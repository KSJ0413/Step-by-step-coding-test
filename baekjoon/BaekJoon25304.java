package baekjoon;

import java.util.Scanner;

public class BaekJoon25304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

      int big = N/5;
      int big5 =N%5;
           if(big5 ==0){
           System.out.println(big);
           }
                   if(big5==1){
                       System.out.println(big+1);
                   }
                       if(big5==2){
                           System.out.println(-1);
                       }
                            if(N==3){
                                System.out.println(1);
                            }else
                               if(big5==3){
                                   System.out.println(big+1);
                               }
                               if(N==4){
                                   System.out.println(-1);
                               }
                               else if(big5==4){
                                   System.out.println(big+2);
                                   }

       }
    }




//    Scanner sc = new Scanner(System.in);
//
//    int total =  sc.nextInt();
//    int count = sc.nextInt();
//
//        for(int i = 0; i< count; i++){
//        int price = sc.nextInt();
//        int num = sc.nextInt();
//
//        total = total - (price * num);
//        }
//
//        if(total == 0) System.out.println("Yes");
//        else System.out.println("No");