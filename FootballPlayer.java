/*

DAY : 10

ASSIGNMENT NO : 15

Write a program in Java to create a Player class. Inherit the classes as,
Cricket _Player, Football _Player and Hockey_ Player from Player class

*/
// FootballPlayer.java

package net.texala.main;

class FootballPlayer extends Player {
    public FootballPlayer(String playerName, int jerseyNumber) {
        super(playerName, jerseyNumber);
    }

    @Override
    public void play() {
        System.out.println("Football player is playing football...");
    }
}
