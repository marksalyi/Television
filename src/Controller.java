abstract class Controller {
    public int currentVolume;
    public int currentChannel;
    public int maxVolume;
    public int maxChannel;

    abstract int volumeUp(int currentVolume);
    abstract int volumeDown(int currentVolume);
    abstract int channelUp(int currentChannel);
    abstract int channelDown(int currentChannel);

}
