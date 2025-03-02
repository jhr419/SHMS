package com.ruoyi.room.controller;

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
import com.ruoyi.room.domain.FamRoom;
import com.ruoyi.room.service.IFamRoomService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * RoomController
 * 
 * @author ruoyi
 * @date 2024-10-01
 */
@RestController
@RequestMapping("/room/room")
public class FamRoomController extends BaseController
{
    @Autowired
    private IFamRoomService famRoomService;

    /**
     * 查询Room列表
     */
    @PreAuthorize("@ss.hasPermi('room:room:list')")
    @GetMapping("/list")
    public TableDataInfo list(FamRoom famRoom)
    {
        startPage();
        List<FamRoom> list = famRoomService.selectFamRoomList(famRoom);
        return getDataTable(list);
    }

    /**
     * 导出Room列表
     */
    @PreAuthorize("@ss.hasPermi('room:room:export')")
    @Log(title = "Room", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, FamRoom famRoom)
    {
        List<FamRoom> list = famRoomService.selectFamRoomList(famRoom);
        ExcelUtil<FamRoom> util = new ExcelUtil<FamRoom>(FamRoom.class);
        util.exportExcel(response, list, "Room数据");
    }

    /**
     * 获取Room详细信息
     */
    @PreAuthorize("@ss.hasPermi('room:room:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(famRoomService.selectFamRoomById(id));
    }

    /**
     * 新增Room
     */
    @PreAuthorize("@ss.hasPermi('room:room:add')")
    @Log(title = "Room", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody FamRoom famRoom)
    {
        return toAjax(famRoomService.insertFamRoom(famRoom));
    }

    /**
     * 修改Room
     */
    @PreAuthorize("@ss.hasPermi('room:room:edit')")
    @Log(title = "Room", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody FamRoom famRoom)
    {
        return toAjax(famRoomService.updateFamRoom(famRoom));
    }

    /**
     * 删除Room
     */
    @PreAuthorize("@ss.hasPermi('room:room:remove')")
    @Log(title = "Room", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(famRoomService.deleteFamRoomByIds(ids));
    }
}
