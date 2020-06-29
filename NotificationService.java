package mypackagetest;
import java.sql.SQLException;
import java.util.Scanner;
class worker {
    int id, age;
    String name, dept;

    worker(int id, String name, String dept, int age) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.age = age;
    }
}
public class NotificationService {

    public static void main(String[] args) throws SQLException {
        int s;
        System.out.println("Type 1.Hashmap 2.Arraylist 3.Database");
        Scanner inp = new Scanner(System.in);
        s = inp.nextInt();
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification(s);
        //notification.add();
        int i, k, j = 1, gr = 0, id, age;
        String name, dept;
        while (j == 1) {
            System.out.println("Press 1.Adding 2.Deleting 3.Displaying 4.Fetching");
            gr = inp.nextInt();
            switch (gr) {
                case 1:/* Addingworker Details */
                    System.out.println("enter id name age dept");
                    id = inp.nextInt();
                    name = inp.next();
                    age = inp.nextInt();
                    dept = inp.next();
                    notification.add(id, name, age, dept);
                    break;
                case 2:/* iterates all elements and delete the given id detail */
                    System.out.println("enter id to delete");
                    i = inp.nextInt();
                    notification.delete(i);
                    break;
                case 3:/* displaying all details */
                    notification.display();
                    break;
                case 4:/* iterating and fetching detail */
                    System.out.println("enter id to fetch");
                    k = inp.nextInt();
                    notification.fetch(k);
                    break;
                default:
                    System.out.println("invalid");

            }

            System.out.println("type 1 to continue or 0 to end the task");
            j = inp.nextInt();
        }

    }
    }

