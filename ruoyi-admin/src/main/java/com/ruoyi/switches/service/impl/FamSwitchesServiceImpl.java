package com.ruoyi.switches.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.switches.mapper.FamSwitchesMapper;
import com.ruoyi.switches.domain.FamSwitches;
import com.ruoyi.switches.service.IFamSwitchesService;

/**
 * SwitchesService业务层处理
 * 
 * @author ruoyi
 * @date 2024-10-01
 */
@Service
public class FamSwitchesServiceImpl implements IFamSwitchesService 
{
    @Autowired
    private FamSwitchesMapper famSwitchesMapper;

    /**
     * 查询Switches
     * 
     * @param id Switches主键
     * @return Switches
     */
    @Override
    public FamSwitches selectFamSwitchesById(Long id)
    {
        return famSwitchesMapper.selectFamSwitchesById(id);
    }

    /**
     * 查询Switches列表
     * 
     * @param famSwitches Switches
     * @return Switches
     */
    @Override
    public List<FamSwitches> selectFamSwitchesList(FamSwitches famSwitches)
    {
        return famSwitchesMapper.selectFamSwitchesList(famSwitches);
    }

    /**
     * 新增Switches
     * 
     * @param famSwitches Switches
     * @return 结果
     */
    @Override
    public int insertFamSwitches(FamSwitches famSwitches)
    {
        return famSwitchesMapper.insertFamSwitches(famSwitches);
    }

    /**
     * 修改Switches
     * 
     * @param famSwitches Switches
     * @return 结果
     */
    @Override
    public int updateFamSwitches(FamSwitches famSwitches)
    {
        return famSwitchesMapper.updateFamSwitches(famSwitches);
    }

    /**
     * 批量删除Switches
     * 
     * @param ids 需要删除的Switches主键
     * @return 结果
     */
    @Override
    public int deleteFamSwitchesByIds(Long[] ids)
    {
        return famSwitchesMapper.deleteFamSwitchesByIds(ids);
    }

    /**
     * 删除Switches信息
     * 
     * @param id Switches主键
     * @return 结果
     */
    @Override
    public int deleteFamSwitchesById(Long id)
    {
        return famSwitchesMapper.deleteFamSwitchesById(id);
    }
}
