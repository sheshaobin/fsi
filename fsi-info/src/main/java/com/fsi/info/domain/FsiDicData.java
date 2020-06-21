package com.fsi.info.domain;

import com.fsi.common.annotation.Excel;
import com.fsi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * fsi字典对象 fsi_dic_data
 * 
 * @author fsi
 * @date 2020-06-20
 */
public class FsiDicData extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 字典类别编号 */
    @Excel(name = "字典类别编号")
    private String dicTypeCode;

    /** 字典类别 */
    @Excel(name = "字典类别")
    private String dicTypeName;

    /** 字典代码 */
    @Excel(name = "字典代码")
    private String dicKey;

    /** 字典值 */
    @Excel(name = "字典值")
    private String dicValue;

    /** 父代码 */
    @Excel(name = "父代码")
    private String parent;

    /** 地区性组织代码：001欧盟，002东盟 */
    @Excel(name = "地区性组织代码：001欧盟，002东盟")
    private String area;

    /** 地区性组织值 */
    @Excel(name = "地区性组织值")
    private String areaName;

    /** 字典排序 */
    @Excel(name = "字典排序")
    private Long dicSort;

    /** 0 生效 1未生效 */
    @Excel(name = "0 生效 1未生效")
    private String status;

    /** 0 未删除 1删除 */
    @Excel(name = "0 未删除 1删除")
    private String deleteFlag;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setDicTypeCode(String dicTypeCode) 
    {
        this.dicTypeCode = dicTypeCode;
    }

    public String getDicTypeCode() 
    {
        return dicTypeCode;
    }
    public void setDicTypeName(String dicTypeName) 
    {
        this.dicTypeName = dicTypeName;
    }

    public String getDicTypeName() 
    {
        return dicTypeName;
    }
    public void setDicKey(String dicKey) 
    {
        this.dicKey = dicKey;
    }

    public String getDicKey() 
    {
        return dicKey;
    }
    public void setDicValue(String dicValue) 
    {
        this.dicValue = dicValue;
    }

    public String getDicValue() 
    {
        return dicValue;
    }
    public void setParent(String parent) 
    {
        this.parent = parent;
    }

    public String getParent() 
    {
        return parent;
    }
    public void setArea(String area) 
    {
        this.area = area;
    }

    public String getArea() 
    {
        return area;
    }
    public void setAreaName(String areaName) 
    {
        this.areaName = areaName;
    }

    public String getAreaName() 
    {
        return areaName;
    }
    public void setDicSort(Long dicSort) 
    {
        this.dicSort = dicSort;
    }

    public Long getDicSort() 
    {
        return dicSort;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setDeleteFlag(String deleteFlag) 
    {
        this.deleteFlag = deleteFlag;
    }

    public String getDeleteFlag() 
    {
        return deleteFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("dicTypeCode", getDicTypeCode())
            .append("dicTypeName", getDicTypeName())
            .append("dicKey", getDicKey())
            .append("dicValue", getDicValue())
            .append("parent", getParent())
            .append("area", getArea())
            .append("areaName", getAreaName())
            .append("dicSort", getDicSort())
            .append("status", getStatus())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("deleteFlag", getDeleteFlag())
            .toString();
    }
}
