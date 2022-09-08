package MyJavaTest.generic;

import org.testng.annotations.Test;

import java.util.*;

public class GenericTest {

    @Test
    public void test1() {
        ArrayList list = new ArrayList();
        list.add(78);
        list.add(76);
        list.add(89);
        list.add(88); // 类型不安全

        for (Object score : list) {
            int stuScore = (Integer) score;
            System.out.println(stuScore);
        }
    }

    @Test
    public void test2() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(78);
        list.add(87);
        list.add(99);
        list.add(65);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int stuScore = iterator.next();
            System.out.println(stuScore);
        }
    }

    @Test
    public void test3() {
        Map<String, Integer> map = new HashMap<>();

        map.put("Tom", 87);
        map.put("Jerry", 87);
        map.put("Jack", 67);

        Set<Map.Entry<String, Integer>> entry = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entry.iterator();

        while(iterator.hasNext()){
            Map.Entry<String,Integer> e = iterator.next();
            String key = e.getKey();
            Integer value = e.getValue();
            System.out.println(key+"----"+value);
        }
    }
}
