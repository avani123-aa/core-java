class ZeptoExecutor {

    public static void main(String[] args) {

        String itemName = "toor dal";
        double price = Zepto.search(itemName);
        System.out.println("price of the item " + itemName + " is  : " + price);

    }
}