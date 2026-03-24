class CricBuzExecutor {

    public static void main(String[] args) {

        CricBuz cb = new CricBuz();

        cb.addTeam("India");
        cb.addTeam("Australia");
        cb.addTeam("England");
        cb.addTeam("Pakistan");
        cb.addTeam("South Africa");
        cb.addTeam("New Zealand");
        cb.addTeam("Sri Lanka");
        cb.addTeam("West Indies");

        cb.getTeams();
    }
}