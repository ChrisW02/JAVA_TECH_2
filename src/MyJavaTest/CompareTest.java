package MyJavaTest;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Comparator;

public class CompareTest {
    @Test
    public void test1() {
        String[] arr = new String[]{"AA", "CC", "KK", "MM", "GG", "JJ", "DD"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test2() {
        Goods[] arr = new Goods[5];
        arr[0] = new Goods("lenovoMouse", 34);
        arr[1] = new Goods("dellMouse", 43);
        arr[2] = new Goods("xiaomiMouse", 12);
        arr[3] = new Goods("huaweiMouse", 65);
        arr[4] = new Goods("microsoftMouse", 43);

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test3() {
        String[] arr = new String[]{
                "AA", "CC", "KK", "MM", "GG", "JJ", "DD"};
        Arrays.sort(arr, new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1 instanceof String && o2 instanceof String) {
                    return -((String) o1).compareTo((String) o2);
                }
                throw new RuntimeException("Wrong Type!");
            }
        });
        System.out.println(Arrays.toString(arr));

    }
    @Test
    public void test4(){
        Goods[] arr = new Goods[6];
        arr[0] = new Goods("lenovoMouse",34);
        arr[1] = new Goods("dellMouse",43);
        arr[2] = new Goods("xiaomiMouse",12);
        arr[3] = new Goods("huaweiMouse",65);
        arr[4] = new Goods("huaweiMouse",224);
        arr[5] = new Goods("microsoftMouse",43);

        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Goods&&o2 instanceof Goods){
                    Goods g1 = (Goods)o1;
                    Goods g2 = (Goods)o2;
                    if (g1.getName().equals(g2.getName()))return -Double.compare(g1.getPrice(),g2.getPrice());
                    else return g1.getName().compareTo(g2.getName());
                }
                throw new RuntimeException("Wrong Type!");
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}

class Goods implements Comparable {

    private String name;
    private double price;

    public Goods() {
    }

    public Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    //指明商品比较大小的方式:按照价格从低到高排序,再按照产品名称从高到低排序
    @Override
    public int compareTo(Object o) {
//        System.out.println("**************");
        if (o instanceof Goods goods) {
            //方式一：
            if (this.price > goods.price) {
                return 1;
            } else if (this.price < goods.price) {
                return -1;
            } else {
//                return 0;
                return -this.name.compareTo(goods.name);
            }
            //方式二：
//           return Double.compare(this.price,goods.price);
        }
//        return 0;
        throw new RuntimeException("传入的数据类型不一致！");
    }
}

