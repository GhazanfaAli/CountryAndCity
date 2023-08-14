import java.util.ArrayList;


class Country {
    private String country_name;
    private ArrayList < City > city_list = new ArrayList < > ();
    private Capital c;
    Country(String country_name, Capital c_n) {
        this.country_name = country_name;
        this.c = c_n;
    }

    public String getC_name() {
        return this.country_name;
    }
    public Capital get_capital_name(){
        return this.c;
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
class Capital{
    String capital_name;
    Capital(String capital_name){
        this.capital_name = capital_name;
    }
    String getCapital_name(){
        return capital_name;
    }
    public String toString() {
        return capital_name;
    }


}


public class Main {
    public static void main(String[] args) {


        City city1 = new City("Larkana");
        City city2 = new City("Hyderabad");
        City city3 = new City("Karachi");
        City city4 = new City("lahore");


        Capital capital = new Capital("Islamabad");
        Country country = new Country("Pakistan", capital);


        country.addCity(city1);
        country.addCity(city2);
        country.addCity(city3);



        System.out.println("\nCities in country: " + country.getC_name());
        System.out.println("Capital of country " + country.getC_name() + " is "+capital.getCapital_name());
        country.display();

        country.addCity(city4);


        System.out.println("\n.....................");
        System.out.println("List has been updated....");
        System.out.println("Updated city name: " + city4.getCity_name());
        System.out.println(".....................\n");
        System.out.println("Cities in country: " + country.getC_name());
        System.out.println("Capital of country " + country.getC_name() + " is "+capital.getCapital_name());
        country.display();

    }
}