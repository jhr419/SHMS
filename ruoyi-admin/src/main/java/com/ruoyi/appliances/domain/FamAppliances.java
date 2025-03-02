package com.ruoyi.appliances.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * Appliances对象 fam_appliances
 * 
 * @author ruoyi
 * @date 2024-10-01
 */
public class FamAppliances extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** Appliance */
    @Excel(name = "Appliance")
    private String applianceName;

    /** Status */
    @Excel(name = "Status")
    private String status;

    /** Room ID */
    private Long roomId;

    /** Room */
    @Excel(name = "Room")
    private String roomName;

    /** Registration Date */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "Registration Date", width = 30, dateFormat = "yyyy-MM-dd")
    private Date registrationDate;

    /** Warranty Period */
    @Excel(name = "Warranty Period")
    private Long warrantyPeriod;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setApplianceName(String applianceName) 
    {
        this.applianceName = applianceName;
    }

    public String getApplianceName() 
    {
        return applianceName;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setRoomId(Long roomId) 
    {
        this.roomId = roomId;
    }

    public Long getRoomId() 
    {
        return roomId;
    }
    public void setRoomName(String roomName) 
    {
        this.roomName = roomName;
    }

    public String getRoomName() 
    {
        return roomName;
    }
    public void setRegistrationDate(Date registrationDate) 
    {
        this.registrationDate = registrationDate;
    }

    public Date getRegistrationDate() 
    {
        return registrationDate;
    }
    public void setWarrantyPeriod(Long warrantyPeriod) 
    {
        this.warrantyPeriod = warrantyPeriod;
    }

    public Long getWarrantyPeriod() 
    {
        return warrantyPeriod;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("applianceName", getApplianceName())
            .append("status", getStatus())
            .append("roomId", getRoomId())
            .append("roomName", getRoomName())
            .append("registrationDate", getRegistrationDate())
            .append("warrantyPeriod", getWarrantyPeriod())
            .toString();
    }
}
