package mhf.service;
import mhf.bean.Game;
public interface GameService {

	public Game getGameByLevel(int level);

	public int insert(int i, int j);
	
}
