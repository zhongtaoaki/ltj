package second;

/**
 * Practice2
 */
public class Practice2 {

    public static void main(String[] args) {

        int[][] numbers = { { 3, 6, 1, 4 }, { 5, 7, 4, 8 } };

        int sum = 0;

        for (int[] is : numbers) {
            for (int i : is) {
                System.out.println(i);
                sum += i;
            }
        }

        System.out.println("这个数组的和为:" + sum);

    }

}