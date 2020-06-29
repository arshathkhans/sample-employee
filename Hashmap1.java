package mypackagetest;

import java.util.HashMap;
import mypackagetest.Notification;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;


public class Hashmap1 implements Notification {
    Map<Integer, worker> map = new HashMap<Integer, worker>();

    @Override
    public void add(int id, String name, int age, String dept) {
        /* Adding worker Details */
        worker b1 = new worker(id, name, dept, age);
        map.put(id, b1);
    }

    @Override
    public void delete(int id) {
        /* iterates all elements and delete the given id detail */
        Iterator<Integer> it = map.keySet().iterator();
        /* Iterate over all the elements */
        while (it.hasNext()) {
            int key = it.next();
            if (key == id) {
                // Remove the element
                it.remove();
            }
        }
    }

    @Override
    public void display() {
        /* displaying all details */
        System.out.println(" Details:");
        for (Map.Entry<Integer, worker> entry : map.entrySet()) {
            int key = entry.getKey();
            worker b = entry.getValue();
            System.out.println(b.id + " " + b.name + " " + b.age + " " + b.dept);
        }
    }

    @Override
    public void fetch(int id) {
        /* iterating and fetching detail */
        for (Map.Entry<Integer, worker> entry : map.entrySet()) {
            int key = entry.getKey();
            worker b = entry.getValue();
            if (key == id) {
                System.out.println(key + " Details:");
                System.out.println(b.id + " " + b.name + " " + b.age + " " + b.dept);
            }
        }
    }
}

