package Course1.Students1.Students_service_1;

import Course1.Students1.Student_Max;
import Course1.Students1.Student_Vera;
import Course1.Students1.Student_Victor;

import static Course1.Students1.Student_Max.amountMaxim;
import static Course1.Students1.Student_Vera.amountVera;
import static Course1.Students1.Student_Victor.amountVictor;

public class ServiceClass_Students1 {
    public static void main(String[] args) {
        System.out.println(Student_Max.name);
        System.out.println(Student_Vera.name);
        System.out.println(Student_Victor.name);

        System.out.println("Загальна кількість: ");
        System.out.println(amountMaxim + amountVera + amountVictor);

    }
}
