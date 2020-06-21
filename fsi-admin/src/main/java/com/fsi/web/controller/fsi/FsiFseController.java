package com.fsi.web.controller.fsi;

import java.util.List;

import com.fsi.info.domain.FsiDicData;
import com.fsi.info.service.IFsiDicDataService;
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
import com.fsi.info.domain.FsiInfo;
import com.fsi.info.service.IFsiInfoService;
import com.fsi.common.core.controller.BaseController;
import com.fsi.common.core.domain.AjaxResult;
import com.fsi.common.utils.poi.ExcelUtil;
import com.fsi.common.core.page.TableDataInfo;

/**
 * 食品安全事件Controller
 * 
 * @author fsi
 * @date 2020-06-20
 */
@Controller
@RequestMapping("/fsi/fse")
public class FsiFseController extends BaseController
{
    private String prefix = "fsi/fse";

    @Autowired
    private IFsiInfoService fsiInfoService;
    @Autowired
    private IFsiDicDataService fsiDicDataService;

    @RequiresPermissions("fsi:fse:view")
    @GetMapping()
    public String fse()
    {
        return prefix + "/fse";
    }

    /**
     * 查询食品安全事件列表
     */
    @RequiresPermissions("fsi:fse:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(FsiInfo fsiInfo)
    {
        startPage();
        List<FsiInfo> list = fsiInfoService.selectFsiInfoList(fsiInfo);
        return getDataTable(list);
    }

    /**
     * 导出食品安全事件列表
     */
    @RequiresPermissions("fsi:fse:export")
    @Log(title = "食品安全事件", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(FsiInfo fsiInfo)
    {
        List<FsiInfo> list = fsiInfoService.selectFsiInfoList(fsiInfo);
        ExcelUtil<FsiInfo> util = new ExcelUtil<FsiInfo>(FsiInfo.class);
        return util.exportExcel(list, "fse");
    }

    /**
     * 新增食品安全事件
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存食品安全事件
     */
    @RequiresPermissions("fsi:fse:add")
    @Log(title = "食品安全事件", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(FsiInfo fsiInfo)
    {
        return toAjax(fsiInfoService.insertFsiInfo(fsiInfo));
    }

    /**
     * 修改食品安全事件
     */
    @GetMapping("/edit/{infoId}")
    public String edit(@PathVariable("infoId") Long infoId, ModelMap mmap)
    {
        FsiInfo fsiInfo = fsiInfoService.selectFsiInfoById(infoId);
        mmap.put("fsiInfo", fsiInfo);
        return prefix + "/edit";
    }

    /**
     * 修改保存食品安全事件
     */
    @RequiresPermissions("fsi:fse:edit")
    @Log(title = "食品安全事件", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(FsiInfo fsiInfo)
    {
        return toAjax(fsiInfoService.updateFsiInfo(fsiInfo));
    }

    /**
     * 删除食品安全事件
     */
    @RequiresPermissions("fsi:fse:remove")
    @Log(title = "食品安全事件", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(fsiInfoService.deleteFsiInfoByIds(ids));
    }
}
