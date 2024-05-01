import java.util.ArrayList;
import java.io.*;
// import java.util.List;

public class gallery  {

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


      // Overloading metode displayArt untuk menampilkan berbagai jenis daftar seni
      public void displayArt(ArrayList<? extends Art> artList, BufferedReader br) throws IOException {
        if (artList.isEmpty()) {
            clear();
            System.out.println("Data art masih kosong");
        } else {
            System.out.println("+---------------------+----------------------+------------+---------------------+-----------------------------------+\n");
            System.out.println("| Artist              | Tittle               | Year       | Jenis Art           | Additional Info                   |\n");
            System.out.println("+---------------------+----------------------+------------+---------------------+-----------------------------------+\n");
            for (int i = 0; i < artList.size(); i++) {
                System.out.println("|===============================================================================================================|\n");
                System.out.println("|" + (i + 1) + "." + artList.get(i).display());
            }
            System.out.println("|===================================================================================================================|");
        }
    }

    
    // Overloading method untuk menampilkan digitalArt
    public void displayArt(ArrayList<digitalArt> digitalArtList, BufferedReader br,boolean isDigital) throws IOException {
        if (digitalArtList.isEmpty()) {
            clear();
            System.out.println("Data digital art masih kosong");
        } else {
            System.out.println("+---------------------+----------------------+------------+---------------------+-----------------------------------+\n");
            System.out.println("| Artist              | Tittle               | Year       | Jenis Art           | Additional Info                   |\n");
            System.out.println("+---------------------+----------------------+------------+---------------------+-----------------------------------+\n");
            for (int i = 0; i < digitalArtList.size(); i++) {
                System.out.println("|===============================================================================================================|\n");
                System.out.println("|" + (i + 1) + "." + digitalArtList.get(i).display());
            }
            System.out.println("|===================================================================================================================|");
        }
    }

    // Overloading method untuk menampilkan paint
    public void displayArt(ArrayList<paint> paintList, BufferedReader br ,String PaintType) throws IOException {
        if (paintList.isEmpty()) {
            clear();
            System.out.println("Data paint masih kosong");
        } else {
            System.out.println("+---------------------+----------------------+------------+---------------------+-----------------------------------+\n");
            System.out.println("| Artist              | Tittle               | Year       | Jenis Art           | Additional Info                   |\n");
            System.out.println("+---------------------+----------------------+------------+---------------------+-----------------------------------+\n");
            for (int i = 0; i < paintList.size(); i++) {
                System.out.println("|===============================================================================================================|\n");
                System.out.println("|" + (i + 1) + "." + paintList.get(i).display());
            }
            System.out.println("|===================================================================================================================|");
        }
    }

    // Overloading method untuk menampilkan sculpture
    public void displayArt(ArrayList<Sculpture> sculptureList, BufferedReader br ,char Material_sculpture) throws IOException {
        if (sculptureList.isEmpty()) {
            clear();
            System.out.println("Data sculpture masih kosong");
        } else {
            System.out.println("+---------------------+----------------------+------------+---------------------+-----------------------------------+\n");
            System.out.println("| Artist              | Tittle               | Year       | Jenis Art           | Additional Info                   |\n");
            System.out.println("+---------------------+----------------------+------------+---------------------+-----------------------------------+\n");
            for (int i = 0; i < sculptureList.size(); i++) {
                System.out.println("|===============================================================================================================|\n");
                System.out.println("|" + (i + 1) + "." + sculptureList.get(i).display());
            }
            System.out.println("|===================================================================================================================|");
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

