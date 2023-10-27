package isp.lab6.exercise1;


    public class Address
    {
        private String street;
        private String city;

        public Address(String street, String city) {
            this.street = street;
            this.city = city;
        }

        //ALT + INSER


        public String getStreet() {
            return street;
        }

        public String getCity() {
            return city;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "steet='" + street + '\'' +
                    ", city='" + city + '\'' +
                    '}';
        }
    }

