package yuydemos.src.fanshe;

import java.lang.reflect.Field;

/**
 * Coder: yuyang
 * Date: 2019/11/15
 * Description: 测试类定义
 * Version:
 */
public class Student {

    public Student() {
        System.out.println("创建了一个Student 实例");

    }

    private String name;

      public  static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchFieldException {

          //利用反射获取属性 & 赋值

          //1、获取Studeng 对象的Class 对象
          Class studentClazz = Student.class;

          //2、通过Class 对象 创建Student 类的对象

          Object mStudent = studentClazz.newInstance();

          //3、通过Class 对象获取Student 类的name 属性
          Field field = studentClazz.getDeclaredField("name");

          //4、设置私有访问权限
          field.setAccessible(true);

          //5、 对新创建的对象设置name 值
          field.set(mStudent, "yuyang");

          //6、获取新的 对象属性， & 输出
          System.out.println(field.get(mStudent));

         }

}
