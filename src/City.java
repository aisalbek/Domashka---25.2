public class City implements Comparable<City> {
    int code;
    String name;

    public City(int code, String name) {
        this.name = name;
        this.code=code;
    }
    @Override
    public String toString() {
        return  "  City->" +
                " code-=-" + code +
                " name-=-" + name+"\n"+
              "--------------------------------------\n";
    }
    @Override
    public int compareTo(City o) {
        return o.code -  this.code ;
    }
}
