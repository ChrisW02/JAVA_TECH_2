package MyJavaTest.reflection;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTest {

    @Test
    public void test1() {
        Person p1 = new Person("Tom", 12);

        p1.age = 10;
        System.out.println(p1.toString());
        p1.show();
    }

    @Test
    public void test2()throws Exception{
        Class<Person> clazz = Person.class;
        Constructor<Person> cons = clazz.getConstructor(String.class,int.class);
        Person p = cons.newInstance("Tom",12);
        System.out.println(p.toString());
        Field age = clazz.getDeclaredField("age");
        age.set(p,10);
        System.out.println(p.toString());

        Method show = clazz.getDeclaredMethod("show");
        show.invoke(p);

        System.out.println();
    }
}
