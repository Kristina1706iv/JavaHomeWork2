/**
*Java 1.Home Work #2
*
* @author Kristina
* @version 14.02.2022
*/
class HomeWorktwo{
	 public static void main(String[] args) {
            System.out.println(within10and20(-6, 17));
        isPositiveOrNegative(10);
            System.out.println(isNegative(-17));
        printWordNTime("Word", 6);
    }

    public static boolean within10and20(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <=20) {
            return true;
        }
            return false;
    }

    public static void  isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Positive");
        }
        else {
            System.out.println("Negative");
        }
    }

    public static boolean isNegative(int x) {
        if (x >= 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void printWordNTime(String str, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("[" + i + "]" + " " + str);
        }
    }

    }