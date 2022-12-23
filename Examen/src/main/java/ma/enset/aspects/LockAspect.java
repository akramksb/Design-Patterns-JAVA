package ma.enset.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class LockAspect {
    @Around(value = "@annotation(ma.enset.aspects.Lock)")
    public Object lock(ProceedingJoinPoint pjp){
        return null;
    }
}
