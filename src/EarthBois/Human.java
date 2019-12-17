package EarthBois;
import java.util.Random;

public class Human {
	//inventory
	static int food;
	static int clothing;
	static int water;
	static int horse;
	static int ale;
	static int goldPieces;
	static int potion;
	
	
	//statistics
	static int strength;
	static int speed;
	static int health;
	static int hunger;
	static int thirst;
	static int sobriety;
	static int restfulness;
	
	//shop
	static int foodPrice;
	static int waterPrice;
	static int clothingPrice;
	static int alePrice;
	static int horsePrice;
	static int potionPrice;
	
	//earth
	static int distance;
	static int days;
	
	public Human() {
		//inventory
		Random randomizer = new Random();
		food = 3;
		clothing = 1;
		water = 5;
		horse = 0;
		ale = 0;
		goldPieces = 25;
		potion = 0;
		
		//statistics
		strength = randomizer.nextInt((2 - 1) + 1) + 1;
		speed = randomizer.nextInt((5 - 3) + 1) + 3;
		health = randomizer.nextInt((17 - 13) + 1) + 13;
		hunger = 0;
		thirst = 0;
		sobriety = 100;
		restfulness = randomizer.nextInt((100 - 90) + 1) + 90;
		
		//shop
		foodPrice = 5;
		waterPrice =3;
		clothingPrice = 7;
		alePrice = 10;
		horsePrice = 35;
		potionPrice = 15;
		
		//earth
		distance = 175;
		days = 1;
	}
	
	public static void inventory() {
    	System.out.println("\n--------------Inventory--------------");
    	System.out.println("1: You have: " + food + " piece(s) of meat");
    	System.out.println("2: You have: " + clothing + " garment(s)");
    	System.out.println("3: You have: " + water + " bottle(s) of water");
    	System.out.println("4: You have: " + horse + " horse(s)");
    	System.out.println("5: You have: " + ale + " cask(s) of ale");
    	System.out.println("6: You have: " + goldPieces + " gold coin(s)");
    	System.out.println("7: You have: " + potion + " mysterious potion(s)");
    	System.out.println("--------------------------------------");
    }
	public static void stats() {
		System.out.println("--------------Statistics--------------");
    	System.out.println("Your strength modifier: " + strength);
    	System.out.println("Your speed modifier: " + speed);
    	System.out.println("You have: " + health + " hitpoints");
    	System.out.println("You are: " + hunger + "% hungry");
    	System.out.println("You are: " + thirst + "% thirsty");
    	System.out.println("You are: " + sobriety + "% sober");
    	System.out.println("You are: " + restfulness + "% rested");
    	System.out.println("---------------------------------------");
	}
	public static void shop() {
		System.out.println("-----------------Shop------------------");
    	System.out.println("1: Food - " + foodPrice + " coins");
    	System.out.println("2: Water - " + waterPrice + " coins");
    	System.out.println("3: Clothes - " + clothingPrice + " coins");
    	System.out.println("4: Ale - " + alePrice + " coins");
    	System.out.println("5: Horse - " + horsePrice + " coins");
    	System.out.println("6: Potion - " + potionPrice + " coins");
    	System.out.println("7: EXIT\n");
	}
}
