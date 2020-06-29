package mypackagetest;

import mypackagetest.*;

import java.sql.SQLException;
import java.util.Scanner;

public class NotificationFactory {
    Notification createNotification(int ch) throws SQLException {
        if (ch==1) {
            return new Hashmap1();
        }
        else if (ch==2) {
            return new Arraylist1();
        }
        else if (ch==3) {
            return new Database();
        }
        return null;
    }
}
