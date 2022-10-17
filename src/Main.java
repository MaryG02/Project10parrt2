import java.util.Objects;
import java.util.Scanner;
import jdk.jfr.Enabled;
public class Main {
    public static void main(String[] args) {
        String input;
        Scanner scan = new Scanner(System.in);
        boolean menu = true;
            System.out.println("Hello, welcome to series collection!");
        while (menu) {
            System.out.println("-----------Menu-------------");
            System.out.println("Choose an option:\n" +
                    "1 - Add series to collection\n" +
                    "2 - Print all series\n" +
                    "3 - Sort series by year\n" +
                    "4 - Search series by title\n" +
                    "5 - Search series by year\n" +
                    "0 - exit program");
            input = scan.nextLine();
            SeriesColl s1 = new SeriesColl();
            if (Objects.equals(input, "1")) {
                AddingSeries();
            }
            if (Objects.equals(input, "2")) {
                s1.printSeries();

            }
            if (Objects.equals(input, "3")) {
                System.out.println("Sorting series by year");
                s1.SortSeries();
                s1.printSeries();


            }
            if (Objects.equals(input, "4")) {
                System.out.println("Enter the keyword to search");
                String keyword;
                keyword = scan.nextLine();
                s1.searchSeriesByTitle(keyword);

            }
            if (Objects.equals(input, "5")) {
                System.out.println("Enter the the year to search");
                int year;
                year = scan.nextInt();
                s1.searchSeriesByYear(year);

            }
            if (Objects.equals(input, "0")) {
                menu = false;
                System.exit(0);

            }

        }
    }

    private static void AddingSeries() {
        Scanner scan = new Scanner(System.in);
        boolean isAdding = true;
        while (isAdding) {
            System.out.println("To add a series, enter the title:");
            String seriesName = scan.nextLine();
            System.out.println("Status(Finished/To be continued)");
            String IsFinished = scan.nextLine();
            System.out.println("Number of seasons:");
            int NumberOfSeasons = scan.nextInt();
            System.out.println("Year of airing:");
            int Year = scan.nextInt();
            scan.nextLine();
            Series s1 = new Series(seriesName,NumberOfSeasons, IsFinished, Year);
            SeriesColl.addSeries(s1);
            System.out.println("Do you want to add a new series, Y/N");
            String answer = scan.nextLine();
            if (answer.toLowerCase().equals("y"))
                isAdding = true;
            else {
                isAdding = false;
            }
        }
    }
}