public class Bola extends BangunRuang{
    double r;
    
    @Override
    double Volume(){
        
        double volumeB = (Math.PI * r * r * r) * (4/3);
        System.out.println("Volume Bangun Ruang Vola : " + volumeB);
        return volumeB;
        
    }
}
