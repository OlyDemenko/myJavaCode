import Course1.Homework1.HomeTask_1;
import Course1.Homework1.HomeTask_2;
import Course1.Homework1.HomeTask_3;
import Course1.Lections1.Lection_1;
import Course1.Lections1.Lection_2;
import Course1.Lections1.Lection_3;
import Course1.Students1.Student_Max;
import Course1.Students1.Student_Vera;
import Course1.Students1.Student_Victor;
import Course1.Teachers1.Teacher_Boris;
import Course1.Teachers1.Teacher_Maria;
import Course1.Teachers1.Teacher_Vlad;
import Homework_5.Lection_4;
import Homework_5.Lection_5;

import static Course1.Students1.Student_Max.amountMaxim;
import static Course1.Students1.Student_Vera.amountVera;
import static Course1.Students1.Student_Victor.amountVictor;

public class Main {
    public static void main(String[] args) {

        System.out.println(Teacher_Boris.name); // Вчитель

        System.out.println(Lection_1.name); // Лекція

        System.out.println(HomeTask_1.name); // Домашнє завдання

        // Список студентів
        System.out.println(Student_Max.name);
        System.out.println(Student_Vera.name);
        System.out.println(Student_Victor.name);

        System.out.println("Загальна кількість: ");
        System.out.println(amountMaxim + amountVera + amountVictor);
        System.out.println("**************************");


        System.out.println(Teacher_Maria.name); // Вчитель

        System.out.println(Lection_2.name); // Лекція

        System.out.println(HomeTask_2.name); // Домашнє завдання

        // Список студентів
        System.out.println(Student_Max.name);
        System.out.println(Student_Vera.name);

        System.out.println("Загальна кількість: ");
        System.out.println(amountMaxim + amountVera);
        System.out.println("**************************");


        System.out.println(Teacher_Vlad.name); // Вчитель

        System.out.println(Lection_3.name); // Лекція

        System.out.println(HomeTask_3.name); // Домашнє завдання

        // Список студентів
        System.out.println(Student_Max.name);
        System.out.println(Student_Vera.name);
        System.out.println(Student_Victor.name);

        System.out.println("Загальна кількість: ");
        System.out.println(amountMaxim + amountVera + amountVictor);
        System.out.println("**************************");


        System.out.println(Teacher_Boris.name); // Вчитель

        System.out.println(Lection_4.name); // Лекція


        // Список студентів
        System.out.println(Student_Max.name);
        System.out.println(Student_Vera.name);

        System.out.println("Загальна кількість: ");
        System.out.println(amountMaxim + amountVera);
        System.out.println("**************************");


        System.out.println(Teacher_Vlad.name); // Вчитель

        System.out.println(Lection_5.name); // Лекція


        // Список студентів
        System.out.println(Student_Max.name);
        System.out.println(Student_Vera.name);

        System.out.println("Загальна кількість: ");
        System.out.println(amountMaxim + amountVera);
        System.out.println("**************************");
    }
}