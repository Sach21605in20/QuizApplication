import java.util.Scanner;

public class questionService {
    int size;
    question[] Q = new question[size]; 
    public questionService(int size){
        this.size = size;
        Q = new question[size];
    }
    public void setQuestions() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <  Q.length; i++) {
            question que = new question();
            System.out.println("Enter question "+(i+1)+":" );
            que.setQuestion(sc.nextLine());
            que.setSno(i);
            System.out.println("Enter option 1:");
            que.setOpt1(sc.nextLine());
            System.out.println("Enter option 2:");
            que.setOpt2(sc.nextLine());
            System.out.println("Enter option 3:");
            que.setOpt3(sc.nextLine());
            System.out.println("Enter option 4:");
            que.setOpt4(sc.nextLine());
            System.out.println("Enter answer:");
            que.setAnswer(sc.nextLine());
            Q[i] = que;
            System.out.println("\n" + "--------" + "--------" + "\n");
        }
    }
    public question[] getQuestions(){
        return Q;
    }
}