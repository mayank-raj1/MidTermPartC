package midtermexam_versiona_extensioncode;

import java.util.Scanner;

public class TestUserprofile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        // Display the list of available genres
        System.out.println("Available genres: ");
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + ". " + genres[i]);
        }

        // Prompt the user to choose their favorite genre
        System.out.print("Choose your favorite genre (enter the corresponding number): ");
        int genreChoice = input.nextInt();

        String favoriteGenre = genres[genreChoice - 1];
        UserProfile userProfile = new UserProfile(name, favoriteGenre);

        System.out.println("User profile created!");
    }
}
