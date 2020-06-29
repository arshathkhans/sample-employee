import java.util.*;
import java.sql.*;

/*
 interface Notification {
    void notifyUser();
}
Note- Above interface could be created as an abstract class as well.
Create all implementation classes

Hashmap1.java
filter_none
edit
play_arrow

brightness_4
 class SMSNotification implements Notification {

    @Override
     void notifyUser()
    {
        // TODO Auto-generated method stub
        System.out.println("Sending an SMS notification");
    }
}
Arraylist1.java
filter_none
edit
play_arrow

brightness_4
 class EmailNotification implements Notification {

    @Override
     void notifyUser()
    {
        // TODO Auto-generated method stub
        System.out.println("Sending an e-mail notification");
    }
}
PushNotification.java
filter_none
edit
play_arrow

brightness_4
 class PushNotification implements Notification {

    @Override
     void notifyUser()
    {
        // TODO Auto-generated method stub
        System.out.println("Sending a push notification");
    }
}
Create a factory class NotificationFactory.java to instantiate concrete class.




filter_none
edit
play_arrow

brightness_4
 class NotificationFactory {
     Notification createNotification(String channel)
    {
        if (channel == null || channel.isEmpty())
            return null;
        if ("SMS".equals(channel)) {
            return new SMSNotification();
        }
        else if ("EMAIL".equals(channel)) {
            return new EmailNotification();
        }
        else if ("PUSH".equals(channel)) {
            return new PushNotification();
        }
        return null;
    }
}
Now let’s use factory class to create and get an object of concrete class by passing some information.

filter_none
edit
play_arrow

brightness_4
 class NotificationService {
     static void main(String[] args)
    {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("SMS");
        notification.notifyUser();
    }
}
import java.io.*;
abstract class Plan{
    protected double rate;
    abstract void getRate();

     void calculateBill(int units){
        System.out.println(units*rate);
    }
}//end of Plan class.
Step 2: Create the concrete classes that extends Plan abstract class.

class  DomesticPlan extends Plan{
    //@override
     void getRate(){
        rate=3.50;
    }
}//end of DomesticPlan class.
class  CommercialPlan extends Plan{
    //@override
     void getRate(){
        rate=7.50;
    }
/end of CommercialPlan class.
    class  InstitutionalPlan extends Plan{
        //@override
         void getRate(){
            rate=5.50;
        }
/end of InstitutionalPlan class.
        Step 3: Create a GetPlanFactory to generate object of concrete classes based on given information..

        class GetPlanFactory{

            //use getPlan method to get object of type Plan
             Plan getPlan(String planType){
                if(planType == null){
                    return null;
                }
                if(planType.equalsIgnoreCase("DOMESTICPLAN")) {
                    return new DomesticPlan();
                }
                else if(planType.equalsIgnoreCase("COMMERCIALPLAN")){
                    return new CommercialPlan();
                }
                else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
                    return new InstitutionalPlan();
                }
                return null;
            }
        }//end of GetPlanFactory class.
        Step 4: Generate Bill by using the GetPlanFactory to get the object of concrete classes by passing an information such as type of plan DOMESTICPLAN or COMMERCIALPLAN or INSTITUTIONALPLAN.

import java.io.*;
        class GenerateBill{
             static void main(String args[])throws IOException{
                GetPlanFactory planFactory = new GetPlanFactory();

                System.out.print("Enter the name of plan for which the bill will be generated: ");
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                String planName=br.readLine();
                System.out.print("Enter the number of units for bill will be calculated: ");
                int units=Integer.parseInt(br.readLine());

                Plan p = planFactory.getPlan(planName);
                //call getRate() method and calculateBill()method of DomesticPaln.

                System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");
                p.getRate();
                p.calculateBill(units);
            }
        }//end of GenerateBill class.
*/
