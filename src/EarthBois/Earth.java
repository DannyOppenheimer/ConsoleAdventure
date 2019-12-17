package EarthBois;
import java.util.Random;
import java.awt.Color;
import java.awt.Container;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.*;

public class Earth extends Human {
	JFrame window;
	Container container;
	JPanel jpanel;
	public Earth() {
		window = new JFrame();
		window.setSize(1000, 800);		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		window.setVisible(true);
		jpanel = new JPanel();
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		JFrame game = new JFrame();
		System.out.println("The world materilized around you, you are cold and wet. \nA narrow dirt path only leads fowards");
		Thread.sleep(2000);
		question();
		Human player1 = new Human();
		loadAndHelp();
		Earth.days();
		}
	
		private static void question() {
			Scanner questionScanner = new Scanner(System.in);
			String userName;
			System.out.println("\nWhat's your name?");
			userName = questionScanner.nextLine();
			System.out.println("Hello " + userName + "!\n");
			
		}
		
	    private static void loadAndHelp() throws InterruptedException {
	    	int percentage = -6;
	    	System.out.println("Creating Game and Player");
	    	System.out.print("|");
	    	while(percentage <= 100) {
	    		System.out.print("█");
	    		percentage = percentage += 3;
	    		Thread.sleep(10);
	    	}
	    	System.out.print("| 100%");
	    	Human.inventory();
	    	Human.stats();
	    	System.out.println("\nDone!");
	    	System.out.println("175 miles to go!");
	    	System.out.println("Each day, you can do 1 action. Either you can move, visit a shop, sleep, or use something from your inventory \n(you can check your stats or inventory at any time)!");
	    	System.out.println("The commands are: \"Move\" - walk fowards your speed stat, \"Inventory\" - open a window to use select items you own, \n\"Sleep\" - restore restfulness, \"Shop\" - open a window in which you can purchase more items, \"Stats\" - opens a window to view your player statistics");
	    	System.out.println("Good luck!\n"); 	
	    }
	   
	    public static void days() throws InterruptedException {
	    	Scanner dayScanner = new Scanner(System.in);
	    	if(distance <= 0) {
	    		//TEMPORARILY USING .ERR BELOW!!
	    		System.err.println("After " + days + " days of hard work, you see a clearing in the trees.\nYou step out into civilization.\nCongratulations! You win!");
	    		System.exit(0);
	    	}
	    	while(distance >= 0) {
	    		String dayChoice;
	    		System.out.println("What would you like your action to be?");
	    		dayChoice = dayScanner.nextLine().toLowerCase();
	    		if(dayChoice.contentEquals("move")) {
//Movement ----------------------------------------------------------------------------------------------------
	    			if(health >= 1) {
			    		if(thirst < 100 && hunger < 100 && restfulness > 1) {	
		    				if(horse >= 1) {
			    				distance -= speed + 10;
			    				System.out.println("You sidle up onto your horse...");
				    			System.out.println(distance + " miles left to go!");
				    			days++;
				    			if(clothing <= 0) {
				    				System.out.println("Your clothes are tattered, the wind seems to buffet you even more");
				    				if(thirst >= 88) {
				    					thirst = 100;
				    				} else if(thirst < 88) {
				    					thirst += 12;
				    				}
				    				if(hunger >= 92) {
				    					hunger = 100;
				    				} else if(hunger < 92) {
				    					hunger += 8;
				    				}
				    				if(restfulness <= 15) {
				    					restfulness = 0;
				    				} else if(restfulness > 15) {
				    					restfulness -= 15;
				    				}
				    			} else if(clothing > 0) {
					    			if(thirst >= 92) {
					    				thirst += 8;
					    			} else if(thirst < 95) {
					    				hunger = 100;
					    			} else if(hunger < 95) {
					    				hunger += 5;
					    			}
					    			if(restfulness <= 10) {
					    				restfulness = 0;
					    			} else if(restfulness > 10) { 
					    				restfulness -= 10;
					    			}
				    			}
				    			System.out.println("Day " + days + "\n");
				    			Earth.fightSequence();
			    			} else if(horse <= 1) {
			    				distance -= speed;
				    			System.out.println(distance + " miles left to go!");
				    			days++;
				    			if(clothing <= 0) {
				    				System.out.println("Your clothes are tattered, the wind seems to buffet you even more");
				    				if(hunger >= 90) {
				    					hunger = 100;
				    				} else if(hunger < 90) {
				    					hunger += 10;
				    				}
				    				if(thirst >= 86) {
				    					thirst = 100;
				    				} else if(thirst < 86) {
				    					thirst += 14;
				    				}
				    				if(restfulness <= 17) {
				    					restfulness = 0;
				    				} else if(restfulness > 17) {
				    					restfulness -= 17;
				    				}
				    			} else if(clothing > 0) {
					    			if (thirst >= 88) {
					    				thirst = 100;
					    			} else if( thirst < 88 ){
					    				thirst += 12;
					    			}
					    			if(hunger >= 93) {
					    				hunger = 100;
					    			} else if(hunger < 93) {
					    				hunger +=7;
					    			}
					    			if(restfulness <= 8) {
					    				restfulness = 100;
					    			} else if(restfulness > 8) {
					    				restfulness -= 8;
					    			}
				    			}
				    			System.out.println("Day " + days + "\n");
				    			Earth.fightSequence();
				    			
			    			}
			    		} else if(thirst >= 100 || hunger >= 100 || restfulness <= 1) {
			    			System.out.println("You stumble fowards, your vision becoming blurry");
			    			health--;
			    			if(hunger <= 99) {
			    				hunger++;
			    			}
			    			if(thirst <= 99) {
			    				thirst++;
			    			}
			    			if(restfulness >= 1) {
			    				restfulness--;
			    			}
			    			System.out.println("Thirst: " + thirst + "%, " + "Hunger: " + hunger + "%, " + "Restfulness: " + restfulness + " " + health + " hitpoints left");
			    			days++;
			    			distance--;
			    			System.out.println(distance + " long miles left to go.");
			    			System.out.println("Day " + days + "\n");
			    			Earth.fightSequence();
			    		}
	    			} else if(health <= 1) {
	    				//TEMPORARILY USING .ERR BELOW!!
	    				System.err.println("\nThe trees fade from around you. You collapse onto the hard path.");
	    				System.err.println("You lost on day " + days);
	    				System.exit(0);
	    			}
	    //Movement ----------------------------------------------------------------------------------------------------
	    		} else if(dayChoice.contentEquals("shop" ) || dayChoice.contentEquals("shp") || dayChoice.contentEquals("store") || dayChoice.contentEquals("visit a shop")) {
	    			shopWindow();	
	    		} else if(dayChoice.contentEquals("sleep") || dayChoice.contentEquals("slp")) {
	    			days++;
	    			restfulness = 100;
	    			System.out.println("You are well rested");
	    			System.out.println("Day " + days);
	    			System.out.println(distance + " miles left to go!\n");
	    			Earth.days();
	    		} else if(dayChoice.contentEquals("inventory") || dayChoice.contentEquals("inv") || dayChoice.contentEquals("inven") || dayChoice.contentEquals("ivty")) {
	    			Human.inventory();
	    			System.out.println("8: EXIT");
	    			Earth.inventoryWindow();
	    		} else {
	    			System.out.println("Error 1: Incorrect action");
	    			days();
	    		}
	    			
	    	}
	    }
	    public static void fightSequence() throws InterruptedException {
	    		Random diceNumber = new Random();
				int rollValue = diceNumber.nextInt(6) + 1;
				Animal enemy = new Animal();
				String name = enemy.name;
				int animalSpeed = enemy.animalSpeed;
				int animalAttack = enemy.animalAttack;
				int animalDefense = enemy.animalDefense;
				int animalReward = enemy.animalReward;
				int meatReward = enemy.meatReward;
				if(rollValue < 2 ) {
					System.out.println("A " + name + " blocks your path");
					if(speed >= animalSpeed) {
						String rollOrAttack;
						Scanner battleScanner = new Scanner(System.in);
						System.out.println("You attack first");
						//SPEEDY BOI
						while(animalDefense > 0 && health > 0) {
							System.out.println("Would you like to roll to attack or roll to run?");
							rollOrAttack= battleScanner.nextLine();
							if(rollOrAttack.contentEquals("attack")) {
								System.out.print("\nRolling");
								Thread.sleep(200);
								System.out.print(".");
								Thread.sleep(200);
								System.out.print(".");
								Thread.sleep(200);
								System.out.print(".");
								Random attackDice = new Random();
								int rollNumber = attackDice.nextInt(3) + 1;
								int damage = rollNumber + strength;
								animalDefense -= damage; 
								System.out.println("You did " + damage + " damage");
								System.out.println(animalDefense + " enemy hitpoints remaining.");
								Thread.sleep(500);
								if(animalDefense > 0 && health > 0) {
									System.out.print("\nEnemy Rolling");
									Thread.sleep(200);
									System.out.print(".");
									Thread.sleep(200);
									System.out.print(".");
									Thread.sleep(200);
									System.out.print(".");
									int enemyRollNumber = attackDice.nextInt(2) + 1;
									int enemyDamage = enemyRollNumber + animalAttack;
									health -= enemyDamage;
									System.out.println("You took " + enemyDamage + " damage");
									System.out.println("You have " + health + " hitpoints remaining.");
								}
							} else if(rollOrAttack.contentEquals("run")) {
								Random attackDice = new Random();
								int rollNumber = attackDice.nextInt(6) + 1;
								rollNumber += speed;
								if(rollNumber > 7) {
									System.out.println("Got away!\n");
									Earth.days();
								} else if(rollNumber <= 7) {
									System.out.println("Couldn't escape");
									if(animalDefense > 0 && health > 0) {
										System.out.print("\nEnemy Rolling");
										Thread.sleep(200);
										System.out.print(".");
										Thread.sleep(200);
										System.out.print(".");
										Thread.sleep(200);
										System.out.print(".");
										int enemyRollNumber = attackDice.nextInt(2) + 1;
										int enemyDamage = enemyRollNumber + animalAttack;
										health -= enemyDamage;
										System.out.println("You took " + enemyDamage + " damage");
										System.out.println("You have " + health + " hitpoints remaining.");
									}
								}
							} else {
								System.out.println("Error 3: Incorrect input");
							}
						} 
						if(health < 1) {
							System.err.println("\nThe trees fade from around you. You collapse onto the hard path, your assailent slipping back into the trees.");
		    				System.err.println("You lost on day " + days);
		    				System.exit(0);
						}
						System.out.println("Enemy Defeated!");
						System.out.println("You got " + animalReward + " coins, and " + meatReward + " pieces of meat\n");
						goldPieces += animalReward;
						food += meatReward;
						days();
						//SPEEDY BOI
					} else if(speed < animalSpeed ) {
						String rollOrAttack;
						Scanner battleScanner = new Scanner(System.in);
						System.out.println("You attack second");
						//SLOW BOI
						while(animalDefense > 0 && health > 0) {
							System.out.println("Would you like to roll to attack or roll to run?");
							rollOrAttack= battleScanner.nextLine();
							if(rollOrAttack.contentEquals("attack")) {
								Random attackDice = new Random();
								System.out.print("\nEnemy Rolling");
								Thread.sleep(200);
								System.out.print(".");
								Thread.sleep(200);
								System.out.print(".");
								Thread.sleep(200);
								System.out.print(".");
								int enemyRollNumber = attackDice.nextInt(2) + 1;
								int enemyDamage = enemyRollNumber + animalAttack;
								health -= enemyDamage;
								System.out.println("You took " + enemyDamage + " damage");
								System.out.println("You have " + health + " hitpoints remaining.");
								Thread.sleep(500);
								if(animalDefense > 0 && health > 0) {
									System.out.print("\nRolling");
									Thread.sleep(200);
									System.out.print(".");
									Thread.sleep(200);
									System.out.print(".");
									Thread.sleep(200);
									System.out.print(".");
									int rollNumber = attackDice.nextInt(3) + 1;
									int damage = rollNumber + strength;
									animalDefense -= damage; 
									System.out.println("You did " + damage + " damage");
									System.out.println(animalDefense + " enemy hitpoints remaining.");
								}
							} else if(rollOrAttack.contentEquals("run")) {
								Random attackDice = new Random();
								int rollNumber = attackDice.nextInt(6) + 1;
								rollNumber += speed;
								if(rollNumber > 7) {
									System.out.println("Got away!\n");
									Earth.days();
								} else if(rollNumber <= 7) {
									System.out.println("Couldn't escape");
									if(animalDefense > 0 && health > 0) {
										System.out.print("\nEnemy Rolling");
										Thread.sleep(200);
										System.out.print(".");
										Thread.sleep(200);
										System.out.print(".");
										Thread.sleep(200);
										System.out.print(".");
										int enemyRollNumber = attackDice.nextInt(2) + 1;
										int enemyDamage = enemyRollNumber + animalAttack;
										health -= enemyDamage;
										System.out.println("You took " + enemyDamage + " damage");
										System.out.println("You have " + health + " hitpoints remaining.");
									}
								}
							} else {
								System.out.println("Error 3: Incorrect input");
							}
							//SLOW BOI
						} 
						if(health < 1) {
							System.err.println("\nThe trees fade from around you. You collapse onto the hard path, your assailent slipping back into the trees.");
		    				System.err.println("You lost on day " + days);
		    				System.exit(0);
						}
						System.out.println("Enemy Defeated!");
						System.out.println("You got " + animalReward + " coins, and " + meatReward + " pieces of meat\n");
						goldPieces += animalReward;
						food += meatReward;
						days();
					}
				} else if(rollValue >= 2 ) {
					Earth.days();
				}
	    }
	    public static void inventoryWindow() throws InterruptedException {
	    	String invenID;
	    	Scanner inventoryChoice = new Scanner(System.in);
	    	System.out.println("Enter the item ID (the #) of the item you would like to use.");
			invenID = inventoryChoice.nextLine().toLowerCase();
			if(invenID.equals("1")) {
					if(food > 0) {
					System.out.println("Eating...");
					hunger = 0;
					System.out.println("You are " + hunger + "% hungry");
					food--;
					System.out.println(food + " pieces of meat left");
					inventoryWindow();
				} else if(food < 1) {
					System.out.println("You don't have enough of that in your inventory\n");
					inventoryWindow();
				}
			} else if(invenID.equals("2")) {
				if(clothing > 0) {
					System.out.println("You look at your clothes...\n");
					inventoryWindow();
				} else if(clothing < 1) {
					System.out.println("You don't have any clothes");
					inventoryWindow();
				}
			} else if(invenID.equals("3")) {
				if(water > 0) {
					System.out.println("Drinking...");
					thirst = 0;
					System.out.println("You are " + thirst + "% thirsty");
					water--;
					System.out.println(water + " bottles of water left");
					inventoryWindow();
				} else if(water < 1) {
					System.out.println("You don't have enough of that in your inventory\n");
					inventoryWindow();
				}
			} else if(invenID.equals("4")) {
				if(horse > 0) {
					System.out.println("You pet your horse, he nuzzles your arm");
					inventoryWindow();
				} else if(horse < 1) {
					System.out.println("You don't have a horse.\n");
					inventoryWindow();
				}
			} else if(invenID.equals("5")) {
				if(ale > 0) {
					System.out.println("Chugging... You become disoriented and weak.");
					health += 12;
					System.out.println("You have " + health + " hitpoints");
					ale--;
					sobriety -= 50;
					System.out.println("You are " + sobriety + "% sober");
					speed--;
					strength--;
					System.out.println(ale + " casks of ale left");
					inventoryWindow();
				} else if(ale < 1) {
					System.out.println("You don't have enough of that in your inventory\\n");
					inventoryWindow();
				}
			} else if(invenID.equals("6")) {
				if(goldPieces > 0) {
					System.out.println("Your money glints as rays of light shine thorugh the trees...");
					inventoryWindow();
				} else if(goldPieces < 1) {
					System.out.println("The emptiness of your money pouch seems to way more than if there were coins in it.\n");
					inventoryWindow();
				}
			} else if(invenID.equals("7")) {
				if(potion > 0) {
					System.out.println("Swigging...");
					health += 17;
					System.out.println("You have " + health + " hitpoints");
					potion--;
					System.out.println(potion + " vials of potion left");
					inventoryWindow();
				} else if(potion < 1) {
					System.out.println("You don't have enough of that in your inventory\n");
					inventoryWindow();
				}
			} else if(invenID.equals("8")) {
				System.out.println("\nExiting...");
				days++;
				System.out.println("Day " + days);
				Earth.days();
			} else {
				System.out.println("Error 4: Invalid inventory ID");
				inventoryWindow();
			}
	    }
	    public static void shopWindow() throws InterruptedException {
	    	System.out.println(" ");
			Human.shop();
			System.out.println("What would you like to buy? You have " + goldPieces + " coins.\n(Type the ID you would like to buy)");
			String shopChoice;
			Scanner shopScanner = new Scanner(System.in);
			shopChoice = shopScanner.nextLine();
			if(shopChoice.contentEquals("1")) {
				if(goldPieces >= 5) {
    				food++;
    				System.out.println("Purchased, you now have " + Human.food + " piece(s) of meat.");
    				goldPieces -= foodPrice;
    				shopWindow();
				} else if(goldPieces < 5) {
					System.out.println("Not enough coins...");
					shopWindow();
				}
			} else if(shopChoice.contentEquals("2")) {
				if(goldPieces >= 3) {
    				water++;
    				System.out.println("Purchased, you now have " + Human.water + " bottle(s) of water.");
    				goldPieces -= waterPrice;
    				shopWindow();
				} else if(goldPieces < 3) {
					System.out.println("Not enough coins...");
					shopWindow();
				}
			} else if(shopChoice.contentEquals("3")) {
				if(goldPieces >= 7) {
					clothing++;
    				System.out.println("Purchased, you now have " + Human.clothing + " garment(s).");
    				goldPieces -= clothingPrice;
    				shopWindow();
				} else if(goldPieces < 7) {
					System.out.println("Not enough coins...");
					shopWindow();
				}
			} else if(shopChoice.contentEquals("4")) {
				if(goldPieces >= 10) {
					ale++;
    				System.out.println("Purchased, you now have " + Human.ale + " cask(s) of ale.");
    				goldPieces -= alePrice;
    				shopWindow();
    				} else if(goldPieces < 10) {
					System.out.println("Not enough coins...");
					shopWindow();
				}
			} else if(shopChoice.contentEquals("5")) {
				if(goldPieces >= 35) {
					horse++;
    				System.out.println("Purchased, you now have " + Human.horse + " horse(s).");
    				goldPieces -= horsePrice;
    				shopWindow();
				} else if(goldPieces < 35) {
					System.out.println("Not enough coins...");
					shopWindow();
				}
			} else if(shopChoice.contentEquals("6")) {
				if(goldPieces >= 15) {
					potion++;
    				System.out.println("Purchased, you now have " + Human.potion + " potion(s).");
    				goldPieces -= potionPrice;
    				shopWindow();
				} else if(goldPieces < 15) {
					System.out.println("Not enough coins...");
					shopWindow();
				}
			} else if(shopChoice.contentEquals("7")) {
				System.out.println("\nExiting...");
				days++;
				System.out.println("Day " + days);
				shopWindow();	
		    }
			else {
				System.out.println("Error 2: Incorrect Shop ID");
				shopWindow();
			}
	    }
}