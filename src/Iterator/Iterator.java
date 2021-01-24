package Iterator;

public interface Iterator{

    //Whether there are more elements to iterate over
    public boolean hasNext();

    //returns next element in collection
    public Object next();
}