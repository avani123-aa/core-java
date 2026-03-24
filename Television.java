class Television {

    private String channelNames[] = new String[17];
    int index;

    public boolean addChannel(String channelName) {

        boolean isAdded = false;

        if (channelName != null && !channelName.isEmpty()) {
            channelNames[index] = channelName;
            index++;
            isAdded = true;
        } else {
            System.out.println(channelName + " is invalid");
        }

        return isAdded;
    }

    public void getChannels() {

        for (String channel : channelNames) {
            if (channel != null) {
                System.out.println(channel);
            }
        }
    }
}