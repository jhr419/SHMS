package com.ruoyi.sensor.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.sensor.mapper.FamSensorMapper;
import com.ruoyi.sensor.domain.FamSensor;
import com.ruoyi.sensor.service.IFamSensorService;

/**
 * SensorService业务层处理
 * 
 * @author ruoyi
 * @date 2024-10-01
 */
@Service
public class FamSensorServiceImpl implements IFamSensorService 
{
    @Autowired
    private FamSensorMapper famSensorMapper;

    /**
     * 查询Sensor
     * 
     * @param id Sensor主键
     * @return Sensor
     */
    @Override
    public FamSensor selectFamSensorById(Long id)
    {
        return famSensorMapper.selectFamSensorById(id);
    }

    /**
     * 查询Sensor列表
     * 
     * @param famSensor Sensor
     * @return Sensor
     */
    @Override
    public List<FamSensor> selectFamSensorList(FamSensor famSensor)
    {
        return famSensorMapper.selectFamSensorList(famSensor);
    }

    /**
     * 新增Sensor
     * 
     * @param famSensor Sensor
     * @return 结果
     */
    @Override
    public int insertFamSensor(FamSensor famSensor)
    {
        return famSensorMapper.insertFamSensor(famSensor);
    }

    /**
     * 修改Sensor
     * 
     * @param famSensor Sensor
     * @return 结果
     */
    @Override
    public int updateFamSensor(FamSensor famSensor)
    {
        return famSensorMapper.updateFamSensor(famSensor);
    }

    /**
     * 批量删除Sensor
     * 
     * @param ids 需要删除的Sensor主键
     * @return 结果
     */
    @Override
    public int deleteFamSensorByIds(Long[] ids)
    {
        return famSensorMapper.deleteFamSensorByIds(ids);
    }

    /**
     * 删除Sensor信息
     * 
     * @param id Sensor主键
     * @return 结果
     */
    @Override
    public int deleteFamSensorById(Long id)
    {
        return famSensorMapper.deleteFamSensorById(id);
    }
}
