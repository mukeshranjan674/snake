public class SnakeLadder{
	
	public static int position = 0;
	
	public static void main(String[] args) {
		System.out.println("Snake and Ladder game played with single player at start position 0");
		int check = checkOption();
	}
	
	public static int rollDie() {
		int die = 0;
		while(die == 0) {
			die = (int)(Math.floor(Math.random() * 10) % 7);
		}
		System.out.println("Die Value is : "+die);
		return die;
	}
	public static int checkOption() {
		int check = (int)(Math.floor(Math.random() * 10) % 3);
		switch(check) {
			case 1:
				position = position + rollDie();
				System.out.println("[Option : Ladder]" + " Player moves to position " + position);
				break;
				
			case 2:
				position = position - rollDie();
				System.out.println("[Option : Snake]" + " Player moves to position " + position);
				break;
			default:
				System.out.println("[Option : No Play]" + " Player remains at position " + position);
				
		}
		return check;
	}
}