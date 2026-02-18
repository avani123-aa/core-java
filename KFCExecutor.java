class KFCExecutor {

    public static void main(String[] args) {

        String foodName = "zinger burger";
        double price = KFC.search(foodName);
        System.out.println("price of the food " + foodName + " is  : " + price);

    }
}