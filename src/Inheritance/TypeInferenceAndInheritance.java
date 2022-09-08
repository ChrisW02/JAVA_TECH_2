package Inheritance;

class MyClass {

}

class FirstDerivedClass extends MyClass {
    int x;

}

class SecondDerivedClass extends FirstDerivedClass {
    int y;
}

public class TypeInferenceAndInheritance {

    static MyClass getObj(int which) {
        return switch (which) {
            case 0 -> new MyClass();
            case 1 -> new FirstDerivedClass();
            default -> new SecondDerivedClass();
        };
    }

    public static void main(String[] args) {

        var mc = getObj(0);
        var mc2 = getObj(1);
        var mc3 = getObj(2);

        // mc2.x = 10;
        // mc3.y = 10;

        System.out.println(mc);
        System.out.println(mc2);
        System.out.println(mc3);

    }
}
