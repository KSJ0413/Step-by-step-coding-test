package baekjoon;

import java.util.Scanner;

public class BaekJoon1541 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int sum = Integer.MAX_VALUE;	// 초기 상태 여부 확인을 위한 값으로 설정
    String[] subtraction = in.nextLine().split("-");


		for(int i = 0; i < subtraction.length; i++) {
        int temp = 0;

        // 뺄셈으로 나뉜 토큰을 덧셈으로 분리하여 해당 토큰들을 더한다.
        String[] addition = subtraction[i].split("\\+");

        // 덧셈으로 나뉜 토큰들을 모두 더한다.
        for(int j = 0; j < addition.length; j++) {
            temp += Integer.parseInt(addition[j]);
        }

        // 첫 번째토큰인 경우 temp값이 첫 번째 수가 됨
        if (sum == Integer.MAX_VALUE) {
            sum = temp;
        } else {
            sum -= temp;
        }
    }
		System.out.println(sum);
}
}



//    string input = Console.ReadLine();
//    string[] splitForMinus = input.Split("-"); // -를 기준으로 파트를 나눈다
//
//    int answer = addPart(splitForMinus[0]); // 첫 파트를 답에 더해준다
//        for(int i = 1; i < splitForMinus.Length; i++)
//        {
//        answer -= addPart(splitForMinus[i]); // 나머지 파트를 답에서 뺴준다
//        }
//
//        Console.WriteLine(answer);
//        }
//
//// -로 나눈 파트안에 있는 +들을 계산하는 메소드
//static int addPart(string part)
//        {
//        string[] splitForPlus = part.Split("+");
//        int partSum = 0;
//        foreach(var num in splitForPlus)
//        {
//        partSum += Int32.Parse(num);
//        }
//
//        return partSum;

