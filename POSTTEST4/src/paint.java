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

    // Override metode display dari kelas Art
    @Override
    public String display() {
        String superDisplay = super.display();
        String display = superDisplay +
                         String.format("|\t%-10s   ", getjenisArt()) +
                         String.format("|\t%-15s   ", "Tipe paint yang digunakan : " + getPaintType()) +
                         "\n";
        return display;
    }  
    

}
