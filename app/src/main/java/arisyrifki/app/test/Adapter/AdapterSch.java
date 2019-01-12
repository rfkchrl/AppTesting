package arisyrifki.app.test.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import arisyrifki.app.test.Holder.HolderSch;
import arisyrifki.app.test.Model.ModelSch;
import arisyrifki.app.test.R;

/**
 * Created by rfkchrl on 1/13/2019.
 */

public class AdapterSch extends RecyclerView.Adapter<HolderSch>{

    private List<ModelSch> sch = new ArrayList<>();

    public AdapterSch(List<ModelSch> sch) {
        this.sch = sch;
    }

    @Override
    public HolderSch onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_sch,parent,false);
        final HolderSch holderSch = new HolderSch(itemView);
        return holderSch;
    }

    @Override
    public void onBindViewHolder(HolderSch holder, int position) {
        holder.schTitle.setText( sch.get(position).getSchTitle());
        holder.schSubtitle.setText( sch.get(position).getSchSubtitle());
        holder.imgSch.setImageResource( sch.get(position).getImgSch());



    }

    @Override
    public int getItemCount() {
        return sch.size();
    }



}
