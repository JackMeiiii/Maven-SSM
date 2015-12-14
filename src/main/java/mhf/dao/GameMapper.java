package mhf.dao;

import java.util.List;

import mhf.bean.Game;

public interface GameMapper {
    int deleteByPrimaryKey(Integer level);

    int insert(Game record);

    int insertSelective(Game record);

    int selectByPrimaryKey(Integer level);

    int updateByPrimaryKeySelective(Game record);

    int updateByPrimaryKey(Game record);

	List getAll();
}