package yuydemos.src.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Coder: yuyang
 * Date: 2019/11/15
 * Description:
 * Version:
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Yuy_Annotation {
    //注解 Yuy_Annotation 中有两个属性 id 和 msg
    int id();

    String msg() default "Hi";
}
