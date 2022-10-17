import java.io.Serial;

class SeriesColl {
    private static Series[] SeriesColl;
    private static int length = 0;

    public static void addSeries(Series s1) {
        Series[] arr = new Series[length + 1];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = SeriesColl[i];
        }
        arr[length] = s1;
        length++;
        SeriesColl = arr;
    }

public void SortSeries() {
    boolean isSorted = false;
    int count = 0;

    while (!isSorted) {
        isSorted = true;

        for (int j = 0; j < length - count - 1; j++) {
            if (SeriesColl[j].Year > SeriesColl[j + 1].Year) {
                isSorted = false;
                Series temp = SeriesColl[j];
                SeriesColl[j] = SeriesColl[j + 1];
                SeriesColl[j + 1] = temp;
            }

        }
        count++;
    }}

    public void printSeries() {
        for (int i = 0; i < length; i++) {
            System.out.println("------------------");
            SeriesColl[i].FullDetails();
        }

    }

    public void searchSeriesByTitle(String keyword) {
        for (int i = 0; i < length; i++)
            if (SeriesColl[i].getSeriesName().contains(keyword)){
                SeriesColl[i].FullDetails();}
            else System.out.println("There is no objects including this name");

    }

    public void searchSeriesByYear(int keyword) {
        for (int i = 0; i < length; i++)
            if (keyword == SeriesColl[i].getYear()){
                SeriesColl[i].FullDetails();}

    }
}