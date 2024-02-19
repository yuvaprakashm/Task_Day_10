/*

DAY : 10

ASSIGNMENT NO : 15

Write a program in Java to create a Player class. Inherit the classes as,
Cricket _Player, Football _Player and Hockey_ Player from Player class

*/
// HockeyPlayer.java

package net.texala.main;

class HockeyPlayer extends Player {
    public HockeyPlayer(String playerName, int jerseyNumber) {
        super(playerName, jerseyNumber);
    }

    @Override
    public void play() {
        System.out.println("Hockey player is playing hockey...");
    }
}
