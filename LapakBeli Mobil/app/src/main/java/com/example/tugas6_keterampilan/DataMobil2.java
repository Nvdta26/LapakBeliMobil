package com.example.tugas6_keterampilan;

import java.util.ArrayList;

public class DataMobil2 {

    public static String[][] data = new String[][]{
            {"Mobil Xpander Exceed M/T", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRrywVnN8AxrCtatkGj8CGBU1UWYCPJD5vMv2FdASxMxXYSpyGP9Q"},
            {"Toyota New Fortuner 2.7 V AT ", "https://mobilsyariah.com/wp-content/uploads/2018/12/Fortuner-Black.jpg?w=640"},
            {"Toyota New Alphard", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcStbc_UguaObd0XAVDHg-rpLNe9k_L1HSGf4UUoyEsK-13IVM8C"},
            {"Toyota Rush All New", "https://static.rajamobil.com/resize/600x600/media/images/databasemobil/mobilbaru/color/toyota-new-rush-white.png"},
            {"Toyota Innova", "https://cdns.klimg.com/otosia.com/p/headline/650x325/0000453461.jpg"},
            {"Toyota Vios", "https://d2pa5gi5n2e1an.cloudfront.net/id/images/car_models/Toyota_Vios/4/main/Toyota_Vios_L_1.jpg"},
            {"Pajero Sport", "https://i1.wp.com/adira.co.id/wp-content/uploads/2018/11/pe-1.jpg?ssl=1"},
            {"Honda Civic", "https://d2pa5gi5n2e1an.cloudfront.net/id/images/car_models/Honda_Civic/10/exterior/exterior_2L_1.jpg"},
            {"Jeep", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT4wSCGCVhokdiexVSPBpUAL_bRkyGBR29kxttAnnIXU1Gmjq3w"},
            {"Jazz", "http://s1.carbase.my/upload/24/121/301/exterior/s19-1405499801-6994.jpg"},
    };

    public static ArrayList<DataMobil> getListData(){
        ArrayList<DataMobil> list = new ArrayList<>();
        for(String[] kData : data){
            DataMobil datamobil = new DataMobil();
            datamobil.setNama(kData[0]);
            datamobil.setFoto(kData[1]);
            list.add(datamobil);
        }

        return list;
    }
}
