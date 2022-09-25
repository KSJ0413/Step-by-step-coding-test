import java.util.Arrays;
import java.util.Random;



public class Lotto {
    public static void main(String[] args) {


        System.out.println("로또 번호 생성기");
        int[] lotto = new int[6]; // 로또 숫자들을 담을 배열 생성
        Random random = new Random();// 랜덤 숫자 저장

        //i는 랜덤 생성된 번호임
        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = random.nextInt(45) + 1; // 1~45까지 랜덤 숫자 추출
            //중복제거
            for (int j = 0; j < i; j++) { //index 번호칸끼리 번호 비교, j가 i보다 작으면 작동
                if (lotto[i] == lotto[j]) // i번째 칸과 j번째 칸의 값이 같다면
                    i--;
                break; //j문을 탈출하려 새로 무작위 값 생성
            }
        }

        for (int i = 0; i < lotto.length; i++) { //랜덤 번호의 값이 로또 배열의 길이보다 작을 때까지 1씩 증가하며 반복
            for (int j = i + 1; j < lotto.length; j++) { //i와 비교할 값은 j, 즉 i가 지목할 바로 옆의 숫자가 j
                if (lotto[i] > lotto[j]) { //i의 값이 j보다 크다면
                    int temp = lotto[i]; // i를 임시로 temp 라는 공간에 저장하고
                    lotto[i] = lotto[j]; // j의 값은  i가 되며
                    lotto[j] = temp; // j는 temp 라는 공간에 임시로 저장된다
                }
            }
        }
        System.out.println("이번주 로또번호 : " + Arrays.toString(lotto));
    }
}
