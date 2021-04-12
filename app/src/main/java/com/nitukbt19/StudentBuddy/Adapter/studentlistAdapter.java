package com.nitukbt19.StudentBuddy.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.nitukbt19.StudentBuddy.model.studentlist;
import com.mikhaellopez.circularimageview.CircularImageView;
import com.nitukbt19.StudentBuddy.R;
import com.nitukbt19.StudentBuddy.Student_List;

public class studentlistAdapter extends RecyclerView.Adapter<studentlistAdapter.Holder>  {
    private List<studentlist> list;
    private Context context;
    public studentlistAdapter(List<studentlist> list, Context context){
        this.list=list;
        this.context=context;
    }
    @NonNull
    @Override

    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_student_list,parent,false);
                return new Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
   studentlist studentlist=list.get(position);

holder.tvName.setText(studentlist.getUserName());
holder.tvDesc.setText(studentlist.getdescription());
holder.tvDate.setText(studentlist.getdate());
Glide.with(context).load(studentlist.geturlptofile()).into(holder.profile);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        private TextView tvName,tvDesc, tvDate;
        private CircularImageView profile;
        public Holder(@NonNull View itemView) {
            super(itemView);
            tvDate= itemView.findViewById(R.id.tv_date);
            tvDesc= itemView.findViewById(R.id.tv_desc);
            tvName= itemView.findViewById(R.id.tv_name);
            profile= itemView.findViewById(R.id.image_profile);
        }
    }
}
