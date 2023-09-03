import java.util.ArrayList;

class Country {
    private String country_name;
    private Capital capital;
    private ArrayList<City> city_list = new ArrayList<>();

    Country(String country_name, Capital capital) {
        this.country_name = country_name;
        this.capital = capital;
    }

    public String getC_name() {
        return this.country_name;
    }

    public Capital getCapital() {
        return this.capital;
    }

    public void addCity(String city_name) {
        City city = new City(city_name);
        city_list.add(city);
    }

    public void display() {
        for (City city : city_list) {
            System.out.println(city.getCity_name());
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
}

class Capital {
    private String capital_name;

    Capital(String capital_name) {
        this.capital_name = capital_name;
    }

    public String getCapital_name() {
        return capital_name;
    }
}

public class Main {
    public static void main(String[] args) {
        Capital capital = new Capital("Islamabad");
        Country country = new Country("Pakistan", capital);

        country.addCity("Larkana");
        country.addCity("Hyderabad");
        country.addCity("Karachi");

        System.out.println("\nCities in country: " + country.getC_name());
        System.out.println("Capital of country " + country.getC_name() + " is " + country.getCapital().getCapital_name());
        country.display();
    }
}
