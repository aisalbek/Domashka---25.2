import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<City> cities=new TreeSet<>();

        City city1 =new City(6,"osh");
        City city2 =new City(7,"bishkek");
        City city3 =new City(5,"jalal_abat");


        if (city1.code%2!=0){
            cities.add(city1);
        }
        if (city2.code%2!=0){
            cities.add(city2);
        }
        if (city3.code%2!=0){
            cities.add(city3);
        }
        System.out.println(cities);
        }
        }
