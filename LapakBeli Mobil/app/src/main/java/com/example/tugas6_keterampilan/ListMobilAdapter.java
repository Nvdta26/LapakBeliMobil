package com.example.tugas6_keterampilan;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

abstract class ListMobilAdapter extends RecyclerView.Adapter<ListMobilAdapter.ListViewHolder>{
    private ArrayList<DataMobil> listMobil;
    private DataMobil dataMobil;

    public ListMobilAdapter(ArrayList<DataMobil> list) {
        this.listMobil = list; }


    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_mobil, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        final DataMobil dataLaptop =listMobil.get(position);
        Glide.with(holder.itemView.getContext()).load(dataLaptop.getFoto())
                .apply(new RequestOptions())
                .into(holder.fotomobil);

        holder.namamobil.setText(dataLaptop.getNama());
        holder.tambahButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(), Pembelian.class);
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }


    @Override
    public int getItemCount() {
        return listMobil.size(); }


    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView fotomobil;
        TextView namamobil;
        Button tambahButton;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            fotomobil = itemView.findViewById(R.id.foto_mobil);
            namamobil = itemView.findViewById(R.id.nama_mobil);
            tambahButton = itemView.findViewById(R.id.tambah); }

    }
}