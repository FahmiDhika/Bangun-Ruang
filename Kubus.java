public class Kubus extends BangunRuang {
    double s;
    
    @Override
    double Volume(){
        
        double volumeK = s * s * s;
        System.out.println("Volume Bangun Ruang Kubus : " + volumeK);
        return volumeK;
    }
}
