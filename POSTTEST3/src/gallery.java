import java.util.ArrayList;
import java.io.*;
// import java.util.List;

public class gallery {

    // deklarasi arraylist artlist

    private ArrayList<digitalArt> digital_artList;
    private ArrayList<paint> paint_artList;
    private ArrayList<Sculpture> sculpture_artList;

    // Constructor untuk menginisialisasi artList
    public gallery() {

        paint_artList = new ArrayList<>();
        digital_artList = new ArrayList<>();
        sculpture_artList = new ArrayList<>();

    }

    // public void addArt(Art art) {
    //     artList.add(art);
    // }

    // public void SetArt(int ubah, Art art) {
    //     artList.set(ubah, art);
    // }

    // public void deleteArt(int hapus) {
    //     artList.remove(hapus);
    // }

    private static void clear(){
        System.out.println("\033[H\033[2J");
        System.out.flush();
    }

    public void addPaintArt(paint paintArt) {
        paint_artList.add(paintArt);
    }

    public void addDigitalArt(digitalArt da){
        digital_artList.add(da);
    }

    public void addSculptureArt(Sculpture SculptureArt){
        sculpture_artList.add(SculptureArt);
    }

    // ArrayList<Art> getArtList() {
    //     return artList;
    // }

    public void display_digitalArt(BufferedReader br)throws IOException{
        if (digital_artList.isEmpty()) {
            clear();
            System.out.println("data art masih kosong");
        }else{
        System.out.println("+---------------------+----------------------+------------+---------------------+---------------------------+\n");
        System.out.println("| Artist              | Tittle               | Year       | Jenis Art           | Software yang di pake     |\n");
        System.out.println("+---------------------+----------------------+------------+---------------------+---------------------------+\n");
            for (int i = 0; i < digital_artList.size(); i++) {
        System.out.println("|===========================================================================================================|\n");
            System.out.println("|"+(i + 1) + "." + digital_artList.get(i).displayDigital());  
        }
        System.out.println("|===========================================================================================================|");
    }
    }

    public void display_paintArt(BufferedReader br)throws IOException{
        if (paint_artList.isEmpty()) {
            clear();
            System.out.println("data art masih kosong");
        }else{
        System.out.println("+---------------------+----------------------+------------+---------------------+---------------------------+\n");
        System.out.println("| Artist              | Tittle               | Year       | Jenis Art           | Tipe Paint                |\n");
        System.out.println("+---------------------+----------------------+------------+---------------------+---------------------------+\n");
            for (int i = 0; i < paint_artList.size(); i++) {
        System.out.println("|===========================================================================================================|\n");
            System.out.println("|"+(i + 1) + "." + paint_artList.get(i).displayPaint());  
        }
        System.out.println("|===========================================================================================================|");
    }
    }

    public void display_ScupltureArt(BufferedReader br)throws IOException{
        if (sculpture_artList.isEmpty()) {
            clear();
            System.out.println("data art masih kosong");
        }else{
        System.out.println("+---------------------+----------------------+------------+---------------------+---------------------------+\n");
        System.out.println("| Artist              | Tittle               | Year       | Jenis Art           | Material yang di pake     |\n");
        System.out.println("+---------------------+----------------------+------------+---------------------+---------------------------+\n");
        for (int i = 0; i < sculpture_artList.size(); i++) {
        System.out.println("|===========================================================================================================|\n");
        System.out.println("|"+(i + 1) + "." + sculpture_artList.get(i).displaySculpture());  
        }
        System.out.println("|===========================================================================================================|");
    }
    }


    public ArrayList<digitalArt> getDigitalArtList() {
        return digital_artList;
    }
    public ArrayList<paint> getPaintArtList() {
        return paint_artList;
    }
    public ArrayList<Sculpture> getSculptureArtList() {
        return sculpture_artList;
    }


    public void delete_digitalArt(int hapus){
        digital_artList.remove(hapus);
    }

    public void delete_paintArt(int hapus){
        paint_artList.remove(hapus);
    }
    public void delete_sculptureArt(int hapus){
        sculpture_artList.remove(hapus);
    }
}
