package com.example.tugas4prak_1918102;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AplikasiAdapter extends RecyclerView.Adapter<AplikasiAdapter.AplikasiViewHolder> {
    private ArrayList<Aplikasi> dataList;

    public AplikasiAdapter(ArrayList<Aplikasi> dataList) {

        this.dataList = dataList;
    }

    @NonNull
    @Override
    public AplikasiAdapter.AplikasiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_aplikasi, parent, false);
        return new AplikasiViewHolder(view);
    }

    public void onBindViewHolder(AplikasiViewHolder holder, int position) {
        holder.imgApk.setImageResource(dataList.get(position).getFoto());
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtJenis.setText(dataList.get(position).getJenis());
        holder.txtTahun.setText(dataList.get(position).getTahun());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class AplikasiViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama, txtJenis, txtTahun;
        private ImageView imgApk;

        public AplikasiViewHolder(View itemView) {
            super(itemView);
            imgApk = (ImageView) itemView.findViewById(R.id.img_apk);
            txtNama = (TextView) itemView.findViewById(R.id.txt_nama);
            txtJenis = (TextView) itemView.findViewById(R.id.txt_jenis);
            txtTahun = (TextView) itemView.findViewById(R.id.txt_tahun);
        }
    }

}
