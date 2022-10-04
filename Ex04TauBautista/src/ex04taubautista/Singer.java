/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex04taubautista;

public class Singer {
    private String name;
    private int noOfPerformances;
    private double earnings;
    private Song favoriteSong;
    
    public Singer(String n, int perf, double earn, Song currentFave) {
        name = n;
        noOfPerformances = perf;
        earnings = earn;
        favoriteSong = currentFave;
    }
    
    public String getSingerName() {
        return name;
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
    
    public void changeFavSong(Song newFaveSong) {
        favoriteSong = newFaveSong;
    }
}
