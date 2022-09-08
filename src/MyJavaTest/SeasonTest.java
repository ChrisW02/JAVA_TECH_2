package MyJavaTest;

public class SeasonTest {
    public static void main(String[] args) {
        Season summer = Season.SUMMER;
        System.out.println(summer);
        Season[] values = Season.values();
        for (int i =0;i<values.length;++i){
            System.out.println(values[i]);
            values[i].show();
        }
        Thread.State[] values1 = Thread.State.values();
        for (int i =0;i<values1.length;++i){
            System.out.println(values1[i]);
        }

        Season winter = Season.valueOf("WINTER");
        System.out.println(winter);
        winter.show();
    }
}

interface Info{
    void show();
}

enum Season implements Info{

    SPRING("Spring","Flowers"){
        @Override
        public void show(){
            System.out.println("Spring has flowers.\n");
        }
    },
    SUMMER("Summer","Hot"){
        @Override
        public void show(){
            System.out.println("Summer is hot.\n");
        }
    },
    AUTUME("Autumn","Cool"){
        @Override
        public void show(){
            System.out.println("Autumn is cool.\n");
        }
    },
    WINTER("Winter","Cold"){
        @Override
        public void show(){
            System.out.println("Winter is cold.\n");

        }
    };
    private final String seasonName;
    private final String seasonDesc;

    private Season(String seasonName,String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonName(){return seasonName;}
    public String getSeasonDesc(){return seasonDesc;}

    @Override
    public String toString(){
        return "Season{"+seasonName+"}" +
                "\n"+seasonDesc;
    }

    @Override
    public void show(){
        System.out.println("This is a season.");
    }

}
