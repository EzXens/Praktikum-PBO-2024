public class paint extends Art{
    private String jenisArt = "Paint Art";
    private String PaintType;

    public paint(String artist,String title,int year,String jenisArt, String PaintType){
        super(artist, title, year);
        this.jenisArt = jenisArt;
        this.PaintType = PaintType;
    }

    public String getjenisArt() {
        return jenisArt;
    }

    public void setPaintType(String PaintType){
        this.PaintType = PaintType;
    }

    public String getPaintType(){
        return PaintType;
    }

    String displayPaint() {
         String display = String.format("|%-10s  ", getArtist()) +
                         String.format("|\t%-15s   ", getTitle()) +
                         String.format("|\t%-10s    ", getYear()) +
                         String.format("|\t%-10s   ", getjenisArt()) +
                         String.format("|\t%-15s   ", getPaintType()) +
                         "\n";
        return display;
    }
    

}
