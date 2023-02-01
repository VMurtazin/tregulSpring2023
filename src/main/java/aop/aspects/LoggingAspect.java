package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class LoggingAspect {


    @Pointcut("execution(* aop.UniLibrary.get*())")
    private void allGetMethodFromUnilibrary(){}

    @Pointcut("execution(* aop.UniLibrary.return*())")
    private void allReturnMethodFromUnilibrary(){}

    @Pointcut("allGetMethodFromUnilibrary()||allReturnMethodFromUnilibrary()")
    private void allGet_ReturnMethodFromUnilibrary(){}


    @Before("allGetMethodFromUnilibrary()")
    public void BeforeGetLoggingAdvice(){
        System.out.println("BeforeGetLoggingAdvice RWITIG LOG 1");
    }

    @Before("allReturnMethodFromUnilibrary()")
    public void BeforeReturnLoggingAdvice(){
        System.out.println("BeforeReturnLoggingAdvice RWITIG LOG 2");
    }

    @Before("allGet_ReturnMethodFromUnilibrary()")
    public void BeforeGet_ReturnLoggingAdvice(){
        System.out.println("BeforeGet-ReturnLoggingAdvice RWITIG LOG 3");
    }



//    @Before("execution(public void get*(String))")//выражение называется Poincut
//    public void beforeGetBookAdvice(){
//        System.out.println("beforeGetBookAdvice:попытка получить книгу");
//    }


}
