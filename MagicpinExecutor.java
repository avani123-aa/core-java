class MagicpinExecutor {

    public static void main(String[] args) {

        String foodName = "veg thali";
        double price = Magicpin.search(foodName);
        System.out.println("price of the food " + foodName + " is  : " + price);

    }
}