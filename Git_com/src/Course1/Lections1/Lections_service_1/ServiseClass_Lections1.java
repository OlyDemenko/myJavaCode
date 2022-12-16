package Course1.Lections1.Lections_service_1;

import Course1.Lections1.Lection_1;
import Course1.Lections1.Lection_2;
import Course1.Lections1.Lection_3;

import static Course1.Lections1.Lection_1.amountLection_1;
import static Course1.Lections1.Lection_2.amountLection_2;
import static Course1.Lections1.Lection_3.amountLection_3;

public class ServiseClass_Lections1 {
    public static void main(String[] args) {

        System.out.println(Lection_1.name);
        System.out.println(Lection_2.name);
        System.out.println(Lection_3.name);

        System.out.println("Загальна кількість: ");
        System.out.println(amountLection_1 + amountLection_2 + amountLection_3);
    }
}
