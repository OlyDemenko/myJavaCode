package Course1.Homework1.Homework_service_1;

import Course1.Homework1.HomeTask_1;
import Course1.Homework1.HomeTask_2;
import Course1.Homework1.HomeTask_3;

import static Course1.Homework1.HomeTask_1.amountHomeTask_1;
import static Course1.Homework1.HomeTask_2.amountHomeTask_2;
import static Course1.Homework1.HomeTask_3.amountHomeTask_3;

public class ServiceClass_Homework_1 {
    public static void main(String[] args) {

        System.out.println(HomeTask_1.name);
        System.out.println(HomeTask_2.name);
        System.out.println(HomeTask_3.name);

        System.out.println("Загальна кількість: ");
        System.out.println(amountHomeTask_1 + amountHomeTask_2 + amountHomeTask_3);
    }
}