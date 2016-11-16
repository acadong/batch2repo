import classes.Customer;
import classes.Employee;
import classes.MyMethods;
import classes.Person;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //This is for hellow display

       /* System.out.println("Hello World!");

        /*personObject = new Person();
        personObject.setName("Alvin C");
        String name = personObject.getName();

        Employee employeeObject = new Employee();
        employeeObject.setName("aca");
        employeeObject.setAge(24);
        employeeObject.setGender(true);
        employeeObject.setHeight(50);

        Customer customerObject = new Customer();
        customerObject.setName("Maria");
        customerObject.setCustomerId(12);
        customerObject.setTelephoneNo(234234);

       // Person person = new Person();

        System.out.println("name:" +employeeObject.getName());
        System.out.println("age:" +employeeObject.getAge());
        System.out.println("gender:" +employeeObject.isGender());
        System.out.println("height:" +employeeObject.getHeight());

        System.out.println("name:" +customerObject.getName()); */
/*
        int x = 5;

        if(x<3){

            System.out.println( x+ " is less than 3");

        } else {

            System.out.println( x+ " is greater than or equal to 3");
        }

        int a = 10;

             System.out.println("a="+a);

        int x1 = 10;
        int x2 = 20;
        int x3 = 30;
        int total = x1 + x2 +x3;

                System.out.println("total="+total);

        int student = 20;

            if( student <= 15 ){

            System.out.print("Monday current subject is Math and teacher1 has a total of 15 students");

        }else{

            System.out.print("Tuesday current subject is Science and allteacher has a total of 20 students");

                boolean weekday = true;
                boolean holiday = false;

                if(!weekday || holiday){

                               if(holiday = true){

                            System.out.println("today is Working day");
                        }
                        else System.out.println("today is Vacation day");
                    }
*/
//                    boolean regular = false;
                  /* boolean parttime = false;
                    String student = "irregular";

                        if(!parttime&&student == "regular") {

                        System.out.println("Your only allowed to take 7 subjects");
                        }
                        else if(parttime && student == "regular" || parttime && student == "irregular") {

                            System.out.println("Your only allowed to take 6 subjects");
                        }
                        else  if (!parttime && student == "irregular") {
                            System.out.println("Your only allowed to take 5 subjects");
                        }*/

       /* boolean isparttime = true;
        int isPar = 0;
        boolean isRegular = false;
        int getNum = getNum(isParttime, isFRegular, maximumSubjectsTake, minimumSubjectsTaken);
        String message;
        case1:
        message ="Regular/Irregular student but working parttime in school ="+getNum;
        break;
        default:
        message =isRegular?"Regular Student="+getNum +"subjects":"Irregular Student";
        break;
        switch(isParttime)
        */

        /*
        int number = 1;
        MyMethods.myLoop(number);
        */

        /*System.out.println(" sum: " + MyMethods.getSum());
        MyMethods.myDisplay();
        MyMethods.getMyFriends();
        */

        String randName[] = new String[2];
        randomName[0] = MyMethods.getOtherFriends();
        randomName[1] = MyMethods.getMyFriends();

        int swap1,swap2;

        do {
            swap1 = MyMethods




        Random randName = new Random();
        int rand = randName.nextInt(2);

        if (rand == 0 ){
            System.out.println(  MyMethods.getOtherFriends() +  "  " + MyMethods.getStatus() + "  " + MyMethods.getMyFriends());
        }

        else {
            System.out.println(  MyMethods.getMyFriends() +  "  " + MyMethods.getStatus() + "  " + MyMethods.getOtherFriends());
        }














    }




}



