public class Tabung extends BangunRuang{
    double r, t;
    
    @Override
    double Volume(){
        
        double volumeT = Math.PI * r * r * t;
        System.out.println("Volume Bangun Ruang Tabung : " + volumeT);
        return volumeT;
    }
}
