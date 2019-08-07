package www.limo.com.skybilldemo;

import java.util.ArrayList;
import java.util.List;

import www.limo.com.skybilldemo.Models.Bills;

public  class GenerateBills {

    public static List<Bills> generateBills(){

        List<Bills>billsList=new ArrayList<>();

        billsList.add(new Bills("KPLC Token",R.drawable.kplc));
        billsList.add(new Bills("NHIF",R.drawable.nhif));
        billsList.add(new Bills("Daily Parking",R.drawable.jijipay));
        billsList.add(new Bills("Seasonal Parking",R.drawable.jijipay));
        billsList.add(new Bills("Nairobi Waters",R.drawable.nairobiwater));


        return billsList;
    }
}
