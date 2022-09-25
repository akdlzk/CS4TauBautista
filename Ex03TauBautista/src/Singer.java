public class Singer {
    String name;
    int noOfPerformances;
    double earnings;
    Song favoriteSong;
    
    public Singer(String n, int perf, double earn, Song currentFave) {
        name = n;
        noOfPerformances = perf;
        earnings = earn;
        favoriteSong = currentFave;
    }
    
    public int getNumPerf() {
        return noOfPerformances;
    }
    
    public double getEarnings() {
        return earnings;
    }
    
    public void performForAudience(int noOfPeople) {
        noOfPerformances += noOfPeople;
        earnings += 100 * noOfPeople;
    }
    
    public void changeFavSong(Song newFaveSong) {
        favoriteSong = newFaveSong;
    }
}
