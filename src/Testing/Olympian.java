public class Olympian extends Athlete {
        private String country;
        private int year;
        private String city;

        public Olympian(String first, String last, String sportName, String countryName, int theYear, String cityName) {

                super(first, last, sportName);

                country = countryName;
                year = theYear;
                city = cityName;

        }

        public String toString() {

                String result = super.toString();
                result += "\nCountry: " + country;
                result += "\nYear: " + year;
                result += "\nCity: " + city;

                return result;
        }

}
