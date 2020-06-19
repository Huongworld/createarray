import java.util.Arrays;
import java.util.Scanner;

public class CreateArrays {
    public static void main(String[] args){
        //5 numbers
        int[] numbers = {1,21,4,51};

        for (int i = 0; i < numbers.length ; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
//        7 Strings (ask the user here)
        String[] weekdays = new String[7]; // 0-6
        Scanner scanner = new Scanner(System.in);

        for (int i = 0 ; i < weekdays.length ; i++) {
            System.out.println("Please give me weekday #"+ (i+1));
            weekdays[i] = scanner.nextLine();
        }

        System.out.println(Arrays.toString(weekdays));
//        5 characters
        char[] ch = new char[5];
        ch[0] = 'a';
        ch[1] = 'e';
        ch[2] = 'i';
        ch[3] = 'o';
        ch[4] = 'u';

        System.out.println(Arrays.toString(ch));
//        2 booleans
        boolean[] booleans = new boolean[2];
        booleans[0] = true;
        booleans[1] = false;


        System.out.println(Arrays.toString(booleans));

    }
}

