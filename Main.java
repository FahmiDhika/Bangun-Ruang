import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("================VOLUME BANGUN RUANG================");
        System.out.print("Silahkan Memasukkan Bangun Ruang (Kapital Perkata): ");
        String br = input.nextLine();
        System.out.println("---------------------------------------------------");
        
        switch(br){
            case "Bola":
                Bola bol = new Bola();
                System.out.println("Rumus Volume Bola : (PI * r * r * r) * (4/3)");
                System.out.print("r : ");
                double er = input.nextDouble();
                
                bol.r = er;
                bol.Volume();
                System.out.println("================VOLUME BANGUN RUANG================");
                break;
            
            case "Kubus":
                Kubus kub = new Kubus();
                System.out.println("Rumus Volume Kubus : s * s * s");
                System.out.print("s : ");
                double es = input.nextDouble();
                
                kub.s = es;
                kub.Volume();
                break;
                
            case "Tabung":
                Tabung tab = new Tabung();
                System.out.println("Rumus Volume Tabung : Math.PI * r * r * t");
                System.out.print("r : ");
                double ere = input.nextDouble();
                System.out.print("t : ");
                double te = input.nextDouble();
                
                tab.r = ere;
                tab.t = te;
                tab.Volume();
                break;
                
            case "Limas Segitiga":
                LimasSegitiga ls = new LimasSegitiga();
                System.out.println("Rumus Volume Limas Segitiga : 1/3 * luas alas * t");
                System.out.print("a : ");
                double a = input.nextDouble();
                System.out.print("t (alas): ");
                double et = input.nextDouble();
                System.out.print("t (limas): ");
                double tee = input.nextDouble();
                
                ls.a = a;
                ls.ti = et;
                ls.t = tee;
                ls.Volume();
                break;
            default:
                System.out.println("Rumus Belum Ditambahkan / Tidak Ada Rumus");
        }
    }
}
