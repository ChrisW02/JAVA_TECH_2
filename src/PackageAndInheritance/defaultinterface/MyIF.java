package PackageAndInheritance.defaultinterface;

public interface MyIF {

    int getNumber();

    default String getString() {
        return "Default String";
    }
}
