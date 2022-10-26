package com.xc.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xc.system.mapper.XcmallUserMapper;
import com.xc.system.domain.XcmallUser;
import com.xc.system.service.IXcmallUserService;

/**
 * 小铺用户Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-10-24
 */
@Service
public class XcmallUserServiceImpl implements IXcmallUserService 
{
    @Autowired
    private XcmallUserMapper xcmallUserMapper;

    /**
     * 查询小铺用户
     * 
     * @param userId 小铺用户主键
     * @return 小铺用户
     */
    @Override
    public XcmallUser selectXcmallUserByUserId(Long userId)
    {
        return xcmallUserMapper.selectXcmallUserByUserId(userId);
    }

    /**
     * 查询小铺用户列表
     * 
     * @param xcmallUser 小铺用户
     * @return 小铺用户
     */
    @Override
    public List<XcmallUser> selectXcmallUserList(XcmallUser xcmallUser)
    {
        return xcmallUserMapper.selectXcmallUserList(xcmallUser);
    }

    /**
     * 新增小铺用户
     * 
     * @param xcmallUser 小铺用户
     * @return 结果
     */
    @Override
    public int insertXcmallUser(XcmallUser xcmallUser)
    {
        return xcmallUserMapper.insertXcmallUser(xcmallUser);
    }

    /**
     * 修改小铺用户
     * 
     * @param xcmallUser 小铺用户
     * @return 结果
     */
    @Override
    public int updateXcmallUser(XcmallUser xcmallUser)
    {
        return xcmallUserMapper.updateXcmallUser(xcmallUser);
    }

    /**
     * 批量删除小铺用户
     * 
     * @param userIds 需要删除的小铺用户主键
     * @return 结果
     */
    @Override
    public int deleteXcmallUserByUserIds(Long[] userIds)
    {
        return xcmallUserMapper.deleteXcmallUserByUserIds(userIds);
    }

    /**
     * 删除小铺用户信息
     * 
     * @param userId 小铺用户主键
     * @return 结果
     */
    @Override
    public int deleteXcmallUserByUserId(Long userId)
    {
        return xcmallUserMapper.deleteXcmallUserByUserId(userId);
    }
}
