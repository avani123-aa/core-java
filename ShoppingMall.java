class ShoppingMall {
    public static void main(String[] args) {

        String mallName = "Orion Mall";
        String location = "Rajajinagar";
        String manager = "Prakash";

        String floors[] = {"Ground Floor", "First Floor", "Second Floor"};
        String shops[] = {"Zara", "H&M", "Pantaloons", "Reliance"};
        String security[] = {"Raju", "Manohar", "Suresh"};

        System.out.println("Shopping Mall Details");
        System.out.println("the name of the mall :" +mallName);
        System.out.println("the location :" +location);
        System.out.println("the manager is :" +manager);

        System.out.println("Floors count: " + floors.length);
        for (String floor : floors) {
            System.out.println(floor);
        }

        System.out.println("Shops count: " + shops.length);
        for (String shop : shops) {
            System.out.println(shop);
        }

        System.out.println("Security count: " + security.length);
        for (String guard : security) {
            System.out.println(guard);
        }
    }
}