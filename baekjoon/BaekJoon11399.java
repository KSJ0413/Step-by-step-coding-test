package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon11399 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int total=0;
        int[] P = new int[N];
        for(int i=0; i<N; i++) {
            P[i] = scanner.nextInt();
        }
        Arrays.sort(P); //정렬

        int pre = 0;	//이전까지의 대기시간 합
        int sum = 0;	//사람 별 대기시간 총합

        for(int i = 0; i < N; i++) {
            sum += pre + P[i];
            pre += P[i];
        }
        System.out.println(sum);

       }
    }