package mhf.service;
import java.util.List;

import mhf.bean.Game;
public interface GameService {

	public int getGameByLevel(int level);

	public int insert(int i, int j);
	
	public List getAll();
	
}
