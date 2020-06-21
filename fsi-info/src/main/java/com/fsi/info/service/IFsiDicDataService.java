package com.fsi.info.service;

import java.util.List;

import com.fsi.common.core.domain.DicDataZtree;
import com.fsi.common.core.domain.Ztree;
import com.fsi.info.domain.FsiDicData;

/**
 * fsi字典Service接口
 * 
 * @author fsi
 * @date 2020-06-20
 */
public interface IFsiDicDataService 
{
    /**
     * 查询fsi字典
     * 
     * @param id fsi字典ID
     * @return fsi字典
     */
    public FsiDicData selectFsiDicDataById(Long id);

    /**
     * 查询fsi字典列表
     * 
     * @param fsiDicData fsi字典
     * @return fsi字典集合
     */
    public List<FsiDicData> selectFsiDicDataList(FsiDicData fsiDicData);

    /**
     * 查询字典树
     *
     * @param dicData 字典信息
     * @return 所有字典信息
     */
    public List<DicDataZtree> selectDicDataTree(FsiDicData dicData);

    /**
     * 新增fsi字典
     * 
     * @param fsiDicData fsi字典
     * @return 结果
     */
    public int insertFsiDicData(FsiDicData fsiDicData);

    /**
     * 修改fsi字典
     * 
     * @param fsiDicData fsi字典
     * @return 结果
     */
    public int updateFsiDicData(FsiDicData fsiDicData);

    /**
     * 批量删除fsi字典
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteFsiDicDataByIds(String ids);

    /**
     * 删除fsi字典信息
     * 
     * @param id fsi字典ID
     * @return 结果
     */
    public int deleteFsiDicDataById(Long id);
}
