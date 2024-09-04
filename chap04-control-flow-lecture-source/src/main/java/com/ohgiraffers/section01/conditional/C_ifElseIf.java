package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class C_ifElseIf {

    // if-else-if
    
    // 표현식
    
    /*
    * if(조건식 1){
    *       조건 1이 만족될때 명령문
    * } else if(조건식 2) {
    *       조건식 1이 false고 조건식 2가 true일 경우 실행 할 명령문
    * } else{
    *       모든 조건이 false일 때 실행할 명령문
    * }*/

    // 금도끼 은도끼 문제
    public void testIfElseIfStatement() {
        System.out.println("산 속에서 나무를 하던 나무꾼이 연못에 쇠도끼를 빠뜨리고 말았다...");
        System.out.println("그때... 연못에서 산신령이 나타나 금도끼,은도끼, 쇠도끼를 들고 나타났다...");
        System.out.println("나무꾼에게 셋 중 어떤 도끼가 너의 도끼인지 물어보게 되는데..");

        System.out.println("산신령 : 어느 도끼가 너의 도끼냐, 숫자로 입력하거라.");
        System.out.print("금도끼(1) 은도끼(2) 쇠도끼(3) : ");

        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();

        if (answer == 1){
            System.out.println("\n"+"산신령: 너는 정직하지 못하구나!!! 아무것도 주지 않겠다!!");
        } else if (answer == 2) {
            System.out.println("\n"+"산신령: 너는 조금만 정직하구나. 하지만 거짓말을 하였으니 너의 쇠도끼만 돌려주겠다.");
        } else if (answer == 3){
            System.out.println("\n"+"산신령: 너는 정직한 나무꾼이구나.. 모든 도끼를 너에게 주겠다!!!!");
        } else {
            System.out.println("\n"+"산신령: 너는 도끼를 빠뜨린것이 아닌가 보구나.. 돌아가거라...");
        }

        System.out.println("나무꾼은 집으로 돌아갔습니다.");
    }

    // A,B,C,D,E 성적 문제
    // 추가로 각 구역의 중간 점수 이상부터는 +

    public void testNestedIfElseIfStatement() {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n"+"학생의 이름을 입력하세요: ");
        String name = sc.nextLine();
        
        System.out.print("학생의 점수를 입력하세요: ");
        int score = sc.nextInt();

        String grade = "";

        if (score >= 90){
            if (score >= 95){
                grade = "A+";
            }else {
                grade = "A";
            }
        }
        else if(score >= 80){
            if (score >= 85){
                grade = "B+";
            }else {
                grade = "B";
            }
        }
        else if(score >= 70){
            if (score >= 75){
                grade = "C+";
            }else {
                grade = "C";
            }
        }
        else if(score >= 60){
            if (score >= 65){
                grade = "D+";
            }
            else {
                grade = "D";
            }
        }
        else {
            grade = "F";
        }

        System.out.println(name+"의 점수는 "+score+"이고, 학점은 "+grade+"입니다.");
    }

    // + 쪽 모음 변형
    public void improveNestedIfElseIfStatement() {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n"+"학생의 이름을 입력하세요: ");
        String name = sc.nextLine();

        System.out.print("학생의 점수를 입력하세요: ");
        int score = sc.nextInt();

        String grade = "";

        if (score >= 90){
                grade = "A";
        }
        else if(score >= 80){
                grade = "B";
        }
        else if(score >= 70){
                grade = "C";
        }
        else if(score >= 60){
                grade = "D";
        }
        else {
            grade = "F";
        }

        if (score >= 60 &&score % 10 >= 5 ){
            grade += "+";
        }

        System.out.println(name+"의 점수는 "+score+"이고, 학점은 "+grade+"입니다.");
    }

    // 몸무게 문제
    public void weightStatement() {
        Scanner sc = new Scanner(System.in);

        System.out.print("당신의 몸무게를 입력해주세요: ");
        int weight = sc.nextInt();

        boolean chicken = false;

        if (weight > 70){
            System.out.println("오늘 점심은 샐러드를 드셔야겠어요.");
        } else{
            if (chicken){
                System.out.println("오늘 점심은 치킨입니다.");
            } else {
                System.out.println("오늘 점심은 라면입니다.");
            }
        }



    }
}
