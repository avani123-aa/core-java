class Forever24 {

    static String brand;
    static String clothName;
    static String type;
    static String size;
    static String color;
    static String material;
    static String price;
    static String gender;
    static String fit;
    static String sleeveType;
    static String occasion;
    static String rating;

    public static boolean createCloth(String br, String name, String typ,
                                       String sz, String col, String mat,
                                       String pri, String gen, String ft,
                                       String sleeve, String occ, String rate) {

        boolean isCreated = false;

        boolean isBrValid = false;
        boolean isNameValid = false;
        boolean isTypValid = false;
        boolean isSzValid = false;
        boolean isColValid = false;
        boolean isMatValid = false;
        boolean isPriValid = false;
        boolean isGenValid = false;
        boolean isFtValid = false;
        boolean isSleeveValid = false;
        boolean isOccValid = false;
        boolean isRateValid = false;

        if (br != null && !br.isEmpty()) {
            System.out.println("brand is validated");
            brand = br;
            isBrValid = true;
        } else System.out.println("brand is not valid");

        if (name != null && !name.isEmpty()) {
            System.out.println("clothName is validated");
            clothName = name;
            isNameValid = true;
        } else System.out.println("clothName is not valid");

        if (typ != null && !typ.isEmpty()) {
            System.out.println("type is validated");
            type = typ;
            isTypValid = true;
        } else System.out.println("type is not valid");

        if (sz != null && !sz.isEmpty()) {
            System.out.println("size is validated");
            size = sz;
            isSzValid = true;
        } else System.out.println("size is not valid");

        if (col != null && !col.isEmpty()) {
            System.out.println("color is validated");
            color = col;
            isColValid = true;
        } else System.out.println("color is not valid");

        if (mat != null && !mat.isEmpty()) {
            System.out.println("material is validated");
            material = mat;
            isMatValid = true;
        } else System.out.println("material is not valid");

        if (pri != null && !pri.isEmpty()) {
            System.out.println("price is validated");
            price = pri;
            isPriValid = true;
        } else System.out.println("price is not valid");

        if (gen != null && !gen.isEmpty()) {
            System.out.println("gender is validated");
            gender = gen;
            isGenValid = true;
        } else System.out.println("gender is not valid");

        if (ft != null && !ft.isEmpty()) {
            System.out.println("fit is validated");
            fit = ft;
            isFtValid = true;
        } else System.out.println("fit is not valid");

        if (sleeve != null && !sleeve.isEmpty()) {
            System.out.println("sleeveType is validated");
            sleeveType = sleeve;
            isSleeveValid = true;
        } else System.out.println("sleeveType is not valid");

        if (occ != null && !occ.isEmpty()) {
            System.out.println("occasion is validated");
            occasion = occ;
            isOccValid = true;
        } else System.out.println("occasion is not valid");

        if (rate != null && !rate.isEmpty()) {
            System.out.println("rating is validated");
            rating = rate;
            isRateValid = true;
        } else System.out.println("rating is not valid");

        if (isBrValid && isNameValid && isTypValid && isSzValid &&
            isColValid && isMatValid && isPriValid && isGenValid &&
            isFtValid && isSleeveValid && isOccValid && isRateValid) {

            isCreated = true;
        }

        return isCreated;
    }

    public static void getCloth() {
        System.out.println("Cloth Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Cloth Name: " + clothName);
        System.out.println("Type: " + type);
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Price: " + price);
        System.out.println("Gender: " + gender);
        System.out.println("Fit: " + fit);
        System.out.println("Sleeve Type: " + sleeveType);
        System.out.println("Occasion: " + occasion);
        System.out.println("Rating: " + rating);
    }
}