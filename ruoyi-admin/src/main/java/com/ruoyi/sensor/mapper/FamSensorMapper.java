package com.ruoyi.sensor.mapper;

import java.util.List;
import com.ruoyi.sensor.domain.FamSensor;

/**
 * SensorMapper接口
 * 
 * @author ruoyi
 * @date 2024-10-01
 */
public interface FamSensorMapper 
{
    /**
     * 查询Sensor
     * 
     * @param id Sensor主键
     * @return Sensor
     */
    public FamSensor selectFamSensorById(Long id);

    /**
     * 查询Sensor列表
     * 
     * @param famSensor Sensor
     * @return Sensor集合
     */
    public List<FamSensor> selectFamSensorList(FamSensor famSensor);

    /**
     * 新增Sensor
     * 
     * @param famSensor Sensor
     * @return 结果
     */
    public int insertFamSensor(FamSensor famSensor);

    /**
     * 修改Sensor
     * 
     * @param famSensor Sensor
     * @return 结果
     */
    public int updateFamSensor(FamSensor famSensor);

    /**
     * 删除Sensor
     * 
     * @param id Sensor主键
     * @return 结果
     */
    public int deleteFamSensorById(Long id);

    /**
     * 批量删除Sensor
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteFamSensorByIds(Long[] ids);
}
