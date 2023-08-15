import java.util.Scanner;

public class Your_Grade_25206 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double total_score = 0;
        double grade_score = 0;
        String grade;
        double score;
        for (int repeat = 0; repeat < 20; repeat++)
        {
            sc.next();
            score = sc.nextDouble();
            grade = sc.next();
            if (grade.equals("P"))
                continue;
            grade_score += GradeScore(grade,score);
            total_score += score;
        }
        System.out.print(grade_score/total_score);

    }

    public static double GradeScore(String grade, double score)
    {
        if (grade.equals("A+")) return score * 4.5;
        else if (grade.equals("A0")) return score * 4.0;
        else if (grade.equals("B+")) return score * 3.5;
        else if (grade.equals("B0")) return score * 3.0;
        else if (grade.equals("C+")) return score * 2.5;
        else if (grade.equals("C0")) return score * 2.0;
        else if (grade.equals("D+")) return score * 1.5;
        else if (grade.equals("D0")) return score;
        else return score * 0.0;

    }
}
