package third;

import java.util.*;
import second.SortDemo;

/**
 * 使用异包的类的时候，需要导包
 * import 包名.包名.类名
 */

public class PackageDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println(i*i);

        scanner.close();
       
    }

}
