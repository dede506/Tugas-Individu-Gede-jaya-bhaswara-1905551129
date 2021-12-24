package com.jayabhaswara.progmob;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerviewAdapter extends RecyclerView.Adapter<com.jayabhaswara.progmob.UserViewHolder> {
    List<User> userList;

    public RecyclerviewAdapter(List<User> userList) {
        this.userList = userList;
    }

    @NonNull
    @Override
    public com.jayabhaswara.progmob.UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_item, parent, false);
        com.jayabhaswara.progmob.UserViewHolder userViewHolder = new com.jayabhaswara.progmob.UserViewHolder(view);

        return userViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull com.jayabhaswara.progmob.UserViewHolder holder, int position) {
        holder.txtNamaLengkap.setText(userList.get(position).getNamaLengkap());
        holder.txtGender.setText(userList.get(position).getGender());
        holder.txtPenyewaan.setText(userList.get(position).getPenyewaan());
    }

    // Ini untuk menghitung jumlah datanya
    @Override
    public int getItemCount() {
        return userList.size();
    }
}
