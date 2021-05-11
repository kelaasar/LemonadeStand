import java.util.Scanner;

public class LemonadeStand {
	private int cups;
	private int lemons;
	private int sugar;
	private int ice;
	private double balance;
	private String weather;
	private int fahrenheit;
	private int celsius;
	private double cup25Price;
	private double cup50Price;
	private double cup100Price;
	private double lemon10Price;
	private double lemon30Price;
	private double lemon75Price;
	private double sugar8Price;
	private double sugar20Price;
	private double sugar48Price;
	private double ice100Price;
	private double ice250Price;
	private double ice500Price;
	private double pricePerCup;
	private double lemonsPerPitcher;
	private double sugarPerPitcher;
	private double icePerCup;
	
	Scanner input = new Scanner(System.in);
	
	public LemonadeStand() {
	    cups = 0;
	    lemons = 0;
	    sugar = 0;
	    ice = 0;
	    balance = 20.0;
	    weather = "";
	    cup25Price = 0.90;
		cup50Price = 1.72;
		cup100Price = 2.87;
		lemon10Price = 0.51;
		lemon30Price = 2.15;
		lemon75Price = 4.48;
		sugar8Price = 0.74;
		sugar20Price = 1.59;
		sugar48Price = 3.40;
		ice100Price = 0.80;
		ice250Price = 2.12;
		ice500Price = 3.68;
		pricePerCup = 25;
		lemonsPerPitcher = 4;
		sugarPerPitcher = 4;
		icePerCup = 4;
		
	}
	
	public void cupPrices() {
		int choice = 0;
		int amount = 0;
		System.out.println("Acquisition: Paper Cups");
		System.out.printf("You have %d Paper Cups and $%.2f\n\n", cups, balance);
		if (weather.equals("Clear and Sunny")) {
			System.out.println("You can buy: \n");
			System.out.printf("1. 25 Paper Cups for %.2f\n", cup25Price);
			System.out.printf("2. 50 Paper Cups for %.2f\n", cup50Price);
			System.out.printf("3. 100 Paper Cups for %.2f\n", cup100Price);
			if (cup25Price <= balance) {
				//error if buy > balance
				Double price = new Double(0.0);
				Integer amountPerStack = new Integer(0);
				Boolean invalidChoice = new Boolean(false);
				Boolean invalidAmount = new Boolean(false);
				do {
					invalidChoice = false;
					invalidAmount = false;
					System.out.print("\nSelect which to buy: ");
					choice = input.nextInt();
					if (choice == 1) {
						price = cup25Price;
						amountPerStack = 25;
					} else if (choice == 2) {
						price = cup50Price;
						amountPerStack = 50;
					} else if (choice == 3) {
						price = cup100Price;
						amountPerStack = 100;
					} else {
						System.out.println("Invalid Choice.");
						invalidChoice = true;
					}
					if (!invalidChoice) {
						System.out.printf("\nEnter how many stacks of %d Paper Cups you would like to buy: ", amountPerStack);
						amount = input.nextInt();
						invalidAmount = verifyPurchase(amount*price);
						if (invalidAmount)
							System.out.println("You don't have enough money for this purchase.");
					}
				} while(invalidAmount || invalidChoice);
				cupAcquisition(amount, price, amountPerStack);
			} else
				System.out.println("Your broke ass cannot afford any of these options.\n\n\n\n\n\n");
			
		}
		else if (weather.equals("Cloudy")) {
			//4% cheaper than sunny
			System.out.println("You can buy: \n");
			System.out.printf("1. 25 Paper Cups for %.2f\n", cup25Price*.96);
			System.out.printf("2. 50 Paper Cups for %.2f\n", cup50Price*.96);
			System.out.printf("3. 100 Paper Cups for %.2f\n", cup100Price*.96);
			if (cup25Price*.96 <= balance) {
				//error if buy > balance
				Double price = new Double(0.0);
				Integer amountPerStack = new Integer(0);
				Boolean invalidChoice = new Boolean(false);
				Boolean invalidAmount = new Boolean(false);
				do {
					invalidChoice = false;
					invalidAmount = false;
					System.out.print("\nSelect which to buy: ");
					choice = input.nextInt();
					if (choice == 1) {
						price = cup25Price*.96;
						amountPerStack = 25;
					} else if (choice == 2) {
						price = cup50Price*.96;
						amountPerStack = 50;
					} else if (choice == 3) {
						price = cup100Price*.96;
						amountPerStack = 100;
					} else {
						System.out.println("Invalid Choice.");
						invalidChoice = true;
					}
					if (!invalidChoice) {
						System.out.printf("\nEnter how many stacks of %d Paper Cups you would like to buy: ", amountPerStack);
						amount = input.nextInt();
						invalidAmount = verifyPurchase(amount*price);
						if (invalidAmount)
							System.out.println("You don't have enough money for this purchase.");
					}
				} while(invalidAmount || invalidChoice);
				cupAcquisition(amount, price, amountPerStack);
			} else
				System.out.println("\nYour broke ass cannot afford any of these options.");
			
		}
		else if (weather.equals("Hazy")) {
			//7% cheaper than sunny
			System.out.println("You can buy: \n");
			System.out.printf("1. 25 Paper Cups for %.2f\n", cup25Price*.93);
			System.out.printf("2. 50 Paper Cups for %.2f\n", cup50Price*.93);
			System.out.printf("3. 100 Paper Cups for %.2f\n", cup100Price*.93);
			if (cup25Price*.93 <= balance) {
				//error if buy > balance
				Double price = new Double(0.0);
				Integer amountPerStack = new Integer(0);
				Boolean invalidChoice = new Boolean(false);
				Boolean invalidAmount = new Boolean(false);
				do {
					invalidChoice = false;
					invalidAmount = false;
					System.out.print("\nSelect which to buy: ");
					choice = input.nextInt();
					if (choice == 1) {
						price = cup25Price*.93;
						amountPerStack = 25;
					} else if (choice == 2) {
						price = cup50Price*.93;
						amountPerStack = 50;
					} else if (choice == 3) {
						price = cup100Price*.93;
						amountPerStack = 100;
					} else {
						System.out.println("Invalid Choice.");
						invalidChoice = true;
					}
					if (!invalidChoice) {
						System.out.printf("\nEnter how many stacks of %d Paper Cups you would like to buy: ", amountPerStack);
						amount = input.nextInt();
						invalidAmount = verifyPurchase(amount*price);
						if (invalidAmount)
							System.out.println("You don't have enough money for this purchase.");
					}
				} while(invalidAmount || invalidChoice);
				cupAcquisition(amount, price, amountPerStack);
			} else
				System.out.println("\nYour broke ass cannot afford any of these options.");
			
		}
		else if (weather.equals("Overcast")) {
			//11% cheaper than sunny
			System.out.println("You can buy: \n");
			System.out.printf("1. 25 Paper Cups for %.2f\n", cup25Price*.89);
			System.out.printf("2. 50 Paper Cups for %.2f\n", cup50Price*.89);
			System.out.printf("3. 100 Paper Cups for %.2f\n", cup100Price*.89);
				if (cup25Price*.89 <= balance) {
				//error if buy > balance
				Double price = new Double(0.0);
				Integer amountPerStack = new Integer(0);
				Boolean invalidChoice = new Boolean(false);
				Boolean invalidAmount = new Boolean(false);
				do {
					invalidChoice = false;
					invalidAmount = false;
					System.out.print("\nSelect which to buy: ");
					choice = input.nextInt();
					if (choice == 1) {
						price = cup25Price*.89;
						amountPerStack = 25;
					} else if (choice == 2) {
						price = cup50Price*.89;
						amountPerStack = 50;
					} else if (choice == 3) {
						price = cup100Price*.89;
						amountPerStack = 100;
					} else {
						System.out.println("Invalid Choice.");
						invalidChoice = true;
					}
					if (!invalidChoice) {
						System.out.printf("\nEnter how many stacks of %d Paper Cups you would like to buy: ", amountPerStack);
						amount = input.nextInt();
						invalidAmount = verifyPurchase(amount*price);
						if (invalidAmount)
							System.out.println("You don't have enough money for this purchase.");
					}
				} while(invalidAmount || invalidChoice);
				cupAcquisition(amount, price, amountPerStack);
			} else
				System.out.println("\nYour broke ass cannot afford any of these options.");
			
		}
		else if (weather.equals("Rainy")) {
			System.out.println("You can buy: \n");
			System.out.printf("1. 25 Paper Cups for %.2f\n", cup25Price*.86);
			System.out.printf("2. 50 Paper Cups for %.2f\n", cup50Price*.86);
			System.out.printf("3. 100 Paper Cups for %.2f\n", cup100Price*.86);
			if (cup25Price*.86 <= balance) {
				//14% cheaper than sunny
				//error if buy > balance
				Double price = new Double(0.0);
				Integer amountPerStack = new Integer(0);
				Boolean invalidChoice = new Boolean(false);
				Boolean invalidAmount = new Boolean(false);
				do {
					invalidChoice = false;
					invalidAmount = false;
					System.out.print("\nSelect which to buy: ");
					choice = input.nextInt();
					if (choice == 1) {
						price = cup25Price*.86;
						amountPerStack = 25;
					} else if (choice == 2) {
						price = cup50Price*.86;
						amountPerStack = 50;
					} else if (choice == 3) {
						price = cup100Price*.86;
						amountPerStack = 100;
					} else {
						System.out.println("Invalid Choice.");
						invalidChoice = true;
					}
					if (!invalidChoice) {
						System.out.printf("\nEnter how many stacks of %d Paper Cups you would like to buy: ", amountPerStack);
						amount = input.nextInt();
						invalidAmount = verifyPurchase(amount*price);
						if (invalidAmount)
							System.out.println("You don't have enough money for this purchase.");
					}
				} while(invalidAmount || invalidChoice);
				cupAcquisition(amount, price, amountPerStack);
			} else
				System.out.println("\nYour broke ass cannot afford any of these options.");
		}	
	}
	
	public void lemonPrices() {
		int choice = 0;
		int amount = 0;
		System.out.println("Acquisition: Lemons");
		System.out.printf("You have %d Lemons and $%.2f\n\n", lemons, balance);
		if (weather.equals("Clear and Sunny")) {
			System.out.println("You can buy: \n");
			System.out.printf("1. 10 Lemons for %.2f\n", lemon10Price);
			System.out.printf("2. 30 Lemons for %.2f\n", lemon30Price);
			System.out.printf("3. 75 Lemons for %.2f\n", lemon75Price);
			if (lemon10Price <= balance) {
				//error if buy > balance
				Double price = new Double(0.0);
				Integer amountPerStack = new Integer(0);
				Boolean invalidChoice = new Boolean(false);
				Boolean invalidAmount = new Boolean(false);
				do {
					invalidChoice = false;
					invalidAmount = false;
					System.out.print("\nSelect which to buy: ");
					choice = input.nextInt();
					if (choice == 1) {
						price = lemon10Price;
						amountPerStack = 10;
					} else if (choice == 2) {
						price = lemon30Price;
						amountPerStack = 30;
					} else if (choice == 3) {
						price = lemon75Price;
						amountPerStack = 75;
					} else {
						System.out.println("Invalid Choice.");
						invalidChoice = true;
					}
					if (!invalidChoice) {
						System.out.printf("\nEnter how many stacks of %d Lemons you would like to buy: ", amountPerStack);
						amount = input.nextInt();
						invalidAmount = verifyPurchase(amount*price);
						if (invalidAmount)
							System.out.println("You don't have enough money for this purchase.");
					}
				} while(invalidAmount || invalidChoice);
				lemonAcquisition(amount, price, amountPerStack);
			} else
				System.out.println("\nYour broke ass cannot afford any of these options.");
			
		}
		else if (weather.equals("Cloudy")) {
			//4% cheaper than sunny
			System.out.println("You can buy: \n");
			System.out.printf("1. 10 Lemons for %.2f\n", lemon10Price*.96);
			System.out.printf("2. 30 Lemons for %.2f\n", lemon30Price*.96);
			System.out.printf("3. 75 Lemons for %.2f\n", lemon75Price*.96);
			if (lemon10Price*.96 <= balance) {
				//error if buy > balance
				Double price = new Double(0.0);
				Integer amountPerStack = new Integer(0);
				Boolean invalidChoice = new Boolean(false);
				Boolean invalidAmount = new Boolean(false);
				do {
					invalidChoice = false;
					invalidAmount = false;
					System.out.print("\nSelect which to buy: ");
					choice = input.nextInt();
					if (choice == 1) {
						price = lemon10Price*.96;
						amountPerStack = 10;
					} else if (choice == 2) {
						price = lemon30Price*.96;
						amountPerStack = 30;
					} else if (choice == 3) {
						price = lemon75Price*.96;
						amountPerStack = 75;
					} else {
						System.out.println("Invalid Choice.");
						invalidChoice = true;
					}
					if (!invalidChoice) {
						System.out.printf("\nEnter how many stacks of %d Lemons you would like to buy: ", amountPerStack);
						amount = input.nextInt();
						invalidAmount = verifyPurchase(amount*price);
						if (invalidAmount)
							System.out.println("You don't have enough money for this purchase.");
					}
				} while(invalidAmount || invalidChoice);
				lemonAcquisition(amount, price, amountPerStack);
			} else
				System.out.println("\nYour broke ass cannot afford any of these options.");
			
		}
		else if (weather.equals("Hazy")) {
			//7% cheaper than sunny
			System.out.println("You can buy: \n");
			System.out.printf("1. 10 Lemons for %.2f\n", lemon10Price*.93);
			System.out.printf("2. 30 Lemons for %.2f\n", lemon30Price*.93);
			System.out.printf("3. 75 Lemons for %.2f\n", lemon75Price*.93);
			if (lemon10Price*.93 <= balance) {
				//error if buy > balance
				Double price = new Double(0.0);
				Integer amountPerStack = new Integer(0);
				Boolean invalidChoice = new Boolean(false);
				Boolean invalidAmount = new Boolean(false);
				do {
					invalidChoice = false;
					invalidAmount = false;
					System.out.print("\nSelect which to buy: ");
					choice = input.nextInt();
					if (choice == 1) {
						price = lemon10Price*.93;
						amountPerStack = 10;
					} else if (choice == 2) {
						price = lemon30Price*.93;
						amountPerStack = 30;
					} else if (choice == 3) {
						price = lemon75Price*.93;
						amountPerStack = 75;
					} else {
						System.out.println("Invalid Choice.");
						invalidChoice = true;
					}
					if (!invalidChoice) {
						System.out.printf("\nEnter how many stacks of %d Lemons you would like to buy: ", amountPerStack);
						amount = input.nextInt();
						invalidAmount = verifyPurchase(amount*price);
						if (invalidAmount)
							System.out.println("You don't have enough money for this purchase.");
					}
				} while(invalidAmount || invalidChoice);
				lemonAcquisition(amount, price, amountPerStack);
			} else
				System.out.println("\nYour broke ass cannot afford any of these options.");
		}
		else if (weather.equals("Overcast")) {
			//11% cheaper than sunny
			System.out.println("You can buy: \n");
			System.out.printf("1. 10 Lemons for %.2f\n", lemon10Price*.89);
			System.out.printf("2. 30 Lemons for %.2f\n", lemon30Price*.89);
			System.out.printf("3. 75 Lemons for %.2f\n", lemon75Price*.89);
			if (lemon10Price*.89 <= balance) {
				//error if buy > balance
				Double price = new Double(0.0);
				Integer amountPerStack = new Integer(0);Boolean invalidChoice = new Boolean(false);
				Boolean invalidAmount = new Boolean(false);
				do {
					invalidChoice = false;
					invalidAmount = false;
					System.out.print("\nSelect which to buy: ");
					choice = input.nextInt();
					if (choice == 1) {
						price = lemon10Price*.89;
						amountPerStack = 10;
					} else if (choice == 2) {
						price = lemon30Price*.89;
						amountPerStack = 30;
					} else if (choice == 3) {
						price = lemon75Price*.89;
						amountPerStack = 75;
					} else {
						System.out.println("Invalid Choice.");
						invalidChoice = true;
					}
					if (!invalidChoice) {
						System.out.printf("\nEnter how many stacks of %d Lemons you would like to buy: ", amountPerStack);
						amount = input.nextInt();
						invalidAmount = verifyPurchase(amount*price);
						if (invalidAmount)
							System.out.println("You don't have enough money for this purchase.");
					}
				} while(invalidAmount || invalidChoice);
				lemonAcquisition(amount, price, amountPerStack);
			} else
				System.out.println("\nYour broke ass cannot afford any of these options.");
			
		}
		else if (weather.equals("Rainy")) {
			//14% cheaper than sunny
			System.out.println("You can buy: \n");
			System.out.printf("1. 10 Lemons for %.2f\n", lemon10Price*.86);
			System.out.printf("2. 30 Lemons for %.2f\n", lemon30Price*.86);
			System.out.printf("3. 75 Lemons for %.2f\n", lemon75Price*.86);
			if (lemon10Price*.86 <= balance) {
				//error if buy > balance
				Double price = new Double(0.0);
				Integer amountPerStack = new Integer(0);
				Boolean invalidChoice = new Boolean(false);
				Boolean invalidAmount = new Boolean(false);
				do {
					invalidChoice = false;
					invalidAmount = false;
					System.out.print("\nSelect which to buy: ");
					choice = input.nextInt();
					if (choice == 1) {
						price = lemon10Price*.86;
						amountPerStack = 10;
					} else if (choice == 2) {
						price = lemon30Price*.86;
						amountPerStack = 30;
					} else if (choice == 3) {
						price = lemon75Price*.86;
						amountPerStack = 75;
					} else {
						System.out.println("Invalid Choice.");
						invalidChoice = true;
					}
					if (!invalidChoice) {
						System.out.printf("\nEnter how many stacks of %d Lemons you would like to buy: ", amountPerStack);
						amount = input.nextInt();
						invalidAmount = verifyPurchase(amount*price);
						if (invalidAmount)
							System.out.println("You don't have enough money for this purchase.");
					}
				} while(invalidAmount || invalidChoice);
				lemonAcquisition(amount, price, amountPerStack);
			} else
				System.out.println("\nYour broke ass cannot afford any of these options.");
		}	
	}
	public void sugarPrices() {
		int choice = 0;
		int amount = 0;
		System.out.println("Acquisition: Cups of Sugar");
		System.out.printf("You have %d Cups of Sugar and $%.2f\n\n", sugar, balance);
		if (weather.equals("Clear and Sunny")) {
			System.out.println("You can buy: \n");
			System.out.printf("1. 8 Cups of Sugar for %.2f\n", sugar8Price);
			System.out.printf("2. 20 Cups of Sugar for %.2f\n", sugar20Price);
			System.out.printf("3. 48 Cups of Sugar for %.2f\n", sugar48Price);
			if (sugar8Price <= balance) {
				//error if buy > balance
				Double price = new Double(0.0);
				Integer amountPerStack = new Integer(0);
				Boolean invalidChoice = new Boolean(false);
				Boolean invalidAmount = new Boolean(false);
				do {
					invalidChoice = false;
					invalidAmount = false;
					System.out.print("\nSelect which to buy: ");
					choice = input.nextInt();
					if (choice == 1) {
						price = sugar8Price;
						amountPerStack = 8;
					} else if (choice == 2) {
						price = sugar20Price;
						amountPerStack = 20;
					} else if (choice == 3) {
						price = sugar48Price;
						amountPerStack = 48;
					} else {
						System.out.println("Invalid Choice.");
						invalidChoice = true;
					}
					if (!invalidChoice) {
						System.out.printf("\nEnter how many stacks of %d Sugar you would like to buy: ", amountPerStack);
						amount = input.nextInt();
						invalidAmount = verifyPurchase(amount*price);
						if (invalidAmount)
							System.out.println("You don't have enough money for this purchase.");
					}
				} while(invalidAmount || invalidChoice);
				sugarAcquisition(amount, price, amountPerStack);
			} else
				System.out.println("\nYour broke ass cannot afford any of these options.");
		}
		else if (weather.equals("Cloudy")) {
			//4% cheaper than sunny
			System.out.println("You can buy: \n");
			System.out.printf("1. 8 Cups of Sugar for %.2f\n", sugar8Price*.96);
			System.out.printf("2. 20 Cups of Sugar for %.2f\n", sugar20Price*.96);
			System.out.printf("3. 48 Cups of Sugar for %.2f\n", sugar48Price*.96);
			if (sugar8Price*.96 <= balance) {
				//error if buy > balance
				Double price = new Double(0.0);
				Integer amountPerStack = new Integer(0);
				Boolean invalidChoice = new Boolean(false);
				Boolean invalidAmount = new Boolean(false);
				do {
					invalidChoice = false;
					invalidAmount = false;
					System.out.print("\nSelect which to buy: ");
					choice = input.nextInt();
					if (choice == 1) {
						price = sugar8Price*.96;
						amountPerStack = 8;
					} else if (choice == 2) {
						price = sugar20Price*.96;
						amountPerStack = 20;
					} else if (choice == 3) {
						price = sugar48Price*.96;
						amountPerStack = 48;
					} else {
						System.out.println("Invalid Choice.");
						invalidChoice = true;
					}
					if (!invalidChoice) {
						System.out.printf("\nEnter how many stacks of %d Sugar you would like to buy: ", amountPerStack);
						amount = input.nextInt();
						invalidAmount = verifyPurchase(amount*price);
						if (invalidAmount)
							System.out.println("You don't have enough money for this purchase.");
					}
				} while(invalidAmount || invalidChoice);
				sugarAcquisition(amount, price, amountPerStack);
			} else
				System.out.println("\nYour broke ass cannot afford any of these options.");
		}
		else if (weather.equals("Hazy")) {
			//7% cheaper than sunny
			System.out.println("You can buy: \n");
			System.out.printf("1. 8 Cups of Sugar for %.2f\n", sugar8Price*.93);
			System.out.printf("2. 20 Cups of Sugar for %.2f\n", sugar20Price*.93);
			System.out.printf("3. 48 Cups of Sugar for %.2f\n", sugar48Price*.93);
			if (sugar8Price*.93 <= balance) {
				//error if buy > balance
				Double price = new Double(0.0);
				Integer amountPerStack = new Integer(0);
				Boolean invalidChoice = new Boolean(false);
				Boolean invalidAmount = new Boolean(false);
				do {
					invalidChoice = false;
					invalidAmount = false;
					System.out.print("\nSelect which to buy: ");
					choice = input.nextInt();
					if (choice == 1) {
						price = sugar8Price*.93;
						amountPerStack = 8;
					} else if (choice == 2) {
						price = sugar20Price*.93;
						amountPerStack = 20;
					} else if (choice == 3) {
						price = sugar48Price*.93;
						amountPerStack = 48;
					} else {
						System.out.println("Invalid Choice.");
						invalidChoice = true;
					}
					if (!invalidChoice) {
						System.out.printf("\nEnter how many stacks of %d Sugar you would like to buy: ", amountPerStack);
						amount = input.nextInt();
						invalidAmount = verifyPurchase(amount*price);
						if (invalidAmount)
							System.out.println("You don't have enough money for this purchase.");
					}
				} while(invalidAmount || invalidChoice);
				sugarAcquisition(amount, price, amountPerStack);
			} else
				System.out.println("\nYour broke ass cannot afford any of these options.");
		}
		else if (weather.equals("Overcast")) {
			//11% cheaper than sunny
			System.out.println("You can buy: \n");
			System.out.printf("1. 8 Cups of Sugar for %.2f\n", sugar8Price*.89);
			System.out.printf("2. 20 Cups of Sugar for %.2f\n", sugar20Price*.89);
			System.out.printf("3. 48 Cups of Sugar for %.2f\n", sugar48Price*.89);
			if (sugar8Price*.89 <= balance) {
				//error if buy > balance
				Double price = new Double(0.0);
				Integer amountPerStack = new Integer(0);
				Boolean invalidChoice = new Boolean(false);
				Boolean invalidAmount = new Boolean(false);
				do {
					invalidChoice = false;
					invalidAmount = false;
					System.out.print("\nSelect which to buy: ");
					choice = input.nextInt();
					if (choice == 1) {
						price = sugar8Price*.89;
						amountPerStack = 8;
					} else if (choice == 2) {
						price = sugar20Price*.89;
						amountPerStack = 20;
					} else if (choice == 3) {
						price = sugar48Price*.89;
						amountPerStack = 48;
					} else {
						System.out.println("Invalid Choice.");
						invalidChoice = true;
					}
					if (!invalidChoice) {
						System.out.printf("\nEnter how many stacks of %d Sugar you would like to buy: ", amountPerStack);
						amount = input.nextInt();
						invalidAmount = verifyPurchase(amount*price);
						if (invalidAmount)
							System.out.println("You don't have enough money for this purchase.");
					}
				} while(invalidAmount || invalidChoice);
				sugarAcquisition(amount, price, amountPerStack);
			} else
				System.out.println("\nYour broke ass cannot afford any of these options.");
				
			}
		else if (weather.equals("Rainy")) {
			//14% cheaper than sunny
			System.out.println("You can buy: \n");
			System.out.printf("1. 8 Cups of Sugar for %.2f\n", sugar8Price*.86);
			System.out.printf("2. 20 Cups of Sugar for %.2f\n", sugar20Price*.86);
			System.out.printf("3. 48 Cups of Sugar for %.2f\n", sugar48Price*.86);
			if (sugar8Price*.86 <= balance) {
				//error if buy > balance
				Double price = new Double(0.0);
				Integer amountPerStack = new Integer(0);
				Boolean invalidChoice = new Boolean(false);
				Boolean invalidAmount = new Boolean(false);
				do {
					invalidChoice = false;
					invalidAmount = false;
					System.out.print("\nSelect which to buy: ");
					choice = input.nextInt();
					if (choice == 1) {
						price = sugar8Price*.86;
						amountPerStack = 8;
					} else if (choice == 2) {
						price = sugar20Price*.86;
						amountPerStack = 20;
					} else if (choice == 3) {
						price = sugar48Price*.86;
						amountPerStack = 48;
					} else {
						System.out.println("Invalid Choice.");
						invalidChoice = true;
					}
					if (!invalidChoice) {
						System.out.printf("\nEnter how many stacks of %d Sugar you would like to buy: ", amountPerStack);
						amount = input.nextInt();
						invalidAmount = verifyPurchase(amount*price);
						if (invalidAmount)
							System.out.println("You don't have enough money for this purchase.");
					}
				} while(invalidAmount || invalidChoice);
				sugarAcquisition(amount, price, amountPerStack);
			} else
				System.out.println("\nYour broke ass cannot afford any of these options.");			
		}	
	}
	public void icePrices() {
		int amount = 0;
		int choice = 0;
		System.out.println("Acquisition: Ice Cubes");
		System.out.printf("You have %d Ice Cubes and $%.2f\n\n", ice, balance);
		if (weather.equals("Clear and Sunny")) {
			System.out.println("You can buy: \n");
			System.out.printf("1. 100 Ice Cubes for %.2f\n", ice100Price);
			System.out.printf("2. 250 Ice Cubes for %.2f\n", ice250Price);
			System.out.printf("3. 500 Ice Cubes for %.2f\n", ice500Price);
			if (ice100Price <= balance) {
				//error if buy > balance
				Double price = new Double(0.0);
				Integer amountPerStack = new Integer(0);
				Boolean invalidChoice = new Boolean(false);
				Boolean invalidAmount = new Boolean(false);
				do {
					invalidChoice = false;
					invalidAmount = false;
					System.out.print("\nSelect which to buy: ");
					choice = input.nextInt();
					if (choice == 1) {
						price = ice100Price;
						amountPerStack = 100;
					} else if (choice == 2) {
						price = ice250Price;
						amountPerStack = 250;
					} else if (choice == 3) {
						price = ice500Price;
						amountPerStack = 500;
					} else {
						System.out.println("Invalid Choice.");
						invalidChoice = true;
					}
					if (!invalidChoice) {
						System.out.printf("\nEnter how many stacks of %d Ice Cubes you would like to buy: ", amountPerStack);
						amount = input.nextInt();
						invalidAmount = verifyPurchase(amount*price);
						if (invalidAmount)
							System.out.println("You don't have enough money for this purchase.");
					}
				} while(invalidAmount || invalidChoice);
				iceAcquisition(amount, price, amountPerStack);
			} else
				System.out.println("\nYour broke ass cannot afford any of these options.");
			
		} else if (weather.equals("Cloudy")) {
			//4% cheaper than sunny
			System.out.println("You can buy: \n");
			System.out.printf("1. 100 Ice Cubes for %.2f\n", ice100Price*.96);
			System.out.printf("2. 250 Ice Cubes for %.2f\n", ice250Price*.96);
			System.out.printf("3. 500 Ice Cubes for %.2f\n", ice500Price*.96);
			if (ice100Price*.96 <= balance) {
				//error if buy > balance
				Double price = new Double(0.0);
				Integer amountPerStack = new Integer(0);
				Boolean invalidChoice = new Boolean(false);
				Boolean invalidAmount = new Boolean(false);
				do {
					invalidChoice = false;
					invalidAmount = false;
					System.out.print("\nSelect which to buy: ");
					choice = input.nextInt();
					if (choice == 1) {
						price = ice100Price*.96;
						amountPerStack = 100;
					} else if (choice == 2) {
						price = ice250Price*.96;
						amountPerStack = 250;
					} else if (choice == 3) {
						price = ice500Price*.96;
						amountPerStack = 500;
					} else {
						System.out.println("Invalid Choice.");
						invalidChoice = true;
					}
					if (!invalidChoice) {
						System.out.printf("\nEnter how many stacks of %d Ice Cubes you would like to buy: ", amountPerStack);
						amount = input.nextInt();
						invalidAmount = verifyPurchase(amount*price);
						if (invalidAmount)
							System.out.println("You don't have enough money for this purchase.");
					}
				} while(invalidAmount || invalidChoice);
				iceAcquisition(amount, price, amountPerStack);
			} else
				System.out.println("\nYour broke ass cannot afford any of these options.");
		
		} else if (weather.equals("Hazy")) {
			//7% cheaper than sunny
			System.out.println("You can buy: \n");
			System.out.printf("1. 100 Ice Cubes for %.2f\n", ice100Price*.93);
			System.out.printf("2. 250 Ice Cubes for %.2f\n", ice250Price*.93);
			System.out.printf("3. 500 Ice Cubes for %.2f\n", ice500Price*.93);
			if (ice100Price*.93 <= balance) {
				//error if buy > balance
				Double price = new Double(0.0);
				Integer amountPerStack = new Integer(0);
				Boolean invalidChoice = new Boolean(false);
				Boolean invalidAmount = new Boolean(false);
				do {
					invalidChoice = false;
					invalidAmount = false;
					System.out.print("\nSelect which to buy: ");
					choice = input.nextInt();
					System.out.print("\nEnter how many Ice Cubes you would like to buy: ");
					amount = input.nextInt();
					if (choice == 1) {
						price = ice100Price*.93;
						amountPerStack = 100;
					} else if (choice == 2) {
						price = ice250Price*.93;
						amountPerStack = 250;
					} else if (choice == 3) {
						price = ice500Price*.93;
						amountPerStack = 500;
					} else {
						System.out.println("Invalid Choice.");
						invalidChoice = true;
					}
					if (!invalidChoice) {
						invalidAmount = verifyPurchase(price);
						if(invalidAmount)
							System.out.println("You don't have enough money for this purchase.");
					}
				} while(invalidAmount || invalidChoice);
				iceAcquisition(amount, price, amountPerStack);
			} else
				System.out.println("\nYour broke ass cannot afford any of these options.");
			
		} else if (weather.equals("Overcast")) {
			//11% cheaper than sunny
			System.out.println("You can buy: \n");
			System.out.printf("1. 100 Ice Cubes for %.2f\n", ice100Price*.89);
			System.out.printf("2. 250 Ice Cubes for %.2f\n", ice250Price*.89);
			System.out.printf("3. 500 Ice Cubes for %.2f\n", ice500Price*.89);
			if (ice100Price*.89 <= balance) {
				//error if buy > balance
				Double price = new Double(0.0);
				Integer amountPerStack = new Integer(0);
				Boolean invalidChoice = new Boolean(false);
				Boolean invalidAmount = new Boolean(false);
				do {
					invalidChoice = false;
					invalidAmount = false;
					System.out.print("\nSelect which to buy: ");
					choice = input.nextInt();
					if (choice == 1) {
						price = ice100Price*.89;
						amountPerStack = 100;
					} else if (choice == 2) {
						price = ice250Price*.89;
						amountPerStack = 250;
					} else if (choice == 3) {
						price = ice500Price*.89;
						amountPerStack = 500;
					} else {
						System.out.println("Invalid Choice.");
						invalidChoice = true;
					}
					if (!invalidChoice) {
						System.out.printf("\nEnter how many stacks of %d Ice Cubes you would like to buy: ", amountPerStack);
						amount = input.nextInt();
						invalidAmount = verifyPurchase(amount*price);
						if (invalidAmount)
							System.out.println("You don't have enough money for this purchase.");
					}
				} while(invalidAmount || invalidChoice);
				iceAcquisition(amount, price, amountPerStack);
			} else
				System.out.println("\nYour broke ass cannot afford any of these options.");
			
		} else if (weather.equals("Rainy")) {
			//14% cheaper than sunny
			System.out.println("You can buy: \n");
			System.out.printf("1. 100 Ice Cubes for %.2f\n", ice100Price*.86);
			System.out.printf("2. 250 Ice Cubes for %.2f\n", ice250Price*.86);
			System.out.printf("3. 500 Ice Cubes for %.2f\n", ice500Price*.86);
			if (ice100Price*.86 <= balance) {
				//error if buy > balance
				Double price = new Double(0.0);
				Integer amountPerStack = new Integer(0);
				Boolean invalidChoice = new Boolean(false);
				Boolean invalidAmount = new Boolean(false);
				do {
					System.out.print("\nSelect which to buy: ");
					choice = input.nextInt();
					if (choice == 1) {
						price = ice100Price*.86;
						amountPerStack = 100;
					} else if (choice == 2) {
						price = ice250Price*.86;
						amountPerStack = 250;
					} else if (choice == 3) {
						price = ice500Price*.86;
						amountPerStack = 500;
					} else {
						System.out.println("Invalid Choice.");
						invalidChoice = true;
					}
					if (!invalidChoice) {
						System.out.printf("\nEnter how many stacks of %d Ice Cubes you would like to buy: ", amountPerStack);
						amount = input.nextInt();
						invalidAmount = verifyPurchase(amount*price);
						if (invalidAmount)
							System.out.println("You don't have enough money for this purchase.");
					}
					invalidChoice = false;
					invalidAmount = false;
				} while(invalidAmount || invalidChoice);
				iceAcquisition(amount, price, amountPerStack);
			} else
				System.out.println("\nYour broke ass cannot afford any of these options.");
		}	
	}
	public void priceAndQuality() {
		System.out.println("Price/Quality Control\n");
		System.out.println("1. Price per Cup: " + pricePerCup);
		System.out.println("2. Lemons per Pitcher: " + lemonsPerPitcher);
		System.out.println("3. Sugar per Pitcher: " + sugarPerPitcher);
		System.out.println("4. Ice per Cup: " + icePerCup);
		System.out.println("\nWhich would you like to change?");
	}
	public void beginDay() {
		
	}
	public void bankrupt() {
		
	}
	public boolean verifyPurchase(double amount) {
		if (amount > balance)
			return true;
		else
			return false;
	}
	public void addBalance(double amount) {
		balance += amount;
	}
	public void subtractBalance(double amount) {
		balance -= amount;
	}
	public void setCups(int c) {
		cups += c;
	}
	public void setLemons(int l) {
		lemons += l;
	}
	public void setSugar(int s) {
		sugar += s;
	}
	public void setIce(int i) {
		ice += i;
	}
	public double getBalance() {
		return balance;
	}
	public int getCups() {
		return cups;
	}
	public int getLemons() {
		return lemons;
	}
	public int getSugar() {
		return sugar;
	}
	public int getIce() {
		return ice;
	}
	public void cupAcquisition(int amount, double price, int amountPerStack) {
		subtractBalance(price*amount);
		setCups(amountPerStack*amount);
	}
	public void lemonAcquisition(int amount, double price, int amountPerStack) {
		subtractBalance(price*amount);
		setLemons(amountPerStack*amount);
	}
	public void sugarAcquisition(int amount, double price, int amountPerStack) {
		subtractBalance(price*amount);
		setSugar(amountPerStack*amount);
	}
	public void iceAcquisition(int amount, double price, int amountPerStack) {
		subtractBalance(price*amount);
		setIce(amountPerStack*amount);
	}
}
