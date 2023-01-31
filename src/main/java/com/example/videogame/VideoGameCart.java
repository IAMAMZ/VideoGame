package com.example.videogame;

import java.util.ArrayList;

public class VideoGameCart {

    private ArrayList<VideoGame> games;

    public void addGame(VideoGame videoGame){
        games.add(videoGame);
    }

    public VideoGame removegame(VideoGame videoGame) {
        for(int i=0;i<games.size();i++) {
            VideoGame game = games.get(i);
            if(videoGame==game) {
                return games.remove(i);
            }
        }
        return null;
    }
    public Double total() {
        Double sum=0.0;
        for(int i=0;i<games.size();i++) {
            sum=sum+games.get(i).getPrice();
        }
    return sum;
    }
}
