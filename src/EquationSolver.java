import java.util.*;

public class EquationSolver {

    List<Object> equationList;

    EquationSolver(List<Object> equations) {
        //this receives the list of equation
        this.equationList = equations;
    }

    List<Integer> answerGenrator(List<Object> equationList) {
        List<Integer> answerList = new ArrayList<>();
        for (int i = 0; i < equationList.size(); i++) {
            // from here we send the equations one by one
            int num = stackMaker((List<Object>) equationList.get(i));
            answerList.add(num);
        }
        return answerList;
    }

    int stackMaker(List<Object> equations) {
        //this turns the equation into stack one by one
        //into Lifo
        Stack<Object> stack = new Stack<>();
        for (int i = 0; i < equations.size(); i++) {
            stack.push(equations.get(i));
        }
        return LIFOtoFIFI(stack);
    }

    int LIFOtoFIFI(Stack<Object> first) {
        Stack<Object> stack = new Stack<>();
        while (!first.empty()) {
            stack.push(first.pop());
        }
        return stackSolver(stack);
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
                } else {

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
    }
}