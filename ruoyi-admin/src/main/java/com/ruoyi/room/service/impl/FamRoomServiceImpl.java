package com.ruoyi.room.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.room.mapper.FamRoomMapper;
import com.ruoyi.room.domain.FamRoom;
import com.ruoyi.room.service.IFamRoomService;

/**
 * RoomService业务层处理
 * 
 * @author ruoyi
 * @date 2024-10-01
 */
@Service
public class FamRoomServiceImpl implements IFamRoomService 
{
    @Autowired
    private FamRoomMapper famRoomMapper;

    /**
     * 查询Room
     * 
     * @param id Room主键
     * @return Room
     */
    @Override
    public FamRoom selectFamRoomById(Long id)
    {
        return famRoomMapper.selectFamRoomById(id);
    }

    /**
     * 查询Room列表
     * 
     * @param famRoom Room
     * @return Room
     */
    @Override
    public List<FamRoom> selectFamRoomList(FamRoom famRoom)
    {
        return famRoomMapper.selectFamRoomList(famRoom);
    }

    /**
     * 新增Room
     * 
     * @param famRoom Room
     * @return 结果
     */
    @Override
    public int insertFamRoom(FamRoom famRoom)
    {
        return famRoomMapper.insertFamRoom(famRoom);
    }

    /**
     * 修改Room
     * 
     * @param famRoom Room
     * @return 结果
     */
    @Override
    public int updateFamRoom(FamRoom famRoom)
    {
        return famRoomMapper.updateFamRoom(famRoom);
    }

    /**
     * 批量删除Room
     * 
     * @param ids 需要删除的Room主键
     * @return 结果
     */
    @Override
    public int deleteFamRoomByIds(Long[] ids)
    {
        return famRoomMapper.deleteFamRoomByIds(ids);
    }

    /**
     * 删除Room信息
     * 
     * @param id Room主键
     * @return 结果
     */
    @Override
    public int deleteFamRoomById(Long id)
    {
        return famRoomMapper.deleteFamRoomById(id);
    }
}
