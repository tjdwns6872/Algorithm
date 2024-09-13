package dataStructure;

import java.util.Scanner;

public class problem1 {
    /* 
     * N개의 숫자가 공백없이 써 있다. 이 숫자를 모두 합해 출력하는 프로그램을 작성하시오.
     * 입력 : 1번째 줄에 숫자의 개수는 N(1 <= N <= 100) 2번째 줄에 숫자 N개가 공백 없이 주어진다.
     * 출력 입력으로 주어진 숫자 N개의 합을 출력한다.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();
        int sum = 0;
        for(char i : cNum){
            // sum += (i-48); // 아스키 코드 빼기 방법
            sum += i - '0';
        }
        System.out.println(sum);
        sc.close();
    }
}
