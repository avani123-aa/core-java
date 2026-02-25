class PsFive {

    static String model;
    static String storage;
    static String color;
    static String edition;
    static String price;
    static String resolution;
    static String controllerType;
    static String releaseYear;
    static String warranty;

    public static boolean createPsFive(String mod, String stor, String col,
                                        String edi, String pri, String res,
                                        String ctrl, String relYear, String warr) {

        boolean isPsCreated = false;

        boolean isModValid = false;
        boolean isStorValid = false;
        boolean isColValid = false;
        boolean isEdiValid = false;
        boolean isPriValid = false;
        boolean isResValid = false;
        boolean isCtrlValid = false;
        boolean isRelYearValid = false;
        boolean isWarrValid = false;

        if (mod != null && !mod.isEmpty()) {
            System.out.println("model is validated");
            model = mod;
            isModValid = true;
        } else {
            System.out.println("model is not valid");
        }

        if (stor != null && !stor.isEmpty()) {
            System.out.println("storage is validated");
            storage = stor;
            isStorValid = true;
        } else {
            System.out.println("storage is not valid");
        }

        if (col != null && !col.isEmpty()) {
            System.out.println("color is validated");
            color = col;
            isColValid = true;
        } else {
            System.out.println("color is not valid");
        }

        if (edi != null && !edi.isEmpty()) {
            System.out.println("edition is validated");
            edition = edi;
            isEdiValid = true;
        } else {
            System.out.println("edition is not valid");
        }

        if (pri != null && !pri.isEmpty()) {
            System.out.println("price is validated");
            price = pri;
            isPriValid = true;
        } else {
            System.out.println("price is not valid");
        }

        if (res != null && !res.isEmpty()) {
            System.out.println("resolution is validated");
            resolution = res;
            isResValid = true;
        } else {
            System.out.println("resolution is not valid");
        }

        if (ctrl != null && !ctrl.isEmpty()) {
            System.out.println("controllerType is validated");
            controllerType = ctrl;
            isCtrlValid = true;
        } else {
            System.out.println("controllerType is not valid");
        }

        if (relYear != null && !relYear.isEmpty()) {
            System.out.println("releaseYear is validated");
            releaseYear = relYear;
            isRelYearValid = true;
        } else {
            System.out.println("releaseYear is not valid");
        }

        if (warr != null && !warr.isEmpty()) {
            System.out.println("warranty is validated");
            warranty = warr;
            isWarrValid = true;
        } else {
            System.out.println("warranty is not valid");
        }

        if (isModValid && isStorValid && isColValid && isEdiValid &&
            isPriValid && isResValid && isCtrlValid &&
            isRelYearValid && isWarrValid) {

            isPsCreated = true;
        }

        return isPsCreated;
    }

    public static void getPsFiveDetails() {
        System.out.println("The PS5 Details are:");
        System.out.println("Model: " + model);
        System.out.println("Storage: " + storage);
        System.out.println("Color: " + color);
        System.out.println("Edition: " + edition);
        System.out.println("Price: " + price);
        System.out.println("Resolution: " + resolution);
        System.out.println("Controller Type: " + controllerType);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Warranty: " + warranty);
    }
}