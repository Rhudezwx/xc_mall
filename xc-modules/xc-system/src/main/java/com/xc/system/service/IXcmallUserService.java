package com.xc.system.service;

import java.util.List;
import com.xc.system.domain.XcmallUser;

/**
 * 小铺用户Service接口
 * 
 * @author ruoyi
 * @date 2022-10-24
 */
public interface IXcmallUserService 
{
    /**
     * 查询小铺用户
     * 
     * @param userId 小铺用户主键
     * @return 小铺用户
     */
    public XcmallUser selectXcmallUserByUserId(Long userId);

    /**
     * 查询小铺用户列表
     * 
     * @param xcmallUser 小铺用户
     * @return 小铺用户集合
     */
    public List<XcmallUser> selectXcmallUserList(XcmallUser xcmallUser);

    /**
     * 新增小铺用户
     * 
     * @param xcmallUser 小铺用户
     * @return 结果
     */
    public int insertXcmallUser(XcmallUser xcmallUser);

    /**
     * 修改小铺用户
     * 
     * @param xcmallUser 小铺用户
     * @return 结果
     */
    public int updateXcmallUser(XcmallUser xcmallUser);

    /**
     * 批量删除小铺用户
     * 
     * @param userIds 需要删除的小铺用户主键集合
     * @return 结果
     */
    public int deleteXcmallUserByUserIds(Long[] userIds);

    /**
     * 删除小铺用户信息
     * 
     * @param userId 小铺用户主键
     * @return 结果
     */
    public int deleteXcmallUserByUserId(Long userId);
}
