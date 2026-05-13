import java.util.*;
public class EquationSolver {

    List<Object> equationList;

    EquationSolver(List<Object> equations) {
        this.equationList = equations;
    }

    void equationSender(List<List<Object>> equationList) {
        for(int i = 0; i < equationList.size(); i++) {
            stackMaker(equationList.get(i));
        }
    }

    void stackMaker(List<Object> equations) {
        Stack<Object> stack = new Stack<>();
        for (int i = 0; i < equations.size(); i++) {
            stack.push(equations.get(i));
        }
        solver(stack);
    }

    void solver(Stack<Object> stack){

    }

    List<Integer> answerList(){
        List answerList = new ArrayList();
        return answerList;
    }
}