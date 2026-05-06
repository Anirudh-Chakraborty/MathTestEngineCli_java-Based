import java.util.*;

public class MathEquation {
    int difficulty;
    int numbeOfQuestion;

    MathEquation(int difficulty, int numbeOfQuestion) {
        this.difficulty = difficulty;
        this.numbeOfQuestion = numbeOfQuestion;
    }

    List<Integer> generateNumbers() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < difficulty + 2; i++) {
            numbers.add(caller.rand.nextInt(10*i));
        }
        return numbers;
    }

    List<Character> generateSymbols() {
        char symbols[] = {'+', '*', '-'};

        List<Character> symbollist = new ArrayList<>();
        for (int i = 0; i < difficulty - 1; i++) {
            int randomindex = caller.rand.nextInt(symbols.length);
            symbollist.add(symbols[randomindex]);
        }
        return symbollist;
    }


    List<Object> equationGenerator(){
        List<Object> equation = new ArrayList<>();

        for (int i = 0, j = 0; i<difficulty && j<difficulty; i++,j++){
            if (i == j){
                equation.add(generateNumbers().get(i));
            }else{
                equation.add(generateSymbols().get(j));
            }
        }
        return equation;
    }


}
