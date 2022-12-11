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
    @Before("execution(* ma.enset.service..*(..))")
    public void log(){
        System.out.println("From Logging Aspect... Before");
    }
}
```