public class ChinaController extends Controller{
    @Override
    int volumeUp(int currentVolume) {
        int newVolume = currentVolume + 2;
        System.out.println("volume is: " + newVolume);
        return newVolume;
    }

    @Override
    int volumeDown(int currentVolume) {
        int newVolume = currentVolume - 2;
        System.out.println("volume is: " + newVolume);
        return newVolume;
    }

    @Override
    int channelUp(int currentChannel) {
        int newChannel = currentChannel + 2;
        System.out.println("channel is: " + newChannel);
        return newChannel;
    }

    @Override
    int channelDown(int currentChannel) {
        int newChannel = currentChannel - 2;
        System.out.println("channel is: " + newChannel);
        return newChannel;
    }
}
