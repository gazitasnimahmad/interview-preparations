package com.Interview.lowleveldesign.spotify;

import java.util.ArrayList;
import java.util.List;

public class CollaborativePlaylist extends PlayList {
    List<User> collaborators;
    public CollaborativePlaylist(String name) {
        super(name);
        this.collaborators = new ArrayList<>();
    }

    public void addColaborator(User user){
        collaborators.add(user);
    }

    public void removeColaborator(User user){
        collaborators.remove(user);
    }
}
