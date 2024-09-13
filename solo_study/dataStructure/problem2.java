package dataStructure;

import java.util.Scanner;

public class problem2 {
    /*
     * 세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 일단 세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
     * 예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
     * 세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
     * 입력 : 1번째 줄에 시험을 본 과목의 개수 N개 2번째 줄은 현재 성적
     * 출력 : 평균 값
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i = 0;i < N; i++){
            A[i] = sc.nextInt();
        }
        long max = 0;
        long sum = 0;
        for(int i = 0;i < N; i++){
            if(max < A[i]){
                max = A[i];
            }
            sum += A[i];
        }
        System.out.println(sum*100.0/max/N);

        sc.close();
    }
}
