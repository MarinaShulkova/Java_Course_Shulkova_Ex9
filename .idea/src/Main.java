import java.util.Scanner;

public class Main {


    public static int menu_print() {

        System.out.println(
                "1 Enter student \n" +
                        "2 Sort students in ascending order \n" +
                        "3 Sort students in descending order \n" +
                        "4 Delete student by index \n" +
                        "5 Exit");

        System.out.println("Choose menu item: ");
        Scanner scr = new Scanner(System.in);
        int menu_item = scr.nextInt();
    }
}
