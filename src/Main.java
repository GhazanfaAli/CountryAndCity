import java.util.ArrayList;


class Country {
    private String country_name;
    private ArrayList < City > city_list = new ArrayList < > ();
    Country(String country_name) {
        this.country_name = country_name;
    }

    public String getC_name() {
        return this.country_name;
    }
    public void addCity(City city) {
        city_list.add(city);
    }
    public void display() {
        for (int i = 0; i < city_list.size(); i++) {
            System.out.println(city_list.get(i));
        }
    }
}
class City {
    private String city_name;

    City(String city_name) {
        this.city_name = city_name;
    }
    public String getCity_name() {
        return this.city_name;
    }
    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }
    public String toString() {
        return city_name;
    }

}


public class Main {
    public static void main(String[] args) {


        City city1 = new City("Larkana");
        City city2 = new City("Hyderabad");
        City city3 = new City("Karachi");


        Country country = new Country("Pakistan");
        country.addCity(city1);
        country.addCity(city2);
        country.addCity(city3);


        System.out.println("Cities in country: " + country.getC_name());
        country.display();


        city2.setCity_name("lahore");

        System.out.println(".....................");
        System.out.println("Updated city name: " + city2.getCity_name());
        System.out.println(".....................");

        country.display();

    }
}