class ElectricalShop {

    private String appliances[] = new String[20];
    int index;

    public boolean addAppliance(String applianceName) {

        boolean isAdded = false;

        if (applianceName != null && !applianceName.isEmpty()) {
            appliances[index] = applianceName;
            index++;
            isAdded = true;
        } else {
            System.out.println(applianceName + " is invalid");
        }

        return isAdded;
    }

    public void getAppliances() {
        for (String item : appliances) {
                System.out.println(item);
            
        }
    }
}