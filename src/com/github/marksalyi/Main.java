// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Samsung samsung = new Samsung(0,0,new SamsungController());
        Samsung samsungChina = new Samsung(0,0,new ChinaController());

        samsung.controller.volumeUp(samsung.currentVolume);
        samsungChina.controller.volumeUp(samsung.currentVolume);
        samsung.controller.channelUp(samsung.currentChannel);
        samsung.controller.channelUp(samsung.currentChannel);



        }

    }
