package mypackagetest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Arraylist1 implements Notification {

    ArrayList<worker> arraylist = new ArrayList<worker>();

    @Override
    public void add(int id, String name, int age, String dept) {
        /* Adding worker Details */
        arraylist.add(new worker(id, name, dept, age));
    }
    @Override
    public void delete(int id) {
        /* iterates all elements and delete the given id detail */
        Iterator < worker > itr = arraylist.iterator();
        while (itr.hasNext()) {
            worker gt = itr.next();
            if (gt.id == id)
                itr.remove();
        }
    }

    @Override
    public void display() {
            /* displaying all details */
            System.out.println(" Details:");
            for (worker str : arraylist) {
                System.out.println(str.id + " " + str.name + " " + str.age + " " + str.dept);
            }
        }
    @Override
    public void fetch(int id) {
        /* iterating and fetching detail */

        for (worker str : arraylist) {
            if (id == str.id)
                System.out.println(str.id + " " + str.name + " " + str.age + " " + str.dept);
        }
                }

        }

