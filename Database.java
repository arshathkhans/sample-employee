package mypackagetest;

import java.sql.*;
import java.util.*;

import static java.sql.DriverManager.getConnection;

public class Database implements Notification {


    int i, k, j = 1, s, gr = 0, id, age;
    String name, dept;
    String url = "jdbc:mysql://localhost:3306/newtest";
    String username = "root";
    String password = "995287";
    Connection connection = getConnection(url, username, password);
    public Database() throws SQLException {
    }

    @Override
    public void add(int id, String name, int age, String dept) {
        try {

            String sql = "INSERT INTO emp (id,name,age,dept) VALUES ( id,name,age,dept)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            statement.setString(2, name);
            statement.setInt(3, age);
            statement.setString(4, dept);
            int rows = statement.executeUpdate();
            if (rows > 0) {
                System.out.println("a row inserted");
            }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("oops Error!");
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        try {
            Statement statement = connection.createStatement();

            /* input a particular Employees id of which we want to delete record */

            /* query to take data of a particular record from table Employees */
            String q = "delete from emp where id='" + id + "'";

            /* to execute query */
            statement.executeUpdate(q);

            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    @Override
    public void display() {
        try {
            String sql = "SELECT * FROM emp";

            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
            int count = 0;
            while (result.next()) {
                id = result.getInt(1);
                name = result.getString(2);
                age = result.getInt(3);
                dept = result.getString(4);
                count++;
                System.out.println(id + " " + name + " " + age + " " + dept);
            }
            statement.close();


        } catch (SQLException e) {
            System.out.println("oops Error!");
            e.printStackTrace();
        }

    }

    @Override
    public void fetch(int i) {
        try {
            System.out.println("enter id to fetch");
            String sql = "SELECT * FROM emp";

            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
            int count = 0;
            while (result.next()) {
                id = result.getInt(1);
                name = result.getString(2);
                age = result.getInt(3);
                dept = result.getString(4);
                count++;
                if (id == i)
                    System.out.println(id + " " + name + " " + age + " " + dept);
            }
            statement.close();


        } catch (SQLException e) {
            System.out.println("oops Error!");
            e.printStackTrace();
        }
    }
}






