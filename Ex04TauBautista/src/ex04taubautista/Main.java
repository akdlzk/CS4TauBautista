/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex04taubautista;

public class Main {

    public static void main(String[] args) {
        //students' favorite IU songs
        Song song1 = new Song("LILAC", "IU", "LILAC", "Korea Dance/Electronic, Korea Ballads, K-Pop, Folk", "2021", 3, 34);
        Song song2 = new Song("Palette (feat. G-DRAGON)", "IU, G-DRAGON", "Palette", "Korea Dance/Electronic, Korea Ballads, K-Pop", "2017", 3, 37);
        Song song3 = new Song("Celebrity", "IU", "LILAC", "Korea Dance/Electronic, Korea Ballads, K-Pop, Folk", "2021", 3, 15);
        
        //singer's previous and new favorite songs
        Song faveSong = new Song("positions", "Ariana Grande", "Positions", "R&B/Soul, Pop", "2020", 2, 52);
        Song newFave = new Song("Paper Rings", "Taylor Swift", "Lover", "Alternative/Indie, Pop", "2019", 3, 42);
                
        myClass person1 = new myClass("Micah", 15, "Taro", 1.124, song1);
        myClass person2 = new myClass("Skylar", 16, "Matcha", 1.425, song2);
        myClass person3 = new myClass("Ashlynn", 15, "Wintermelon", 1.369, song3);
        
        Singer singer1 = new Singer("IU", 68, 12500000, faveSong);
        
        System.out.printf("Three students are currently studying together, and they are all big fans of IU, who is a Korean singer.%n"
            + "Here are the students' profiles and their favorite IU songs:%n%n");
        
        System.out.printf("Student 1: " + person1.name + "%nAge: " + person1.age + "%nFavorite milktea flavor: " + person1.faveMilktea +
            "%nFinal grade for the school year: " + person1.grade + "%nFavorite song: " + person1.faveSong.title);
        System.out.printf("%nAlbum: " + person1.faveSong.album + "%nGenre: " + person1.faveSong.genre + "%nYear released: " + person1.faveSong.yearReleased
            + "%nDuration: " + person1.faveSong.minutes + " minutes and " + person1.faveSong.seconds + " seconds%n%n");
        
        System.out.printf("Student 2: " + person2.name + "%nAge: " + person2.age + "%nFavorite milktea flavor: " + person2.faveMilktea +
            "%nFinal grade for the school year: " + person2.grade + "%nFavorite song: " + person2.faveSong.title);
        System.out.printf("%nAlbum: " + person2.faveSong.album + "%nGenre: " + person2.faveSong.genre + "%nYear released: " + person2.faveSong.yearReleased
            + "%nDuration: " + person2.faveSong.minutes + " minutes and " + person2.faveSong.seconds + " seconds%n%n");
        
        System.out.printf("Student 3: " + person3.name + "%nAge: " + person3.age + "%nFavorite milktea flavor: " + person3.faveMilktea +
            "%nFinal grade for the school year: " + person3.grade + "%nFavorite song: " + person3.faveSong.title);
        System.out.printf("%nAlbum: " + person3.faveSong.album + "%nGenre: " + person3.faveSong.genre + "%nYear released: " + person3.faveSong.yearReleased
            + "%nDuration: " + person3.faveSong.minutes + " minutes and " + person3.faveSong.seconds + " seconds%n%n");
        
        
        System.out.printf("After studying, they decided to watch the 2022 K-Pop Music Awards. Their favorite singer, IU, is a performer in the award show. "
            + "Here is her profile:%n");
        System.out.printf(singer1.name + "%nNumber of Performances: " + singer1.noOfPerformances + "%nEarnings: $%.0f"
            + "%nCurrent favorite song: " + singer1.favoriteSong.title, singer1.earnings);
        System.out.printf("%nArtist: " + singer1.favoriteSong.artist + "%nAlbum: " + singer1.favoriteSong.album + "%nGenre: " + singer1.favoriteSong.genre + "%nYear released: "
            + singer1.favoriteSong.yearReleased + "%nDuration: " + singer1.favoriteSong.minutes + " minutes and " + singer1.favoriteSong.seconds + " seconds%n%n");

        System.out.printf("After performing songs for 12 people, IU's earnings increased, and she is now enjoying a new song. Here is her updated profile:%n");
        singer1.performForAudience(12);
        singer1.changeFavSong(newFave);
        System.out.printf(singer1.name + "%nNumber of Performances: " + singer1.noOfPerformances + "%nEarnings: $%.0f"
            + "%nNew favorite song: " + singer1.favoriteSong.title, singer1.earnings);
        System.out.printf("%nArtist: " + singer1.favoriteSong.artist + "%nAlbum: " + singer1.favoriteSong.album + "%nGenre: " + singer1.favoriteSong.genre + "%nYear released: "
            + singer1.favoriteSong.yearReleased + "%nDuration: " + singer1.favoriteSong.minutes + " minutes and " + singer1.favoriteSong.seconds + " seconds%n%n");
    }
    
}
