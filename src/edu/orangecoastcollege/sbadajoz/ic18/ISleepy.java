package edu.orangecoastcollege.sbadajoz.ic18;
/*
Badajoz, Seve
CS A170
November 2, 2016

IC18
*/


import java.text.DecimalFormat;
import java.util.Scanner;

public class ISleepy {
    public static void main(String[] args) {
//        Replace 2D array with HashMap in hacker challenge
//        HashMap<String, Double> sleepRecord = new HashMap<>();
//        sleepRecord.put("Monday", 0.0);
//        
//        double hoursSleptOnMonday = sleepRecord.get("Monday");
        
        DecimalFormat twoDP = new DecimalFormat("#.00");
        Object[][] array = {{"Sunday", 0.0}, {"Monday", 0.0},{"Tuesday", 0.0},{"Wednesday", 0.0},{"Thursday", 0.0},{"Friday", 0.0},{"Saturday", 0.0}};
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        double avg;
        int recommended = 0, appropriate = 0, notRecommended = 0;
        
        for(int i = 0; i < array.length; i++) {
            System.out.print("Enter number of hours slept on " + array[i][0] + ": ");
            array[i][1] = input.nextDouble();
            total += (Double) array[i][1];
            
            if((Double)array[i][1] > 11.0|| (Double)array[i][1] < 6.0)
                notRecommended++;
            else if((Double)array[i][1] >= 7.0 && (Double)array[i][1] <= 9.0)
               recommended++;
            else
                appropriate++;
        }
        
        input.close();
        
        avg = total / array.length;
        System.out.println("\nTotal number of hours slept last week: " + twoDP.format(total));
        System.out.println("Average number of hours slept per night " + twoDP.format(avg));
        
        //make a ternary to fix plurality
        System.out.println("\nAccording to the NSF, last week, you slept:\n"
                + recommended + " nights of \"recommended\" sleep\n"
                        + appropriate + " nights of sleep that \"may be appropriate\"\n"
                                + notRecommended + " nights of \"not recommended\" sleep");
        
//        In hacker challenge replace this block of code with a ternary (blah)? "if":"else"
        if(avg > 11.0|| avg < 6.0)
            System.out.println("Overall, your sleep health (on average) is \"Not Recommended\"");
        else if(avg > 7.0 && avg < 10.0)
            System.out.println("Overall, your sleep health (on average) is \"Recommended\"");
        else
            System.out.println("Overall, your sleep health (on average) is \"May be Appropriate\"");
    }
}
