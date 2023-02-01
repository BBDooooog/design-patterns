import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class A {
    private String name;
    public static List<String> s;

    static {
        s = Arrays.asList("123", "123");
    }

    public void sayHello() {
        say();
        hello();
    }

    public void say() {
        System.out.println("hello");
    }

    public void hello() {
        System.out.println("A");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "A{" +
                "name='" + name + '\'' +
                '}';
    }
}
