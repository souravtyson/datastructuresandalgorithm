package chapter2;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		String[] platform1 = { "PS4" };
		String[] platform2 = { "3DS", "Wii U" };

		VideoGame game1 = new VideoGame("Battlefield 1", 2001, "M", platform1);
		VideoGame game2 = new VideoGame("Pokemon Sun", 2016, "E", platform2);
		VideoGame game3 = new VideoGame("The Legend of Zelda", 2017, "E",
				platform2);
		
		Vector<VideoGame> games = new Vector<VideoGame>();
		games.add(game1);
		games.add(game2);
		games.add(game3);
		
		
			System.out.println(games);

	}

}
