package aop.aspects;

import aop.component.Model;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ModelServiceAspect {

    @Before(value = "execution(* aop.service.ModelService.add(..)) && args(model)")
    public void beforeAdvice(JoinPoint joinPoint, Model model) {
        System.out.println("Before add function:" + joinPoint.getSignature());
        System.out.println("Model name:" + model.getName() + " age:" + model.getAge());
    }

    @AfterReturning(pointcut = "execution(* aop.service.ModelService.add(..))", returning = "response")
    public void afterReturning(JoinPoint joinPoint, Object response) {
        System.out.println("Your model adding status:" + response);
    }
}
