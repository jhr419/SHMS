package com.ruoyi.appliances.mapper;

import java.util.List;
import com.ruoyi.appliances.domain.FamAppliances;

/**
 * AppliancesMapper接口
 * 
 * @author ruoyi
 * @date 2024-10-01
 */
public interface FamAppliancesMapper 
{
    /**
     * 查询Appliances
     * 
     * @param id Appliances主键
     * @return Appliances
     */
    public FamAppliances selectFamAppliancesById(Long id);

    /**
     * 查询Appliances列表
     * 
     * @param famAppliances Appliances
     * @return Appliances集合
     */
    public List<FamAppliances> selectFamAppliancesList(FamAppliances famAppliances);

    /**
     * 新增Appliances
     * 
     * @param famAppliances Appliances
     * @return 结果
     */
    public int insertFamAppliances(FamAppliances famAppliances);

    /**
     * 修改Appliances
     * 
     * @param famAppliances Appliances
     * @return 结果
     */
    public int updateFamAppliances(FamAppliances famAppliances);

    /**
     * 删除Appliances
     * 
     * @param id Appliances主键
     * @return 结果
     */
    public int deleteFamAppliancesById(Long id);

    /**
     * 批量删除Appliances
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteFamAppliancesByIds(Long[] ids);
}
