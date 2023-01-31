package com.example.videogame;

public class Main {

    public static void main(String[] args) {
        VideoGame gta5 = new VideoGame("GTA5",2008,50.0);
        VideoGame redDeadRedemption = new VideoGame("Red Dead redemption:",2015,70.0);
        VideoGame CallOfDutyMW2 = new VideoGame("Call of Duty Modern Warfare2",2022,100.0);
        VideoGame gta4 = new VideoGame("GTA4",2008,30.45);


        VideoGameCart myCart = new VideoGameCart();

        myCart.addGame(gta5);
        myCart.addGame(gta4);
        System.out.println(myCart.total());

        myCart.addGame(redDeadRedemption);
        System.out.println(myCart.total());










    }


}
