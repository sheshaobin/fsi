package com.fsi.info.service.impl;

import java.util.List;
import com.fsi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fsi.info.mapper.FsiInfoMapper;
import com.fsi.info.domain.FsiInfo;
import com.fsi.info.service.IFsiInfoService;
import com.fsi.common.core.text.Convert;

/**
 * 食品安全事件Service业务层处理
 * 
 * @author fsi
 * @date 2020-06-20
 */
@Service
public class FsiInfoServiceImpl implements IFsiInfoService 
{
    @Autowired
    private FsiInfoMapper fsiInfoMapper;

    /**
     * 查询食品安全事件
     * 
     * @param infoId 食品安全事件ID
     * @return 食品安全事件
     */
    @Override
    public FsiInfo selectFsiInfoById(Long infoId)
    {
        return fsiInfoMapper.selectFsiInfoById(infoId);
    }

    /**
     * 查询食品安全事件列表
     * 
     * @param fsiInfo 食品安全事件
     * @return 食品安全事件
     */
    @Override
    public List<FsiInfo> selectFsiInfoList(FsiInfo fsiInfo)
    {
        return fsiInfoMapper.selectFsiInfoList(fsiInfo);
    }

    /**
     * 新增食品安全事件
     * 
     * @param fsiInfo 食品安全事件
     * @return 结果
     */
    @Override
    public int insertFsiInfo(FsiInfo fsiInfo)
    {
        fsiInfo.setCreateTime(DateUtils.getNowDate());
        return fsiInfoMapper.insertFsiInfo(fsiInfo);
    }

    /**
     * 修改食品安全事件
     * 
     * @param fsiInfo 食品安全事件
     * @return 结果
     */
    @Override
    public int updateFsiInfo(FsiInfo fsiInfo)
    {
        return fsiInfoMapper.updateFsiInfo(fsiInfo);
    }

    /**
     * 删除食品安全事件对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteFsiInfoByIds(String ids)
    {
        return fsiInfoMapper.deleteFsiInfoByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除食品安全事件信息
     * 
     * @param infoId 食品安全事件ID
     * @return 结果
     */
    @Override
    public int deleteFsiInfoById(Long infoId)
    {
        return fsiInfoMapper.deleteFsiInfoById(infoId);
    }
}
