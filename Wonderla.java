class Wonderla {

    private String waterGames[] = new String[21]; // 20+ → taken as 21
    int index;

    public boolean addWaterGame(String gameName) {

        boolean isAdded = false;

        if (gameName != null && !gameName.isEmpty()) {
            waterGames[index] = gameName;
            index++;
            isAdded = true;
        } else {
            System.out.println(gameName + " is invalid");
        }

        return isAdded;
    }

    public void getWaterGames() {

        for (String game : waterGames) {
            if (game != null) {
                System.out.println(game);
            }
        }
    }
}