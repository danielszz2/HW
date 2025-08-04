package sample;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.*;

@Target(value = ElementType.METHOD)
@Retention(value = RUNTIME)
public @interface TestMethod {
    int a();
    int b();
}
