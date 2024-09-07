package com.Interview.lowleveldesign.spotify;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
    private String playListId;
    private String playListName;
    private List<Song> playlist;

    public PlayList(String playListName) {
        this.playListName = playListName;
        this.playlist = new ArrayList<>();
    }

    public void addSong(Song song){
        playlist.add(song);
    }

    public void removeSong(Song song){
        playlist.remove(song);
    }

    public void playAll(){
        for(Song song: playlist){
            PlayBackEngine.play(song);
        }
    }
}
