//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    Menu menu = new Menu();


    public static void main(String[] args) {
        Main main = new Main();
        main.play();
    }

    void play(){
    menu.StartMenu();

    int difficulty = caller.sc.nextInt();
    int numberofQuestions = caller.sc.nextInt();

    MathEquation questions = new MathEquation(difficulty, numberofQuestions);
    questions.displayEquation();
    }
}