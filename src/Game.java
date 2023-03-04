import java.util.ArrayList;
import java.util.Random;

public class Game {

	static void shuffle() {
		ArrayList<Integer> deck = new ArrayList<Integer>();
		for (int i = 0; i < 52; i++) {
			deck.add(5);
		}
		Random rand = new Random();
		for (int i = 0; i < 13; i++) {
			int randomIndex = rand.nextInt(52);
			int current = randomIndex;
			while (deck.get(current) != 5) {
				if (current >= 50) {
					current = 0; //starts it over
				}
				else {
					current += 2;
				}
			} //checks if current spot in deck is empty, moves along if it is
			System.out.println(current);
			deck.add(current, 0);
		}
		for (int i = 0; i < 13; i++) {
			int randomIndex = rand.nextInt(52);
			int current = randomIndex;
			while (deck.get(current) != 5) {
				if (current >= 50) {
					current = 0; //starts it over
				}
				else {
					current += 2;
				}
			} //checks if current spot in deck is empty, moves along if it is
			System.out.println(current);
			deck.add(current, 1);
		}
		for (int i = 0; i < 13; i++) {
			int randomIndex = rand.nextInt(52);
			int current = randomIndex;
			while (deck.get(current) != 5) {
				if (current >= 50) {
					current = 0; //starts it over
				}
				else {
					current += 2;
				}
			} //checks if current spot in deck is empty, moves along if it is
			System.out.println(current);
			deck.add(current, 2);
		}
		for (int i = 0; i < 13; i++) {
			int randomIndex = rand.nextInt(52);
			int current = randomIndex;
			while (deck.get(current) != 5) {
				if (current >= 50) {
					current = 0; //starts it over
				}
				else {
					current += 2;
				}
			} //checks if current spot in deck is empty, moves along if it is
			System.out.println(current);
			deck.add(current, 3);
		}
		for (int i = 0; i < 52; i++) {
			System.out.println(deck.get(i));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I'm going to make a game!");
		shuffle();
	}

}
