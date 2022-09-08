package PackageAndInheritance.multipleinheritanceissues;

interface Alpha {
    void save();

    default void reset() {
        System.out.println("Resetting in Alpha...");
    }
}
