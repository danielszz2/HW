package sample;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        class Test {
            @sample.TestMethod(a= 2, b =3 )
            public static int sub (int a, int b) {
                int sum = a - b;
                return sum;
                
            }
        }

        Class<?> cls = Test.class;
        Method[] Methods = cls.getDeclaredMethods();
        for (Method m : Methods) {
            if(m.isAnnotationPresent(sample.TestMethod.class)){
                sample.TestMethod test = m.getAnnotation(sample.TestMethod.class);
                int res = (Integer)m.invoke(null, test.a(), test.b());
                System.out.println((res));
            }
        }

    }
}