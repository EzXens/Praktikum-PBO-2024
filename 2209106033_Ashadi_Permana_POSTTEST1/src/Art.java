public class Art {
    
    // properti art
    String artist;
    String title;
    int year;

    // constructor
    Art(String artist, String title, int year){
        this.artist = artist;
        this.title = title;
        this.year = year;
    }

    public String getArtist(){
        return artist;
    }
    public String getTittle(){
        return title;
    }
    public int getYear(){
        return year;
    }


    // untuk menampilkan objek dalam bentuk string
    public String display(){
        String tableFormat = "| %-15s | %-20s | %-5d %n";
        return String.format(tableFormat, artist, title, year);
    }

                 
}
