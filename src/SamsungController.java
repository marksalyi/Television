public class SamsungController extends Controller{
    @Override
    int volumeUp(int currentVolume) {
        int newVolume = currentVolume + 1;
        System.out.println("volume is: " + newVolume);
        return newVolume;
    }

    @Override
    int volumeDown(int currentVolume) {
        int newVolume = currentVolume - 1;
        System.out.println("volume is: " + newVolume);
        return newVolume;
    }

    @Override
    int channelUp(int currentChannel) {
        int newChannel = currentChannel + 1;
        System.out.println("channel is: " + newChannel);
        return newChannel;
    }

    @Override
    int channelDown(int currentChannel) {
    }
}
