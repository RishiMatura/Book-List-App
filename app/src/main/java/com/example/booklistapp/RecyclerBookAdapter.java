package com.example.booklistapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerBookAdapter extends RecyclerView.Adapter<RecyclerBookAdapter.ViewHolder> {
    Context context;
    ArrayList<BooksModel> booksModelArrayList;
    public RecyclerBookAdapter(Context context, ArrayList<BooksModel> booksModelArrayList) {
        this.context = context;
        this.booksModelArrayList = booksModelArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_data, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bookPhoto.setImageResource(booksModelArrayList.get(position).img);
        holder.bookName.setText(booksModelArrayList.get(position).book_name);
        holder.authorName.setText(booksModelArrayList.get(position).author_name);
    }

    @Override
    public int getItemCount() {
        return booksModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView bookPhoto;
        TextView bookName,authorName;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            bookPhoto = itemView.findViewById(R.id.book_image);
            bookName = itemView.findViewById(R.id.book_name);
            authorName = itemView.findViewById(R.id.author_name);
        }
    }
}
