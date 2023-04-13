package Chapter3_Nested_For_Loop;

import java.util.ArrayList;

public class ForEachLoop {
// for each loop is only used for array data structure
    public static void main(String[] args){
        ArrayList<String> cities= new ArrayList<String>();
        cities.add("Dubai");
        cities.add("kolkata");
        cities.add("Mumbai");
        cities.add("Pune");
        cities.add("Nagpur");
        for (String cityName: cities) {
         System.out.println(cityName);
        }
    }
}
