package ex04taubautista;

public class Singer {
    private String name;
    private int noOfPerformances;
    private double earnings;
    private Song favoriteSong;
    private static int totalPerformances = 0;
    
    public Singer(String n, int perf, double earn, Song currentFave) {
        name = n;
        noOfPerformances += perf;
        earnings = earn;
        favoriteSong = currentFave;
    }
    
    public String getSingerName() {
        return name;
    }
  
    
    public static int getTotalPerf(Singer firstSinger, Singer secondSinger) {
        int totalPerf = firstSinger.getNumPerf() + secondSinger.getNumPerf();
        totalPerformances = totalPerf;
        return totalPerformances;
    }
    
    public int getNumPerf() {
        return noOfPerformances;
    }
    
    public double getEarnings() {
        return earnings;
    }
    
    public Song getFaveSong() {
        return favoriteSong;
    }
    
    public void performForAudience(int noOfPeople) {
        noOfPerformances += noOfPeople;
        earnings += 100 * noOfPeople;
    }
    
    public void performForAudience(int noOfPpl, Singer firstSinger) {
        firstSinger.noOfPerformances += noOfPpl;
        
        double newEarnings = 100.0 * noOfPpl;
        firstSinger.earnings += newEarnings / 2;
    }
    
    public void performForAudience(Singer secondSinger) {
        secondSinger.noOfPerformances += 12;
        
        double newEarnings = 100.0 * 12;
        secondSinger.earnings += newEarnings / 2;
    }
    
    public void changeFavSong(Song newFaveSong) {
        favoriteSong = newFaveSong;
    }
}
