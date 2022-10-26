package com.xc.system.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.xc.common.core.annotation.Excel;
import com.xc.common.core.web.domain.BaseEntity;

/**
 * 小铺订单对象 xcmall_order
 * 
 * @author ruoyi
 * @date 2022-10-25
 */
public class XcmallOrder extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 订单id */
    private Long orderId;

    /** 用户id */
    @Excel(name = "用户id")
    private Long userId;

    /** 商品id */
    @Excel(name = "商品id")
    private Long goodsId;

    /** 商品名字 */
    @Excel(name = "商品名字")
    private String goodsName;

    /** 商品数量 */
    @Excel(name = "商品数量")
    private Long quantity;

    /** 商品总价 */
    @Excel(name = "商品总价")
    private BigDecimal totalPrice;

    public void setOrderId(Long orderId) 
    {
        this.orderId = orderId;
    }

    public Long getOrderId() 
    {
        return orderId;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
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
    public void setQuantity(Long quantity) 
    {
        this.quantity = quantity;
    }

    public Long getQuantity() 
    {
        return quantity;
    }
    public void setTotalPrice(BigDecimal totalPrice) 
    {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getTotalPrice() 
    {
        return totalPrice;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("orderId", getOrderId())
            .append("userId", getUserId())
            .append("goodsId", getGoodsId())
            .append("goodsName", getGoodsName())
            .append("quantity", getQuantity())
            .append("totalPrice", getTotalPrice())
            .toString();
    }
}
