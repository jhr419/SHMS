package com.ruoyi.sensor.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.sensor.domain.FamSensor;
import com.ruoyi.sensor.service.IFamSensorService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * SensorController
 * 
 * @author ruoyi
 * @date 2024-10-01
 */
@RestController
@RequestMapping("/sensor/sensor")
public class FamSensorController extends BaseController
{
    @Autowired
    private IFamSensorService famSensorService;

    /**
     * 查询Sensor列表
     */
    @PreAuthorize("@ss.hasPermi('sensor:sensor:list')")
    @GetMapping("/list")
    public TableDataInfo list(FamSensor famSensor)
    {
        startPage();
        List<FamSensor> list = famSensorService.selectFamSensorList(famSensor);
        return getDataTable(list);
    }

    /**
     * 导出Sensor列表
     */
    @PreAuthorize("@ss.hasPermi('sensor:sensor:export')")
    @Log(title = "Sensor", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, FamSensor famSensor)
    {
        List<FamSensor> list = famSensorService.selectFamSensorList(famSensor);
        ExcelUtil<FamSensor> util = new ExcelUtil<FamSensor>(FamSensor.class);
        util.exportExcel(response, list, "Sensor数据");
    }

    /**
     * 获取Sensor详细信息
     */
    @PreAuthorize("@ss.hasPermi('sensor:sensor:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(famSensorService.selectFamSensorById(id));
    }

    /**
     * 新增Sensor
     */
    @PreAuthorize("@ss.hasPermi('sensor:sensor:add')")
    @Log(title = "Sensor", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody FamSensor famSensor)
    {
        return toAjax(famSensorService.insertFamSensor(famSensor));
    }

    /**
     * 修改Sensor
     */
    @PreAuthorize("@ss.hasPermi('sensor:sensor:edit')")
    @Log(title = "Sensor", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody FamSensor famSensor)
    {
        return toAjax(famSensorService.updateFamSensor(famSensor));
    }

    /**
     * 删除Sensor
     */
    @PreAuthorize("@ss.hasPermi('sensor:sensor:remove')")
    @Log(title = "Sensor", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(famSensorService.deleteFamSensorByIds(ids));
    }
}
