# AOP
In the following we will create a Java application based on Aspect Oriented Programming.

### dependencies
First, create a maven project and add these dependencies.
```xml
<dependencies>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-core</artifactId>
        <version>6.0.2</version>
    </dependency>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-context</artifactId>
        <version>6.0.2</version>
    </dependency>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-beans</artifactId>
        <version>6.0.2</version>
    </dependency>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-aop</artifactId>
        <version>6.0.2</version>
    </dependency>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-aspects</artifactId>
        <version>6.0.2</version>
    </dependency>
</dependencies>
```

### Business Logic 
Here is the code that describes the business logic of our application:
```java
public interface IMetier {
    void process();
    double computer();
}

public class IMetierImpl implements IMetier {
    @Override
    public void process() {
        System.out.println("Business Process");
    }

    @Override
    public double computer() {
        double data = 78;
        System.out.println("Business Computing");
        return 0;
    }
}
```
main method:
```java
public static void main(String[] args) {
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Application.class);
    IMetier metier = applicationContext.getBean(IMetier.class);
    metier.process();
    System.out.println(metier.compute());
}
```

### Aspects
Now we want to add other functionalities as logging and security.

Example of logging aspect:
```java
@Component
@Aspect
@EnableAspectJAutoProxy
public class LogAspect {
    @Around("execution(* ma.enset.service..*(..))")
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
```

Example of a security aspect using annotations:

First to authenticate a user we will create the following class:
```java
public class SecurityContext {
    private static String username="";
    private static String password="";
    private static String[] roles= {};
    public static void authenticate(String u, String p, String[] r){...}
    public static boolean hasRole(String r){...}
}
```
Our Security Aspect :
```java
@Component
@Aspect
@EnableAspectJAutoProxy
public class AuthorizationAspect {
    @Around(value = "@annotation(securedByAspect)", argNames = "pjp,securedByAspect")
    public Object secure(ProceedingJoinPoint pjp, SecuredByAspect securedByAspect) throws Throwable {
        String[] roles = securedByAspect.roles();
        boolean authorized = false;
        for (String r : roles) {
            if (SecurityContext.hasRole(r)) {
                authorized = true;
                break;
            }
        }
        if (authorized==true){
            Object result = pjp.proceed();
            return result;
        }
        throw new RuntimeException("Not Authorized");
    }
}
```