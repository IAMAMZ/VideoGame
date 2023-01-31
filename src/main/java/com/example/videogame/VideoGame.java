package com.example.videogame;

public class VideoGame {

    private String title;
    private Integer releaseYear;
    private Double price;

    public VideoGame(String title,Integer releaseYear,Double price){
        setTitle(title);
        setReleaseYear(releaseYear);
        setPrice(price);
    }

    public void setTitle(String title) {
        if(title.length()==0) {
            throw new IllegalArgumentException("Please Enter a valid title");
        }
        else{
            this.title=title;
        }
    }

    public void setReleaseYear(Integer releaseYear){
        if(releaseYear<1920 || releaseYear>2023) {
            throw new IllegalArgumentException("Please enter a valid year");
        }
        else{
            this.releaseYear = releaseYear;
        }
    }

    public void setPrice(Double price) {
        if(price<1) {
            throw new IllegalArgumentException("Please enter a valid price");
        }
        else{
            this.price =price;
        }
    }

    @Override
    public String toString() {return title + " costs "+ "$"+ price +  " released on: " +releaseYear;}


}

