class SwiggyExecutor {

    public static void main(String[] args) {

        String foodName = "masala puri";
        double price = Swiggy.search(foodName);
        System.out.println("price of the food " + foodName + " is  : " + price);

    }
}