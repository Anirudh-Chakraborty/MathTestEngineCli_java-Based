import java.util.*;

public class VerifyAnswer {
    List<Object> questions;
    List<Integer> answers;

    void display(List<?> list){
    for(int i=0;i<list.size();i++){
        System.out.print(list.get(i) + " ");
    }
    }

    //Constructor
    VerifyAnswer(List<Object> questionsList, List<Integer> answersList){
        this.questions = questionsList;
        this.answers = answersList;
    }


    void UserAnswer(List<Object>questions, List<Integer> answers){
        //to check for each question
        for(int i=0;i<questions.size();i++){
            boolean next = false;
            while(next == false) {

                display((List<Object>) questions.get(i));
                int answer = caller.sc.nextInt();

                if (answer == answers.get(i)) {

                }
            }

            System.out.println();
        }
    }
}
