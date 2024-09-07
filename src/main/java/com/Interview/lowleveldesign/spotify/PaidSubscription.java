package com.Interview.lowleveldesign.spotify;

public class PaidSubscription implements Subscription{

    @Override
    public void adFree() {
        System.out.print("Enjoy ad free music..");
    }

    @Override
    public boolean canDownload() {
        System.out.print("you can download...");
        return true;
    }
}
