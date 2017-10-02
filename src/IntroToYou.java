import java.util.Scanner;

public class IntroToYou {
    public static void main(String args[]) {
        String name;
        String experience;
        String major;
        String nationality;
        String interestingFact;

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name?");
        name = scan.nextLine();

        System.out.println("What is your level of java experience? Beginner, intermediate or advanced");
        experience = scan.nextLine();

        System.out.println("What is your major?");
        major = scan.nextLine();

        System.out.println("Where are you from originally?");
        nationality = scan.nextLine();

        System.out.println("Tell me something interesting about you.");
        interestingFact = scan.nextLine();

        System.out.println("Your name is " + name + ". Your level of Java experience is " + experience
                + ". You are studying " + major + ". You are originally from " + nationality
                + ". An interesting fact about you is " + interestingFact + ".");

        scan.close();

    }
}
