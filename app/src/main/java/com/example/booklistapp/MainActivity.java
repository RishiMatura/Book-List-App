package com.example.booklistapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<BooksModel> arrBook = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.BookView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrBook.add(new BooksModel(R.drawable.acceptance, "Acceptance", "Jeff VanderMeer"));
        arrBook.add(new BooksModel(R.drawable.acceptance, "Acceptance", "Jeff VanderMeer"));
        arrBook.add(new BooksModel(R.drawable.acceptance, "Acceptance", "Jeff VanderMeer"));
        arrBook.add(new BooksModel(R.drawable.acceptance, "Acceptance", "Jeff VanderMeer"));
        arrBook.add(new BooksModel(R.drawable.acceptance, "Acceptance", "Jeff VanderMeer"));
        arrBook.add(new BooksModel(R.drawable.acceptance, "Acceptance", "Jeff VanderMeer"));
        arrBook.add(new BooksModel(R.drawable.acceptance, "Acceptance", "Jeff VanderMeer"));
        arrBook.add(new BooksModel(R.drawable.acceptance, "Acceptance", "Jeff VanderMeer"));
        arrBook.add(new BooksModel(R.drawable.acceptance, "Acceptance", "Jeff VanderMeer"));
    }
}