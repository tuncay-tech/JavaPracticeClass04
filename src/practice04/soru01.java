package practice04;

import java.util.Scanner;

public class soru01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("İstedigin karakteri gir: ");
        String ch = scan.next();        for(int i=0; i<20; i++) {
            for(int j=0; j<i; j++) {
                System.out.print(ch +" ");
            }
            System.out.println();
        }

    }
}
