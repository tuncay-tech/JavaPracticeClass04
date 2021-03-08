package practice04;

import java.util.Scanner;

public class soru07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        String sayi = scan.next();
        for (int i = sayi.length()-1; i >=0; i--) {
            System.out.print(sayi.charAt(i));
        }
    }
}
