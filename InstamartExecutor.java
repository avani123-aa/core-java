class InstamartExecutor {

    public static void main(String[] args) {

        String itemName = "banana dozen";
        double price = Instamart.search(itemName);
        System.out.println("price of the item " + itemName + " is  : " + price);

    }
}