abstract class TV {
    public int currentVolume;
    public int currentChannel;
    public int maxVolume;
    public int maxChannel;
    Controller controller;


    public TV(int currentVolume, int currentChannel, Controller controller) {
        this.currentVolume = currentVolume;
        this.currentChannel = currentChannel;
        this.maxVolume = 99;
        this.maxChannel = 99;
        this.controller = controller;
    }

    protected void volumeUp(){

    }



}
