package view;

import model.Question;

import java.util.List;
import java.util.Scanner;

public class ConsoleView {
    private Scanner scanner;

    public ConsoleView(){
        this.scanner = new Scanner(System.in);
    }

    public void showWelcomeMessage(){
        System.out.println("Welcome to the Quiz!");
        System.out.println("--------------------");
    }

    public void showQuestion(Question question, int questionNumber){
        System.out.println("\nQ" + (questionNumber+1) + question.getQuestionText());
        List<String> options = question.getOptions();

        for(int i=0; i<options.size(); i++){
            System.out.println((i+1) + ". " + options.get(i));
        }
    }

    public int getUserAnswer(){
        System.out.println("Enter your answer (1-4): ");
        int choice = -1;
        try{
            choice = Integer.parseInt(scanner.nextLine());
        }catch(NumberFormatException e){
            System.out.println("Invalid input. Please enter a number.");
        }
        return choice;
    }

    public void showCorrect() {
        System.out.println("✅ Correct!");
    }

    public void showIncorrect(String correctAnswer) {
        System.out.println("❌ Incorrect! The correct answer is: " + correctAnswer);
    }

    public void showScore(int score, int total){
        System.out.println("\n🎉 Quiz Complete!");
        System.out.println("You scored: " + score + " out of " + total);
    }

    public void closeScanner(){
        scanner.close();
    }
}
