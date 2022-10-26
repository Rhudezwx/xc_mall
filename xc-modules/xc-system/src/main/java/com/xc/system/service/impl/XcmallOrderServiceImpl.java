package com.xc.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xc.system.mapper.XcmallOrderMapper;
import com.xc.system.domain.XcmallOrder;
import com.xc.system.service.IXcmallOrderService;

/**
 * 小铺订单Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-10-25
 */
@Service
public class XcmallOrderServiceImpl implements IXcmallOrderService 
{
    @Autowired
    private XcmallOrderMapper xcmallOrderMapper;

    /**
     * 查询小铺订单
     * 
     * @param orderId 小铺订单主键
     * @return 小铺订单
     */
    @Override
    public XcmallOrder selectXcmallOrderByOrderId(Long orderId)
    {
        return xcmallOrderMapper.selectXcmallOrderByOrderId(orderId);
    }

    /**
     * 查询小铺订单列表
     * 
     * @param xcmallOrder 小铺订单
     * @return 小铺订单
     */
    @Override
    public List<XcmallOrder> selectXcmallOrderList(XcmallOrder xcmallOrder)
    {
        return xcmallOrderMapper.selectXcmallOrderList(xcmallOrder);
    }

    /**
     * 新增小铺订单
     * 
     * @param xcmallOrder 小铺订单
     * @return 结果
     */
    @Override
    public int insertXcmallOrder(XcmallOrder xcmallOrder)
    {
        return xcmallOrderMapper.insertXcmallOrder(xcmallOrder);
    }

    /**
     * 修改小铺订单
     * 
     * @param xcmallOrder 小铺订单
     * @return 结果
     */
    @Override
    public int updateXcmallOrder(XcmallOrder xcmallOrder)
    {
        return xcmallOrderMapper.updateXcmallOrder(xcmallOrder);
    }

    /**
     * 批量删除小铺订单
     * 
     * @param orderIds 需要删除的小铺订单主键
     * @return 结果
     */
    @Override
    public int deleteXcmallOrderByOrderIds(Long[] orderIds)
    {
        return xcmallOrderMapper.deleteXcmallOrderByOrderIds(orderIds);
    }

    /**
     * 删除小铺订单信息
     * 
     * @param orderId 小铺订单主键
     * @return 结果
     */
    @Override
    public int deleteXcmallOrderByOrderId(Long orderId)
    {
        return xcmallOrderMapper.deleteXcmallOrderByOrderId(orderId);
    }
}
