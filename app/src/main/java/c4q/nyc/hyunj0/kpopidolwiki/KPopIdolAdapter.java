package c4q.nyc.hyunj0.kpopidolwiki;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class KPopIdolAdapter extends RecyclerView.Adapter<KPopIdolAdapter.ViewHolder> {

    private KPopIdol[] kPopIdols;

    public KPopIdolAdapter(KPopIdol[] kPopIdols) {
        this.kPopIdols = kPopIdols;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.kpop_idol_profile, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        KPopIdol kPopIdol = kPopIdols[position];
        holder.idol_pic.setImageResource(kPopIdol.getIdolPic());
        holder.idol_name.setText(kPopIdol.getIdolName());
        holder.idol_group.setText(kPopIdol.getIdolGroup());
    }

    @Override
    public int getItemCount() {
        return kPopIdols.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView idol_pic;
        TextView idol_name;
        TextView idol_group;

        public ViewHolder(View itemView) {
            super(itemView);
            idol_pic = (ImageView) itemView.findViewById(R.id.idol_pic);
            idol_name = (TextView) itemView.findViewById(R.id.idol_name);
            idol_group = (TextView) itemView.findViewById(R.id.idol_group);
        }
    }
}