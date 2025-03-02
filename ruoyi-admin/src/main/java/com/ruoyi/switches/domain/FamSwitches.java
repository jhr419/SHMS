package com.ruoyi.switches.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * Switches对象 fam_switches
 * 
 * @author ruoyi
 * @date 2024-10-01
 */
public class FamSwitches extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** Name */
    @Excel(name = "Name")
    private String name;

    /** Status */
    @Excel(name = "Status")
    private String status;

    /** Appliance ID */
    @Excel(name = "Appliance ID")
    private Long relatedApplianceId;

    /** Appliance Name */
    @Excel(name = "Appliance Name")
    private String relatedApplianceName;

    /** Room ID */
    private Long roomId;

    /** Room Name */
    @Excel(name = "Room Name")
    private String roomName;

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
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setRelatedApplianceId(Long relatedApplianceId) 
    {
        this.relatedApplianceId = relatedApplianceId;
    }

    public Long getRelatedApplianceId() 
    {
        return relatedApplianceId;
    }
    public void setRelatedApplianceName(String relatedApplianceName) 
    {
        this.relatedApplianceName = relatedApplianceName;
    }

    public String getRelatedApplianceName() 
    {
        return relatedApplianceName;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("status", getStatus())
            .append("relatedApplianceId", getRelatedApplianceId())
            .append("relatedApplianceName", getRelatedApplianceName())
            .append("roomId", getRoomId())
            .append("roomName", getRoomName())
            .toString();
    }
}
