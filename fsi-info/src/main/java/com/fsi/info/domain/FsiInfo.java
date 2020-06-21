package com.fsi.info.domain;

import java.util.Date;
import com.fsi.common.annotation.Excel;
import com.fsi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 食品安全事件对象 fsi_info
 * 
 * @author fsi
 * @date 2020-06-20
 */
public class FsiInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long infoId;

    /** 栏目编码 */
    private String sectionCode;

    /** 所属栏目 */
    private String sectionName;

    /** 产品分类 */
    private String prodCateName;

    /** 产品类编码 */
    private String prodCateCode;

    /** 国家/地区 */
    private String countryRegionName;

    /** 国家地区编码 */
    private String countryRegionCode;

    /** 发布机构 */
    private String publishOrg;

    /** 企业 */
    private String enterprise;

    /** 品牌 */
    private String brand;

    /** 原产地 */
    private String sourceArea;

    /** 产品名称及描述 */
    private String productName;

    /** 不合格项目 */
    private String unqualifiedItemName;

    /** 不合格项目的编码 */
    private String unqualifiedItemCode;

    /** 采取措施 */
    private String measure;

    /** 原始地址 */
    private String sourceAddress;

    /** 原发布时间 */
    private String sourcePublTime;

    /** 内容 */
    private String content;

    /** 发布时间 */
    @Excel(name = "发布时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date publishTime;

    /** 创建人id */
    private Long creatorId;

    /** 发布人id */
    private Long releaserId;

    /** 创建人 */
    private String creator;

    /** 发布人 */
    @Excel(name = "发布人")
    private String releaser;

    /** 状态 */
    private String status;

    /** 推荐 */
    @Excel(name = "推荐")
    private String recommended;

    /** 采纳 */
    @Excel(name = "采纳")
    private String used;

    /** 精华 */
    private String cream;

    /** 分数 */
    private String score;

    /** 专题 */
    private String special;

    /** 预警类别 */
    private String infoType;

    /** 直属海关 */
    private Long firstOrgId;

    /** 隶属海关 */
    private Long secondOrgId;

    /** 直属海关名称 */
    private String firstOrgName;

    /** 隶属海关名称 */
    private String secondOrgName;

    /** 逻辑删除 */
    private String isdel;

    /** 回复人id */
    private Long replyId;

    /** 回复人姓名 */
    private String reply;

    /** 回复时间 */
    private Date replyTime;

    /** 推荐人id */
    private Long recommendorId;

    /** 推荐人 */
    @Excel(name = "推荐人")
    private String recommendorName;

    /** 推荐时间 */
    private Date recommendedTime;

    /** 标题 */
    @Excel(name = "标题")
    private String infoTitle;

    /** 审批 */
    private String audited;

    /** 重复 */
    private String repeat;

    /** null */
    private String tomodify;

    /** 置顶 */
    private String istop;

    /** 置顶结束时间 */
    private Date topEndTime;

    /** null */
    private String weixinStatus;

    /** 不合格原因 */
    private String unqualifiedCauseName;

    /** 不合格原因编码 */
    private String unqualifiedCauseCode;

    public void setInfoId(Long infoId) 
    {
        this.infoId = infoId;
    }

    public Long getInfoId() 
    {
        return infoId;
    }
    public void setSectionCode(String sectionCode) 
    {
        this.sectionCode = sectionCode;
    }

    public String getSectionCode() 
    {
        return sectionCode;
    }
    public void setSectionName(String sectionName) 
    {
        this.sectionName = sectionName;
    }

    public String getSectionName() 
    {
        return sectionName;
    }
    public void setProdCateName(String prodCateName) 
    {
        this.prodCateName = prodCateName;
    }

    public String getProdCateName() 
    {
        return prodCateName;
    }
    public void setProdCateCode(String prodCateCode) 
    {
        this.prodCateCode = prodCateCode;
    }

    public String getProdCateCode() 
    {
        return prodCateCode;
    }
    public void setCountryRegionName(String countryRegionName) 
    {
        this.countryRegionName = countryRegionName;
    }

    public String getCountryRegionName() 
    {
        return countryRegionName;
    }
    public void setCountryRegionCode(String countryRegionCode) 
    {
        this.countryRegionCode = countryRegionCode;
    }

    public String getCountryRegionCode() 
    {
        return countryRegionCode;
    }
    public void setPublishOrg(String publishOrg) 
    {
        this.publishOrg = publishOrg;
    }

    public String getPublishOrg() 
    {
        return publishOrg;
    }
    public void setEnterprise(String enterprise) 
    {
        this.enterprise = enterprise;
    }

    public String getEnterprise() 
    {
        return enterprise;
    }
    public void setBrand(String brand) 
    {
        this.brand = brand;
    }

    public String getBrand() 
    {
        return brand;
    }
    public void setSourceArea(String sourceArea) 
    {
        this.sourceArea = sourceArea;
    }

    public String getSourceArea() 
    {
        return sourceArea;
    }
    public void setProductName(String productName) 
    {
        this.productName = productName;
    }

    public String getProductName() 
    {
        return productName;
    }
    public void setUnqualifiedItemName(String unqualifiedItemName) 
    {
        this.unqualifiedItemName = unqualifiedItemName;
    }

    public String getUnqualifiedItemName() 
    {
        return unqualifiedItemName;
    }
    public void setUnqualifiedItemCode(String unqualifiedItemCode) 
    {
        this.unqualifiedItemCode = unqualifiedItemCode;
    }

    public String getUnqualifiedItemCode() 
    {
        return unqualifiedItemCode;
    }
    public void setMeasure(String measure) 
    {
        this.measure = measure;
    }

    public String getMeasure() 
    {
        return measure;
    }
    public void setSourceAddress(String sourceAddress) 
    {
        this.sourceAddress = sourceAddress;
    }

    public String getSourceAddress() 
    {
        return sourceAddress;
    }
    public void setSourcePublTime(String sourcePublTime) 
    {
        this.sourcePublTime = sourcePublTime;
    }

    public String getSourcePublTime() 
    {
        return sourcePublTime;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setPublishTime(Date publishTime) 
    {
        this.publishTime = publishTime;
    }

    public Date getPublishTime() 
    {
        return publishTime;
    }
    public void setCreatorId(Long creatorId) 
    {
        this.creatorId = creatorId;
    }

    public Long getCreatorId() 
    {
        return creatorId;
    }
    public void setReleaserId(Long releaserId) 
    {
        this.releaserId = releaserId;
    }

    public Long getReleaserId() 
    {
        return releaserId;
    }
    public void setCreator(String creator) 
    {
        this.creator = creator;
    }

    public String getCreator() 
    {
        return creator;
    }
    public void setReleaser(String releaser) 
    {
        this.releaser = releaser;
    }

    public String getReleaser() 
    {
        return releaser;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setRecommended(String recommended) 
    {
        this.recommended = recommended;
    }

    public String getRecommended() 
    {
        return recommended;
    }
    public void setUsed(String used) 
    {
        this.used = used;
    }

    public String getUsed() 
    {
        return used;
    }
    public void setCream(String cream) 
    {
        this.cream = cream;
    }

    public String getCream() 
    {
        return cream;
    }
    public void setScore(String score) 
    {
        this.score = score;
    }

    public String getScore() 
    {
        return score;
    }
    public void setSpecial(String special) 
    {
        this.special = special;
    }

    public String getSpecial() 
    {
        return special;
    }
    public void setInfoType(String infoType) 
    {
        this.infoType = infoType;
    }

    public String getInfoType() 
    {
        return infoType;
    }
    public void setFirstOrgId(Long firstOrgId) 
    {
        this.firstOrgId = firstOrgId;
    }

    public Long getFirstOrgId() 
    {
        return firstOrgId;
    }
    public void setSecondOrgId(Long secondOrgId) 
    {
        this.secondOrgId = secondOrgId;
    }

    public Long getSecondOrgId() 
    {
        return secondOrgId;
    }
    public void setFirstOrgName(String firstOrgName) 
    {
        this.firstOrgName = firstOrgName;
    }

    public String getFirstOrgName() 
    {
        return firstOrgName;
    }
    public void setSecondOrgName(String secondOrgName) 
    {
        this.secondOrgName = secondOrgName;
    }

    public String getSecondOrgName() 
    {
        return secondOrgName;
    }
    public void setIsdel(String isdel) 
    {
        this.isdel = isdel;
    }

    public String getIsdel() 
    {
        return isdel;
    }
    public void setReplyId(Long replyId) 
    {
        this.replyId = replyId;
    }

    public Long getReplyId() 
    {
        return replyId;
    }
    public void setReply(String reply) 
    {
        this.reply = reply;
    }

    public String getReply() 
    {
        return reply;
    }
    public void setReplyTime(Date replyTime) 
    {
        this.replyTime = replyTime;
    }

    public Date getReplyTime() 
    {
        return replyTime;
    }
    public void setRecommendorId(Long recommendorId) 
    {
        this.recommendorId = recommendorId;
    }

    public Long getRecommendorId() 
    {
        return recommendorId;
    }
    public void setRecommendorName(String recommendorName) 
    {
        this.recommendorName = recommendorName;
    }

    public String getRecommendorName() 
    {
        return recommendorName;
    }
    public void setRecommendedTime(Date recommendedTime) 
    {
        this.recommendedTime = recommendedTime;
    }

    public Date getRecommendedTime() 
    {
        return recommendedTime;
    }
    public void setInfoTitle(String infoTitle) 
    {
        this.infoTitle = infoTitle;
    }

    public String getInfoTitle() 
    {
        return infoTitle;
    }
    public void setAudited(String audited) 
    {
        this.audited = audited;
    }

    public String getAudited() 
    {
        return audited;
    }
    public void setRepeat(String repeat) 
    {
        this.repeat = repeat;
    }

    public String getRepeat() 
    {
        return repeat;
    }
    public void setTomodify(String tomodify) 
    {
        this.tomodify = tomodify;
    }

    public String getTomodify() 
    {
        return tomodify;
    }
    public void setIstop(String istop) 
    {
        this.istop = istop;
    }

    public String getIstop() 
    {
        return istop;
    }
    public void setTopEndTime(Date topEndTime) 
    {
        this.topEndTime = topEndTime;
    }

    public Date getTopEndTime() 
    {
        return topEndTime;
    }
    public void setWeixinStatus(String weixinStatus) 
    {
        this.weixinStatus = weixinStatus;
    }

    public String getWeixinStatus() 
    {
        return weixinStatus;
    }
    public void setUnqualifiedCauseName(String unqualifiedCauseName) 
    {
        this.unqualifiedCauseName = unqualifiedCauseName;
    }

    public String getUnqualifiedCauseName() 
    {
        return unqualifiedCauseName;
    }
    public void setUnqualifiedCauseCode(String unqualifiedCauseCode) 
    {
        this.unqualifiedCauseCode = unqualifiedCauseCode;
    }

    public String getUnqualifiedCauseCode() 
    {
        return unqualifiedCauseCode;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("infoId", getInfoId())
            .append("sectionCode", getSectionCode())
            .append("sectionName", getSectionName())
            .append("prodCateName", getProdCateName())
            .append("prodCateCode", getProdCateCode())
            .append("countryRegionName", getCountryRegionName())
            .append("countryRegionCode", getCountryRegionCode())
            .append("publishOrg", getPublishOrg())
            .append("enterprise", getEnterprise())
            .append("brand", getBrand())
            .append("sourceArea", getSourceArea())
            .append("productName", getProductName())
            .append("unqualifiedItemName", getUnqualifiedItemName())
            .append("unqualifiedItemCode", getUnqualifiedItemCode())
            .append("measure", getMeasure())
            .append("sourceAddress", getSourceAddress())
            .append("sourcePublTime", getSourcePublTime())
            .append("content", getContent())
            .append("publishTime", getPublishTime())
            .append("creatorId", getCreatorId())
            .append("releaserId", getReleaserId())
            .append("creator", getCreator())
            .append("releaser", getReleaser())
            .append("status", getStatus())
            .append("recommended", getRecommended())
            .append("used", getUsed())
            .append("cream", getCream())
            .append("score", getScore())
            .append("special", getSpecial())
            .append("infoType", getInfoType())
            .append("firstOrgId", getFirstOrgId())
            .append("secondOrgId", getSecondOrgId())
            .append("firstOrgName", getFirstOrgName())
            .append("secondOrgName", getSecondOrgName())
            .append("isdel", getIsdel())
            .append("replyId", getReplyId())
            .append("reply", getReply())
            .append("replyTime", getReplyTime())
            .append("recommendorId", getRecommendorId())
            .append("recommendorName", getRecommendorName())
            .append("recommendedTime", getRecommendedTime())
            .append("infoTitle", getInfoTitle())
            .append("audited", getAudited())
            .append("repeat", getRepeat())
            .append("tomodify", getTomodify())
            .append("istop", getIstop())
            .append("topEndTime", getTopEndTime())
            .append("weixinStatus", getWeixinStatus())
            .append("unqualifiedCauseName", getUnqualifiedCauseName())
            .append("unqualifiedCauseCode", getUnqualifiedCauseCode())
            .append("createTime", getCreateTime())
            .toString();
    }
}
