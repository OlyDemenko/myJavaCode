package Course1.Teachers1.Teachers_service_1;

import Course1.Teachers1.Teacher_Boris;
import Course1.Teachers1.Teacher_Maria;
import Course1.Teachers1.Teacher_Vlad;

import static Course1.Teachers1.Teacher_Boris.amountBoris;
import static Course1.Teachers1.Teacher_Maria.amountMaria;
import static Course1.Teachers1.Teacher_Vlad.amountVlad;

public class ServiceClass_Teachers1 {

    public static void main(String[] args) {
        System.out.println(Teacher_Boris.name);
        System.out.println(Teacher_Maria.name);
        System.out.println(Teacher_Vlad.name);

        System.out.println("Загальна кількість: ");
        System.out.println(amountBoris + amountMaria + amountVlad);
    }
}
