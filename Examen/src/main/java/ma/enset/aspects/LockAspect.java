package ma.enset.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Aspect
@EnableAspectJAutoProxy
public class LogAspect {
    @Before(value = "@annotation(ma.enset.aspects.Log)")
    public void log(JoinPoint joinPoint){
        System.out.println(new Date()+ " - call :" + joinPoint.getSignature().getName());
    }
}
