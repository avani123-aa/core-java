class DominosExecutor {

    public static void main(String[] args) {

        String foodName = "margherita pizza";
        double price = Dominos.search(foodName);
        System.out.println("price of the food " + foodName + " is  : " + price);

    }
}