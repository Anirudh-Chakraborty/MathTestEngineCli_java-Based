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
}