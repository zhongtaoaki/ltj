package second;

public class VariableDemo {
    
    //パラメータ
    static int method(int j ){ 
        
        j++;
        return j;
    }

    public static void main(String[] args) {
        int i = 10;
       
        i = method(i);
        System.out.println(method(i));
        System.out.println(i);
    }
}
