package com.fsi.web.controller.fsi;

import java.util.List;

import com.fsi.common.core.domain.DicDataZtree;
import com.fsi.common.core.domain.Ztree;
import com.fsi.system.domain.SysDept;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fsi.common.annotation.Log;
import com.fsi.common.enums.BusinessType;
import com.fsi.info.domain.FsiDicData;
import com.fsi.info.service.IFsiDicDataService;
import com.fsi.common.core.controller.BaseController;
import com.fsi.common.core.domain.AjaxResult;
import com.fsi.common.utils.poi.ExcelUtil;
import com.fsi.common.core.page.TableDataInfo;

/**
 * fsi字典Controller
 *
 * @author fsi
 * @date 2020-06-20
 */
@Controller
@RequestMapping("/fsi/fdd")
public class FsiDicDataController extends BaseController {
    private String prefix = "fsi/fdd";

    @Autowired
    private IFsiDicDataService fsiDicDataService;

    @RequiresPermissions("fsi:fdd:view")
    @GetMapping()
    public String fdd() {
        return prefix + "/fdd";
    }

    /**
     * 查询fsi字典列表
     */
    @RequiresPermissions("fsi:fdd:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(FsiDicData fsiDicData) {
        startPage();
        List<FsiDicData> list = fsiDicDataService.selectFsiDicDataList(fsiDicData);
        return getDataTable(list);
    }

    /**
     * 导出fsi字典列表
     */
    @RequiresPermissions("fsi:fdd:export")
    @Log(title = "fsi字典", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(FsiDicData fsiDicData) {
        List<FsiDicData> list = fsiDicDataService.selectFsiDicDataList(fsiDicData);
        ExcelUtil<FsiDicData> util = new ExcelUtil<FsiDicData>(FsiDicData.class);
        return util.exportExcel(list, "fdd");
    }

    /**
     * 新增fsi字典
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增保存fsi字典
     */
    @RequiresPermissions("fsi:fdd:add")
    @Log(title = "fsi字典", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(FsiDicData fsiDicData) {
        return toAjax(fsiDicDataService.insertFsiDicData(fsiDicData));
    }

    /**
     * 修改fsi字典
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap) {
        FsiDicData fsiDicData = fsiDicDataService.selectFsiDicDataById(id);
        mmap.put("fsiDicData", fsiDicData);
        return prefix + "/edit";
    }

    /**
     * 修改保存fsi字典
     */
    @RequiresPermissions("fsi:fdd:edit")
    @Log(title = "fsi字典", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(FsiDicData fsiDicData) {
        return toAjax(fsiDicDataService.updateFsiDicData(fsiDicData));
    }

    /**
     * 删除fsi字典
     */
    @RequiresPermissions("fsi:fdd:remove")
    @Log(title = "fsi字典", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(fsiDicDataService.deleteFsiDicDataByIds(ids));
    }

    /**
     * 选择字典树
     *
     * @param dicKey
     * @param dicTypeCode
     * @param mmap
     * @return
     */
    @GetMapping(value = "/selectDicDataTree/{dicTypeCode}/{dicKey}")
    public String selectDicDataTree(@PathVariable("dicTypeCode") String dicTypeCode, @PathVariable("dicKey") String dicKey, ModelMap mmap) {
        FsiDicData fsiDicData = new FsiDicData();
        fsiDicData.setDicTypeCode(dicTypeCode);
        fsiDicData.setDicKey(dicKey);
        if (CollectionUtils.isNotEmpty(fsiDicDataService.selectFsiDicDataList(fsiDicData))) {
            mmap.put("fsiDicData", fsiDicDataService.selectFsiDicDataList(fsiDicData).get(0));
        } else {
            mmap.put("fsiDicData", fsiDicData);
        }
        if (dicTypeCode.equals("foodclassify")) {
            return prefix + "/prodCateTree";
        } else if (dicTypeCode.equals("country")) {
            return prefix + "/countryRegionTree";
        } else if (dicTypeCode.equals("unqualtype")) {
            return prefix + "/unqualifiedItemTree";
        } else {
            return "";
        }
    }

    /**
     * 加载字典列表树
     */
    @GetMapping("/dicTreeData/{dicTypeCode}")
    @ResponseBody
    public List<DicDataZtree> dicTreeData(@PathVariable("dicTypeCode") String dicTypeCode) {
        FsiDicData fsiDicData = new FsiDicData();
        fsiDicData.setDicTypeCode(dicTypeCode);
        List<DicDataZtree> prodCateTree = fsiDicDataService.selectDicDataTree(fsiDicData);
        return prodCateTree;
    }
}
