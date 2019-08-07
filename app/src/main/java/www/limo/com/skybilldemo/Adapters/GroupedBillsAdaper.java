package www.limo.com.skybilldemo.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

import www.limo.com.skybilldemo.Models.GroupedBill;
import www.limo.com.skybilldemo.R;

public class GroupedBillsAdaper extends RecyclerView.Adapter<GroupedBillsAdaper.ViewHolder> {

    public List<GroupedBill> groupedBillList;

    public GroupedBillsAdaper(List<GroupedBill> groupedBillList) {
        this.groupedBillList = groupedBillList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.groupedbillticket,parent,false);

        ViewHolder viewHolder=new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        final GroupedBill groupedBill=groupedBillList.get(position);
        holder.AmountTop.setText("KES "+groupedBill.getAmount());
        holder.accountNumber.setText(groupedBill.getBill().getName()+" "+groupedBill.AccountNumber);
        holder.companyName.setText(groupedBill.getBill().getName());
        holder.dueDate.setText(groupedBill.getDate());
        holder.accountBottom.setText("KES "+groupedBill.getAmount());

        holder.removeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                groupedBillList.remove(groupedBill);
                notifyDataSetChanged();
            }
        });
    }

    @Override
    public int getItemCount() {
        return groupedBillList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        TextView companyName;
        TextView AmountTop;
        TextView dueDate;
        TextView accountNumber;
        TextView accountBottom;
        Button editBtn;
        Button removeBtn;

        public ViewHolder(View itemView) {
            super(itemView);
            companyName=itemView.findViewById(R.id.CompanyName);
            AmountTop=itemView.findViewById(R.id.AmountTop);
            dueDate=itemView.findViewById(R.id.dueDate);
            accountNumber=itemView.findViewById(R.id.accountNumber);
            accountBottom=itemView.findViewById(R.id.AmountBottom);
            editBtn=itemView.findViewById(R.id.Edit);
            removeBtn=itemView.findViewById(R.id.Remove);
        }
    }

}
