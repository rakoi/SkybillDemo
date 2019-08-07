package www.limo.com.skybilldemo;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import www.limo.com.skybilldemo.Adapters.GroupedBillsAdaper;
import www.limo.com.skybilldemo.Models.Bills;
import www.limo.com.skybilldemo.Models.GroupedBill;


/**
 * A simple {@link Fragment} subclass.
 */
public class GroupedBills extends Fragment {


    public RecyclerView recyclerView;
    public GroupedBillsAdaper groupedBillsAdaper;
    List<GroupedBill> groupedBillList;
    FloatingActionButton floatingActionButton;
    public GroupedBills() {
        groupedBillList=new ArrayList<>();
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_grouped_billls, container, false);

        recyclerView=view.findViewById(R.id.gbRecyclerView);

        Bills bill=new Bills("KPLC",R.drawable.kplc);

        groupedBillList.add(new GroupedBill("232323","Due Aug 31,2019 |12:00 Am",bill,"12211122","2000"));

        floatingActionButton=view.findViewById(R.id.fab);

        groupedBillsAdaper=new GroupedBillsAdaper(groupedBillList);

        LinearLayoutManager layoutManager=new LinearLayoutManager(getContext());

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(groupedBillsAdaper);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bills bill=new Bills("KPLC",R.drawable.kplc);

                groupedBillList.add(new GroupedBill("232323","Due Aug 31,2019 |12:00 Am",bill,"12211122","2000"));
                groupedBillsAdaper.notifyDataSetChanged();
            }
        });
        return view;
    }

}
