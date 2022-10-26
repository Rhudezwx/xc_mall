package com.xc.system.service;

import java.util.List;
import com.xc.system.domain.XcmallGoods;

/**
 * 宠物商品Service接口
 * 
 * @author ruoyi
 * @date 2022-10-24
 */
public interface IXcmallGoodsService 
{
    /**
     * 查询宠物商品
     * 
     * @param goodsId 宠物商品主键
     * @return 宠物商品
     */
    public XcmallGoods selectXcmallGoodsByGoodsId(Long goodsId);

    /**
     * 查询宠物商品列表
     * 
     * @param xcmallGoods 宠物商品
     * @return 宠物商品集合
     */
    public List<XcmallGoods> selectXcmallGoodsList(XcmallGoods xcmallGoods);

    /**
     * 新增宠物商品
     * 
     * @param xcmallGoods 宠物商品
     * @return 结果
     */
    public int insertXcmallGoods(XcmallGoods xcmallGoods);

    /**
     * 修改宠物商品
     * 
     * @param xcmallGoods 宠物商品
     * @return 结果
     */
    public int updateXcmallGoods(XcmallGoods xcmallGoods);

    /**
     * 批量删除宠物商品
     * 
     * @param goodsIds 需要删除的宠物商品主键集合
     * @return 结果
     */
    public int deleteXcmallGoodsByGoodsIds(Long[] goodsIds);

    /**
     * 删除宠物商品信息
     * 
     * @param goodsId 宠物商品主键
     * @return 结果
     */
    public int deleteXcmallGoodsByGoodsId(Long goodsId);
}
