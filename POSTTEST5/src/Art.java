public abstract class Art {
    
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
    public String display() {

        String display = String.format("|%-10s  ", getArtist()) +
                        String.format("|\t%-15s   ", getTitle()) +
                        String.format("|\t%-10s    ", getYear()) ;
        return display;
    }

                 
}
