class Playstore {

    static String appName;
    static String developer;
    static String category;
    static String rating;
    static String downloads;
    static String size;
    static String version;
    static String isFree;
    static String lastUpdated;

    public static boolean createApp(String name, String dev, String cat,
                                    String rate, String down, String appSize,
                                    String ver, String free, String updated) {

        boolean isAppCreated = false;

        boolean isNameValid = false;
        boolean isDevValid = false;
        boolean isCatValid = false;
        boolean isRateValid = false;
        boolean isDownValid = false;
        boolean isSizeValid = false;
        boolean isVerValid = false;
        boolean isFreeValid = false;
        boolean isUpdatedValid = false;

        if (name != null && !name.isEmpty()) {
            System.out.println("appName is validated");
            appName = name;
            isNameValid = true;
        } else {
            System.out.println("appName is not valid");
        }

        if (dev != null && !dev.isEmpty()) {
            System.out.println("developer is validated");
            developer = dev;
            isDevValid = true;
        } else {
            System.out.println("developer is not valid");
        }

        if (cat != null && !cat.isEmpty()) {
            System.out.println("category is validated");
            category = cat;
            isCatValid = true;
        } else {
            System.out.println("category is not valid");
        }

        if (rate != null && !rate.isEmpty()) {
            System.out.println("rating is validated");
            rating = rate;
            isRateValid = true;
        } else {
            System.out.println("rating is not valid");
        }

        if (down != null && !down.isEmpty()) {
            System.out.println("downloads is validated");
            downloads = down;
            isDownValid = true;
        } else {
            System.out.println("downloads is not valid");
        }

        if (appSize != null && !appSize.isEmpty()) {
            System.out.println("size is validated");
            size = appSize;
            isSizeValid = true;
        } else {
            System.out.println("size is not valid");
        }

        if (ver != null && !ver.isEmpty()) {
            System.out.println("version is validated");
            version = ver;
            isVerValid = true;
        } else {
            System.out.println("version is not valid");
        }

        if (free != null && !free.isEmpty()) {
            System.out.println("isFree is validated");
            isFree = free;
            isFreeValid = true;
        } else {
            System.out.println("isFree is not valid");
        }

        if (updated != null && !updated.isEmpty()) {
            System.out.println("lastUpdated is validated");
            lastUpdated = updated;
            isUpdatedValid = true;
        } else {
            System.out.println("lastUpdated is not valid");
        }

        if (isNameValid && isDevValid && isCatValid && isRateValid &&
            isDownValid && isSizeValid && isVerValid &&
            isFreeValid && isUpdatedValid) {

            isAppCreated = true;
        }

        return isAppCreated;
    }

    public static void getAppDetails() {
        System.out.println("The App Details are:");
        System.out.println("App Name: " + appName);
        System.out.println("Developer: " + developer);
        System.out.println("Category: " + category);
        System.out.println("Rating: " + rating);
        System.out.println("Downloads: " + downloads);
        System.out.println("Size: " + size);
        System.out.println("Version: " + version);
        System.out.println("Is Free: " + isFree);
        System.out.println("Last Updated: " + lastUpdated);
    }
}