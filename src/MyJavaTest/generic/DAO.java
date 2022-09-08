package MyJavaTest.generic;

import java.util.Iterator;
import java.util.List;

public class DAO<T> {

    public void add(T t){}

    public boolean remove(int index){return false;}

    public void update(int index,T t){}

    public T getIndex(int index){return null;}

    public List<T> getForList(int index){return null;}

    public <E> E getValue(){return null;}

}
