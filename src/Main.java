import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    Menu menu = new Menu();


    public static void main(String[] args) {
        Main main = new Main();
        main.play();
    }

    void play() {
        menu.StartMenu();

        int difficulty = caller.sc.nextInt();
        int numberOfQuestions = caller.sc.nextInt();

        //The Questions
        List<Object> questionsList = questions(difficulty, numberOfQuestions);

        // The Computer Answers
        List <Integer> equationAnswers = equationAnswers(questionsList);

        //
        VerifyAnswer game = new VerifyAnswer(questionsList, equationAnswers );
        game.UserAnswer(questionsList, equationAnswers);
    }

    List<Object> questions(int difficulty, int numberOfQuestions) {
        MathEquation questions = new MathEquation(difficulty, numberOfQuestions);
        //the question exist in this list
        List<Object> questionsList = questions.displayEquation();
        return questionsList;
    }

    void printer(List<?> list ){
        for (Object object : list) {
            System.out.println(object);
        }
    }

    List<Integer> equationAnswers(List<Object> questionList){
        EquationSolver AnswerSet = new EquationSolver(questionList);
        List<Integer> answerList = AnswerSet.answerGenrator(questionList);

    return answerList;
    }

}



//so I'll be making a single verify class and then i will send two List<object> and then well be calculating three objects
//
//if the answer is right we continue to the next question and if the answert is worng then we store attempts and send it to
//
//        the scoreclass over there
//
//        we get calculate the percentage
