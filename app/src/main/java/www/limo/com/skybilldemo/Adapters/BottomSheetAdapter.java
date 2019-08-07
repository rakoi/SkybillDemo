package www.limo.com.skybilldemo.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import www.limo.com.skybilldemo.GenerateBills;
import www.limo.com.skybilldemo.Models.Bills;
import www.limo.com.skybilldemo.R;

public  class BottomSheetAdapter extends RecyclerView.Adapter<BottomSheetAdapter.ViewHolder> {

    public List<Bills> billsList=new ArrayList<Bills>();
    public BottomSheetAdapter() {
        billsList= GenerateBills.generateBills();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.bottomsheet,parent,false);

        ViewHolder viewHolder=new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Bills bills=billsList.get(position);

        holder.textView.setText(bills.getName());
        holder.imageView.setImageResource(bills.getImage());

    }

    @Override
    public int getItemCount() {
        return billsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        Switch aSwitch;
        ImageView imageView;
        TextView textView;
        public ViewHolder(View itemView) {
            super(itemView);
            aSwitch=itemView.findViewById(R.id.bsSwitch);
            imageView=itemView.findViewById(R.id.bsIcon);
            textView=itemView.findViewById(R.id.bsName);

        }
    }
}
