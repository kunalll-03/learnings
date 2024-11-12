package org.example;
import java.util.Scanner;
import java.util.Random;
public class r_p_c {
    public static void main(String[] args) {
        System.out.println("Let's play a game of Rock, Paper, Scissors.");
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String userInput;
        String computerInput;

        while(true){
            System.out.println("Please enter your move: Rock, Paper or Scissor. To quit, type 'Quit'.");
            userInput = sc.nextLine().toLowerCase();

            if(userInput.equals("quit")){
                System.out.println("Thanks for playing!!");
                break;
            }

            //computer's move
            int randomNum = random.nextInt(3);
            switch (randomNum){
                case 0:
                    computerInput = "rock";
                    break;
                case 1:
                    computerInput = "paper";
                    break;
                default:
                    computerInput = "scissors";
            }
            if (userInput.equals(computerInput)){
                System.out.println("Its a tie! You both chose "+userInput+".");
            }
            else if(userInput.equals("rock") && computerInput.equals("scissors")){
                System.out.println("You Win!! "+ userInput+ " beats " + computerInput);
            }
            else if(userInput.equals("paper") && computerInput.equals("rock")){
                System.out.println("You Win!! "+ userInput +" beats "+computerInput);
            }
            else if(userInput.equals("scissors") && computerInput.equals("paper")){
                System.out.println("You Win!! "+ userInput +" beats "+ computerInput);
            }
            else{
                System.out.println("You Lose!! "+computerInput+" beats "+userInput);
            }
        }
    }
}
