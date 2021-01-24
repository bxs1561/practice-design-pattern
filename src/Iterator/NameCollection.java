package Iterator;

public class NameCollection implements Collection{

    @Override
    public Iterator createIterator() {
        return new NameIterator();
    }
}