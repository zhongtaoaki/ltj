package second;

/**
 * 方法
 * 
 * 
 */
public class Practice1 {

    public static void main(String[] args) {

        int month = 9;
        switch (month) {
            case 2, 3, 4:
                System.out.println("春季");
                break;
            case 5, 6, 7:
                System.out.println("夏季");
                break;
            case 8, 9, 10:
                System.out.println("秋季");
                break;
            case 11, 12, 1:
                System.out.println("冬季");
                break;

            default:
                break;
        }

    }
}
