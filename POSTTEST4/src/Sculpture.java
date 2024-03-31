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

   // Override metode display dari kelas Art
   @Override
   public String display() {
       String superDisplay = super.display();
       String display = superDisplay +
                        String.format("|\t%-10s   ", getjenisArt()) +
                        String.format("|\t%-15s   ", "Material Yang di pakai : " + getSculptureMaterial()) +
                        "\n";
       return display;
   } 
    

}
