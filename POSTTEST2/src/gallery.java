import java.util.ArrayList;

public class gallery {

    // deklarasi arraylist artlist
    private ArrayList<Art> artList;

    // Constructor untuk menginisialisasi artList
    gallery() {
        artList = new ArrayList<>();
    }

    protected void addArt(Art art) {
        artList.add(art);
    }

    protected void SetArt(int ubah, Art art) {
        artList.set(ubah, art);
    }

    protected void deleteArt(int hapus) {
        artList.remove(hapus);
    }

    ArrayList<Art> getArtList() {
        return artList;
    }
}
