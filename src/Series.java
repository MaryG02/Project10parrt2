public class Series {
    private String seriesName;
    private int NumberOfSeasons;
    private String IsFinished;
    public int Year;

    public Series(String seriesName, int NumberOfSeasons, String IsFinished, int Year){
        this.seriesName = seriesName;
        this.NumberOfSeasons = NumberOfSeasons;
        this.IsFinished = IsFinished;
        this.Year = Year;

    }
    public int getYear(){
        return Year;
    }
    public String getSeriesName(){
        return seriesName;
    }
    public int getNumberOfSeasons(){
        return NumberOfSeasons;
    }
    public String getIsFinished(){
        return IsFinished;
    }
    public void FullDetails(){
        System.out.println("Name: "+ seriesName+ "\nNumber of seasons: "+ NumberOfSeasons+"\nYear of airing: "+Year+"\nStatus: "+ IsFinished);
    }

}
