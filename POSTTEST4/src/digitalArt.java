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

      // Override metode display dari kelas Art
      @Override
      public String display() {
        String superDisplay = super.display();
        String display = superDisplay +
                         String.format("|\t%-10s   ", getjenisArt()) +
                         String.format("|\t%-15s   ", "Software yang di pakai : " + getSoftwareUsed()) +
                         "\n";
          return display;
      }  
    
    

}
