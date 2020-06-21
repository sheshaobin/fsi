package com.fsi.info.mapper;

import java.util.List;
import com.fsi.info.domain.FsiDicData;

/**
 * fsi字典Mapper接口
 * 
 * @author fsi
 * @date 2020-06-20
 */
public interface FsiDicDataMapper 
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
     * 删除fsi字典
     * 
     * @param id fsi字典ID
     * @return 结果
     */
    public int deleteFsiDicDataById(Long id);

    /**
     * 批量删除fsi字典
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteFsiDicDataByIds(String[] ids);
}
