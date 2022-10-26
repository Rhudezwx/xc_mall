package com.xc.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.xc.common.core.annotation.Excel;
import com.xc.common.core.web.domain.BaseEntity;

/**
 * 小铺用户对象 xcmall_user
 * 
 * @author ruoyi
 * @date 2022-10-24
 */
public class XcmallUser extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 用户id */
    private Long userId;

    /** 用户名 */
    @Excel(name = "用户名")
    private String name;

    /** 电话号码 */
    @Excel(name = "电话号码")
    private Long phone;

    /** 家庭地址 */
    @Excel(name = "家庭地址")
    private String address;

    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setPhone(Long phone) 
    {
        this.phone = phone;
    }

    public Long getPhone() 
    {
        return phone;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("userId", getUserId())
            .append("name", getName())
            .append("phone", getPhone())
            .append("address", getAddress())
            .toString();
    }
}
