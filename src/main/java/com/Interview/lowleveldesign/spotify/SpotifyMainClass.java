package com.Interview.lowleveldesign.spotify;

public class SpotifyMainClass {

    public static void main(String[] args){

        Song song1 = new Song("bekhayali", "arijit", 3.4);
        Song song2 = new Song("sajni", "arijit", 3.5);
        Song song3 = new Song("kaise hua", "arijit", 4.4);
        Song song4 = new Song("jeena jeena", "atif aslam", 5.4);

        User user = new User("tasnim",new FreeSubscription(), "bestofarijit", "regular" );
        user.getPlayList().addSong(song1);
        user.getPlayList().addSong(song2);
        user.getPlayList().addSong(song3);
        user.getPlayList().playAll();
    }
}
