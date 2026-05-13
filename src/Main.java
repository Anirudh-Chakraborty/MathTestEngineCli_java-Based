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

    void play(){
    menu.StartMenu();

    int difficulty = caller.sc.nextInt();
    int numberOfQuestions = caller.sc.nextInt();

    //The Questions
    MathEquation questions = new MathEquation(difficulty, numberOfQuestions);
    //the question exist in this list
    List<Object> questionsList = questions.displayEquation();


        for(int i = 0; i < questionsList.size(); i++){
            //sPrinting a single Question at once
            System.out.println(questionsList.get(i));
        }

        //sending the complete list at once
        EquationSolver AnswerSet = new EquationSolver(questionsList);
        List<Integer> answerList = AnswerSet.answerList();
    }



}