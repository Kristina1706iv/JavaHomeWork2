class HomeWorkone{
    public static void main(String[] args) {
		PrintTreeWords();
		CheckSumsSign();
		PrintColor();
		CompareNambers();
	}
    public static void PrintTreeWords() {
		System.out.println("Orange");
		System.out.println("Banana");
		System.out.println("Aplle");
	}
	static void CheckSumsSign() {
		int a = 17;
		int b = 6;
		if (a + b >= 0)	{	
		    System.out.println("Positive");
		} else if ( a + b <= 0) {
		    System.out.println("Negative");
		}
	}
	static void PrintColor() {
		int value = -100;
		if (value < 0) {
		    System.out.println("RED");
		} 
		if (value > 1) {
		    System.out.println("YELLOW");
		} else if (value < 100) {
		    System.out.println("YELLOW"); 
		}
		if (value < 99) {
		    System.out.println("GREEN");
		}
	}
	public static void CompareNambers() {
		int a = 20;
		int b = 19;
		if (a >= b) {
			System.out.println("a>=b");
		} else if (a <= b) {
			System.out.println("a<b");
		}
	}
}