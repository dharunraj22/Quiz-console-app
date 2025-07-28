import model.Question;
import model.Quiz;
import view.ConsoleView;
import service.QuizService;
import controller.QuizController;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        Question q1 = new Question("What is the capital of France?", Arrays.asList("Berlin", "Paris", "Rome", "Madrid"), 1);
        Question q2 = new Question("Who wrote Romeo and Juliet?", Arrays.asList("Charles Dickens", "Jane Austen", "William Shakespeare", "Mark Twain"), 2);
        Question q3 = new Question("Which planet is known as the Red Planet?", Arrays.asList("Earth", "Jupiter", "Mars", "Venus"), 2);
        Question q4 = new Question("WhAT IS 9x6?", Arrays.asList("42", "54", "56", "64"), 1);

        Quiz quiz = new Quiz(Arrays.asList(q1, q2, q3, q4));
        ConsoleView view = new ConsoleView();
        QuizService service = new QuizService();

        QuizController controller = new QuizController(quiz, view, service);
        controller.startQuiz();
    }
}
