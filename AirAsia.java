class AirAsia {

    private String passengers[] = new String[30];
    int index;

    public boolean addPassenger(String passengerName) {

        boolean isAdded = false;

        if (passengerName != null && !passengerName.isEmpty()) {
            passengers[index] = passengerName;
            index++;
            isAdded = true;
        } else {
            System.out.println(passengerName + " is invalid");
        }

        return isAdded;
    }

    public void getPassengers() {
        for (String person : passengers) {
                System.out.println(person);
            }
        
    }
}