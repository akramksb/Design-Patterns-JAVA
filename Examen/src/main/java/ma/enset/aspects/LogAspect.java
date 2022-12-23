package ma.enset.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class LogAspect {
    @Around("@annotation(ma.enset.aspects.Log)")
    public Object log(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long t1 = System.currentTimeMillis();
        System.out.println("From Logging Aspect... Before "+proceedingJoinPoint.getSignature());
        Object result = proceedingJoinPoint.proceed();
        System.out.println("From Logging Aspect... After "+proceedingJoinPoint.getSignature());
        long t2 = System.currentTimeMillis();
        System.out.println("Duration : "+ (t2-t1)+" ms");
        return result;
    }
}
