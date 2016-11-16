package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by JPMPC-B212 on 11/12/2016.
 */
public class MyMethods
{
    /*public static void myLoop(int number)
    {
        while (number < 7)
        {
            System.out.print("[" + number + "]");
            number++;
        }
    }

    public static int getSum()
    {
        int x = 1;
        int total = 0;
        while (x < 7)
        {
            total = x++;
            x++;
        }
        return total;
    }

    public static void myDisplay()
    {
        int n = 1;
        do
        {
            System.out.print("[" + n + "]");
            n++;
        }
        while (n <= 9);
    }*/

    public static String getMyFriends()
    {
        List<String> myFriends = new ArrayList<String>();
        myFriends.add("ann");
        myFriends.add("mary");
        myFriends.add("jane");
        myFriends.add("heart");
        myFriends.add("lorna");
        Random randName = new Random();
        int name = randName.nextInt(5);
        return myFriends.get(name);
    }

    public static String getOtherFriends()
    {
        List<String> OtherFriends = new ArrayList<String>();
        OtherFriends.add("mark");
        OtherFriends.add("john");
        OtherFriends.add("renz");
        OtherFriends.add("james");
        OtherFriends.add("niel");
        Random randName = new Random();
        int name = randName.nextInt(5);
        return OtherFriends.get(name);
    }

    public static String getStatus()
    {
        List<String> Status = new ArrayList<String>();
        Status.add("hate");
        Status.add("love");
        Status.add("secret");
        Status.add("complecated");
        Status.add("ssdf");
        Random randName = new Random();
        int name = randName.nextInt(5);
        return Status.get(name);
    }





}










