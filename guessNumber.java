import java.util.Scanner;

public class guessNumber{
	public static void main(String[] args){
		System.out.println("I will pick a random number between 1 and your number");
		System.out.println("What is your number?");
		Scanner sc = new Scanner(System.in);

		int upper = sc.nextInt();
		System.out.format("Your number is %d",upper);
	}
}
