package pack;

import java.io.File;
import java.util.Arrays;
import java.util.concurrent.Executors;

/**
 * Coder: yuyang
 * Date: 2019/11/12
 * Description:
 * Version:
 */
public class Son extends Father {


    File file;

    Executors executors;
    public Son() {
    }

    StringBuffer stringBuffer;
    StringBuilder stringBuilder;

    public  static void main(String[] args) {

        String s1 = new String("yuy");
        String s2 = new String("yuy");

        System.out.println(s1.equals(s2));


    }

}
