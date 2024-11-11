public class Main {
    public static void main(String[] args) {
        // To do: Buatlah sebuah Objek baru dari class Komputer
        Komputer komputer = new Komputer(20, "Jijah Gaming", 25000);
        // To do: Panggillah Method Informasi dari class Komputer
        komputer.Informasi();

        System.out.println();

        // To do: Buatlah sebuah Objek baru dari class KomputerVIP 
        KomputerVIP komputervip = new KomputerVIP(15, "Jijah Gaming", 50000, true);
        KomputerVIP komputervip2 = new KomputerVIP(15, "Jijah Gaming", 25000, false);
        // To do: Panggillah Method Informasi dari class KomputerVIP
        komputervip.Informasi();
        komputervip2.Informasi();
        // To do: Panggillah Method Login
        komputervip.Login("virtusjuarayeskitahebat");
        komputervip2.Login("virtuskeren");
        // To do: Panggillah Method Bermain 2x agar dapat melakukan polymorphism overloading
        komputervip.Bermain(8);
        komputervip.Bermain(2, 45);
        komputervip2.Bermain(24);
        komputervip2.Bermain(15, 25);;
        
        System.out.println();

        // To do: Buatlah sebuah Objek baru dari class KomputerPremium
        KomputerPremium komputerpremium = new KomputerPremium(12, "Jijah Gaming", 75000, true);
        KomputerPremium komputerpremium2 = new KomputerPremium(12, "Jijah Gaming", 25000, false);
        // To do: Panggillah Method Informasi dari class KomputerPremium
        komputerpremium.Informasi();
        komputerpremium2.Informasi();
        // To do: Panggillah Method Pesan
        komputerpremium.Pesan(5);
        komputerpremium2.Pesan(7);
        // To do: Panggillah Method TambahLayanan 2x agar dapat melakukan polymorphism overloading
       komputerpremium.TambahLayanan("Mie Goreng");
       komputerpremium.TambahLayanan("telur rebus", "Kartindeng");
       komputerpremium2.TambahLayanan("Ayam gulai");
       komputerpremium2.TambahLayanan("Soto medan", "Es rujak");
    }
}