import java.util.Scanner;

public class Menu {
    void StartMenu() {
        System.out.println("Welcome to the Math Sprint Tester");
        System.out.println("We are her to test your skills");
        System.out.println("Please Chose a difficulty from 1 to 10");
        System.out.println("And How many number of Questions you want");
    }

//    void wrongAnswer(int currentScore, int percentage){
    void wrongAnswer(){
        System.out.println("Wrong answer.");
        System.out.println("Try Again");
        System.out.println("If You Wish to Quit press Q");
        //for later us
//        System.out.println("Your Current Score "+ currentScore);
//        System.out.println("Your Percentage "+ percentage);
    }

//    void correctAnswer(int currentScore, int percentage){
        void correctAnswer(){
        System.out.println("Correct answer.");
        System.out.println("Lets Get to the Next Question");

        System.out.println("If You Wish to Quit press Q");
//        for later use
//        System.out.println("Your Current Score: " + currentScore);
//        System.out.println("Your Percentage: " + percentage);
    }

    void endMenu(){
        System.out.println("Thanks for playing!");
    }
}
