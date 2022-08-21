package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon11399 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int U =0;

        int one =   scanner.nextInt();
        int five = scanner.nextInt();
        int ten = scanner.nextInt();
        int five_ten = scanner.nextInt();
        int tenten = scanner.nextInt();
        int five_tenten = scanner.nextInt();
        int tententen = scanner.nextInt();
        int five_tententen = scanner.nextInt();
        int tententententen = scanner.nextInt();
        int five_tentententen = scanner.nextInt();



        if(K>five_tentententen) {
            U =+ K/five_tentententen;
            int K1 = K%five_tentententen;
            if(K1>tententententen) {
                U =+ K/tententententen;
                int K2 = K1%tententententen;
                if(K2>five_tententen) {
                    U =+ K/five_tententen;
                    int K3=K%five_tententen;
                    if(K3>tententen) {
                        U =+ K/tententen;
                        int K4=K%tententen;
                        if(K4>five_tenten) {
                            U =+ K/five_tenten;
                            int K5=K%five_tenten;
                            if(K5>tenten) {
                                U =+ K/tenten;
                                int K6=K%tenten;
                                if(K6>five_ten) {
                                    U =+ K/five_ten;
                                    int K7=K%five_ten;
                                    if(K7>ten) {
                                        U =+ K/ten;
                                        int K8=K%ten;
                                        if(K8>five) {
                                            U =+ K/five;
                                            int K9=K%five;
                                            if(K9>one) {
                                                U =+ K/one;
                                                int K10=K%one;
                                                System.out.println(U);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
        }

        }


        if(K1>tententententen) {
            U =+ K/tententententen;
            int K2 = K1%tententententen;
            if(K2>five_tententen) {
                U =+ K/five_tententen;
                int K3=K%five_tententen;
                if(K3>tententen) {
                    U =+ K/tententen;
                    int K4=K%tententen;
                    if(K4>five_tenten) {
                        U =+ K/five_tenten;
                        int K5=K%five_tenten;
                        if(K5>tenten) {
                            U =+ K/tenten;
                            int K6=K%tenten;
                            if(K6>five_ten) {
                                U =+ K/five_ten;
                                int K7=K%five_ten;
                                if(K7>ten) {
                                    U =+ K/ten;
                                    int K8=K%ten;
                                    if(K8>five) {
                                        U =+ K/five;
                                        int K9=K%five;
                                        if(K9>one) {
                                            U =+ K/one;
                                            int K10=K%one;
                                            System.out.println(U);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }



        }


       }
