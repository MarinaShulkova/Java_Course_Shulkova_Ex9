import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class main {
    static  LinkedList <Student> student = new LinkedList<>();

    public static void main (String[] args) {



}

     public static void print_menu() throws MenuException {
        System.out.println(
                "1 Enter student \n" +
                "2 Sort students in ascending order \n" +
                "3 Sort students in descending order \n" +
                "4 Delete student by index \n" +
                "5 Exit");

        System.out.println("Choose menu item: ");
        Scanner scr = new Scanner(System.in);
        int menu_item = scr.nextInt();
        try {
            if (menu_item <= 0 || menu_item > 5) {
                throw new MenuException(menu_item);
            }
        } catch (MenuException me) {
            System.out.println(me.getMenu() + " - Invalid value, please try again!");

        }

        switch (menu_item) {
            case 1: addStudent();break;

            case 2:

            case 3:

            case 4:

            case 5:

                break;
        }
    }

    public static void addStudent (){
        Enum favotite_class;
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter FIO");
        String fio = scr.nextLine();
        System.out.println("Enter age");
        int age = scr.nextInt();

        System.out.println("Enter class number");
        String class_num = scr.nextLine();
        System.out.println("Choose favorite class");
        System.out.println("1. " + Subject.BIOLOGY);
        System.out.println("2. " + Subject.CHEMISTRY);
        System.out.println("3. " + Subject.MATHEMATICS);
        System.out.println("4. " + Subject.INFORMATICS);
        int favorite = scr.nextInt();

         switch (favorite){

             case 1: Student student1 = new Student(fio, age, class_num, Subject.BIOLOGY);
             if(student.contains(student1)) {
                 System.out.println("This student exist already. Try again.");
                 addStudent();
             } else student.add(student1);
             break;
             case 2: student1 = new Student(fio, age, class_num, Subject.CHEMISTRY);
                 if(student.contains(student1)) {
                     System.out.println("This student exist already. Try again.");
                     addStudent();
                 } else student.add(student1);
                 break;
             case 3: student1 = new Student(fio, age, class_num, Subject.MATHEMATICS);
                 if(student.contains(student1)) {
                     System.out.println("This student exist already. Try again.");
                     addStudent();
                 } else student.add(student1);
                 break;
             case 4: student1 = new Student(fio, age, class_num, Subject.INFORMATICS);
                 if(student.contains(student1)) {
                     System.out.println("This student exist already. Try again.");
                     addStudent();
                 } else student.add(student1);
                 break;
         }
    }
}