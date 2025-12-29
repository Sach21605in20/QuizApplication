import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Quiz Application!");
        System.out.println("Create your quiz"+"\n");
        System.out.println("Enter number of questions: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); 
        questionService tutor = new questionService(n);
        tutor.setQuestions();
        answerService student = new answerService(tutor.getQuestions());
        student.playQuiz();
        student.getScore();
    }
}