public class digitalArt extends Art{
    private String jenisArt = "Digital Art";
    private String SoftwareUsed;

    public digitalArt(String artist,String title,int year,String jenisArt, String SoftwareUsed){
        super(artist, title, year);
        this.jenisArt = jenisArt;
        this.SoftwareUsed = SoftwareUsed;
    }

    public String getjenisArt() {
        return jenisArt;
    }

    public void setSoftwareUsed(String SoftwareUsed){
        this.SoftwareUsed = SoftwareUsed;
    }

    public String getSoftwareUsed(){
        return SoftwareUsed;
    }

    String displayDigital() {
        String display = String.format("|%-10s  ", getArtist()) +
                         String.format("|\t%-15s   ", getTitle()) +
                         String.format("|\t%-10s    ", getYear()) +
                         String.format("|\t%-10s   ", getjenisArt()) +
                         String.format("|\t%-15s   ", getSoftwareUsed()) +
                         "\n";
        return display;
    }
    
    

}
