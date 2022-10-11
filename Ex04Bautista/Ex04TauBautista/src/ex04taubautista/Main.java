package ex04taubautista;

public class Main {

    public static void main(String[] args) {
        //students' favorite IU songs
        Song song1 = new Song("LILAC", "IU", "LILAC", "Korea Dance/Electronic, Korea Ballads, K-Pop, Folk", "2021", 3, 34);
        Song song2 = new Song("Palette (feat. G-DRAGON)", "IU, G-DRAGON", "Palette", "Korea Dance/Electronic, Korea Ballads, K-Pop", "2017", 3, 37);
        Song song3 = new Song("Celebrity", "IU", "LILAC", "Korea Dance/Electronic, Korea Ballads, K-Pop, Folk", "2021", 3, 15);
        
        //singer's previous and new favorite songs
        Song faveSongIU = new Song("positions", "Ariana Grande", "Positions", "R&B/Soul, Pop", "2020", 2, 52);
        Song newFaveIU = new Song("Paper Rings", "Taylor Swift", "Lover", "Alternative/Indie, Pop", "2019", 3, 42);
       
        Song faveSongChungha = new Song("Bad Romance", "Lady Gaga", "The Fame Monster", "Dance-pop, Electropop, Pop", "2009", 4, 54);
        Song newFaveChungha = new Song("Still Into You", "Paramore", "Paramore", "Alternative/Indie, Pop", "2013", 3, 36);
        
        //students
        myClass person1 = new myClass("Micah", 15, "Taro", 1.124, song1);
        myClass person2 = new myClass("Skylar", 16, "Matcha", 1.425, song2);
        myClass person3 = new myClass("Ashlynn", 15, "Wintermelon", 1.369, song3);
        
        //singers performing at the award show
        Singer singer1 = new Singer("IU", 68, 12500000, faveSongIU);
        Singer singer2 = new Singer("CHUNG HA", 45, 13600500, faveSongChungha);

        System.out.printf("Three students are currently studying together, and they are all big fans of IU, who is a Korean singer.%n"
            + "Here are the students' profiles and their favorite IU songs:%n%n");
        
        System.out.printf("Student 1: " + person1.getPersonName() + "%nAge: " + person1.getAge() + "%nFavorite milktea flavor: " + person1.getMilktea() +
            "%nFinal grade for the school year: " + person1.getGrade() + "%nFavorite song: " + person1.getSong().getTitle());
        System.out.printf("%nAlbum: " + person1.getSong().getAlbum() + "%nGenre: " + person1.getSong().getGenre() + "%nYear released: " + person1.getSong().getYear()
            + "%nDuration: " + person1.getSong().getMinutes() + " minutes and " + person1.getSong().getSeconds() + " seconds%n%n");
        
        System.out.printf("Student 2: " + person2.getPersonName() + "%nAge: " + person2.getAge() + "%nFavorite milktea flavor: " + person2.getMilktea() +
            "%nFinal grade for the school year: " + person2.getGrade() + "%nFavorite song: " + person2.getSong().getTitle());
        System.out.printf("%nAlbum: " + person2.getSong().getAlbum() + "%nGenre: " + person2.getSong().getGenre() + "%nYear released: " + person2.getSong().getYear()
            + "%nDuration: " + person2.getSong().getMinutes() + " minutes and " + person2.getSong().getSeconds() + " seconds%n%n");
        
        System.out.printf("Student 3: " + person3.getPersonName() + "%nAge: " + person3.getAge() + "%nFavorite milktea flavor: " + person3.getMilktea() +
            "%nFinal grade for the school year: " + person3.getGrade() + "%nFavorite song: " + person3.getSong().getTitle());
        System.out.printf("%nAlbum: " + person3.getSong().getAlbum() + "%nGenre: " + person3.getSong().getGenre() + "%nYear released: " + person3.getSong().getYear()
            + "%nDuration: " + person3.getSong().getMinutes() + " minutes and " + person3.getSong().getSeconds() + " seconds%n%n");
        
        
        System.out.printf("After studying, they decided to watch the 2022 K-Pop Music Awards. Their favorite singer, IU, is a performer in the award show. "
            + "Here is her profile:%n");
        System.out.printf(singer1.getSingerName() + "%nNumber of Performances: " + singer1.getNumPerf() + "%nEarnings: $%.0f"
            + "%nCurrent favorite song: " + singer1.getFaveSong().getTitle(), singer1.getEarnings());
        System.out.printf("%nArtist: " + singer1.getFaveSong().getArtist() + "%nAlbum: " + singer1.getFaveSong().getAlbum() + "%nGenre: " + singer1.getFaveSong().getGenre() + "%nYear released: "
            + singer1.getFaveSong().getYear() + "%nDuration: " + singer1.getFaveSong().getMinutes() + " minutes and " + singer1.getFaveSong().getSeconds() + " seconds%n%n");

        System.out.println("Another artist is also present in the award show, which is CHUNG HA. Here is her profile:");
        System.out.printf(singer2.getSingerName() + "%nNumber of Performances: " + singer2.getNumPerf() + "%nEarnings: $%.0f"
            + "%nCurrent favorite song: " + singer2.getFaveSong().getTitle(), singer2.getEarnings());
        System.out.printf("%nArtist: " + singer2.getFaveSong().getArtist() + "%nAlbum: " + singer2.getFaveSong().getAlbum() + "%nGenre: " + singer2.getFaveSong().getGenre() + "%nYear released: "
            + singer2.getFaveSong().getYear() + "%nDuration: " + singer2.getFaveSong().getMinutes() + " minutes and " + singer2.getFaveSong().getSeconds() + " seconds%n%n");
        

        System.out.println("IU and CHUNG HA performed a collab stage. After performing songs for 12 people, They earned a total of $1200, and the management decided to split the profit between them. "
            + "They now have a profit of $600 each. Here are their new profiles:"); 
        
        singer1.performForAudience(12, singer1);
        singer2.performForAudience(singer2);
        
        singer1.changeFavSong(newFaveIU);
        singer2.changeFavSong(newFaveChungha);
        
        System.out.printf(singer1.getSingerName() + "%nNumber of Performances: " + singer1.getNumPerf() + "%nEarnings: $%.0f"
            + "%nNew favorite song: " + singer1.getFaveSong().getTitle(), singer1.getEarnings());
        System.out.printf("%nArtist: " + singer1.getFaveSong().getArtist() + "%nAlbum: " + singer1.getFaveSong().getAlbum() + "%nGenre: " + singer1.getFaveSong().getGenre() + "%nYear released: "
            + singer1.getFaveSong().getYear() + "%nDuration: " + singer1.getFaveSong().getMinutes() + " minutes and " + singer1.getFaveSong().getSeconds() + " seconds%n%n");
        
        System.out.printf(singer2.getSingerName() + "%nNumber of Performances: " + singer2.getNumPerf() + "%nEarnings: $%.0f"
            + "%nNew favorite song: " + singer2.getFaveSong().getTitle(), singer2.getEarnings());
        System.out.printf("%nArtist: " + singer2.getFaveSong().getArtist() + "%nAlbum: " + singer2.getFaveSong().getAlbum() + "%nGenre: " + singer2.getFaveSong().getGenre() + "%nYear released: "
            + singer2.getFaveSong().getYear() + "%nDuration: " + singer2.getFaveSong().getMinutes() + " minutes and " + singer2.getFaveSong().getSeconds() + " seconds%n%n");
        
        
        System.out.println("Number of total performances: " + Singer.getTotalPerf(singer1, singer2));
    }
    
}
