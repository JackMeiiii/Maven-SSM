package ssi;

import mhf.bean.Game;
import mhf.service.GameService;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

@Controller
public class testGame {
	private static GameService gs;

	 @Before
	 public void test2(){
	 ApplicationContext text = new ClassPathXmlApplicationContext(
	 new String[] { "spring.xml", "spring-mybatis.xml" });
	 gs = (GameService) text.getBean("GameService");
	 }
	 @Test
	 public void test() {
	 Game game = gs.getGameByLevel(12);
	 System.out.println(game);
	 }

//	public static void main(String[] args) {
//		ApplicationContext text = new ClassPathXmlApplicationContext(
//				new String[] { "spring.xml", "spring-mybatis.xml" });
//		gs = (GameService) text.getBean("GameService");
//		// Game game=gs.getGameByLevel(12);
//		// System.out.println(game);
//		System.out.println(gs.insert(120, 10));
//	}
}
