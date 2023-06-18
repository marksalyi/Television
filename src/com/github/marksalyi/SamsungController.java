public class SamsungController extends Controller{

    @Override
    public int volumeUp(int currentVolume) {
        int newVolume = currentVolume + 1;
        System.out.println("volume is: " + newVolume);
        return newVolume;
    }

    @Override
    public int volumeDown(int currentVolume) {
        int newVolume = currentVolume - 1;
        System.out.println("volume is: " + newVolume);
        return newVolume;
    }

    @Override
    public int channelUp(int currentChannel) {
        int newChannel = currentChannel + 1;
        System.out.println("channel is: " + newChannel);
        return newChannel;
    }

    @Override
    public int channelDown(int currentChannel) {
        int newChannel = currentChannel - 1;
        System.out.println("channel is: " + newChannel);
        return newChannel;
    }
}
