package com.ruoyi.appliances.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.appliances.mapper.FamAppliancesMapper;
import com.ruoyi.appliances.domain.FamAppliances;
import com.ruoyi.appliances.service.IFamAppliancesService;

/**
 * AppliancesService业务层处理
 * 
 * @author ruoyi
 * @date 2024-10-01
 */
@Service
public class FamAppliancesServiceImpl implements IFamAppliancesService 
{
    @Autowired
    private FamAppliancesMapper famAppliancesMapper;

    /**
     * 查询Appliances
     * 
     * @param id Appliances主键
     * @return Appliances
     */
    @Override
    public FamAppliances selectFamAppliancesById(Long id)
    {
        return famAppliancesMapper.selectFamAppliancesById(id);
    }

    /**
     * 查询Appliances列表
     * 
     * @param famAppliances Appliances
     * @return Appliances
     */
    @Override
    public List<FamAppliances> selectFamAppliancesList(FamAppliances famAppliances)
    {
        return famAppliancesMapper.selectFamAppliancesList(famAppliances);
    }

    /**
     * 新增Appliances
     * 
     * @param famAppliances Appliances
     * @return 结果
     */
    @Override
    public int insertFamAppliances(FamAppliances famAppliances)
    {
        return famAppliancesMapper.insertFamAppliances(famAppliances);
    }

    /**
     * 修改Appliances
     * 
     * @param famAppliances Appliances
     * @return 结果
     */
    @Override
    public int updateFamAppliances(FamAppliances famAppliances)
    {
        return famAppliancesMapper.updateFamAppliances(famAppliances);
    }

    /**
     * 批量删除Appliances
     * 
     * @param ids 需要删除的Appliances主键
     * @return 结果
     */
    @Override
    public int deleteFamAppliancesByIds(Long[] ids)
    {
        return famAppliancesMapper.deleteFamAppliancesByIds(ids);
    }

    /**
     * 删除Appliances信息
     * 
     * @param id Appliances主键
     * @return 结果
     */
    @Override
    public int deleteFamAppliancesById(Long id)
    {
        return famAppliancesMapper.deleteFamAppliancesById(id);
    }
}
