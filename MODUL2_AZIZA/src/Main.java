public class Main {
    public static void main(String[] args) {
        // To do: Buatlah sebuah Objek baru dari class Komputer
        Komputer komputer = new Komputer(20, "Jijah Gaming", 25000);
        // To do: Panggillah Method Informasi dari class Komputer
        komputer.Informasi();

        System.out.println();

        // To do: Buatlah sebuah Objek baru dari class KomputerVIP 
        KomputerVIP komputervip = new KomputerVIP(15, "Jijah Gaming", 50000, true);
        komputervip.Informasi();
        komputervip.Login("virtusjuarayeskitahebat");
        komputervip.Bermain(8);
        komputervip.Bermain(2, 45);

        KomputerVIP komputervip2 = new KomputerVIP(15, "Jijah Gaming", 25000, false);
        komputervip2.Informasi();
        komputervip2.Login("virtuskeren");
        komputervip2.Bermain(24);
        komputervip2.Bermain(15, 25);
        
        System.out.println();

        // To do: Buatlah sebuah Objek baru dari class KomputerPremium
        KomputerPremium komputerpremium = new KomputerPremium(12, "Jijah Gaming", 75000, true);
        komputerpremium.Informasi();
        komputerpremium.Pesan(5);
        komputerpremium.TambahLayanan("Mie Goreng");
        komputerpremium.TambahLayanan("telur rebus", "Kartindeng");
        KomputerPremium komputerpremium2 = new KomputerPremium(12, "Jijah Gaming", 25000, false);
        komputerpremium2.Informasi();   
        komputerpremium2.Pesan(7);     
        komputerpremium2.TambahLayanan("Ayam gulai");
        komputerpremium2.TambahLayanan("Soto medan", "Es rujak");
    }
}