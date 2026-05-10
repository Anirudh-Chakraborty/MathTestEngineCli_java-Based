import java.util.*;

public class MathEquation {
    int difficulty;
    int numberOfQuestion;


    MathEquation(int difficulty, int numberOfQuestion) {
        this.difficulty = difficulty+1;
        this.numberOfQuestion = numberOfQuestion;
    }

    private List<Integer> generateNumbers() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < difficulty + 1; i++) {
            numbers.add(caller.rand.nextInt(10*i));
        }
        return numbers;
    }

    private List<Character> generateSymbols() {
        char symbols[] = {'+', '*', '-'};
        List<Character> symbolList = new ArrayList<>();
        for (int i = 0; i < difficulty - 1; i++) {
            int randomindex = caller.rand.nextInt(symbols.length);
            symbolList.add(symbols[randomindex]);
        }
        return symbolList;
    }


     private List<Object> equationGenerator(){
        List<Object> equation = new ArrayList<>();
        List<Character> symbols = generateSymbols();
        List<Integer> numbers = generateNumbers();

        for (int i = 0, j = 0; i<difficulty && j<difficulty;){
            if (i == j){
                equation.add(numbers.get(i));
                i++;
            }else if (i > j){
                equation.add(symbols.get(j));
                j++;
            }
        }
        return equation;
    }
//
//    void displayEquation(){
//        List<Object> equation;
//        for(int i = 0; i< numberOfQuestion; i++){
//            equation = equationGenerator();
//            System.out.println();
//            for(int j = 0; j<equation.size(); j++){
//                System.out.print(equation.get(j) + " ");
//            }
//        }
//    }
    List<Object> displayEquation(){
        List<Object> ContainEquations = new ArrayList<>();
        for(int i = 0; i<numberOfQuestion; i++){
            ContainEquations.add(equationGenerator());
        }
        return ContainEquations;
    }
}
