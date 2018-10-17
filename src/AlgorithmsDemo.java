import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class AlgorithmsDemo {
    public static void main(String[] args) {

        // Create and initialize linked list
        LinkedList ll = new LinkedList();
        ll.add(new Integer(-8));
        ll.add(new Integer(20));
        ll.add(new Integer(-20));
        ll.add(new Integer(8));

        // Create a reverse order comparator
        Comparator r = Collections.reverseOrder();

        //Sort the list using the comparator
        Collections.sort(ll, r);

        //Get Iterator
        Iterator li =ll.iterator();
        System.out.println("List sorted in reverse");

        while(li.hasNext()){
            System.out.println(li.next() + " ");

        }
        System.out.println();

        Collections.shuffle(ll);

        //Display shuffled (randomized) list
        li = ll.iterator();
        System.out.println("List shuffled");

        while(li.hasNext()){
            System.out.println(li.next()+ " ");
        }
        System.out.println();
        System.out.println("Minimum " + Collections.min(ll));
        System.out.println("Maximum " + Collections.max(ll));


    }
}
