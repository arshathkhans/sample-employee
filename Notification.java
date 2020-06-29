package mypackagetest;

public interface Notification {

    public void add(int id,String name,int age,String dept);

    public void delete(int id);

    public void display ();

    public void fetch (int id);
}