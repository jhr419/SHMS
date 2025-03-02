package com.ruoyi.member.controller;

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
import com.ruoyi.member.domain.FamMember;
import com.ruoyi.member.service.IFamMemberService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * MemberController
 * 
 * @author Henry
 * @date 2024-10-01
 */
@RestController
@RequestMapping("/member/member")
public class FamMemberController extends BaseController
{
    @Autowired
    private IFamMemberService famMemberService;

    /**
     * 查询Member列表
     */
    @PreAuthorize("@ss.hasPermi('member:member:list')")
    @GetMapping("/list")
    public TableDataInfo list(FamMember famMember)
    {
        startPage();
        List<FamMember> list = famMemberService.selectFamMemberList(famMember);
        return getDataTable(list);
    }

    /**
     * 导出Member列表
     */
    @PreAuthorize("@ss.hasPermi('member:member:export')")
    @Log(title = "Member", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, FamMember famMember)
    {
        List<FamMember> list = famMemberService.selectFamMemberList(famMember);
        ExcelUtil<FamMember> util = new ExcelUtil<FamMember>(FamMember.class);
        util.exportExcel(response, list, "Member数据");
    }

    /**
     * 获取Member详细信息
     */
    @PreAuthorize("@ss.hasPermi('member:member:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(famMemberService.selectFamMemberById(id));
    }

    /**
     * 新增Member
     */
    @PreAuthorize("@ss.hasPermi('member:member:add')")
    @Log(title = "Member", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody FamMember famMember)
    {
        return toAjax(famMemberService.insertFamMember(famMember));
    }

    /**
     * 修改Member
     */
    @PreAuthorize("@ss.hasPermi('member:member:edit')")
    @Log(title = "Member", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody FamMember famMember)
    {
        return toAjax(famMemberService.updateFamMember(famMember));
    }

    /**
     * 删除Member
     */
    @PreAuthorize("@ss.hasPermi('member:member:remove')")
    @Log(title = "Member", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(famMemberService.deleteFamMemberByIds(ids));
    }
}
