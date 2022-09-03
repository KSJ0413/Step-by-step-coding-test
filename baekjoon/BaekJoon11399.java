package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon11399 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        // 정렬
        Arrays.sort(arr);


        int prev = 0;	// 이전까지의 대기시간 누적합
        int sum = 0;	// 사람별 대기시간 총합

        for(int i = 0; i < N; i++) {
            // 이전까지의 대기시간과 현재 사람이 걸리는 시간을 더해준다.
            sum += prev + arr[i];

            // 이전까지의 누적합에 현재 걸리는 시간을 더해준다.
            prev += arr[i];
        }
        System.out.println(sum);



        }


       }




//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    StringTokenizer st = null;
//
//    // String Line이므로 Integer.parseInt를 이용하여 형변환해야함
//    int n = Integer.parseInt(br.readLine());
//
//    int[] stack = new int[n];
//
//// 3 1 4 3 2 공란 포함 String Line일시 StringTokenizer 사용
//		st = new StringTokenizer(br.readLine());
//
//                for (int i=0; i<n; i++) {
//        // 배열에 토큰을 하나씩 불러서 입력해줌
//        stack[i] = Integer.parseInt(st.nextToken());
//        }
//
//        Arrays.sort(stack);
//
//        int[] hap = new int[n];
//        hap[0] = stack[0];
//
//        for (int i=1; i<n; i++) {
//        hap[i] += hap[i-1] + stack[i];
//        }
//
//        int res = 0;
//        for (int i=0; i<n; i++) {
//        res += hap[i];
//        }
//
//        System.out.println(res);


