package com.Interview.lowleveldesign.spotify;

import javax.swing.text.PlainView;

public class PlayBackEngine {
    private static PlayBackEngine playBackEngine;

    private PlayBackEngine(){

    }

    public static PlayBackEngine playBackEngine(){
        if(playBackEngine == null)
            return new PlayBackEngine();
        return playBackEngine;
    }

    public static void play(Song song){
        System.out.println("Playing song: "+song.getTitle());
    }
}
