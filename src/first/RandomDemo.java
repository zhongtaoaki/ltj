package first;
import java.util.HashMap;
import java.util.Random;

public class RandomDemo {

    public static HashMap<String,Integer> map = new HashMap<>();
    static {
        map.put("xu", 0);
        map.put("feng", 0);
        map.put("heda", 0);
        map.put("yang", 0);
        map.put("wang", 0);
        map.put("chen", 0);
        map.put("sun", 0);
        map.put("qin", 0);
    }


    public static void main(String[] args) {
        Object[] classMember = map.keySet().toArray();
        Random rand = new Random();
        int index = rand.nextInt(8);
        String luckBoy = classMember[index].toString();
        map.put(luckBoy, map.get(luckBoy)+1);
        System.out.println("这为幸运同学是："+luckBoy+"同学,这是ta的第"+map.get(luckBoy)+"次。");
    }
    
}
