package com.fsi.info.mapper;

import java.util.List;
import com.fsi.info.domain.FsiInfo;

/**
 * 食品安全事件Mapper接口
 * 
 * @author fsi
 * @date 2020-06-20
 */
public interface FsiInfoMapper 
{
    /**
     * 查询食品安全事件
     * 
     * @param infoId 食品安全事件ID
     * @return 食品安全事件
     */
    public FsiInfo selectFsiInfoById(Long infoId);

    /**
     * 查询食品安全事件列表
     * 
     * @param fsiInfo 食品安全事件
     * @return 食品安全事件集合
     */
    public List<FsiInfo> selectFsiInfoList(FsiInfo fsiInfo);

    /**
     * 新增食品安全事件
     * 
     * @param fsiInfo 食品安全事件
     * @return 结果
     */
    public int insertFsiInfo(FsiInfo fsiInfo);

    /**
     * 修改食品安全事件
     * 
     * @param fsiInfo 食品安全事件
     * @return 结果
     */
    public int updateFsiInfo(FsiInfo fsiInfo);

    /**
     * 删除食品安全事件
     * 
     * @param infoId 食品安全事件ID
     * @return 结果
     */
    public int deleteFsiInfoById(Long infoId);

    /**
     * 批量删除食品安全事件
     * 
     * @param infoIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteFsiInfoByIds(String[] infoIds);
}
