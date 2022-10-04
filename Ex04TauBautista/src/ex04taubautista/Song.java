/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex04taubautista;

public class Song {
    private String title, artist, album, genre, yearReleased;
    private int minutes, seconds;
    
    public Song(String n, String artistName, String albumName, String gen, String year, int mins, int secs) {
        title = n;
        artist = artistName;
        album = albumName;
        genre = gen;
        yearReleased = year;
        minutes = mins;
        seconds = secs;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getArtist(){
        return artist;
    }
    
    public String getAlbum(){
        return album;
    }
    
    public String getGenre(){
        return genre;
    }
    
    public String getYear(){
        return yearReleased;
    }
    
    public int getMinutes(){
        return minutes;
    }
    
    public int getSeconds(){
        return seconds;
    }
    
}
