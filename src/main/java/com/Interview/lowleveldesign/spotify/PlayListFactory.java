package com.Interview.lowleveldesign.spotify;

public class PlayListFactory {
    public static PlayList createPlaylist(String name, String type){
        switch (type){
            case "collaborative":
                return new CollaborativePlaylist(name);
            default:
                return new PlayList(name);
        }

    }
}
