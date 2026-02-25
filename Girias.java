class Girias {

    static String brand;
    static String model;
    static String capacity;
    static String type;
    static String energyRating;
    static String color;
    static String price;
    static String warranty;
    static String spinSpeed;
    static String drumType;

    public static boolean createWashingMachine(String br, String mod, String cap,
                                                String typ, String energy, String col,
                                                String pri, String warr,
                                                String spin, String drum) {

        boolean isCreated = false;

        boolean isBrandValid = false;
        boolean isModelValid = false;
        boolean isCapacityValid = false;
        boolean isTypeValid = false;
        boolean isEnergyValid = false;
        boolean isColorValid = false;
        boolean isPriceValid = false;
        boolean isWarrantyValid = false;
        boolean isSpinValid = false;
        boolean isDrumValid = false;

        if (br != null && !br.isEmpty()) {
            System.out.println("brand is validated");
            brand = br;
            isBrandValid = true;
        } else System.out.println("brand is not valid");

        if (mod != null && !mod.isEmpty()) {
            System.out.println("model is validated");
            model = mod;
            isModelValid = true;
        } else System.out.println("model is not valid");

        if (cap != null && !cap.isEmpty()) {
            System.out.println("capacity is validated");
            capacity = cap;
            isCapacityValid = true;
        } else System.out.println("capacity is not valid");

        if (typ != null && !typ.isEmpty()) {
            System.out.println("type is validated");
            type = typ;
            isTypeValid = true;
        } else System.out.println("type is not valid");

        if (energy != null && !energy.isEmpty()) {
            System.out.println("energyRating is validated");
            energyRating = energy;
            isEnergyValid = true;
        } else System.out.println("energyRating is not valid");

        if (col != null && !col.isEmpty()) {
            System.out.println("color is validated");
            color = col;
            isColorValid = true;
        } else System.out.println("color is not valid");

        if (pri != null && !pri.isEmpty()) {
            System.out.println("price is validated");
            price = pri;
            isPriceValid = true;
        } else System.out.println("price is not valid");

        if (warr != null && !warr.isEmpty()) {
            System.out.println("warranty is validated");
            warranty = warr;
            isWarrantyValid = true;
        } else System.out.println("warranty is not valid");

        if (spin != null && !spin.isEmpty()) {
            System.out.println("spinSpeed is validated");
            spinSpeed = spin;
            isSpinValid = true;
        } else System.out.println("spinSpeed is not valid");

        if (drum != null && !drum.isEmpty()) {
            System.out.println("drumType is validated");
            drumType = drum;
            isDrumValid = true;
        } else System.out.println("drumType is not valid");

        if (isBrandValid && isModelValid && isCapacityValid && isTypeValid &&
            isEnergyValid && isColorValid && isPriceValid &&
            isWarrantyValid && isSpinValid && isDrumValid) {

            isCreated = true;
        }

        return isCreated;
    }

    public static void getWashingMachineDetails() {
        System.out.println("Washing Machine Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Capacity: " + capacity);
        System.out.println("Type: " + type);
        System.out.println("Energy Rating: " + energyRating);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Warranty: " + warranty);
        System.out.println("Spin Speed: " + spinSpeed);
        System.out.println("Drum Type: " + drumType);
    }
}