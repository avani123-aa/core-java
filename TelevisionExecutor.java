class TelevisionExecutor {

    public static void main(String[] args) {

        Television tv = new Television();

        tv.addChannel("Star Plus");
        tv.addChannel("Zee TV");
        tv.addChannel("Colors");
        tv.addChannel("Sony TV");
        tv.addChannel("Sun TV");
        tv.addChannel("Star Sports");
        tv.addChannel("Sony Sports");
        tv.addChannel("Discovery Channel");
        tv.addChannel("National Geographic");
        tv.addChannel("Cartoon Network");
        tv.addChannel("Pogo");
        tv.addChannel("Nick");
        tv.addChannel("Animal Planet");
        tv.addChannel("History TV18");
        tv.addChannel("MTV");
        tv.addChannel("VH1");
        tv.addChannel("DD National");

        tv.getChannels();
    }
}