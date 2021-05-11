import java.util.Scanner;

public class LemonadeStandTest {
	static Scanner input = new Scanner(System.in);
	static LemonadeStand s = new LemonadeStand();
	public static void main(String[] args) {
		System.out.println("Welcome to the Lemonade Stand game!\n");
		System.out.print("How many days would you like to play for? ");
		int days = input.nextInt();
		System.out.println("\n");
		for (int i = 0; i < days; i++) {
			s.setWeather();
			s.setTemperature();
			inventory();
		}
	}
	public static void inventory() {
		System.out.println("Inventory/Purchasing");
		System.out.println("Weather: " + s.getWeather());
		System.out.printf("Temperature: %d\u00B0F / %d\u00B0C\n", s.getFahrenheit(), s.getCelsius());
		System.out.printf("You have $%.2f and:\n\n", s.getBalance());
		System.out.println(s.getCups() + " Paper cups");
		System.out.println(s.getLemons() + " Lemons");
		System.out.println(s.getSugar() + " Cups of Sugar");
		System.out.println(s.getIce() + " Ice Cubes\n");
		System.out.println("1. Next");
		System.out.println("2. Buy More Cups");
		System.out.println("3. Buy More Lemons");
		System.out.println("4. Buy More Sugar");
		System.out.println("5. Buy More Ice");
		System.out.println("6. Declare Bankruptcy");
		System.out.println("7. Help");
		System.out.print("\nEnter a choice: ");
		char choice = input.next().charAt(0);
		System.out.println("\n\n");
		menuChoice(choice);
	}
	public static void menuChoice(char choice) {
		if (choice == '1') {
			s.priceAndQuality();
			System.out.println("\n\n");
		}
		else if (choice == '2') {
			s.cupPrices();
			System.out.println("\n\n");
		}
		else if (choice == '3') {
			s.lemonPrices();
			System.out.println("\n\n");
		}
		else if (choice == '4') {
			s.sugarPrices();
			System.out.println("\n\n");
		}
		else if (choice == '5') {
			s.icePrices();
			System.out.println("\n\n");
		}
		else if (choice == '6') {
			
		}
		else if (choice == '7') {
			
		}
	}
}
