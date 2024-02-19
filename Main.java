/*

DAY : 10

ASSIGNMENT NO : 15

Write a program in Java to create a Player class. Inherit the classes as,
Cricket _Player, Football _Player and Hockey_ Player from Player class

*/
package net.texala.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char userInput;

		List<Player> players = new ArrayList<>();

		while (true) {
			System.out.println("Menu:");
			System.out.println("1. Enter Cricket Player's details");
			System.out.println("2. Enter Football Player's details");
			System.out.println("3. Enter Hockey Player's details");
			System.out.println("4. Display Players");
			System.out.println("5. Exit");
			System.out.print("Enter your choice (1-5): ");

			userInput = scanner.next().charAt(0);
			scanner.nextLine();

			switch (userInput) {
			case '1':
				CricketPlayer cricketPlayer = createCricketPlayer(scanner);
				if (cricketPlayer != null) {
					players.add(cricketPlayer);
					cricketPlayer.printDetails();
				}
				break;
			case '2':
				FootballPlayer footballPlayer = createFootballPlayer(scanner);
				if (footballPlayer != null) {
					players.add(footballPlayer);
					footballPlayer.printDetails();
				}
				break;
			case '3':
				HockeyPlayer hockeyPlayer = createHockeyPlayer(scanner);
				if (hockeyPlayer != null) {
					players.add(hockeyPlayer);
					hockeyPlayer.printDetails();
				}
				break;
			case '4':
				displayAllPlayers(players);
				break;
			case '5':
				System.out.println("Exiting the program. Goodbye!");
				break;
			default:
				System.out.println("Invalid choice. Please enter a number between 1 and 5.");
			}
		}
	}

	private static CricketPlayer createCricketPlayer(Scanner scanner) {
		String cricketPlayerName = readAlphabeticInput(scanner);
		int cricketPlayerJerseyNo = readJerseyNumber(scanner);

		if (isValidName(cricketPlayerName)) {
			return new CricketPlayer(cricketPlayerName, cricketPlayerJerseyNo);
		} else {
			System.out.println("Invalid name. Please enter alphabetic characters only.");
			return null;
		}
	}

	private static FootballPlayer createFootballPlayer(Scanner scanner) {
		String footballPlayerName = readAlphabeticInput(scanner);
		int footballPlayerJerseyNo = readJerseyNumber(scanner);

		if (isValidName(footballPlayerName)) {
			return new FootballPlayer(footballPlayerName, footballPlayerJerseyNo);
		} else {
			System.out.println("Invalid name. Please enter alphabetic characters only.");
			return null;
		}
	}

	private static HockeyPlayer createHockeyPlayer(Scanner scanner) {
		String hockeyPlayerName = readAlphabeticInput(scanner);
		int hockeyPlayerJerseyNo = readJerseyNumber(scanner);

		if (isValidName(hockeyPlayerName)) {
			return new HockeyPlayer(hockeyPlayerName, hockeyPlayerJerseyNo);
		} else {
			System.out.println("Invalid name. Please enter alphabetic characters only.");
			return null;
		}
	}

	private static String readAlphabeticInput(Scanner scanner) {
		while (true) {
			System.out.println("Enter name:");
			String input = scanner.nextLine();

			if (!input.isEmpty() && input.matches("[a-zA-Z]+")) {
				return input;
			} else {
				System.out.println("Invalid input. Please enter alphabetic characters only.");
			}
		}
	}

	private static int readJerseyNumber(Scanner scanner) {
		while (true) {
			System.out.println("Enter Jersey Number:");
			String input = scanner.nextLine();

			if (!input.isEmpty() && input.matches("\\d+")) {
				return Integer.parseInt(input);
			} else {
				System.out.println("Invalid input. Please enter a valid integer for the Jersey Number.");
			}
		}
	}

	private static boolean isValidName(String name) {
		return name.matches("[a-zA-Z]+");
	}

	private static void displayAllPlayers(List<Player> players) {
		if (players.isEmpty()) {
			System.out.println("No players to display.");
		} else {
			System.out.println("Player Details:");

			for (Player player : players) {
				String playerType = "";

				if (player instanceof CricketPlayer) {
					playerType = "Cricket";
				} else if (player instanceof FootballPlayer) {
					playerType = "Football";
				} else if (player instanceof HockeyPlayer) {
					playerType = "Hockey";
				}

				System.out.println(playerType + " Player Name: " + player.getPlayerName());
				System.out.println("Jersey Number: " + player.getJerseyNumber());
				System.out.println("----------------------");
			}
		}
	}
}