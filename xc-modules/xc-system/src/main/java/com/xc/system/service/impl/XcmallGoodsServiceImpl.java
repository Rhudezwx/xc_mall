package com.xc.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xc.system.mapper.XcmallGoodsMapper;
import com.xc.system.domain.XcmallGoods;
import com.xc.system.service.IXcmallGoodsService;

/**
 * 宠物商品Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-10-24
 */
@Service
public class XcmallGoodsServiceImpl implements IXcmallGoodsService 
{
    /**
     *
     */
    @Autowired
    private XcmallGoodsMapper xcmallGoodsMapper;

    /**
     * 查询宠物商品
     * 
     * @param goodsId 宠物商品主键
     * @return 宠物商品
     */
    @Override
    public XcmallGoods selectXcmallGoodsByGoodsId(Long goodsId)
    {
        return xcmallGoodsMapper.selectXcmallGoodsByGoodsId(goodsId);
    }

    /**
     * 查询宠物商品列表
     * 
     * @param xcmallGoods 宠物商品
     * @return 宠物商品
     */
    @Override
    public List<XcmallGoods> selectXcmallGoodsList(XcmallGoods xcmallGoods)
    {
        return xcmallGoodsMapper.selectXcmallGoodsList(xcmallGoods);
    }

    /**
     * 新增宠物商品
     * 
     * @param xcmallGoods 宠物商品
     * @return 结果
     */
    @Override
    public int insertXcmallGoods(XcmallGoods xcmallGoods)
    {
        return xcmallGoodsMapper.insertXcmallGoods(xcmallGoods);
    }

    /**
     * 修改宠物商品
     * 
     * @param xcmallGoods 宠物商品
     * @return 结果
     */
    @Override
    public int updateXcmallGoods(XcmallGoods xcmallGoods)
    {
        return xcmallGoodsMapper.updateXcmallGoods(xcmallGoods);
    }

    /**
     * 批量删除宠物商品
     * 
     * @param goodsIds 需要删除的宠物商品主键
     * @return 结果
     */
    @Override
    public int deleteXcmallGoodsByGoodsIds(Long[] goodsIds)
    {
        return xcmallGoodsMapper.deleteXcmallGoodsByGoodsIds(goodsIds);
    }

    /**
     * 删除宠物商品信息
     * 
     * @param goodsId 宠物商品主键
     * @return 结果
     */
    @Override
    public int deleteXcmallGoodsByGoodsId(Long goodsId)
    {
        return xcmallGoodsMapper.deleteXcmallGoodsByGoodsId(goodsId);
    }
}
