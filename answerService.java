import java.util.*;

public class answerService{
    int size;
    question[] Q;
    String[] userAnswers;
    public answerService(question[] Q){
        this.Q = Q;
        userAnswers = new String[Q.length];
    }
    public void playQuiz(){
        System.out.println("Quiz begins, All the best!"+"\n");
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<Q.length;i++){
            System.out.println(Q[i]);
            System.out.println("Enter your answer:");
            userAnswers[i] = scan.nextLine();
        }
        System.out.println("Quiz ended! Thanks for playing.");
        System.out.println("\n"+"--------"+"--------"+"\n");
    }
    public void getScore(){
        int score=0;
        for(int i=0;i<Q.length;i++){
            if(userAnswers[i].equals(Q[i].getAnswer())){
                score++;
            }
        }
        System.out.println("Your score is: "+score+"/"+Q.length);
    }
}