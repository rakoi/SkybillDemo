package www.limo.com.skybilldemo.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import www.limo.com.skybilldemo.Models.Bills;
import www.limo.com.skybilldemo.MyBills;
import www.limo.com.skybilldemo.R;

public class MyBillsAdapter extends RecyclerView.Adapter<MyBillsAdapter.ViewHolder> {

    public List<Bills> billsList;

    public MyBillsAdapter(List<Bills> billsList) {
        this.billsList = billsList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.mybillsticket,parent,false);

        ViewHolder viewHolder=new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Bills bill=billsList.get(position);
        holder.companyName.setText(bill.getName());
        holder.companyImage.setImageResource(bill.getImage());

    }

    @Override
    public int getItemCount() {
        return billsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView companyImage;
        TextView companyName;

        public ViewHolder(View itemView) {
            super(itemView);

            companyImage=itemView.findViewById(R.id.companyIcon);
            companyName=itemView.findViewById(R.id.comapanyName);

        }
    }
}
