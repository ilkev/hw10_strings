import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        task();
    }

    public static void task() {

        //task1

        String firstname = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = firstname + " " + middleName + " " + lastName;
        System.out.println("ФИО сотрудника - "+fullName);

        //task2

        String fullName1 = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета —"+fullName1);

        //task3

        String fullName2 = "Иванов Семён Семёнович";
        String fullName3 = fullName2.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — "+fullName3);
    }
}