package exercise.chapter11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> scores = new ArrayList<>();
        String grade = "";
        while (true) {
            System.out.print("점수를 입력하세요 : ");
            int score = in.nextInt();  // 예외처리 추가
            if (score < 0) {
                break;
            }
            scores.add(score);
        }

        System.out.println("전체 학생은 " + scores.size() + " 명이다.");
        System.out.print("학생들의 성적 : ");
        for (Integer score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();
        Collections.sort(scores, (s1, s2) -> s2 - s1);
        int max = scores.get(0);

        for (int i = 0; i < scores.size(); i++) {
            int score = scores.get(i);
            if (score >= max - 10 && score <= max) {
                grade = "A";
            } else if (score >= max - 20 && score < max - 10) {
                grade = "B";
            } else {
                grade = "C";
            }
            System.out.println(i + "번 학생의 성적은 " + score + "이며 등급은 " + grade + "이다.");
        }
    }
}
