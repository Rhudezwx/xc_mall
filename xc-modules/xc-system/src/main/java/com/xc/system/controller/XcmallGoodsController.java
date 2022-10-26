package com.xc.system.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.xc.common.log.annotation.Log;
import com.xc.common.log.enums.BusinessType;
import com.xc.common.security.annotation.RequiresPermissions;
import com.xc.system.domain.XcmallGoods;
import com.xc.system.service.IXcmallGoodsService;
import com.xc.common.core.web.controller.BaseController;
import com.xc.common.core.web.domain.AjaxResult;
import com.xc.common.core.utils.poi.ExcelUtil;
import com.xc.common.core.web.page.TableDataInfo;

/**
 * 宠物商品 Controller
 * 
 * @author ruoyi
 * @date 2022-10-24
 */
@RestController
@RequestMapping("/goods")
public class XcmallGoodsController extends BaseController
{
    @Autowired
    private IXcmallGoodsService xcmallGoodsService;

    /**
     * 查询宠物商品列表
     */
    @RequiresPermissions("system:goods:list")
    @GetMapping("/list")
    public TableDataInfo list(XcmallGoods xcmallGoods)
    {
        startPage();
        List<XcmallGoods> list = xcmallGoodsService.selectXcmallGoodsList(xcmallGoods);
        return getDataTable(list);
    }

    /**
     * 导出宠物商品列表
     */
    @RequiresPermissions("system:goods:export")
    @Log(title = "宠物商品", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XcmallGoods xcmallGoods)
    {
        List<XcmallGoods> list = xcmallGoodsService.selectXcmallGoodsList(xcmallGoods);
        ExcelUtil<XcmallGoods> util = new ExcelUtil<XcmallGoods>(XcmallGoods.class);
        util.exportExcel(response, list, "宠物商品数据");
    }

    /**
     * 获取宠物商品详细信息
     */
    @RequiresPermissions("system:goods:query")
    @GetMapping(value = "/{goodsId}")
    public AjaxResult getInfo(@PathVariable("goodsId") Long goodsId)
    {
        return AjaxResult.success(xcmallGoodsService.selectXcmallGoodsByGoodsId(goodsId));
    }

    /**
     * 新增宠物商品
     */
    @RequiresPermissions("system:goods:add")
    @Log(title = "宠物商品", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XcmallGoods xcmallGoods)
    {
        return toAjax(xcmallGoodsService.insertXcmallGoods(xcmallGoods));
    }

    /**
     * 修改宠物商品
     */
    @RequiresPermissions("system:goods:edit")
    @Log(title = "宠物商品", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XcmallGoods xcmallGoods)
    {
        return toAjax(xcmallGoodsService.updateXcmallGoods(xcmallGoods));
    }

    /**
     * 删除宠物商品
     */
    @RequiresPermissions("system:goods:remove")
    @Log(title = "宠物商品", businessType = BusinessType.DELETE)
	@DeleteMapping("/{goodsIds}")
    public AjaxResult remove(@PathVariable Long[] goodsIds)
    {
        return toAjax(xcmallGoodsService.deleteXcmallGoodsByGoodsIds(goodsIds));
    }
}
