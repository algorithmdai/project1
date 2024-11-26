package aop;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author 1060785272@qq.com
 * @version 1.0
 * @description: TODO
 * @date 2022-4-10 下午 9:31
 */
@Aspect
@Component
public class LogAdvice {
    // 定义一个切点：所有被GetMapping注解修饰的方法会织入advice
    @Pointcut("within(aop.user)")
    private void logAdvicePointcut(){}




    @After("logAdvicePointcut()")
    public void logAdvice1(){
        // 这里只是一个示例，你可以写任何处理逻辑
        System.out.println("After");
    }
    @Before("logAdvicePointcut()")
    public void logAdvice(){
        // 这里只是一个示例，你可以写任何处理逻辑
        System.out.println("Before");
    }
}

