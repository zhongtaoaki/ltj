package second;

public class Practice3 {

    public static void main(String[] args) {

        int count = 0;

        for (int number = 2; number < 2000; number++) {

            boolean a = true;

            for (int i = 2; i < number; i++) {

                if (number % i == 0) {
                    a = false;
                    break;
                }
            }
            if (a) {
                System.out.println(number + "是素数");
                count++;
            }

        }

        System.out.println("素数的数量为:" + count);
    }

}
