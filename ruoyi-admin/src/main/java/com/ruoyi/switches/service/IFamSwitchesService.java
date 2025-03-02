package com.ruoyi.switches.service;

import java.util.List;
import com.ruoyi.switches.domain.FamSwitches;

/**
 * SwitchesService接口
 * 
 * @author ruoyi
 * @date 2024-10-01
 */
public interface IFamSwitchesService 
{
    /**
     * 查询Switches
     * 
     * @param id Switches主键
     * @return Switches
     */
    public FamSwitches selectFamSwitchesById(Long id);

    /**
     * 查询Switches列表
     * 
     * @param famSwitches Switches
     * @return Switches集合
     */
    public List<FamSwitches> selectFamSwitchesList(FamSwitches famSwitches);

    /**
     * 新增Switches
     * 
     * @param famSwitches Switches
     * @return 结果
     */
    public int insertFamSwitches(FamSwitches famSwitches);

    /**
     * 修改Switches
     * 
     * @param famSwitches Switches
     * @return 结果
     */
    public int updateFamSwitches(FamSwitches famSwitches);

    /**
     * 批量删除Switches
     * 
     * @param ids 需要删除的Switches主键集合
     * @return 结果
     */
    public int deleteFamSwitchesByIds(Long[] ids);

    /**
     * 删除Switches信息
     * 
     * @param id Switches主键
     * @return 结果
     */
    public int deleteFamSwitchesById(Long id);
}
