class PlayList {

    private String songNames[] = new String[15];
    int index;

    public boolean addSong(String songName) {

        boolean isAdded = false;

        if (songName != null && !songName.isEmpty()) {
            songNames[index] = songName;
            index++;
            isAdded = true;
        } else {
            System.out.println(songName + " is invalid");
        }

        return isAdded;
    }

    public void getSongs() {

        for (String song : songNames) {
            if (song != null) {
                System.out.println(song);
            }
        }
    }
}