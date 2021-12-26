package third;

public class FieldDemo {
    
    //成员变量是类内的变量
    public int i;


    //本地变量是方法内的变量
    public void method() {
        int i;
    }

    public void name() {
        for (int i = 0; i <10; i++) {
            i ++;
        }
        int i;
    }
}
