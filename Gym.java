class Gym {
    public static void main(String[] args) {

        String gymName = "Fit Zone";
        String trainer = "Arjun";
        String city = "Yelahanka";

        String equipments[] = {"Treadmill", "Dumbbells", "Cycle"};
        String batches[] = {"Morning", "Afternoon", "Evening"};
        String members[] = {"Akash", "Pooja", "Nithin"};

        System.out.println("Gym Details");
        System.out.println("the gym name is :" +gymName);
        System.out.println("the trainer :" +trainer);
        System.out.println("the city :" +city);

        System.out.println("Equipments count: " + equipments.length);
        for (String equipment : equipments) {
            System.out.println(equipment);
        }

        System.out.println("Batches count: " + batches.length);
        for (String batch : batches) {
            System.out.println(batch);
        }

        System.out.println("Members count: " + members.length);
        for (String member : members) {
            System.out.println(member);
        }
    }
}