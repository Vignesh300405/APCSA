public class Athlete {

        private String firstName;
        private String lastName;
        private String sport;

        public Athlete(String first, String last, String sportName) {
                firstName = first;
                lastName = last;
                sport = sportName;
        }

        public String toString() {
                String result = "First name: " + firstName;
                result += "\nLastName: " + lastName;
                result += "\nSport: " + sport;

                return result;
        }

}
