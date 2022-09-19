package Game;

public class Animal implements Comparable<Animal>{

    private int rank;
    private String name;

    public Animal(int rank, String name) {
        this.rank = rank;
        this.name = name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Override
//    public String toString() {
//        return "Animal{" +
//                "name='" + name + '\'' +
//                '}';
//    }

    @Override
    public int compareTo(Animal other) {
        if (this.rank == 1 && other.rank == 8) return 1;
        return this.rank >= other.rank ? 1 : 0;
    }
}
