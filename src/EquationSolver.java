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
        stackSolver(stack);
    }
    int stackSolver(Stack<Object> stack) {
        Stack<Integer> numStack = new Stack<>();
        Stack<Character> symbolStack = new Stack<>();

        while (!stack.empty()) {
            if (stack.peek() instanceof Integer) {
                int num = (int) stack.pop();
                numStack.push(num);

            } else if (stack.peek() instanceof Character) {

                if (symbolStack.empty()) {
                    char symbol = (char) stack.pop();
                    symbolStack.push(symbol);
                }

                else {

                    while (!symbolStack.empty() && value((char) stack.peek()) <= value((char) symbolStack.peek())) {

                        int num2 = numStack.pop();
                        int num1 = numStack.pop();
                        char symbol = symbolStack.pop();
                        numStack.push(resolve(num1, num2, symbol));
                    }
                    char symbol = (char) stack.pop();
                    symbolStack.push(symbol);

                }
            }
        }

        while (!symbolStack.empty()) {
            int num2 = numStack.pop();
            int num1 = numStack.pop();
            char symbol = symbolStack.pop();
            numStack.push(resolve(num1, num2, symbol));
        }

        return numStack.pop();
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



    int resolve(int num1, int num2, char symbol) {
        if (symbol == '+') {
            num1 = num1 + num2;
        } else if (symbol == '-') {
            num1 = num1 - num2;
        } else if (symbol == '*') {
            num1 = num1 * num2;
        }
        return num1;
    };

    List<Integer> answerList(){
        List answerList = new ArrayList();
        return answerList;
    }
}