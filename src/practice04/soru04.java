package practice04;

import java.util.Scanner;

public class soru04 {
    public static void main(String[] args) {
        float celcius, fahren;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter temp. in Celsius :");
        celcius = s.nextInt();

        fahren = celcius * 9 / 5 + 32;

        System.out.println("Temp. in Fahrenheit: " + fahren);
    }
}
