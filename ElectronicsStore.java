class ElectronicsStore {
    public static void main(String[] args) {

        String storeName = "Tech World";
        String owner = "Sandeep";
        String place = "Malleshwaram";

        String categories[] = {"TV", "Laptop", "Washing Machine"};
        String brands[] = {"LG", "Sony", "Samsung"};
        String salesmen[] = {"Ravi", "Sunil", "Deepa"};

        System.out.println("Electronics Store Details");
        System.out.println("the store name is :" +storeName);
        System.out.println("the owner of the shop is :" +owner);
        System.out.println("the place name :" +place);

        System.out.println("Categories count: " + categories.length);
        for (String category : categories) {
            System.out.println(category);
        }

        System.out.println("Brands count: " + brands.length);
        for (String brand : brands) {
            System.out.println(brand);
        }

        System.out.println("Salesmen count: " + salesmen.length);
        for (String salesman : salesmen) {
            System.out.println(salesman);
        }
    }
}