package yuydemos.src.annotation;

/**
 * Coder: yuyang
 * Date: 2019/11/15
 * Description:
 * Version:
 */
//@Yuy_Annotation(id = 1, msg = "我是类Test")
public class Test {
    //1 个注解 作用于Test 类成员变量
    @Yuy_Annotation(id = 2, msg = "我是变量a")
    int a;

    @Yuy_Annotation(id = 3, msg = "我是方法b")
    @Yuy_Annotation2(id = 4, msg = "我是方法bb （来自第二个注解）")
    public void bMethod(){ }

}
