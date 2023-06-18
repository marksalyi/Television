package com.github.marksalyi;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {



        SamsungController sams = new SamsungController(new TV2(0,0));
        sams.volumeUp();
        sams.volumeUp();
        sams.volumeUp();
        sams.volumeUp();
        sams.volumeDown();
        sams.channelUp();
        sams.channelUp();
        sams.channelUp();
        sams.channelDown();


        ChinaController china = new ChinaController(new TV2(10,10));
        china.volumeDown();
        china.volumeDown();
        china.volumeDown();
        china.channelUp();
        china.channelUp();


        }

    }
