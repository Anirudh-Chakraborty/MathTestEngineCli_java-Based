import java.util.*;
public class EquationSolver {

    List<Object> equationList;

    EquationSolver(List<Object> equations) {
    //this receives the list of equation
        this.equationList = equations;
    }

    void equationSender(List<List<Object>> equationList) {
        for(int i = 0; i < equationList.size(); i++) {
            // from here we send the equations one by one
            stackMaker(equationList.get(i));
        }
    }

    void stackMaker(List<Object> equations) {
        //this turns the equation into stack one by one
        //into Lifo
        Stack<Object> stack = new Stack<>();
        for (int i = 0; i < equations.size(); i++) {
            stack.push(equations.get(i));
        }
        LIFOtoFIFI(stack);
    } 

    void LIFOtoFIFI(Stack<Object> first) {
    Stack<Object> stack = new Stack<>();
        while (!first.empty()) {
            stack.push(first.pop());
        }
        solver(stack);
    }
    void solver(Stack<Object> stack){

    }

    int value(char symbol) {
        switch (symbol) {
            case '+':
                return 1;
            case '-':
                return 1;
            case '*':
                return 3;

            default:
                break;
        }

        int value = 0;
        return value;
    }

    List<Integer> answerList(){
        List answerList = new ArrayList();
        return answerList;
    }
}