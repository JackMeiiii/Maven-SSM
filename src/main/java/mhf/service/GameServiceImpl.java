package mhf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;

import mhf.bean.Game;
import mhf.dao.GameMapper;

@Service("GameService")
public class GameServiceImpl implements GameService {

	private GameMapper gameMapper;

	public GameMapper getGameMapper() {
		return gameMapper;
	}

	@Autowired
	public void setGameMapper(GameMapper gameMapper) {
		this.gameMapper = gameMapper;
	}

	public int getGameByLevel(int level) {
		return gameMapper.selectByPrimaryKey(level);
	}

	public int insert(int i, int j) {
		Game game = new Game();
		game.setLevel(i);
		game.setPrize(j);
		return gameMapper.insert(game);
	}

	public List getAll() {
		return gameMapper.getAll();
	}
}
