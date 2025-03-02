package com.ruoyi.member.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * Member对象 fam_member
 * 
 * @author Henry
 * @date 2024-10-01
 */
public class FamMember extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** Name */
    @Excel(name = "Name")
    private String name;

    /** Gender */
    @Excel(name = "Gender")
    private String gender;

    /** Role */
    @Excel(name = "Role")
    private String role;

    /** Authority */
    @Excel(name = "Authority")
    private String authority;

    /** Status */
    @Excel(name = "Status")
    private Integer status;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setGender(String gender) 
    {
        this.gender = gender;
    }

    public String getGender() 
    {
        return gender;
    }
    public void setRole(String role) 
    {
        this.role = role;
    }

    public String getRole() 
    {
        return role;
    }
    public void setAuthority(String authority) 
    {
        this.authority = authority;
    }

    public String getAuthority() 
    {
        return authority;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("gender", getGender())
            .append("role", getRole())
            .append("authority", getAuthority())
            .append("status", getStatus())
            .toString();
    }
}
