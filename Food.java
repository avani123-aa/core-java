class Food {

    static String foodName;
    static String foodType;
    static String cuisine;
    static String price;
    static String rating;

    public static boolean createFood(String name, String type,
                                     String cuis, String pri,
                                     String rate) {

        boolean isFoodCreated = false;

        boolean isNameValid = false;
        boolean isTypeValid = false;
        boolean isCuisineValid = false;
        boolean isPriceValid = false;
        boolean isRatingValid = false;

        if (name != null && !name.isEmpty()) {
            System.out.println("foodName is validated");
            foodName = name;
            isNameValid = true;
        } else {
            System.out.println("foodName is not valid");
        }

        if (type != null && !type.isEmpty()) {
            System.out.println("foodType is validated");
            foodType = type;
            isTypeValid = true;
        } else {
            System.out.println("foodType is not valid");
        }

        if (cuis != null && !cuis.isEmpty()) {
            System.out.println("cuisine is validated");
            cuisine = cuis;
            isCuisineValid = true;
        } else {
            System.out.println("cuisine is not valid");
        }

        if (pri != null && !pri.isEmpty()) {
            System.out.println("price is validated");
            price = pri;
            isPriceValid = true;
        } else {
            System.out.println("price is not valid");
        }

        if (rate != null && !rate.isEmpty()) {
            System.out.println("rating is validated");
            rating = rate;
            isRatingValid = true;
        } else {
            System.out.println("rating is not valid");
        }

        if (isNameValid && isTypeValid && isCuisineValid &&
            isPriceValid && isRatingValid) {

            isFoodCreated = true;
        }

        return isFoodCreated;
    }

    public static void getFoodDetails() {
        System.out.println("Food Details:");
        System.out.println("Food Name: " + foodName);
        System.out.println("Food Type: " + foodType);
        System.out.println("Cuisine: " + cuisine);
        System.out.println("Price: " + price);
        System.out.println("Rating: " + rating);
    }
}