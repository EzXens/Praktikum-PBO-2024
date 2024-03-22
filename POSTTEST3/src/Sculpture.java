public class Sculpture extends Art{
    private String jenisArt = "Sculpture art";
    private String SculptureMaterial;

    public Sculpture(String artist,String title,int year,String jenisArt, String SculptureMaterial){
        super(artist, title, year);
        this.jenisArt = jenisArt;
        this.SculptureMaterial = SculptureMaterial;
    }

    public String getjenisArt() {
        return jenisArt;
    }

    public void setSculptureMaterial(String SculptureMaterial){
        this.SculptureMaterial = SculptureMaterial;
    }

    public String getSculptureMaterial(){
        return SculptureMaterial;
    }

    String displaySculpture() {
         String display = String.format("|%-10s  ", getArtist()) +
                         String.format("|\t%-15s   ", getTitle()) +
                         String.format("|\t%-10s    ", getYear()) +
                         String.format("|\t%-10s   ", getjenisArt()) +
                         String.format("|\t%-15s   ", getSculptureMaterial()) +
                         "\n";
        return display;
    }
    

}
