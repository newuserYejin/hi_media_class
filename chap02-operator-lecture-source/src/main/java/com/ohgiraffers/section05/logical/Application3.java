package com.ohgiraffers.section05.logical;

public class Application3 {
    public static void main(String[] args) {

        // 논리연결 연산자의 진리표에 대해서 이해할 수 있다.

        // 논리 && 논리 : 앞의 결과가 false면 뒤에 실행 안함
        // 논리 || 논리 : 앞에가 true면 뒤에 실행 안함.

        int num1 = 10;

        // 앞의 조건의 false로 강제화하고 뒤의 조건은 ++ 로 num1의 값을 변화시켰지만 진행되지 않은것을 확인할 수 있다.

        int result = (false && ++num1 > 0) ? num1 : num1;

        System.out.println("&& 실행확인 = " + result);

        // &&는 조건 식이 모두 만족되어야 true를 반환하는데 1개라도 false이면 그 뒤는 실행되지 않는다.
        // 컴퓨터를 효율적으로 사용하기 위해서는 앞에 false가 나올 확률이 높은 조건을 앞에 둔다.

    }
}
