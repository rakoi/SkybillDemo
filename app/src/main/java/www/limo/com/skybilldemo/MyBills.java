package www.limo.com.skybilldemo;


import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import www.limo.com.skybilldemo.Adapters.BottomSheetAdapter;
import www.limo.com.skybilldemo.Adapters.MyBillsAdapter;
import www.limo.com.skybilldemo.Models.Bills;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyBills extends Fragment {

    public MyBillsAdapter myBillsAdapter;
    public List<Bills> billsList;
    Button bottomSheetBtn;
    BottomSheetBehavior bottomSheetBehavior;
    LinearLayout bottomSheet;
    public RecyclerView recyclerView;
    public MyBills() {
        // Required empty public constructor
        billsList=new ArrayList<>();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View view= inflater.inflate(R.layout.fragment_my_bills, container, false);

        recyclerView=view.findViewById(R.id.mybillsRecyclerView);
        RecyclerView.LayoutManager layoutManager=new GridLayoutManager(getContext(),3);
        recyclerView.setLayoutManager(layoutManager);

        bottomSheetBtn=view.findViewById(R.id.bottomSheet);
        bottomSheet=view.findViewById(R.id.bottomSheetLayout);




        bottomSheetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomSheetBehavior=BottomSheetBehavior.from(bottomSheet);


                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);

            }
        });

        billsList.add(new Bills("KPLC Token",R.drawable.kplc));
        billsList.add(new Bills("NHIF",R.drawable.nhif));
        billsList.add(new Bills("Daily Parking",R.drawable.jijipay));
        billsList.add(new Bills("Seasonal Parking",R.drawable.jijipay));
        billsList.add(new Bills("Nairobi Waters",R.drawable.nairobiwater));

        myBillsAdapter=new MyBillsAdapter(billsList);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(myBillsAdapter);

        return view;

    }

}
