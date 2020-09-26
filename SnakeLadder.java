public class SnakeLadder{
	public static void main(String[] args) {
		System.out.println("Snake and Ladder game played with single player at start position 0");
		int n = rollDie();
	}
	
	public static int rollDie() {
		int check = (int)(Math.floor(Math.random() * 10) % 7);
		System.out.println("Die Value is : "+check);
		return check;
	}
}