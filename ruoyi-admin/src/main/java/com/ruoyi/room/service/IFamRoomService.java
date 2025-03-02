package com.ruoyi.room.service;

import java.util.List;
import com.ruoyi.room.domain.FamRoom;

/**
 * RoomService接口
 * 
 * @author ruoyi
 * @date 2024-10-01
 */
public interface IFamRoomService 
{
    /**
     * 查询Room
     * 
     * @param id Room主键
     * @return Room
     */
    public FamRoom selectFamRoomById(Long id);

    /**
     * 查询Room列表
     * 
     * @param famRoom Room
     * @return Room集合
     */
    public List<FamRoom> selectFamRoomList(FamRoom famRoom);

    /**
     * 新增Room
     * 
     * @param famRoom Room
     * @return 结果
     */
    public int insertFamRoom(FamRoom famRoom);

    /**
     * 修改Room
     * 
     * @param famRoom Room
     * @return 结果
     */
    public int updateFamRoom(FamRoom famRoom);

    /**
     * 批量删除Room
     * 
     * @param ids 需要删除的Room主键集合
     * @return 结果
     */
    public int deleteFamRoomByIds(Long[] ids);

    /**
     * 删除Room信息
     * 
     * @param id Room主键
     * @return 结果
     */
    public int deleteFamRoomById(Long id);
}
