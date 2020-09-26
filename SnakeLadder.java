public class SnakeLadder{
	
	public static int position = 0;
	//public static int die = 0;
	
	public static void main(String[] args) {
		System.out.println("Snake and Ladder game played with single player at start position 0");
		while(position < 100) {
			int check = checkOption();
			
		}
	}
	
	public static int rollDie() {
		int die = 0;
		while(die == 0) {
			die = (int)(Math.floor(Math.random() * 10) % 7);
		}
		System.out.print("Die Value is : "+die);
		return die;
	}
	public static int checkOption() {
		int check = (int)(Math.floor(Math.random() * 10) % 3);
		int value = rollDie();
		switch(check) {
			case 1:
				position = position + value;
				if (position > 100)
					position = position - value;
				System.out.println(" [Option : Ladder]\n" + " Player moves to position " + position + "\n");
				break;
				
			case 2:
				position = position - value;
				if (position < 0)
					position = 0;
				System.out.println(" [Option : Snake]\n" + " Player moves to position " + position + "\n");
				break;
			default:
				System.out.println(" [Option : No Play]\n" + " Player remains at position " + position + "\n");
				
				
		}
		
		return check;
	}
}