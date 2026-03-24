class CricBuz {

    private String teamNames[] = new String[8];
    int index;

    public boolean addTeam(String teamName) {

        boolean isAdded = false;

        if (teamName != null && !teamName.isEmpty()) {
            teamNames[index] = teamName;
            index++;
            isAdded = true;
        } else {
            System.out.println(teamName + " is invalid");
        }

        return isAdded;
    }

    public void getTeams() {
        for (String team : teamNames) {
            if (team != null) {
                System.out.println(team);
            }
        }
    }
}