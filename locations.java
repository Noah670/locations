import java.util.ArrayList;
import java.util.HashMap;

public class locations{
    public static void main(String[] args) {
        ArrayList noahPlaces = new ArrayList();

        noahPlaces.add("Saipan");
        noahPlaces.add("Almaty");
        noahPlaces.add("Guam");
        noahPlaces.add("Seoul");
        noahPlaces.add("Tokyo");
        noahPlaces.add("Florida");
        noahPlaces.add("Atlanta");
        noahPlaces.add("Boston");

        System.out.println(noahPlaces);

        noahPlaces.remove("Boston");

        System.out.println(noahPlaces + " \n f boston");

        System.out.println(noahPlaces.size());

        

        ArrayList someNums = new ArrayList();

        someNums.add(69);
        someNums.add(420);
        someNums.add(88);
        someNums.add(8008513);

        for(int j = 0; j < someNums.size(); j++){
            System.out.println(someNums.get(j));
        }

        // Playing around with Hashmaps

        HashMap worldCapitals = new HashMap<>();
        

        worldCapitals.put("Japan","Tokyo");
        worldCapitals.put("South Korea", "Seoul");
        worldCapitals.put("North Korea (Best Korea)","Pyongyang");
        worldCapitals.put("Netherlands", "Amsterdam");
        worldCapitals.put("France", "Paris");

        System.out.println(worldCapitals);
        System.out.println(worldCapitals.size());

        System.out.println(worldCapitals.get("South Korea"));

        worldCapitals.remove("France");
        System.out.println(worldCapitals);
        
       worldCapitals.clear();
       System.out.println(worldCapitals);
    }
}