package com.Interview.lowleveldesign.spotify;

import org.apache.catalina.Lifecycle;

public class FreeSubscription implements Subscription {
    @Override
    public void adFree() {
        System.out.print("Playing ad.......");
    }

    @Override
    public boolean canDownload() {
        System.out.print("please subscribe to download.");
        return false;
    }
}
