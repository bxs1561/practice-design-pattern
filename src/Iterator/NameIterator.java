package Iterator;

public class NameIterator implements Iterator{
    public String names[] = {"bishal" , "arjun" ,"virat" , "nandu", "abhaya"};

    public int index;
    @Override
    public boolean hasNext() {
        if(index<names.length){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if(this.hasNext()){
            return names[index++];
        }
        return null;
    }
}
