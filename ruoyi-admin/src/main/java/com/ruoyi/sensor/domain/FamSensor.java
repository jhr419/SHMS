package com.ruoyi.sensor.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * Sensor对象 fam_sensor
 * 
 * @author ruoyi
 * @date 2024-10-01
 */
public class FamSensor extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** Name */
    @Excel(name = "Name")
    private String sensorName;

    /** Type */
    @Excel(name = "Type")
    private String dataType;

    /** Value */
    @Excel(name = "Value")
    private String dataValue;

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
    public void setSensorName(String sensorName) 
    {
        this.sensorName = sensorName;
    }

    public String getSensorName() 
    {
        return sensorName;
    }
    public void setDataType(String dataType) 
    {
        this.dataType = dataType;
    }

    public String getDataType() 
    {
        return dataType;
    }
    public void setDataValue(String dataValue) 
    {
        this.dataValue = dataValue;
    }

    public String getDataValue() 
    {
        return dataValue;
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
            .append("sensorName", getSensorName())
            .append("dataType", getDataType())
            .append("dataValue", getDataValue())
            .append("roomId", getRoomId())
            .append("roomName", getRoomName())
            .toString();
    }
}
