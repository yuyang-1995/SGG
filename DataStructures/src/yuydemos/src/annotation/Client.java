package yuydemos.src.annotation;

import java.lang.reflect.Method;

/**
 * Coder: yuyang
 * Date: 2019/11/15
 * Description:
 * Version:
 */
public class Client {
      public  static void main(String[] args){

          //1、获取 测试对象
          Test2 test2 = new Test2();
          Class t2Clazz = test2.getClass();

          //2、获取测试类所有方法， 用数组存放
          Method[] methods = t2Clazz.getDeclaredMethods();

          //3、通过注解 测试类中的方法
          //a. 遍历类中所有的方法
          // a. 遍历类中所有方法
          for ( Method m: methods ) {
              // b. 只有被 @Carson_Test 标注过的方法才允许进行测试
              if ( m.isAnnotationPresent( Yuy_Test.class )) {
                  try {
                      m.setAccessible(true);
                      // c. 通过反射调用测试类中的方法
                      m.invoke(test2);
                      // d. 捕捉方法出现的异常 & 输出异常信息
                  } catch (Exception e) {
                      System.out.println( "Test类出现Bug了！！！");
                      System.out.println( "出现Bug的方法：" + m.getName());
                      System.out.println( "Bug类型：" + e.getCause().getClass().getSimpleName());
                      System.out.println( "Bug信息：" + e.getCause().getMessage());
                  }
              }
          }
         }
}
