package yuydemos.src.fanshe;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Coder: yuyang
 * Date: 2019/11/15
 * Description:
 * Version:
 */
public class S2 {

    public S2() {
        System.out.println("创建了一个Studeng 实例");
    }

    public void setName() {
        System.out.println("setName");
    }

    public void setName2(String str) {
        System.out.println("setName2");
    }

      public  static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

          Class sC = S2.class;

          Object s = sC.newInstance();

          Method method = sC.getMethod("setName");

          method.invoke(s);

          Method method1 = sC.getMethod("setName2", String.class);

          method1.invoke(s, "yuyang");

         }
}
