import java.io.*;
import java.util.*;

public class Main {
    // deklarasi integer batasan input data
    static int batasan;

    private static InputStreamReader p = new InputStreamReader(System.in);
    private static BufferedReader input = new BufferedReader(p);

    // void clear , untuk clear layar terminal / cls
    private static void clear(){
        System.out.println("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        boolean login_berhasil = false;

        while (!login_berhasil) {  
        if (login.authenticate()){
            clear();
            System.out.println("login Berhasil");

        while (true) {
        System.out.println("|===============================|");
        System.out.println("|      ART GALLERY PINTERIST    |");
        System.out.println("|===============================|");
        System.out.println("| 1. Tambah Data Art            |");
        System.out.println("| 2. Display Art Gallery        |");
        System.out.println("| 3. Ubah Data Art              |");
        System.out.println("| 4. Hapus Data Art             |");
        System.out.println("| 5. Keluar                     |");
        System.out.println("|===============================|");
        System.out.print("|Pilih Menu \t: ");
        String pilih = input.readLine();

            switch (pilih) {
                case "1":
                    clear();
                    nambah_art();
                    break;
                case "2":
                    clear();
                    lihat_art();
                    break;
                case "3":
                    clear();
                    update_art();
                    break;
                case "4":
                    clear();
                    hapus_art();
                    break;
                case "5":
                System.out.println("Sedang Keluar Program");
                    System.exit(0);
                    break;
                default:
                clear();
                System.out.println("Pilihan Tak Valid");
                System.out.println("|==============================================|");
                    break;
            }
        }
        
    }else{
        clear();
        System.out.println("login gagal");
    }
    }
}

    static void nambah_art() throws NumberFormatException, IOException {
        System.out.println("============================");
        System.out.println("nambah data art : ");
        System.out.println("============================");
        System.out.println();
        
        System.out.println("ingin masukan berapa data : (ketik 0 jika ingin kembali ke menu utama) ");
        // mengecek inputan selain angka
        try {
            batasan = Integer.parseInt(input.readLine());
        }catch(NumberFormatException | IOException e){
            System.out.println("inputan harus berupa angka");
        }

        // perulangan penambahan data
        for (int i = 1; i <= batasan; i++) {
            System.out.println("|==============================================|");
            System.out.println("masukan Nama artist : ");
            String artist = input.readLine();
            System.out.println("|==============================================|");
            System.out.println("Masukan judul art : ");
            String title = input.readLine();
            int year = 0;
            
            // mengecek inputan selain angka pada tahun , jika ter catch maka akan mengulang inputan year
            while (true) {
                try {
                System.out.println("|==============================================|");
                System.out.println("Masukan tahun art : ");
                year = Integer.parseInt(input.readLine()); 
                break;
                }catch(NumberFormatException | IOException e){
                System.out.println("inputan harus berupa angka");
                }
            }

            Art art = new Art(artist,title,year);
            gallery.addArt(art);
            System.out.println("Data Telah Ditambahkan !!!! ");
        }
    }

    static void lihat_art() {
        ArrayList<Art> artList = gallery.getArtList();
        
        // mengecek array apakah kosong
        if (artList.isEmpty()) {
            clear();
            System.out.println("data art masih kosong");
        }else{
        System.out.println("+---------------------+----------------------+-------+\n");
        System.out.println("| Artist              | Tittle               | Year  |\n");
        System.out.println("+---------------------+----------------------+-------+\n");
            for (int i = 0; i < artList.size(); i++) {
            System.out.println("|==============================================|\n");
            System.out.println("|"+(i + 1) + "." + artList.get(i).display());  
        }
        System.out.println("|==============================================|");
    }

    }

    static void hapus_art()throws NumberFormatException, IOException {
        ArrayList<Art> artList = gallery.getArtList();
        lihat_art();
        
        // digunakan untuk melakukan penghapusan data sesuai nomor data nya bukan melalui indexing
        int hapus = - 1;
        if (artList.isEmpty()){
            return;
        }

        // mengecek inputan selain angka
        try {
           System.out.println("Pilih data ke berapa Untuk Menghapus Data Art");
           hapus = Integer.parseInt(input.readLine()) -1 ;
        }catch(NumberFormatException | IOException e){
            System.out.println("inputan harus berupa angka");
        }

        if ( hapus >= 0 && hapus < gallery.getArtList().size()) {
            gallery.deleteArt(hapus);
            System.out.println("data berhasil di hapus ");
        }else {
            System.out.println("pilihan tak valid");
        }
        }


    static void update_art()throws NumberFormatException, IOException {
        ArrayList<Art> artList = gallery.getArtList();
        lihat_art();

        // digunakan untuk melakukan pengubahan data sesuai nomor data nya bukan melalui indexing
        int ubah = - 1;
        if (artList.isEmpty()) {
            return;
        }

        // mengecek inputan selain angka
        try {
            System.out.println("============================");
            System.out.println("Update Data art : ");
            System.out.println("============================");
            System.out.println("Pilih data ke berapa Untuk Mengubah Data Art");
            ubah = Integer.parseInt(input.readLine()) - 1 ; 
        }catch(NumberFormatException | IOException e){
            System.out.println("inputan harus berupa angka");
        }

        if (ubah >= 0 && ubah < gallery.getArtList().size()) {
            System.out.println("masukan Nama artist baru : ");
            String artist = input.readLine();
            System.out.println("Masukan judul art baru : ");
            String title = input.readLine();
            System.out.println("Masukan tahun art baru : ");
            int year = 0;
            
            // mengecek inputan selain angka pada tahun , jika ter catch maka akan mengulang inputan year
            while (true) {
                try {
                System.out.println("Masukan tahun art : ");
                year = Integer.parseInt(input.readLine()); 
                break;
                }catch(NumberFormatException | IOException e){
                System.out.println("inputan harus berupa angka");
                }
            }


            Art ubah_art = new Art(artist, title, year);
            gallery.updateArt(ubah, ubah_art);
            System.out.println("data art berhasil di ubah");
        }else{
            System.out.println("pilihan tak valid");
        }


    }

}
