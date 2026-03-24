class PhonePe {

    private String insuranceNames[] = new String[27];
    int index;

    public boolean addInsurance(String insuranceName) {

        boolean isAdded = false;

        if (insuranceName != null && !insuranceName.isEmpty()) {
            insuranceNames[index] = insuranceName;
            index++;
            isAdded = true;
        } else {
            System.out.println(insuranceName + " is invalid");
        }

        return isAdded;
    }

    public void getInsurance() {

        for (String name : insuranceNames) {
            if (name != null) {
                System.out.println(name);
            }
        }
    }
}