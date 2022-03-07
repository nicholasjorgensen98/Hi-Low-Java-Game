import java.util.Scanner;
import java.util.Random;
import java.lang.Math;


public class Main
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //RNG

        Random rand = new Random();

        // Creating Random Number
        int ran = rand.nextInt(15) + 1;
        // Setting answer not equal to ran
        int ans = ran -1;
        // to keep count of answers
        int count = 0;

        // Prompting User



        System.out.println("There are currently no high scores");


        String answerString;
        Scanner user_input = new Scanner(System.in);
        System.out.println("Is this a new player?");

        do {

            answerString = user_input.next();

            if ("no".equalsIgnoreCase(answerString)) {
                System.out.println("Welcome back!");
                break;
            } else if ("yes".equalsIgnoreCase(answerString)) {
                System.out.println("Welcome to the game!");
                break;
            } else {
                System.out.println("Answer by saying 'yes' or 'no'");
            }

            //do loop to ask if its a new player

        } while(true);

        System.out.println("Welcome to my guessing game! I am thinking of a number between 1 and 15 what do you think it is?");




        while(ran != ans){
            //while loop to check for anser
            ans = checkInputInteger(scanner);
            if( ans > 15 ) {

                // if/else if to tell the user if they are high or low

                System.out.println("To Big my number is less than 15 ");
            }else if( ans - ran <= 5 & ans - ran > 0   ) {
                System.out.println(" Your number is to big but within 5... Try Again!  ");
            }


            else if( Math.abs(ans - ran) <= 5 & ans - ran < 0  & ans > 0 ) {
                System.out.println(" Your number is to small  but within 5... Try Again!  ");
            }


            else if( ans  < 0   ) {
                System.out.println(" My Number is Not Neative... Try Again!  ");

                // incase the user enter a neg

            }






            count ++;

            //count++ to add the guesses for the score

        }

        int Score = 100 - (count*5);

        System.out.println(" Congradulations My Number was " + ans + "! Your Score is "+ Score +"!"  );

//gives the score starting from a hundred


    }




//below is to get a valid anser from user

    public static int checkInputInteger(Scanner scanner) {
// declaring and initial loop
        boolean continueLoop = true;
// declaring and initil var
        int num = 1;


// below is a do loop to check if it was correct 

        do {
// reads as a int
            try {
                num = scanner.nextInt();



                continueLoop = false;
            }

// tells the user the input they gave was bad 

            catch (Exception e) {
                System.out.println("Im sorry I couldn't understand your input I"
                        + " simply was expecting ");
                System.out.println("an integer for input. Please Try Again");

                scanner.next();
            }
        } while (continueLoop);

        return num;
    }
}