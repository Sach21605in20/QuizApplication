public class question {
    private int sno;
    private String question;
    private String opt1;
    private String opt2;
    private String opt3;
    private String opt4;
    private String answer;
    public int getSno() {
        return sno;
    }
    public String getQuestion() {
        return question;
    }
    public String getOpt1() {
        return opt1;
    }
    public String getOpt2() {
        return opt2;
    }
    public String getOpt3() {
        return opt3;
    }
    public String getOpt4() {
        return opt4;
    }
    public String getAnswer() {
        return answer;
    }
    public void setSno(int sno) {
        this.sno = sno;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public void setOpt1(String opt1) {
        this.opt1 = opt1;
    }
    public void setOpt2(String opt2) {
        this.opt2 = opt2;
    }
    public void setOpt3(String opt3) {
        this.opt3 = opt3;
    }
    public void setOpt4(String opt4) {
        this.opt4 = opt4;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    @Override
    public String toString() {
        return "question no "+(++sno)+": "+question+"\n"+"\n"+
               "option 1: "+opt1+"\n"+
               "option 2: "+opt2+"\n"+ 
               "option 3: "+opt3+"\n"+ 
               "option 4: "+opt4+"\n";
    }
}

