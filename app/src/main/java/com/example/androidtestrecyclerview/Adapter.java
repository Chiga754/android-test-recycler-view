package com.example.androidtestrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.TempViewHolder> {

    private ArrayList<String> strings = new ArrayList<>();

    public void setStrings(ArrayList<String> strings) {
        this.strings = strings;
    }

    @NonNull
    @Override
    public TempViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.item,
                parent,
                false
        );
        return new TempViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TempViewHolder holder, int position) {
        String string = strings.get(position);
        holder.textView.setText(string);
    }

    @Override
    public int getItemCount() {
        return strings.size();
    }

    class TempViewHolder extends RecyclerView.ViewHolder {
        private TextView textView;
        public TempViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
        }
    }
}
