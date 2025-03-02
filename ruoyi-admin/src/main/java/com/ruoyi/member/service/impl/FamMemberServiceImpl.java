package com.ruoyi.member.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.member.mapper.FamMemberMapper;
import com.ruoyi.member.domain.FamMember;
import com.ruoyi.member.service.IFamMemberService;

/**
 * MemberService业务层处理
 * 
 * @author Henry
 * @date 2024-10-01
 */
@Service
public class FamMemberServiceImpl implements IFamMemberService 
{
    @Autowired
    private FamMemberMapper famMemberMapper;

    /**
     * 查询Member
     * 
     * @param id Member主键
     * @return Member
     */
    @Override
    public FamMember selectFamMemberById(Long id)
    {
        return famMemberMapper.selectFamMemberById(id);
    }

    /**
     * 查询Member列表
     * 
     * @param famMember Member
     * @return Member
     */
    @Override
    public List<FamMember> selectFamMemberList(FamMember famMember)
    {
        return famMemberMapper.selectFamMemberList(famMember);
    }

    /**
     * 新增Member
     * 
     * @param famMember Member
     * @return 结果
     */
    @Override
    public int insertFamMember(FamMember famMember)
    {
        return famMemberMapper.insertFamMember(famMember);
    }

    /**
     * 修改Member
     * 
     * @param famMember Member
     * @return 结果
     */
    @Override
    public int updateFamMember(FamMember famMember)
    {
        return famMemberMapper.updateFamMember(famMember);
    }

    /**
     * 批量删除Member
     * 
     * @param ids 需要删除的Member主键
     * @return 结果
     */
    @Override
    public int deleteFamMemberByIds(Long[] ids)
    {
        return famMemberMapper.deleteFamMemberByIds(ids);
    }

    /**
     * 删除Member信息
     * 
     * @param id Member主键
     * @return 结果
     */
    @Override
    public int deleteFamMemberById(Long id)
    {
        return famMemberMapper.deleteFamMemberById(id);
    }
}
