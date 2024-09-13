package debugging;

import java.util.Scanner;

public class debugging {
    //디버깅
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        int answer = 0;
        //자료형 범위 오류
        int A[] = new int[100001]; 
        int S[] = new int[100001];
        for(int i = 1; i<10000; i++){ //반복문 인덱스 범위 지정 오류
            A[i] = (int)(Math.random()*Integer.MAX_VALUE);
            S[i] = S[i-1] + A[i];
        }

        for(int t = 1; t < testcase; t++){
            int query = sc.nextInt(); //변수 초기화 오류
            for(int i = 0; i <query; i++){
                int start = sc.nextInt();
                int end = sc.nextInt();
                answer += S[end] - S[start - 1];
                System.out.println(testcase + " " + answer); //잘못된 변수 사용오류
            }
        }
        sc.close();
    }
}
