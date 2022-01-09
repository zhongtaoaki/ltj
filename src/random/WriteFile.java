package random;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class WriteFile {

    public static void main(String[] args) throws IOException {
        
        File file = new File("object.txt");
        if (file.exists()) {
            file.delete();
            System.out.println("object.txt has been deleted");
        }
        file.createNewFile();
        System.out.println("object.txt has been created");
        FileOutputStream outFile = new FileOutputStream("object.txt");
        ObjectOutputStream outObject = new ObjectOutputStream(outFile);

        List<Bean> list = new ArrayList<>();
        list.add(new Bean("徐同学", 1));
        list.add(new Bean("冯同学", 1));
        //list.add(new Bean("鹤达同学", 1));
        list.add(new Bean("杨同学", 1));
        list.add(new Bean("王同学", 1));
        //list.add(new Bean("陈同学", 1));
        list.add(new Bean("孙同学", 1));
        list.add(new Bean("秦同学", 1));

        outObject.writeObject(list);
        outObject.close();
        outFile.close();
    }
    
}
