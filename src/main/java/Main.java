public class Main {

    public static void main(String[] args) {

        String string_voorbeeld = "Dit is een voorbeeld";
        String string_hello_world = "hello world";
        boolean boolean_true = true;
        int int_four = 4;
        short short_minus_eight = -8;
        float float_six_point_five = 6.5F;
        double double_minus_two_point_three = -2.3;


        // Wijzig niets aan onderstaande System.out.println statements

        System.out.println(string_voorbeeld); // String Dit is een voorbeeld
        System.out.println(string_hello_world); // String hello world
        System.out.println(boolean_true); // boolean true
        System.out.println(int_four); // int 4
        System.out.println(short_minus_eight); // short -8
        System.out.println(float_six_point_five); // float 6.5
        System.out.println(double_minus_two_point_three); // double -2.3

        // Bonus: Wijs een nieuwe waarde toe aan een bestaande variabele

        string_voorbeeld = "Dit is een aangepast voorbeeld";
        boolean_true = false;
        int_four = 8;
        short_minus_eight = -4;
        float_six_point_five = 3.45F;
        double_minus_two_point_three = -9.13;

        System.out.println(string_voorbeeld); // String Dit is een aangepast voorbeeld
        System.out.println(boolean_true); // boolean false
        System.out.println(int_four); // int 8
        System.out.println(short_minus_eight); // short -4
        System.out.println(float_six_point_five); // float 3.45
        System.out.println(double_minus_two_point_three); // double -9.13
    }

}
