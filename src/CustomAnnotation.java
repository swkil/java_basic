import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@interface CustomInfo {
    String author();
    String date();
    int version() default 1;
}

@CustomInfo(author = "Alice", date = "2025-06-26", version = 2)
class Demo {
    @CustomInfo(author = "Alice", date = "2026-06-26")
    public void display() {
        System.out.println("Display method executed.");
    }
}

public class CustomAnnotation {
    public static void main(String[] args) {
        Demo demo = new Demo();
        Class<?> demoClass = demo.getClass();

        if (demoClass.isAnnotationPresent(CustomInfo.class)) {
            CustomInfo classInfo = demoClass.getAnnotation(CustomInfo.class);
            System.out.println("Author: " + classInfo.author());
            System.out.println("Date: " + classInfo.date());
            System.out.println("Version: " + classInfo.version());
        }

        try {
            Method m = demoClass.getMethod("display");

            if(m.isAnnotationPresent(CustomInfo.class)) {
                CustomInfo mi = m.getAnnotation(CustomInfo.class);
                System.out.println("Author: " + mi.author());
                System.out.println("Date: " + mi.date());
                System.out.println("Version: " + mi.version());
            }
        } catch (NoSuchMethodException e) {
            e.getStackTrace();
        }

    }
}
