package practice04;

public class soru06 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12};
        for (int i = 1; i <= numbers.length; i++) {
            if (i == numbers[i - 1]) {
            } else {
                System.out.println(i);
                break;
            }
        }
        }
    }
