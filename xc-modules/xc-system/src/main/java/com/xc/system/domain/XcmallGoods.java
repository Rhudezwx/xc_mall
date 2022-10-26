package com.xc.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.xc.common.core.annotation.Excel;
import com.xc.common.core.web.domain.BaseEntity;

/**
 * 宠物商品对象 xcmall_goods
 * 
 * @author ruoyi
 * @date 2022-10-24
 */
public class XcmallGoods extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 商品id */
    private Long goodsId;

    /** 商品名 */
    @Excel(name = "商品名")
    private String goodsName;

    /** 商品价格 */
    @Excel(name = "商品价格")
    private Long goodsPrice;

    /** 商品库存 */
    @Excel(name = "商品库存")
    private Long goodsStock;

    /** 商品状态【0下架 1在售】 */
    @Excel(name = "商品状态【0下架 1在售】")
    private Long goodsStatus;

    /** 商品详情 */
    @Excel(name = "商品详情")
    private String goodsDetail;

    public void setGoodsId(Long goodsId) 
    {
        this.goodsId = goodsId;
    }

    public Long getGoodsId() 
    {
        return goodsId;
    }
    public void setGoodsName(String goodsName) 
    {
        this.goodsName = goodsName;
    }

    public String getGoodsName() 
    {
        return goodsName;
    }
    public void setGoodsPrice(Long goodsPrice) 
    {
        this.goodsPrice = goodsPrice;
    }

    public Long getGoodsPrice() 
    {
        return goodsPrice;
    }
    public void setGoodsStock(Long goodsStock) 
    {
        this.goodsStock = goodsStock;
    }

    public Long getGoodsStock() 
    {
        return goodsStock;
    }
    public void setGoodsStatus(Long goodsStatus) 
    {
        this.goodsStatus = goodsStatus;
    }

    public Long getGoodsStatus() 
    {
        return goodsStatus;
    }
    public void setGoodsDetail(String goodsDetail) 
    {
        this.goodsDetail = goodsDetail;
    }

    public String getGoodsDetail() 
    {
        return goodsDetail;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("goodsId", getGoodsId())
            .append("goodsName", getGoodsName())
            .append("goodsPrice", getGoodsPrice())
            .append("goodsStock", getGoodsStock())
            .append("goodsStatus", getGoodsStatus())
            .append("goodsDetail", getGoodsDetail())
            .toString();
    }
}
