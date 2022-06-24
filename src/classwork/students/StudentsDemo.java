package classwork.students;

import java.util.Scanner;

public class StudentsDemo {
    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();

    public static void main(String[] args) {

        boolean run = true;
        while (run) {

            commandLine();

            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case 0:
                    run = false;
                    break;
                case 1:
                    addstudent();
                    break;
                case 2:
                    studentStorage.print();
                    break;
                case 3:
                    System.out.println(studentStorage.getSize());
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    lessonPrint();
                    break;

                case 6:
                    changeLesson();
                    break;

                default:
                    System.out.println("invalid command, Please try again");


            }
        }
    }

    private static void addstudent() {
        System.out.println("Please input student name");
        String name = scanner.nextLine();
        System.out.println("Please input student surname");
        String surname = scanner.nextLine();
        System.out.println("Please input student age");
        String ageStr = scanner.nextLine();
        System.out.println("Please input student phoneNumber");
        String phoneNumber = scanner.nextLine();
        System.out.println("Please input student city");
        String city = scanner.nextLine();
        System.out.println("Please input student lesson");
        String lesson = scanner.nextLine();

        int age = Integer.parseInt(ageStr);
        Student student = new Student(name, surname, age, phoneNumber, city, lesson);
        studentStorage.add(student);
        System.out.println("Thank you");
    }

    private static void commandLine() {
        System.out.println("Please input 0 for exit");
        System.out.println("Please input 1 for add student");
        System.out.println("Please input 2 for print all students");
        System.out.println("Please input 3 for print students count");
        System.out.println("Please input 4 for print delete student by index");
        System.out.println("Please input 5 for print students by lesson");
        System.out.println("Please input 6 for change students lesson");
    }

    private static void delete() {
        studentStorage.print();
        System.out.println("Please choose student index");
        int index = Integer.parseInt(scanner.nextLine());
        studentStorage.delete(index);
    }

    private static void lessonPrint() {
        System.out.println("please input lesson name");
        String lessonName = scanner.nextLine();
        studentStorage.printStudentByLesson(lessonName);
    }

    private static void changeLesson() {
        studentStorage.print();
        System.out.println("Please input student index");
        int index;
        index = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input new lesson");
        String lessonChange = scanner.nextLine();
        studentStorage.changeLesson(index, lessonChange);
    }

}
