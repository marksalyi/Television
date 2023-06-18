package com.github.marksalyi;


public class TV2 {
    protected int currentVolume;
    protected int currentChannel;
    protected int maxVolume;
    protected int maxChannel;




    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public TV2(int currentVolume, int currentChannel) {
        this.currentVolume = currentVolume;
        this.currentChannel = currentChannel;
        this.maxVolume = 99;
        this.maxChannel = 99;

    }



}

