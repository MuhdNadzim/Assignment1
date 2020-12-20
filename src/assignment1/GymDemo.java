package assignment1;

import java.util.Scanner;


public class GymDemo {
    
    public static void main(String []args){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to GYM\n");
        
        Gym g = new Gym();
        Weightlifting w = new Weightlifting();
        
        g.setExericse("\n1.Weightlifting\n2.Running\n3.Bike Exercise");
        System.out.println("Type of Exercise: "+g.getExercise()+"\n");
        g.setnameofcoach("\n1.En. Nadzim\n2.En.Syafiq\n3.En.Daniel");
        System.out.println("Name of Coach: "+g.getnameofcoach()+"\n");
        g.setequip("\n1.Dumbbell\n2.Treadmill\n3.Bikemill");
        System.out.println("Type of Equipment: "+g.getequip()+"\n");
        
        System.out.println("What's kind of exercise do you want? Please choose");
        String name = scan.next();
        System.out.println("You choose number "+ name +". Here the information for this exercise");

        
        w.setCoach("En. Nadzim");
        System.out.println("Coach Name: "+w.getCoach());
        w.settype("Weightlifting");
        System.out.println("Exercise Name: "+w.gettype());
        w.setSet("12x - 3set");
        System.out.println("Set: "+w.getSet());
        w.setcalories(400);
        System.out.println("Calories: "+w.getcalories()+" Calories Burned");
    }
}
