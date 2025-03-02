package com.ruoyi.member.mapper;

import java.util.List;
import com.ruoyi.member.domain.FamMember;

/**
 * MemberMapper接口
 * 
 * @author Henry
 * @date 2024-10-01
 */
public interface FamMemberMapper 
{
    /**
     * 查询Member
     * 
     * @param id Member主键
     * @return Member
     */
    public FamMember selectFamMemberById(Long id);

    /**
     * 查询Member列表
     * 
     * @param famMember Member
     * @return Member集合
     */
    public List<FamMember> selectFamMemberList(FamMember famMember);

    /**
     * 新增Member
     * 
     * @param famMember Member
     * @return 结果
     */
    public int insertFamMember(FamMember famMember);

    /**
     * 修改Member
     * 
     * @param famMember Member
     * @return 结果
     */
    public int updateFamMember(FamMember famMember);

    /**
     * 删除Member
     * 
     * @param id Member主键
     * @return 结果
     */
    public int deleteFamMemberById(Long id);

    /**
     * 批量删除Member
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteFamMemberByIds(Long[] ids);
}
