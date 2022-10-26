package com.xc.system.service;

import java.util.List;
import com.xc.system.domain.XcmallOrder;

/**
 * 小铺订单Service接口
 * 
 * @author ruoyi
 * @date 2022-10-25
 */
public interface IXcmallOrderService 
{
    /**
     * 查询小铺订单
     * 
     * @param orderId 小铺订单主键
     * @return 小铺订单
     */
    public XcmallOrder selectXcmallOrderByOrderId(Long orderId);

    /**
     * 查询小铺订单列表
     * 
     * @param xcmallOrder 小铺订单
     * @return 小铺订单集合
     */
    public List<XcmallOrder> selectXcmallOrderList(XcmallOrder xcmallOrder);

    /**
     * 新增小铺订单
     * 
     * @param xcmallOrder 小铺订单
     * @return 结果
     */
    public int insertXcmallOrder(XcmallOrder xcmallOrder);

    /**
     * 修改小铺订单
     * 
     * @param xcmallOrder 小铺订单
     * @return 结果
     */
    public int updateXcmallOrder(XcmallOrder xcmallOrder);

    /**
     * 批量删除小铺订单
     * 
     * @param orderIds 需要删除的小铺订单主键集合
     * @return 结果
     */
    public int deleteXcmallOrderByOrderIds(Long[] orderIds);

    /**
     * 删除小铺订单信息
     * 
     * @param orderId 小铺订单主键
     * @return 结果
     */
    public int deleteXcmallOrderByOrderId(Long orderId);
}
