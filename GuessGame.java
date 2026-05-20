import java.util.Scanner;
public class GuessGame{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int secret;
        int guess =0;
        int diff;
        int tries =0;
        secret =(int)(Math.random() *100) +1;

        System.out.println("I have chosen a number between 1 and 100!");
        System.out.println("You have 10 attempts to guess that number.");
    

        while(tries <10){

            System.out.print("Enter guess: ");
            guess = sc.nextInt();
            tries++;

            if(secret >guess){

                diff =secret -guess;
            }
            else{

                diff =guess -secret;
            }

            if (guess ==secret){

                if (tries ==10){

                    System.out.println("Wow! You guessed it on the last attempt");
                    System.out.println("That's impressive!");
                }
                else{

                    System.out.println("Lettssgooo!");
                }

                System.out.println("You have guessed it in " + tries + " tries.");
                break;
            }

            else if(diff <=5){

                System.out.println("Scorching hot, you're very close");
            }
            else if(diff <=10){

                System.out.println("Warm, you're close");
            }
            else{

                if (guess <secret){

                    System.out.println("Cold, go higher");
                }
                else{

                    System.out.println("Cold, go lower");
                }
            }

            System.out.println("You have " +(10 -tries)+" attempts left.");
            System.out.println();
        }

        if (tries ==10 && guess !=secret) {

            System.out.println("Game Over :(");
            System.out.println("The number was: " +secret);
            System.out.println("Better luck next time!");
        }
    }
}
