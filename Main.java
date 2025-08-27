import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] agrs) throws IOException {

//        LocalDate date = LocalDate.now();
//        LocalTime time = LocalTime.now();
//        LocalDateTime dateTime = LocalDateTime.now();
//        Instant instant = Instant.now();
//        System.out.println(date);
//        System.out.println(time);
//        System.out.println(dateTime);
//        System.out.println(instant);


//        LocalDateTime dateTime = LocalDateTime.now();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//        System.out.println(dateTime.format(formatter));

        // Anonymous class
//        Dog dog1 = new Dog();
//        dog1.speak();
//
//        Dog dog2 = new Dog(){
//            @Override
//            void speak(){
//                System.out.println("Philips says Hi");
//            }
//        };
//
//        dog2.speak();

        //Timer & TimerTask
//        Timer timer = new Timer();
//        TimerTask task =  new TimerTask() {
//            int count = 3;
//
//            @Override
//            public void run() {
//                System.out.println("Hello!");
//                count--;
//                if(count == 0){
//                    System.out.println("Completed!");
//                    timer.cancel();
//                }
//            }
//        };
//
//        timer.schedule(task, 3000, 1000);


        //Generics
//        Box<Integer> box = new Box<>();
//        box.setItem(122);
//        System.out.println(box.getItem());
//
//        Product<String, Integer> product = new Product<>("Banana", 20);
//        System.out.println(product.getItem());
//        System.out.println(product.getPrice());

        //HashMap
//        HashMap<String, Double> map = new HashMap<>();
//        map.put("apple", 20.5);
//        map.put("banana", 25.2);
//        map.put("orange", 22.2);
//        map.remove("orange");
//        System.out.println(map);
//        System.out.println(map.get("banana"));
//        System.out.println(map.containsKey("banana"));
//        System.out.println(map.containsValue(20.5));
//        for(String key : map.keySet()){
//            System.out.println(key + " "+ map.get(key));
//        }

        //Enums
        Day day = Day.SUNNDAY;
        System.out.println(day);
        System.out.println(day.getDayNumber());
    }
}
