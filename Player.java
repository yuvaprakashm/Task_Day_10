package net.texala.main;

class Player {
    private String playerName;
    private int jerseyNumber;

    public Player(String playerName, int jerseyNumber) {
        this.playerName = playerName;
        this.jerseyNumber = jerseyNumber;
    }

    public void play() {
        System.out.println("Playing...");
    }

    public String getPlayerName() {
        return playerName;
    }

    public void printDetails() {
        System.out.println("Player Name: " + playerName);
        System.out.println("Jersey Number: " + jerseyNumber);
    }

    public String getJerseyNumber() {
        return String.valueOf(jerseyNumber);
    }

}
