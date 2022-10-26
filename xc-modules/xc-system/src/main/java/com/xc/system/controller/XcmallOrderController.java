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
import com.xc.system.domain.XcmallOrder;
import com.xc.system.service.IXcmallOrderService;
import com.xc.common.core.web.controller.BaseController;
import com.xc.common.core.web.domain.AjaxResult;
import com.xc.common.core.utils.poi.ExcelUtil;
import com.xc.common.core.web.page.TableDataInfo;

/**
 * 小铺订单Controller
 * 
 * @author ruoyi
 * @date 2022-10-25
 */
@RestController
@RequestMapping("/order")
public class XcmallOrderController extends BaseController
{
    @Autowired
    private IXcmallOrderService xcmallOrderService;

    /**
     * 查询小铺订单列表
     */
    @RequiresPermissions("system:order:list")
    @GetMapping("/list")
    public TableDataInfo list(XcmallOrder xcmallOrder)
    {
        startPage();
        List<XcmallOrder> list = xcmallOrderService.selectXcmallOrderList(xcmallOrder);
        return getDataTable(list);
    }

    /**
     * 导出小铺订单列表
     */
    @RequiresPermissions("system:order:export")
    @Log(title = "小铺订单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XcmallOrder xcmallOrder)
    {
        List<XcmallOrder> list = xcmallOrderService.selectXcmallOrderList(xcmallOrder);
        ExcelUtil<XcmallOrder> util = new ExcelUtil<XcmallOrder>(XcmallOrder.class);
        util.exportExcel(response, list, "小铺订单数据");
    }

    /**
     * 获取小铺订单详细信息
     */
    @RequiresPermissions("system:order:query")
    @GetMapping(value = "/{orderId}")
    public AjaxResult getInfo(@PathVariable("orderId") Long orderId)
    {
        return AjaxResult.success(xcmallOrderService.selectXcmallOrderByOrderId(orderId));
    }

    /**
     * 新增小铺订单
     */
    @RequiresPermissions("system:order:add")
    @Log(title = "小铺订单", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XcmallOrder xcmallOrder)
    {
        return toAjax(xcmallOrderService.insertXcmallOrder(xcmallOrder));
    }

    /**
     * 修改小铺订单
     */
    @RequiresPermissions("system:order:edit")
    @Log(title = "小铺订单", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XcmallOrder xcmallOrder)
    {
        return toAjax(xcmallOrderService.updateXcmallOrder(xcmallOrder));
    }

    /**
     * 删除小铺订单
     */
    @RequiresPermissions("system:order:remove")
    @Log(title = "小铺订单", businessType = BusinessType.DELETE)
	@DeleteMapping("/{orderIds}")
    public AjaxResult remove(@PathVariable Long[] orderIds)
    {
        return toAjax(xcmallOrderService.deleteXcmallOrderByOrderIds(orderIds));
    }
}
