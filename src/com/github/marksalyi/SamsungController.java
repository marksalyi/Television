package com.github.marksalyi;

public class SamsungController implements Controller{
    public TV2 tv;

    public SamsungController(TV2 tv) {
        this.tv = tv;
    }

    @Override
    public int volumeUp() {
        int newVolume = this.tv.currentVolume + 1;
        this.tv.currentVolume = newVolume;
        System.out.println("Samsung volume is: " + newVolume);
        return newVolume;
    }

    @Override
    public int volumeDown() {
        int newVolume = this.tv.currentVolume - 1;
        this.tv.currentVolume = newVolume;
        System.out.println("Samsung volume is: " + newVolume);
        return newVolume;
    }

    @Override
    public int channelUp() {
        int newChannel = this.tv.currentChannel + 1;
        this.tv.currentChannel = newChannel;
        System.out.println("Samsung channel is: " + newChannel);
        return newChannel;
    }

    @Override
    public int channelDown() {
        int newChannel = this.tv.currentChannel - 1;
        this.tv.currentChannel = newChannel;
        System.out.println("Samsung channel is: " + newChannel);
        return newChannel;
    }
}
