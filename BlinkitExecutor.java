class BlinkitExecutor {

    public static void main(String[] args) {

        String itemName = "toothpaste";
        double price = Blinkit.search(itemName);
        System.out.println("price of the item " + itemName + " is  : " + price);

    }
}