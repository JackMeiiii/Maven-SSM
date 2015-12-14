package mhf.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import mhf.bean.Game;
import mhf.service.GameService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class GameController {

	private GameService gameService;

	public GameService getGameService() {
		return gameService;
	}

	@Autowired
	public void setGameService(GameService gameService) {
		this.gameService = gameService;
	}

	@RequestMapping("/ShowGame")
	public String getAll(HttpServletRequest request) {
		List<Game> list = new ArrayList<Game>();
		List<Game> list2=new ArrayList<Game>();
		list = gameService.getAll();
	for(Game game:list){
		System.out.println(game.getLevel()+"    "+game.getPrize());
	}
		request.setAttribute("list", list);
		return "ShowGame";
	}

	@RequestMapping("/{level}/ShowPrize")
	public String getPrizeByLevel(@PathVariable int level,
			HttpServletRequest request) {
		int prize = gameService.getGameByLevel(12);
		request.setAttribute("prize", prize);
		return "ShowPrize";
	}
}
