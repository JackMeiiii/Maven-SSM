package mhf.dao;

import mhf.bean.Game;

public interface GameMapper {
    int deleteByPrimaryKey(Integer level);

    int insert(Game record);

    int insertSelective(Game record);

    Game selectByPrimaryKey(Integer level);

    int updateByPrimaryKeySelective(Game record);

    int updateByPrimaryKey(Game record);
}