import java.util.Arrays;
import java.util.List;
​
​
​
public class PaginationHelper<I> {
    private List<I> collection;
    private int itemsPerPage;
​
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.collection = collection;
        this.itemsPerPage = itemsPerPage;
    }
​
​
    public int itemCount() {
      
        return collection.size();
    }
​
​
    public int pageCount() {
            return (itemCount() + itemsPerPage - 1) / itemsPerPage;
    }
​
​
   public int pageItemCount(int pageIndex) {
    if (pageIndex < 0 || pageIndex >= pageCount()) {
        return -1;
    }
​
    if ((pageIndex + 1) * itemsPerPage > itemCount()) {
        return itemCount() - pageIndex * itemsPerPage;
    }
​
    return itemsPerPage;
}
​
​
​
    public int pageIndex(int itemIndex) {
    if (itemIndex < 0 || itemIndex >= itemCount()) {
        return -1; 
    }
    return itemIndex / itemsPerPage; 
}
​
}