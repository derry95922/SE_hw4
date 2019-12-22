public class letterGrade {
    public char letterGrade(int  score){
        char grade;
        if (score <0 || score>100)grade='X';
        else if (score >= 90 && score <= 100)grade='A';
        else if (score >= 80 && score <= 90)grade='B';
        else if (score >= 70 && score <= 80)grade='C';
        else if (score >= 60 && score <= 70)grade='D';
        else grade='F';
        return grade;
    }
}
