import java.util.ArrayList;
import java.util.List;

public class Order{

    public int x;
    public int y;

    public boolean isDone;
    public int noOfItems;
    public List<Integer> items;

    public Order(){
        items = new ArrayList<>();
        isDone = false;
    }

}
