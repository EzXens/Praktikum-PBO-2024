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
    
    // objek gallery
    static gallery gallery = new gallery();

    public static void main(String[] args) throws NumberFormatException, IOException {
        boolean login_berhasil = false;
        login logins = new login("admin", "admin");

        while (!login_berhasil) {  
        if (logins.authenticate()){
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
        System.out.println("| 5. Keluar program             |");
        System.out.println("|===============================|");
        System.out.print("|Pilih Menu \t: ");
        String pilih = input.readLine();

            switch (pilih) {
                case "1":
                    clear();
                    Menu_add();
                    break;
                case "2":
                    clear();
                    Menu_lihat();
                    break;
                case "3":
                    clear();
                    Menu_ubah();
                    break;
                case "4":
                    clear();
                    Menu_hapus();
                    break;
                case "5":
                    System.out.println("Sedang Keluar Program");
                    System.exit(0);
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
// menu menu crud 
    public static void Menu_add() throws IOException{
        clear();
        while (true) {
        System.out.println("============================");
        System.out.println("======   Tambah Art   ======");
        System.out.println("============================");
        System.out.println("= 1. Digital Art           =");
        System.out.println("= 2. Paint Art             =");
        System.out.println("= 3. Sculpture Art         =");
        System.out.println("= 4. Keluar                =");
        System.out.println("============================");
        String pilih = input.readLine();
        switch(pilih){
            case "1" -> {
                nambah_digitalArt();
            }
            case "2" -> {
               nambah_paintArt();
            }
            case "3" -> {
               nambah_SculptureArt();
            }
            case "4" -> {
               return;
            }
            default -> {
                System.out.println("Kembali. . .");
                System.out.print("Tekan ENTER untuk melanjutkan");input.readLine();
            }
          }
      }

    }

    public static void Menu_lihat() throws IOException{
        clear();
        while (true) {
        System.out.println("================================");
        System.out.println("========   Lihat Art    ========");
        System.out.println("================================");
        System.out.println("= 1. Tampilkan Semua Jenis Art =");
        System.out.println("= 2. Digital Art               =");
        System.out.println("= 3. Paint Art                 =");
        System.out.println("= 4. Sculpture Art             =");
        System.out.println("= 5. Keluar                    =");
        System.out.println("================================");
        String pilih = input.readLine();
        switch(pilih){
            case "1" -> {
                ArrayList<Art> allArt = new ArrayList<>();
                allArt.addAll(gallery.getDigitalArtList());
                allArt.addAll(gallery.getPaintArtList());
                allArt.addAll(gallery.getSculptureArtList());
                
                gallery.displayArt(allArt, input);
            }
            case "2" -> {
                // gallery.displayArt(gallery.getDigitalArtList(), input);
                gallery.displayArt(gallery.getDigitalArtList(), input , true);
            }
            case "3" -> {
               gallery.displayArt(gallery.getPaintArtList(), input , "");
            }
            case "4" -> {
               gallery.displayArt(gallery.getSculptureArtList() , input ,' ') ;
            }
            case "5" -> {
               return;
            }
            default -> {
                System.out.println("Kembali. . .");
                System.out.print("Tekan ENTER untuk melanjutkan");input.readLine();
            }
          }
      }

    }

    public static void Menu_ubah() throws IOException{
        clear();
        while (true) {
        System.out.println("============================");
        System.out.println("======   Ubah Art   ======");
        System.out.println("============================");
        System.out.println("= 1. Digital Art           =");
        System.out.println("= 2. Paint Art             =");
        System.out.println("= 3. Sculpture Art         =");
        System.out.println("= 4. Keluar                =");
        System.out.println("============================");
        String pilih = input.readLine();
        switch(pilih){
            case "1" -> {
                update_digitalart();
            }
            case "2" -> {
               update_Paintart();
            }
            case "3" -> {
               update_Sculptureart();
            }
            case "4" -> {
               return;
            }
            default -> {
                System.out.println("Kembali. . .");
                System.out.print("Tekan ENTER untuk melanjutkan");input.readLine();
            }
          }
      }

    }

    public static void Menu_hapus() throws IOException{
        clear();
        while (true) {
        System.out.println("============================");
        System.out.println("======   Hapus Art   ======");
        System.out.println("============================");
        System.out.println("= 1. Digital Art           =");
        System.out.println("= 2. Paint Art             =");
        System.out.println("= 3. Sculpture Art         =");
        System.out.println("= 4. Keluar                =");
        System.out.println("============================");
        String pilih = input.readLine();
        switch(pilih){
            case "1" -> {
                hapus_digitalart();
            }
            case "2" -> {
               hapus_Paintart();
            }
            case "3" -> {
               hapus_Sculptureart();
            }
            case "4" -> {
               return;
            }
            default -> {
                System.out.println("Kembali. . .");
                System.out.print("Tekan ENTER untuk melanjutkan");input.readLine();
            }
          }
      }

    }

    //  end of menu menu crud

    // data digital art
    static void nambah_digitalArt() throws NumberFormatException, IOException {
        System.out.println("============================");
        System.out.println("nambah data art : ");
        System.out.println("============================");
        System.out.println();
        
        System.out.println("ingin masukan berapa data : (ketik 0 jika ingin kembali ) ");
        // mengecek inputan selain angka
        try {
            batasan = Integer.parseInt(input.readLine());
            // membatasi inputan yang ingin dimasukan maks 10
            if (batasan > 10) {
                System.out.println("Maksimal 10 data yang dapat dimasukkan. Hanya 10 data yang akan diproses.");
                batasan = 10;
                return;
            }
        }catch(NumberFormatException | IOException e){
            System.out.println("inputan harus berupa angka");
            return;
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
                System.out.println("Masukan tahun art (1970-2024) : ");
                year = Integer.parseInt(input.readLine()); 
                
                if (year < 1970 || year > 2024) {
                    System.out.println("Tahun harus berada dalam rentang 1970-2024.");
                    continue; // Melanjutkan loop untuk meminta input kembali
                }

                break;
                }catch(NumberFormatException | IOException e){
                System.out.println("inputan harus berupa angka");
                }
            }

            System.out.println("|==============================================|");
            System.out.println("masukan software yang di pakai : ");
            String SoftwareUsed = input.readLine();


            digitalArt digital_art = new digitalArt(artist, title, year, "Digital Art", SoftwareUsed);
            gallery.addDigitalArt(digital_art);;
            System.out.println("Data Telah Ditambahkan !!!! ");
        }
    }

    static void hapus_digitalart()throws NumberFormatException, IOException {
        ArrayList<digitalArt> digitalArt = gallery.getDigitalArtList();
        gallery.displayArt(gallery.getDigitalArtList(),input,true);
        // digunakan untuk melakukan penghapusan data sesuai nomor data nya bukan melalui indexing
        int hapus = - 1;
        if (digitalArt.isEmpty()){
            return;
        }

        // mengecek inputan selain angka
        try {
           System.out.println("Pilih data ke berapa Untuk Menghapus Data Art");
           hapus = Integer.parseInt(input.readLine()) -1 ;
        }catch(NumberFormatException | IOException e){
            System.out.println("inputan harus berupa angka");
        }
        
        if ( hapus >= 0 && hapus < gallery.getDigitalArtList().size()) {
            digitalArt selectedArt = digitalArt.get(hapus);
            System.out.println("apakah anda ingin menghapus art dari gallery ? " + selectedArt.display());
            System.out.print("Ya (Y) / Tidak (T) : ");
            String yakin = input.readLine();
            if (yakin.equalsIgnoreCase("Ya") || yakin.equalsIgnoreCase("Y")){
                gallery.delete_digitalArt(hapus);
                System.out.println("data berhasil di hapus ");
            }else if(yakin.equalsIgnoreCase("Tidak") || yakin.equalsIgnoreCase("T")){
                System.out.println("data batal di hapus ");
            }else{
                System.out.println("pilihan tak valid");
            }
        }else {
            System.out.println("pilihan tak valid");
        }
        }


    static void update_digitalart()throws NumberFormatException, IOException {
        ArrayList<digitalArt> digitalArt = gallery.getDigitalArtList();
        gallery.displayArt(gallery.getDigitalArtList(),input,true);

        // digunakan untuk melakukan pengubahan data sesuai nomor data nya bukan melalui indexing
        int ubah = - 1;
        if (digitalArt.isEmpty()) {
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

        if (ubah >= 0 && ubah < gallery.getDigitalArtList().size()) {
            digitalArt selectedArt = digitalArt.get(ubah);
            System.out.println("apakah anda ingin mengubah art dari gallery ? " + selectedArt.display());
            System.out.print("Ya (Y) / Tidak (T) : ");
            String yakin = input.readLine();
            if (yakin.equalsIgnoreCase("Ya") || yakin.equalsIgnoreCase("Y")){

                System.out.println("masukan Nama artist baru : ");
                selectedArt.setArtist(input.readLine());
                System.out.println("Masukan judul art baru : ");
                selectedArt.setTitle(input.readLine());
                System.out.println("Masukan tahun art baru (1970-2024) : ");
                int year = 0;
                // mengecek inputan selain angka pada tahun , jika ter catch maka akan mengulang inputan year
                while (true) {
                    try {
                    year = Integer.parseInt(input.readLine()); 
                    
                   if (year < 1970 || year > 2024) {
                    System.out.println("Tahun harus berada dalam rentang 1970-2024.");
                    continue; // Melanjutkan loop untuk meminta input kembali
                   }

                    selectedArt.setYear(year);
                    break;
                    }catch(NumberFormatException | IOException e){
                    System.out.println("inputan harus berupa angka");
                    }
                }

            System.out.println("masukan software baru yang di pakai : ");
            selectedArt.setSoftwareUsed(input.readLine());
            
            System.out.println("data art berhasil di ubah");

            }else if(yakin.equalsIgnoreCase("Tidak") || yakin.equalsIgnoreCase("T")){
                System.out.println("data batal di update ");

            }else{
                System.out.println("pilihan tak valid");
            }
            
        }else{
            System.out.println("pilihan tak valid");
        }


    }

    // end of data digitalart

    //  data paint art
    static void nambah_paintArt() throws NumberFormatException, IOException {
        System.out.println("============================");
        System.out.println("nambah data art : ");
        System.out.println("============================");
        System.out.println();
        
        System.out.println("ingin masukan berapa data : (ketik 0 jika ingin kembali ) ");
        // mengecek inputan selain angka
        try {
            batasan = Integer.parseInt(input.readLine());
            // membatasi inputan yang ingin dimasukan maks 10
            if (batasan > 10) {
                System.out.println("Maksimal 10 data yang dapat dimasukkan. Hanya 10 data yang akan diproses.");
                batasan = 10;
                return;
            }
        }catch(NumberFormatException | IOException e){
            System.out.println("inputan harus berupa angka");
            return;
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
                System.out.println("Masukan tahun art (1970-2024) : ");
                year = Integer.parseInt(input.readLine()); 

                
                if (year < 1970 || year > 2024) {
                    System.out.println("Tahun harus berada dalam rentang 1970-2024.");
                    continue; // Melanjutkan loop untuk meminta input kembali
                }

                break;
                }catch(NumberFormatException | IOException e){
                System.out.println("inputan harus berupa angka");
                }
            }

            System.out.println("|==============================================|");
            System.out.println("masukan tipe paint yang di pakai : ");
            String PaintType = input.readLine();


            paint paint_art = new paint(artist, title, year, "Paint Art", PaintType);
            gallery.addPaintArt(paint_art);
            System.out.println("Data Telah Ditambahkan !!!! ");
        }
    }

    static void hapus_Paintart()throws NumberFormatException, IOException {
        ArrayList<paint> paint_art = gallery.getPaintArtList();
        gallery.displayArt(gallery.getPaintArtList(),input,"");
        // digunakan untuk melakukan penghapusan data sesuai nomor data nya bukan melalui indexing
        int hapus = - 1;
        if (paint_art.isEmpty()){
            return;
        }

        // mengecek inputan selain angka
        try {
           System.out.println("Pilih data ke berapa Untuk Menghapus Data Art");
           hapus = Integer.parseInt(input.readLine()) -1 ;
        }catch(NumberFormatException | IOException e){
            System.out.println("inputan harus berupa angka");
        }
        
        if ( hapus >= 0 && hapus < gallery.getPaintArtList().size()) {
            paint selectedArt = paint_art.get(hapus);
            System.out.println("apakah anda ingin menghapus art dari gallery ? " + selectedArt.display());
            System.out.print("Ya (Y) / Tidak (T) : ");
            String yakin = input.readLine();
            if (yakin.equalsIgnoreCase("Ya") || yakin.equalsIgnoreCase("Y")){
                gallery.delete_paintArt(hapus);
                System.out.println("data berhasil di hapus ");
            }else if(yakin.equalsIgnoreCase("Tidak") || yakin.equalsIgnoreCase("T")){
                System.out.println("data batal di hapus ");
            }else{
                System.out.println("pilihan tak valid");
            }
        }else {
            System.out.println("pilihan tak valid");
        }
        }

        static void update_Paintart()throws NumberFormatException, IOException {
            ArrayList<paint> paint_art = gallery.getPaintArtList();
            gallery.displayArt(gallery.getPaintArtList(),input,"");
    
            // digunakan untuk melakukan pengubahan data sesuai nomor data nya bukan melalui indexing
            int ubah = - 1;
            if (paint_art.isEmpty()) {
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
    
            if (ubah >= 0 && ubah < gallery.getPaintArtList().size()) {
                paint selectedArt = paint_art.get(ubah);
                System.out.println("apakah anda ingin mengubah art dari gallery ? " + selectedArt.display());
                System.out.print("Ya (Y) / Tidak (T) : ");
                String yakin = input.readLine();
                if (yakin.equalsIgnoreCase("Ya") || yakin.equalsIgnoreCase("Y")){
    
                    System.out.println("masukan Nama artist baru : ");
                    selectedArt.setArtist(input.readLine());
                    System.out.println("Masukan judul art baru : ");
                    selectedArt.setTitle(input.readLine());
                    System.out.println("Masukan tahun art baru (1970-2024) : ");
                    int year = 0;
                    // mengecek inputan selain angka pada tahun , jika ter catch maka akan mengulang inputan year
                    while (true) {
                        try {
                        year = Integer.parseInt(input.readLine()); 
                        
                        if (year < 1970 || year > 2024) {
                            System.out.println("Tahun harus berada dalam rentang 1970-2024.");
                            continue; // Melanjutkan loop untuk meminta input kembali
                        }

                        selectedArt.setYear(year);
                        break;
                        }catch(NumberFormatException | IOException e){
                        System.out.println("inputan harus berupa angka");
                        }
                    }
    
                System.out.println("masukan tipe paint baru yang di pakai : ");
                selectedArt.setPaintType(input.readLine());
                
                System.out.println("data art berhasil di ubah");
    
                }else if(yakin.equalsIgnoreCase("Tidak") || yakin.equalsIgnoreCase("T")){
                    System.out.println("data batal di update ");
    
                }else{
                    System.out.println("pilihan tak valid");
                }
                
            }else{
                System.out.println("pilihan tak valid");
            }
    
    
        } 

    // end of data paint art

    //  data sculpture art

    static void nambah_SculptureArt() throws NumberFormatException, IOException {
        System.out.println("============================");
        System.out.println("nambah data art : ");
        System.out.println("============================");
        System.out.println();
        
        System.out.println("ingin masukan berapa data : (ketik 0 jika ingin kembali ) ");
        // mengecek inputan selain angka
        try {
            batasan = Integer.parseInt(input.readLine());
            // membatasi inputan yang ingin dimasukan maks 10
            if (batasan > 10) {
                System.out.println("Maksimal 10 data yang dapat dimasukkan. Hanya 10 data yang akan diproses.");
                batasan = 10;
                return;
            }
        }catch(NumberFormatException | IOException e){
            System.out.println("inputan harus berupa angka");
            return;
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
                System.out.println("Masukan tahun art (1970-2024) : ");
                year = Integer.parseInt(input.readLine()); 

                
                if (year < 1970 || year > 2024) {
                    System.out.println("Tahun harus berada dalam rentang 1970-2024.");
                    continue; // Melanjutkan loop untuk meminta input kembali
                }

                break;
                }catch(NumberFormatException | IOException e){
                System.out.println("inputan harus berupa angka");
                }
            }

            System.out.println("|==============================================|");
            System.out.println("masukan Sculpture material yang di pakai : ");
            String SculptureMaterial = input.readLine();


            Sculpture sculpture_art = new Sculpture(artist, title, year, "Sculpture Art", SculptureMaterial);
            gallery.addSculptureArt(sculpture_art);
            System.out.println("Data Telah Ditambahkan !!!! ");
        }
    }

    static void hapus_Sculptureart()throws NumberFormatException, IOException {
        ArrayList<Sculpture> Sculpture_art = gallery.getSculptureArtList();
        gallery.displayArt(gallery.getSculptureArtList(),input,' ');
        // digunakan untuk melakukan penghapusan data sesuai nomor data nya bukan melalui indexing
        int hapus = - 1;
        if (Sculpture_art.isEmpty()){
            return;
        }

        // mengecek inputan selain angka
        try {
           System.out.println("Pilih data ke berapa Untuk Menghapus Data Art");
           hapus = Integer.parseInt(input.readLine()) -1 ;
        }catch(NumberFormatException | IOException e){
            System.out.println("inputan harus berupa angka");
        }
        
        if ( hapus >= 0 && hapus < gallery.getPaintArtList().size()) {
            Sculpture selectedArt = Sculpture_art.get(hapus);
            System.out.println("apakah anda ingin menghapus art dari gallery ? " + selectedArt.display());
            System.out.print("Ya (Y) / Tidak (T) : ");
            String yakin = input.readLine();
            if (yakin.equalsIgnoreCase("Ya") || yakin.equalsIgnoreCase("Y")){
                gallery.delete_sculptureArt(hapus);
                System.out.println("data berhasil di hapus ");
            }else if(yakin.equalsIgnoreCase("Tidak") || yakin.equalsIgnoreCase("T")){
                System.out.println("data batal di hapus ");
            }else{
                System.out.println("pilihan tak valid");
            }
        }else {
            System.out.println("pilihan tak valid");
        }
        }

        static void update_Sculptureart()throws NumberFormatException, IOException {
            ArrayList<Sculpture> Sculpture_art = gallery.getSculptureArtList();
            gallery.displayArt(gallery.getSculptureArtList(),input,' ');
    
            // digunakan untuk melakukan pengubahan data sesuai nomor data nya bukan melalui indexing
            int ubah = - 1;
            if (Sculpture_art.isEmpty()) {
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
    
            if (ubah >= 0 && ubah < gallery.getPaintArtList().size()) {
                Sculpture selectedArt = Sculpture_art.get(ubah);
                System.out.println("apakah anda ingin mengubah art dari gallery ? " + selectedArt.display());
                System.out.print("Ya (Y) / Tidak (T) : ");
                String yakin = input.readLine();
                if (yakin.equalsIgnoreCase("Ya") || yakin.equalsIgnoreCase("Y")){
    
                    System.out.println("masukan Nama artist baru : ");
                    selectedArt.setArtist(input.readLine());
                    System.out.println("Masukan judul art baru : ");
                    selectedArt.setTitle(input.readLine());
                    System.out.println("Masukan tahun art baru (1970-2024): ");
                    int year = 0;
                    // mengecek inputan selain angka pada tahun , jika ter catch maka akan mengulang inputan year
                    while (true) {
                        try {
                        year = Integer.parseInt(input.readLine()); 

                        
                        if (year < 1970 || year > 2024) {
                            System.out.println("Tahun harus berada dalam rentang 1970-2024.");
                            continue; // Melanjutkan loop untuk meminta input kembali
                        }

                        selectedArt.setYear(year);
                        break;
                        }catch(NumberFormatException | IOException e){
                        System.out.println("inputan harus berupa angka");
                        }
                    }
    
                System.out.println("masukan Sculpture material baru yang di pakai : ");
                selectedArt.setSculptureMaterial(input.readLine());
                
                System.out.println("data art berhasil di ubah");
    
                }else if(yakin.equalsIgnoreCase("Tidak") || yakin.equalsIgnoreCase("T")){
                    System.out.println("data batal di update ");
    
                }else{
                    System.out.println("pilihan tak valid");
                }
                
            }else{
                System.out.println("pilihan tak valid");
            }
    
    
        } 

    // end of data sculpture art
}
