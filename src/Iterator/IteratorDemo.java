package Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        NameCollection nameCollection = new NameCollection();
        Iterator iter =nameCollection.createIterator();
        while (iter.hasNext()){
            String name = (String)iter.next();
            System.out.println(name);
        }
    }
    }

