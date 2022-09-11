import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> cities=new TreeSet<>(Comparator.reverseOrder());
        City city1 =new City(6,"osh");
        City city2 =new City(7,"bishkek");
        City city3 =new City(5,"jalal_abat");

        if (city1.code%2!=0){
            cities.add(city1.getCode());
        }
        if (city2.code%2!=0){
            cities.add(city2.getCode());
        }
        if (city3.code%2!=0){
            cities.add(city3.getCode());
        }
        System.out.println(cities);
        }
        }
