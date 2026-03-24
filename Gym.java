class Gym {

    private String equipments[] = new String[16];
    int index;

    public boolean addEquipment(String equipmentName) {

        boolean isAdded = false;

        if (equipmentName != null && !equipmentName.isEmpty()) {
            equipments[index] = equipmentName;
            index++;
            isAdded = true;
        } else {
            System.out.println(equipmentName + " is invalid");
        }

        return isAdded;
    }

    public void getEquipments() {

        for (String equipment : equipments) {
            if (equipment != null) {
                System.out.println(equipment);
            }
        }
    }
}