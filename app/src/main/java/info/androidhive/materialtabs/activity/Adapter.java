package info.androidhive.materialtabs.activity;

import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import info.androidhive.materialtabs.R;

public class Adapter extends RecyclerView.Adapter<Adapter.BangunViewHolder> {



    private ArrayList<Bangun> dataList;

    public Adapter(ArrayList<Bangun> dataList) {
            this.dataList = dataList;
        }

        @Override
        public BangunViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
            View view = layoutInflater.inflate(R.layout.recyclerview, parent, false);
            return new BangunViewHolder(view);
        }

        @Override
        public void onBindViewHolder(BangunViewHolder holder, int position) {
            holder.txtNama.setText(dataList.get(position).getNama());
            holder.txtPhoto.setImageResource(dataList.get(position).getPhoto());
        }

        @Override
        public int getItemCount() {
            return (dataList != null) ? dataList.size() : 0;
        }

        public class BangunViewHolder extends RecyclerView.ViewHolder{
            private TextView txtNama ;
private ImageView txtPhoto;
            public BangunViewHolder(View itemView) {
                super(itemView);
                txtNama = (TextView) itemView.findViewById(R.id.txt_nama);
                txtPhoto= (ImageView) itemView.findViewById(R.id.txt_photo);
            }
        }
}
