class JioMartExecutor {

    public static void main(String[] args) {

        String itemName = "milk 1L";
        double price = JioMart.search(itemName);
        System.out.println("price of the item " + itemName + " is  : " + price);

    }
}