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
        arrBook.add(new BooksModel(R.drawable.authority, "Authority", "Jeff VanderMeer"));
        arrBook.add(new BooksModel(R.drawable.book_of_strange_new_things, "The Book of Strange New Things", "Michel Faber"));
        arrBook.add(new BooksModel(R.drawable.closing_time, "Closing Time", "Joe Queenan"));
        arrBook.add(new BooksModel(R.drawable.dangerous_frames, "Dangerous Frames", "Nicholas J. G. Winter"));
        arrBook.add(new BooksModel(R.drawable.harry_potter, "Harry Potter and the Deathly Hallows", "J.K Rowling"));
        arrBook.add(new BooksModel(R.drawable.how_to_live, "How to Live", "Sarah Bakewell"));
        arrBook.add(new BooksModel(R.drawable.indecision_2, "Indecision", "Benjamin Kunkel"));
        arrBook.add(new BooksModel(R.drawable.lost_decades, "Lost Decades: The Making of America's Debt Crisis and the Long Recovery", "Jeffry Frieden and Menzie Chinn"));
        arrBook.add(new BooksModel(R.drawable.no_longer_human, "No Longer Human", "Osamu Dazai"));
        arrBook.add(new BooksModel(R.drawable.nova, "Nova", "Samuel R. Delany"));
        arrBook.add(new BooksModel(R.drawable.panic, "Panic: The Story of Modern Financial Insanity", "Michael Lewis"));
        arrBook.add(new BooksModel(R.drawable.the_last_skin, "The Last Skin", "Barbara Ras"));
        arrBook.add(new BooksModel(R.drawable.the_psychopath_test, "The Psychopath Test", "Jon Ronson"));
        arrBook.add(new BooksModel(R.drawable.the_spys_son, "The Spy's Son", "Bryan Denson"));
        arrBook.add(new BooksModel(R.drawable.wall_street, "Wall Street: America's Dream Palace", "Steve Fraser"));
        arrBook.add(new BooksModel(R.drawable.you_shall_know_them, "You Shall Know Them", "Vercors"));


    }
}