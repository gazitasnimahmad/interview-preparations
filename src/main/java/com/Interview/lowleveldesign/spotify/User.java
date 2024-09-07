package com.Interview.lowleveldesign.spotify;

public class User {
    private String userId;
    private String userName;
    private PlayList playList;
    private Subscription subscription;

    public User(String userName, Subscription subscription, String playListName, String type) {
        this.userName = userName;
        this.playList = PlayListFactory.createPlaylist(playListName,type);
        this.subscription = subscription;
    }

    public void subscribe(PaidSubscription subscription){
        this.subscription = subscription;
    }

    public void playSong(Song song){
        PlayBackEngine.play(song);
    }

    public PlayList getPlayList(){
        return playList;
    }
}
