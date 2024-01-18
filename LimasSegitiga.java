public class LimasSegitiga extends BangunRuang{
    double a, ti, t;
    
    @Override
    double Volume(){
        
        double volumeLS = a * ti  * t * 1/3 * 1/2;
        System.out.println("Volume Bangun Ruang Limas Segitiga : " + volumeLS);
        return volumeLS;
    }
}
