class Airport {
    public static void main(String[] args) {

        String airportName = "Kempegowda Airport";
        String city = "Bangalore";
        String director = "Raghav";

        String terminals[] = {"Terminal 1", "Terminal 2"};
        String airlines[] = {"Indigo", "Air India", "Vistara"};
        String employees[] = {"Nikhil", "Pavan", "Sneha"};

        System.out.println("Airport Details");
        System.out.println("the name of the airport :" +airportName);
        System.out.println("the city name :" +city);
        System.out.println("the director :" +director);

        System.out.println("Terminals count: " + terminals.length);
        for (String terminal : terminals) {
            System.out.println(terminal);
        }

        System.out.println("Airlines count: " + airlines.length);
        for (String airline : airlines) {
            System.out.println(airline);
        }

        System.out.println("Employees count: " + employees.length);
        for (String employee : employees) {
            System.out.println(employee);
        }
    }
}