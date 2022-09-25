public class Song {
    String title, artist, album, genre, yearReleased;
    int minutes, seconds;
    
    public Song(String n, String artistName, String albumName, String gen, String year, int mins, int secs) {
        title = n;
        artist = artistName;
        album = albumName;
        genre = gen;
        yearReleased = year;
        minutes = mins;
        seconds = secs;
    }
}
