import java.util.Scanner;

public class Ex02TauBautista {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean invalidOption = true;
        String option;
        int[] newSettings = {0, 0, 0};
        int lowerLimit, upperLimit, numGuesses;
        lowerLimit = upperLimit = numGuesses = 0;
        
        do {    
            System.out.printf("Welcome to Higher or Lower! What will you do? %n");
            System.out.printf("- Start game %n" + "- Change settings %n" + "- End application %n");
            option = sc.nextLine();
            
            switch(option.toLowerCase()) {
                case "start game":
                    invalidOption = false;
                    System.out.printf("%n");
                    startGame(newSettings); //get the array of values
                    break;
                
                case "change settings":
                    invalidOption = false;
                    boolean allValid = false;
                    System.out.printf("%n");
        
                    do {
                        System.out.print("What is the lower limit of the random number? ");
                        lowerLimit = Integer.parseInt(sc.nextLine());
        
                        System.out.print("What is the upper limit of the random number? ");
                        upperLimit = Integer.parseInt(sc.nextLine());
        
                        if (lowerLimit > upperLimit) {
                            System.out.printf("The lower limit must be less than the upper limit!%n%n");
                        }
        
                        else if (lowerLimit == upperLimit) {
                            System.out.printf("The numbers must be different!%n%n");
                        }
        
                        else {
                            allValid = true;
                        }
                    } while (allValid == false); //will keep looping until all values are valid
        
                    System.out.print("How many guesses are allowed? ");
                    numGuesses = Integer.parseInt(sc.nextLine());
                    System.out.printf("%n");
                    newSettings = changeSettings(lowerLimit, upperLimit, numGuesses);
                    break;
                
                case "end application":
                    System.out.printf("Thank you for playing! %n");
                    invalidOption = false;
                    System.out.printf("%n");
                    break;
                
                default:
                    System.out.printf("%n");
                    System.out.printf("Choose one from the options! %n%n");
                    break;
            }
        } while (invalidOption || !option.equalsIgnoreCase("end application"));
        //will keep looping until option selected (to proceed with game) is valid or until the user ends the game
    }
    
    static void startGame(int arr[]) {
        Scanner sc = new Scanner(System.in);
        int defaultMin = 1;
        int defaultMax = 10;
        int defaultGuesses = 3;
        int empty = 0;
        int min, max, guesses;
        min = max = guesses = 0;
        
        for (int x = 0; x < 3; x++) {
            if (arr[x] == 0) {
                empty++;
            }
        }
        
        if (empty == 3) { //user did not change settings
            min = defaultMin;
            max = defaultMax;
            guesses = defaultGuesses;
        }
        
        else { //user changed settings
            min = arr[0];
            max = arr[1];
            guesses = arr[2];
        }
        
        int random = (int) Math.floor(Math.random() * (max - min + 1)) + min;
        String answer;
        do {
            for (int i = guesses; i > 0; i--) {
                System.out.printf("You have %d guess(es) left. What is your guess? ", i);
                int guessInput = Integer.parseInt(sc.nextLine());
            
                if (guessInput < min || guessInput > max) {
                    System.out.printf("That choice is outside the range! ");
                    i++; //number of guesses does not decrease to give the user another chance
                    continue;
                }
            
                if ((guessInput > random) && (guessInput <= max || guessInput >= min)) {
                    if (i > 1) {
                        System.out.print("Guess lower! ");
                    }
                    if ((i == 1) && (guessInput != random)) { //if it is the last guess
                        System.out.printf("You lost...%n");
                        break;
                    }
                }
            
                if ((guessInput < random) && (guessInput <= max || guessInput >= min)) {
                    if (i > 1) {
                        System.out.print("Guess higher! ");
                    }   
                    if ((i == 1) && (guessInput != random)) { //if it is the last guess
                        System.out.printf("You lost...%n");
                        break;
                    }
                }
            
                if (guessInput == random) {
                    System.out.printf("You got it! %n");
                    break;
                }
            }
            
            System.out.print("Play again (y/n)? ");
            answer = sc.nextLine();
            System.out.printf("%n");
            
            if (answer.equalsIgnoreCase("y")) {
                int randomConst = (int) Math.floor(Math.random() * (max - min + 1)) + min; //generate another random number
                random = randomConst;
            }
        } while (answer.equalsIgnoreCase("y"));
        //loops as long as the user answers yes, and if the user chooses no, the game goes back to the main menu
    }
    
    static int[] changeSettings(int a, int b, int c) {
        int[] values = new int[3]; //put the inputted values from change settings into an array
        values[0] = a; //lower limit min
        values[1] = b; //upper limit max
        values[2] = c; //number of guesses
        return values;
    }
}