package com.fsi.info.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.fsi.common.constant.FsiConstants;
import com.fsi.common.constant.UserConstants;
import com.fsi.common.core.domain.DicDataZtree;
import com.fsi.common.core.domain.Ztree;
import com.fsi.common.utils.DateUtils;
import com.fsi.common.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fsi.info.mapper.FsiDicDataMapper;
import com.fsi.info.domain.FsiDicData;
import com.fsi.info.service.IFsiDicDataService;
import com.fsi.common.core.text.Convert;

/**
 * fsi字典Service业务层处理
 *
 * @author fsi
 * @date 2020-06-20
 */
@Service
public class FsiDicDataServiceImpl implements IFsiDicDataService {
    @Autowired
    private FsiDicDataMapper fsiDicDataMapper;

    /**
     * 查询fsi字典
     *
     * @param id fsi字典ID
     * @return fsi字典
     */
    @Override
    public FsiDicData selectFsiDicDataById(Long id) {
        return fsiDicDataMapper.selectFsiDicDataById(id);
    }

    /**
     * 查询fsi字典列表
     *
     * @param fsiDicData fsi字典
     * @return fsi字典
     */
    @Override
    public List<FsiDicData> selectFsiDicDataList(FsiDicData fsiDicData) {
        return fsiDicDataMapper.selectFsiDicDataList(fsiDicData);
    }

    /**
     * 查询字典树
     *
     * @param dicData 字典信息
     * @return 所有字典信息
     */
    @Override
    public List<DicDataZtree> selectDicDataTree(FsiDicData dicData) {
        List<FsiDicData> deptList = fsiDicDataMapper.selectFsiDicDataList(dicData);
        List<DicDataZtree> ztrees = initZtree(deptList);
        return ztrees;
    }

    /**
     * 新增fsi字典
     *
     * @param fsiDicData fsi字典
     * @return 结果
     */
    @Override
    public int insertFsiDicData(FsiDicData fsiDicData) {
        fsiDicData.setCreateTime(DateUtils.getNowDate());
        return fsiDicDataMapper.insertFsiDicData(fsiDicData);
    }

    /**
     * 修改fsi字典
     *
     * @param fsiDicData fsi字典
     * @return 结果
     */
    @Override
    public int updateFsiDicData(FsiDicData fsiDicData) {
        fsiDicData.setUpdateTime(DateUtils.getNowDate());
        return fsiDicDataMapper.updateFsiDicData(fsiDicData);
    }

    /**
     * 删除fsi字典对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteFsiDicDataByIds(String ids) {
        return fsiDicDataMapper.deleteFsiDicDataByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除fsi字典信息
     *
     * @param id fsi字典ID
     * @return 结果
     */
    @Override
    public int deleteFsiDicDataById(Long id) {
        return fsiDicDataMapper.deleteFsiDicDataById(id);
    }

    /**
     * 对象转树
     *
     * @param fsiDicDataList 列表
     * @return 树结构列表
     */
    public List<DicDataZtree> initZtree(List<FsiDicData> fsiDicDataList) {
        List<DicDataZtree> ztrees = new ArrayList<>();
        if (StringUtils.isNull(fsiDicDataList)){
            return ztrees;
        }
        for (FsiDicData fsiDicData : fsiDicDataList) {
            if (FsiConstants.FSI_DIC_DATA_NORMAL.equals(fsiDicData.getStatus())) {
                DicDataZtree dicDataZtree = new DicDataZtree();
                dicDataZtree.setId(fsiDicData.getDicKey());
                dicDataZtree.setpId(fsiDicData.getParent());
                dicDataZtree.setName(fsiDicData.getDicValue());
                dicDataZtree.setTitle(fsiDicData.getDicTypeName());
                ztrees.add(dicDataZtree);
            }
        }
        return ztrees;
    }
}
