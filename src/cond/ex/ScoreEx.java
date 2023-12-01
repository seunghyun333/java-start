package cond.ex;

public class ScoreEx {
    public static void main(String[] args) {
        int score = 90;
        String word;

        if (score >= 90) {
            word = "A";
        } else if (score>= 80) {
            word = "B";
        } else if (score >= 70) {
            word = "C";
        } else if (score >= 60) {
            word = "D";
        } else {
            word = "F";
        }

        System.out.println("학점은 " + word + "입니다");
    }
}
