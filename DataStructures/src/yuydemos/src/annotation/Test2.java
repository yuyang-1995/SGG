package yuydemos.src.annotation;

/**
 * Coder: yuyang
 * Date: 2019/11/15
 * Description:
 * Version:
 */
public class Test2 {

    @Yuy_Test
    public void method1(){
        System.out.println("method1正常运行 = " + (1+1));
    }

    @Yuy_Test
    public void method2(){
        System.out.println("method2正常运行 = " + (2*3));
    }

    @Yuy_Test
    public void method3(){
        System.out.println("method3正常运行 = " + (2/0));
    }

}
