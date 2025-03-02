package com.ruoyi.switches.controller;

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
import com.ruoyi.switches.domain.FamSwitches;
import com.ruoyi.switches.service.IFamSwitchesService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * SwitchesController
 * 
 * @author ruoyi
 * @date 2024-10-01
 */
@RestController
@RequestMapping("/switches/switches")
public class FamSwitchesController extends BaseController
{
    @Autowired
    private IFamSwitchesService famSwitchesService;

    /**
     * 查询Switches列表
     */
    @PreAuthorize("@ss.hasPermi('switches:switches:list')")
    @GetMapping("/list")
    public TableDataInfo list(FamSwitches famSwitches)
    {
        startPage();
        List<FamSwitches> list = famSwitchesService.selectFamSwitchesList(famSwitches);
        return getDataTable(list);
    }

    /**
     * 导出Switches列表
     */
    @PreAuthorize("@ss.hasPermi('switches:switches:export')")
    @Log(title = "Switches", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, FamSwitches famSwitches)
    {
        List<FamSwitches> list = famSwitchesService.selectFamSwitchesList(famSwitches);
        ExcelUtil<FamSwitches> util = new ExcelUtil<FamSwitches>(FamSwitches.class);
        util.exportExcel(response, list, "Switches数据");
    }

    /**
     * 获取Switches详细信息
     */
    @PreAuthorize("@ss.hasPermi('switches:switches:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(famSwitchesService.selectFamSwitchesById(id));
    }

    /**
     * 新增Switches
     */
    @PreAuthorize("@ss.hasPermi('switches:switches:add')")
    @Log(title = "Switches", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody FamSwitches famSwitches)
    {
        return toAjax(famSwitchesService.insertFamSwitches(famSwitches));
    }

    /**
     * 修改Switches
     */
    @PreAuthorize("@ss.hasPermi('switches:switches:edit')")
    @Log(title = "Switches", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody FamSwitches famSwitches)
    {
        return toAjax(famSwitchesService.updateFamSwitches(famSwitches));
    }

    /**
     * 删除Switches
     */
    @PreAuthorize("@ss.hasPermi('switches:switches:remove')")
    @Log(title = "Switches", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(famSwitchesService.deleteFamSwitchesByIds(ids));
    }
}
