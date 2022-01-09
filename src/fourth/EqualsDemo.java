package fourth;

/**
 * toString()
 * java的所有类class都有一个共同的父类 Object
 * object的equals方法比的是地址，用的是==
 */
public class EqualsDemo {

    public static void main(String[] args) {

        People s = new People();
        // s.name = "张三";
        // People l = new People();
        // l.name = "张三";
        //  s.getName().trim();

        // boolean flag = s.equals(l);
        // System.out.println(flag);

        // String str1 = "abc";
        // String str2 = new String("abc");
        // System.out.println(str1 == str2);

        // String s = "Hello World";
        // System.out.println(s.length());
        // System.out.println(s.toUpperCase());
        // System.out.println(s.trim());
        // System.out.println(s.substring(0, 5));
        // System.out.println(s.replaceAll("l", "L"));

        // 输入一段手机号码，比如 123-4567-8910
        // 输出 123****8910
        String number = "111-1111-1111";
        // System.out.println(number.substring(0, 3) + "****" + number.substring(9));

        StringBuffer sb = new StringBuffer();
        sb.append(number.substring(0, 3)).append("****").append(number.substring(9));
        System.out.println(sb);

        StringBuilder sb2 = new StringBuilder();
        sb2.append(number.substring(0, 3)).append("****").append(number.substring(9));
        System.out.println(sb2);
    }

}

class People {
    private String name;

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return name;

    }

    @Override
    public boolean equals(Object obj) {
        People p = (People) obj;
        // return this.name.equals(p.name);
        return this.name == p.name;
    }

}
