class PharmaCare {

    static String medicineName;
    static String manufacturer;
    static String type;
    static String dosage;
    static String price;
    static String expiryDate;
    static String rating;

    public static boolean createMedicine(String name, String manu,
                                          String typ, String dose,
                                          String pri, String exp,
                                          String rate) {

        boolean isCreated = false;

        boolean isNameValid = false;
        boolean isManuValid = false;
        boolean isTypValid = false;
        boolean isDoseValid = false;
        boolean isPriValid = false;
        boolean isExpValid = false;
        boolean isRateValid = false;

        if (name != null && !name.isEmpty()) {
            System.out.println("medicineName is validated");
            medicineName = name;
            isNameValid = true;
        } else System.out.println("medicineName is not valid");

        if (manu != null && !manu.isEmpty()) {
            System.out.println("manufacturer is validated");
            manufacturer = manu;
            isManuValid = true;
        } else System.out.println("manufacturer is not valid");

        if (typ != null && !typ.isEmpty()) {
            System.out.println("type is validated");
            type = typ;
            isTypValid = true;
        } else System.out.println("type is not valid");

        if (dose != null && !dose.isEmpty()) {
            System.out.println("dosage is validated");
            dosage = dose;
            isDoseValid = true;
        } else System.out.println("dosage is not valid");

        if (pri != null && !pri.isEmpty()) {
            System.out.println("price is validated");
            price = pri;
            isPriValid = true;
        } else System.out.println("price is not valid");

        if (exp != null && !exp.isEmpty()) {
            System.out.println("expiryDate is validated");
            expiryDate = exp;
            isExpValid = true;
        } else System.out.println("expiryDate is not valid");

        if (rate != null && !rate.isEmpty()) {
            System.out.println("rating is validated");
            rating = rate;
            isRateValid = true;
        } else System.out.println("rating is not valid");

        if (isNameValid && isManuValid && isTypValid &&
            isDoseValid && isPriValid && isExpValid && isRateValid) {

            isCreated = true;
        }

        return isCreated;
    }

    public static void getMedicine() {
        System.out.println("Medicine Details:");
        System.out.println("Medicine Name: " + medicineName);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Type: " + type);
        System.out.println("Dosage: " + dosage);
        System.out.println("Price: " + price);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Rating: " + rating);
    }
}