package com.xc.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.xc.system.domain.XcmallUser;
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
import com.xc.system.service.IXcmallUserService;
import com.xc.common.core.web.controller.BaseController;
import com.xc.common.core.web.domain.AjaxResult;
import com.xc.common.core.utils.poi.ExcelUtil;
import com.xc.common.core.web.page.TableDataInfo;

/**
 * 小铺用户Controller
 * 
 * @author ruoyi
 * @date 2022-10-24
 */
@RestController
@RequestMapping("/xcuser")
public class XcmallUserController extends BaseController
{
    @Autowired
    private IXcmallUserService xcmallUserService;

    /**
     * 查询小铺用户列表
     */
    @RequiresPermissions("system:xcuser:list")
    @GetMapping("/list")
    public TableDataInfo list(XcmallUser xcmallUser)
    {
        startPage();
        List<XcmallUser> list = xcmallUserService.selectXcmallUserList(xcmallUser);
        return getDataTable(list);
    }

    /**
     * 导出小铺用户列表
     */
    @RequiresPermissions("system:xcuser:export")
    @Log(title = "小铺用户", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XcmallUser xcmallUser)
    {
        List<XcmallUser> list = xcmallUserService.selectXcmallUserList(xcmallUser);
        ExcelUtil<XcmallUser> util = new ExcelUtil<XcmallUser>(XcmallUser.class);
        util.exportExcel(response, list, "小铺用户数据");
    }

    /**
     * 获取小铺用户详细信息
     */
    @RequiresPermissions("system:xcuser:query")
    @GetMapping(value = "/{userId}")
    public AjaxResult getInfo(@PathVariable("userId") Long userId)
    {
        return AjaxResult.success(xcmallUserService.selectXcmallUserByUserId(userId));
    }

    /**
     * 新增小铺用户
     */
    @RequiresPermissions("system:xcuser:add")
    @Log(title = "小铺用户", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XcmallUser xcmallUser)
    {
        return toAjax(xcmallUserService.insertXcmallUser(xcmallUser));
    }

    /**
     * 修改小铺用户
     */
    @RequiresPermissions("system:xcuser:edit")
    @Log(title = "小铺用户", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XcmallUser xcmallUser)
    {
        return toAjax(xcmallUserService.updateXcmallUser(xcmallUser));
    }

    /**
     * 删除小铺用户
     */
    @RequiresPermissions("system:xcuser:remove")
    @Log(title = "小铺用户", businessType = BusinessType.DELETE)
	@DeleteMapping("/{userIds}")
    public AjaxResult remove(@PathVariable Long[] userIds)
    {
        return toAjax(xcmallUserService.deleteXcmallUserByUserIds(userIds));
    }
}
