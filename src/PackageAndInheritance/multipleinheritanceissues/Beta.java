package PackageAndInheritance.multipleinheritanceissues;

interface Beta extends Alpha {
    void delete();


    @Override
    default void reset() {
        Alpha.super.reset();
    }




}
