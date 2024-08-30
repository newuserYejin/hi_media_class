package com.ohgiraffers.section04.scanner;

public class RandomMaker {

    public int randomNumber(int min, int max){
        return (int)(Math.random() * (max-min+1) + min);
    }

    public String randomUpperAlphabet(int length){
        String result = "";
        return maker(length,result);

    }

    public String maker(int num, String result){
        char ch = (char)((int)(Math.random() * 26 + 65));
        String str =  ""+ch;        // char String으로 변환
        result += str;

        return result.length() == num ? result : maker(num, result) ;
    }

    public String rockPaperScissors(){
        int num = (int)(Math.random() * 3 +1);
        
        String result = num ==1?"가위" : num ==2? "바위" :"보";
        return result;
    }


    public String tossCoin() {
        int num = (int)(Math.random() * 2 + 1);

        String result = num ==1 ?"앞면" : "뒷면";
        return result;
    }

}
