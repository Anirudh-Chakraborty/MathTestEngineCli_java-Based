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

}
