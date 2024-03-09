import java.util.ArrayList;

public class gallery {

    // deklarasi arraylist artlist
    private static ArrayList<Art> artList;

    // constructor
    static {
        artList = new ArrayList<>();
    }

    public static void addArt(Art art) {
        artList.add(art);
    }

    public static void updateArt(int ubah, Art art) {
        artList.set(ubah, art);
    }

    public static void deleteArt(int hapus) {
        artList.remove(hapus);
    }

    public static ArrayList<Art> getArtList() {
        return artList;
    }
}
