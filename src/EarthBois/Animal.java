package EarthBois;
import java.util.Random;
public class Animal {
	int animalAttack;
	int animalDefense;
	int animalSpeed;
	int animalReward;
	int meatReward;
	public String name;
	public Animal() {
		Random diceNumber = new Random();
		int rollValue = diceNumber.nextInt(6) + 1;
		if(rollValue == 1) {
			Random statRandom = new Random();
			name = "Hawk";
			animalAttack = statRandom.nextInt((3 - 2) + 1) + 2;
			animalDefense = statRandom.nextInt((6 - 4) + 1) + 4;
			animalSpeed = 5;
			animalReward = 4;
			meatReward = 1;
		} else if(rollValue == 2 ) {
			Random statRandom = new Random();
			name = "Snake";
			animalAttack = statRandom.nextInt((4 - 2) + 1) + 2;
			animalDefense = statRandom.nextInt((5 - 3) + 1) + 3;
			animalSpeed = 4;
			animalReward = 4;
			meatReward = 0;
		} else if(rollValue == 3) {
			Random statRandom = new Random();
			name = "Bear";
			animalAttack = statRandom.nextInt((3 - 2) + 1) + 2;
			animalDefense = statRandom.nextInt((10 - 5) + 1) + 5;
			animalSpeed = 3;
			animalReward = 8;
			meatReward = 5;
		}  else if(rollValue == 4) {
			Random statRandom = new Random();
			name = "Squirrel";
			animalAttack = statRandom.nextInt((1 - 1) + 1) + 1;
			animalDefense = statRandom.nextInt((1 - 1) + 1) + 1;
			animalSpeed = 10;
			animalReward = statRandom.nextInt((2 - 1) + 1) + 1;;
			meatReward = 2;
		}  else if(rollValue == 5) {
			Random statRandom = new Random();
			name = "Deer";
			animalAttack = 3;
			animalDefense = statRandom.nextInt((6 - 5) + 1) + 5;
			animalSpeed = 5;
			animalReward = 6;
			meatReward = 4;
		}  else if(rollValue == 6) {
			name = "Golden Rabbit";
			animalAttack = 0;
			animalDefense = 3;
			animalSpeed = 10;
			animalReward = 10;
			meatReward = 5;
		}
			
			
	}
}
