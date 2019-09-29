
// Array-based implementation of the ADT list.
public class ListArrayBased implements ListInterface
{

    private static final int MAX_LIST = 50;
    private Object items[]; // an array of list items
    private int numItems; // number of items in list
    
    
    public ListArrayBased() {
        items = new Object[MAX_LIST];
        numItems = 0;
    }

    public boolean isEmpty() {
        return (numItems == 0);
    }

    public int size() {
        return numItems;
    }

  

    public void removeAll() {
        // creates a new array ; marks old array for
        // garbage collection.
        items = new Object[MAX_LIST];
        numItems = 0;
    }

    public void add(int index, Object item)
            throws ListIndexOutOfBoundsException{

        if(numItems >= MAX_LIST) {
            throw new ListException("ListException on add");
        }

        if(index >= 0 && index <= numItems) {
            // make room for new element by shifting all items at
            // positions >= index toward the end of the list
            // (no shift if index == numItems+1)
            for(int pos = numItems-1; pos >= index; pos--) {
                items[pos+1] = items[pos];
            } // end for
            // insert new item
            items[index] = item;
            numItems++;
        }

        else { // index out of range
            throw new ListIndexOutOfBoundsException(
                    "ListIndexOutOfBoundsException on add");
        }
    }

    public void remove(int index)
            throws ListIndexOutOfBoundsException{
        if(index >= 0 && index < numItems) {
            // delete item by shifting all items at
            // positions > index toward the beginning of the list
            // (no shift if index == size)
            for(int pos = index+1; pos < numItems; pos++) {
                items[pos-1] = items[pos];
            }
            numItems--;
        }
        else { // index out of range
            throw new IndexOutOfBoundsException(
                    "ListIndexOutOfBoundsException on remove");
        }
    }

    public Object get(int index)
            throws ListIndexOutOfBoundsException{

        if(index >= 0 && index < numItems) {
            return items[index];
        }
        else { // index out of range
            throw new ListIndexOutOfBoundsException(
                    "ListindexOutOfBoundsException on get");
        }
    } // end get
      
}
