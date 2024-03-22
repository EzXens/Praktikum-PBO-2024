public class Art {
    
    // properti art
    protected String artist;
    protected String title;
    protected int year;

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

    public void setArtist(String artist_baru){
        this.artist = artist_baru;
    }

    public void setTitle(String title_baru){
        this.title = title_baru;
    }

    public void setYear(int year_baru){
        this.year = year_baru;
    }




    // untuk menampilkan objek dalam bentuk string
    String display(){
        String tableFormat = "| %-15s | %-20s | %-5d %n";
        return String.format(tableFormat, getArtist(), getTitle(), getYear());
    }

                 
}
