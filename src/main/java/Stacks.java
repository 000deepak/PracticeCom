import java.util.*;

public class Stacks {
    public static void main(String[] args) {
        Stack st = new Stack();

        List list = new ArrayList();
        list.add(1);
        list.add("deep");

        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}


