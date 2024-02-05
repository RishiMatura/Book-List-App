package com.example.booklistapp;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
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

        holder.rowLayout.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.add_update_layout);

                EditText edBook = dialog.findViewById(R.id.dialogBoxaddBook);
                EditText edAuthor = dialog.findViewById(R.id.dialogBoxaddAuthor);
                Button dialogBoxBtnAction = dialog.findViewById(R.id.dialogBoxBtnAction);
                TextView dialogBoxTxt = dialog.findViewById(R.id.dialogBoxText);

                dialogBoxTxt.setText("Update Book Details");
                edBook.setText(booksModelArrayList.get(position).book_name);
                edAuthor.setText(booksModelArrayList.get(position).author_name);
                dialogBoxBtnAction.setText("Update Details");

                dialogBoxBtnAction.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String bookName, authorName;
                        bookName = edBook.getText().toString();
                        authorName = edAuthor.getText().toString();


                        booksModelArrayList.set(position, new BooksModel(R.drawable.harry_potter, bookName, authorName));
                        notifyItemChanged(position);

                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });

        holder.rowLayout.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                AlertDialog.Builder builder = new AlertDialog.Builder(context)
                        .setTitle("Delete Book")
                        .setMessage("Delete Book Entry?")
                        .setIcon(R.drawable.baseline_delete_24)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
//                                booksModelArrayList.remove(position);
//                                notifyItemRemoved(position);

                                booksModelArrayList.remove(position);

                                // Notify the adapter about the removal
                                notifyItemRemoved(position);

                                // Notify the adapter about the range change to update positions
                                notifyItemRangeChanged(position, booksModelArrayList.size());


                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                builder.show();
                return true;
            }
        });

    }

    @Override
    public int getItemCount() {
        return booksModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView bookPhoto;
        TextView bookName,authorName;
        ConstraintLayout rowLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            bookPhoto = itemView.findViewById(R.id.book_image);
            bookName = itemView.findViewById(R.id.book_name);
            authorName = itemView.findViewById(R.id.author_name);
            rowLayout = itemView.findViewById(R.id.row_layout);
        }
    }
}
