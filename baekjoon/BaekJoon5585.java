package baekjoon;

import java.util.Scanner;

public class BaekJoon5585 {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        int change = 1000 - scanner.nextInt();
        int result = 0;

        int [] coins = {500,100,50,10,5,1};

        for(int coin : coins){

            if (coin > change)
                continue;
            result += change / coin;
            change %= coin;

        }
        System.out.println(result);
    }
}
//    지불해야 할 금액을 입력받고 solve함수를 호출합니다. **
//    public static void main(String[] args) throws IOException {
//        int pay = Integer.parseInt(br.readLine());
//
//        System.out.println(solve(1000 - pay));
//    }
//
//     최소 거스름돈 개수를 구하는 함수입니다. **
//    private static int solve(int changeMoney) {
//        int[] change = {500, 100, 50, 10, 5, 1};
//        int result = 0;
//
//        for (int index = 0; index < change.length && changeMoney >= 0; index++) {
//            result += changeMoney / change[index];
//            changeMoney %= change[index];
//        }
//        return result;
//    }
