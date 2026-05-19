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


}
