
public interface ComparableListInterface
{

    public boolean isEmpty();
    public int size();
    public void add(int index, Comparable item) throws
                                            ListIndexOutOfBoundsException, ListException;

    public Comparable get(int index)
            throws ListIndexOutOfBoundsException;

    public void remove(int index)
            throws ListIndexOutOfBoundsException;

    public void removeAll();
    public boolean isInAscendingOrder();
    
}
