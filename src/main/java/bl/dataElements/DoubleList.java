package bl.dataElements;

import java.util.ArrayList;
import java.util.Collection;
import java.util.NoSuchElementException;

public class DoubleList<T> {
    ArrayList<T> one = new ArrayList<T>();
    ArrayList<T> two = new ArrayList<T>();
    
    public DoubleList(Collection<T> one, Collection<T> two){
        this.one = new ArrayList<T>(one);
        this.two = new ArrayList<T>(two);
    }
    
    public DoubleList(){
        
    }
    
    public void switchList(T element){
        if(one.remove(element)){
            two.add(element);
        }else if(two.remove(element)){
            one.add(element);
        }else{
            throw new NoSuchElementException();
        }
    }
    
    public void addToOne(T element){
        one.add(element);
    }
    
    public void addToTwo(T element){
        two.add(element);
    }
}
