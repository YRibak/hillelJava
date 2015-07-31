package lesson12.animals;

import lesson12.animals.observers.HungryObserver;
import lesson12.animals.observers.SicknessObserver;
import lesson12.observable.*;
import lesson12.observable.Observer;

import java.util.*;

/**
 * Created by VSulevskiy on 09.07.2015.
 */
public class App {
    public static Giraffe giraffe;
    public static List init() {
        List zoo = new ArrayList();
        Cat cat = new Cat(1,3,3.4,"Grey","Murka",true);
        zoo.add(cat);
        Lion lion = new Lion(2,10,90,"Yellow",true);
        zoo.add(lion);
        Dog dog = new Dog(3,7,16,"Black","Tuzik",true);
        zoo.add(dog);
        Fish fish = new Fish(4,3,0.2,"Gold","Karas'",false);
        zoo.add(fish);
        GuideDog cleverDog = new GuideDog(5,10,10,"White","Sharik",true,true);
        zoo.add(cleverDog);
        GuideDog notCleverDog = new GuideDog(6,1,3,"Grey","Muhtar",true,false);
        zoo.add(notCleverDog);
        giraffe = new Giraffe(7,33,36,"Spot",false);
        zoo.add(giraffe);
        return zoo;
    }

    public static void main(String[] args) {
        Hamster hamster = new Hamster();
        Fish fish = new Fish();
        Observer doctor = new SicknessObserver();
        Observer feeder = new HungryObserver();
        hamster.addObserver(doctor);
        hamster.addObserver(feeder);
        fish.addObserver(feeder);
        hamster.notifyObservers();
        fish.notifyObservers();
    }

//    private static void printStatus(List zoo) {
//        if (isAnybodyHungry(zoo)){
//            System.out.println("Go and feed him");
//        }
//        else
//        {
//            System.out.println("Free time");
//        }
//    }

//    public static boolean isAnybodyHungry(List zoo){
//        for (Object o : zoo){
//            Animal animal = (Animal)o;
//            if (animal.isHungry()){
//                return true;
//            }
//        }
//        return false;
//    }
}
