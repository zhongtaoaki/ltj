package fourth;

import java.util.HashMap;

public class GeneralDemo {

    public static void main(String[] args) {
        
        String[] array = {"1","2","3"};
        printArray(array);

    }
    
    public static <E> void printArray(E[] array) {
        for (E i : array) {
            System.out.println(i);
        }
    }
}
