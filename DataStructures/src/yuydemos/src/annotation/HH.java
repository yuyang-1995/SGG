package yuydemos.src.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Coder: yuyang
 * Date: 2019/11/15
 * Description:
 * Version:
 */
public class HH {

    public  static void main(String[] args){
        /**
         * 讲解1：获取类上的注解
         */

        // 1. 判断Test类是否应用了注解@Yuy_Annotation
        boolean hasAnnotation = Test.class.isAnnotationPresent(Yuy_Annotation.class);

        // 2. 如果应用了注解 = hasAnnotation = true
        //    则获取类上的注解对象
        if ( hasAnnotation ) {
            Yuy_Annotation classAnnotation = Test.class.getAnnotation(Yuy_Annotation.class);

            // 3. 获取注解对象的值
            System.out.println( "我是Test类上的注解");
            System.out.println("id:" + classAnnotation.id());
            System.out.println("msg:" + classAnnotation.msg());
        }

        /**
         * 讲解2：获取类成员变量a上的注解
         */
        try {
            // 1. 获取类上的成员变量a
            Field a = Test.class.getDeclaredField("a");
            a.setAccessible(true);

            // 2. 获取成员变量a上的注解@Carson_Annotation
            Yuy_Annotation variableAnnotation = a.getAnnotation(Yuy_Annotation.class);

            // 3. 若成员变量应用了注解 = hasAnnotation = true
            //    则获取注解对象上的值 = id & msg
            if ( variableAnnotation != null ) {
                System.out.println("我是类成员变量a上的注解");
                System.out.println( "id:" + variableAnnotation.id());
                System.out.println( "msg:" + variableAnnotation.msg());
            }

            /**
             * 讲解3：获取类方法bMethod上的注解
             */
            // 1. 获取类方法bMethod
            Method testMethod = Test.class.getDeclaredMethod("bMethod");

            // 2. 获取方法上的注解
            if ( testMethod != null ) {
                // 因为方法上有2个注解，所以采用getAnnotations()获得所有类型的注解
                Annotation[] ans = testMethod.getAnnotations();

                System.out.println("我是类方法bMethod的注解");

                // 3. 获取注解的值（通过循环）
                for( int i = 0;i < ans.length  ;i++) {
                    System.out.println("类方法bMethod的" + "注解"+ i+ ans[i].annotationType().getSimpleName());
                }
            }
        } catch (NoSuchFieldException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (NoSuchMethodException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
