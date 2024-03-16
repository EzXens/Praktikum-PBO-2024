public class Art {
    
    // properti art
    private String artist;
    private String title;
    private int year;

    // constructor
    Art(String artist, String title, int year){
        this.artist = artist;
        this.title = title;
        this.year = year;
    }

    public String getArtist(){
        return artist;
    }
    public String getTitle(){
        return title;
    }
    public int getYear(){
        return year;
    }


    // untuk menampilkan objek dalam bentuk string
    String display(){
        String tableFormat = "| %-15s | %-20s | %-5d %n";
        return String.format(tableFormat, getArtist(), getTitle(), getYear());
    }

                 
}
