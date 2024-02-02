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

        arrBook.add(new BooksModel(R.drawable.acceptance, "Acceptance", "By: Jeff VanderMeer"));
        arrBook.add(new BooksModel(R.drawable.authority, "Authority", "By: Jeff VanderMeer"));
        arrBook.add(new BooksModel(R.drawable.book_of_strange_new_things, "The Book of Strange New Things", "By: Michel Faber"));
        arrBook.add(new BooksModel(R.drawable.closing_time, "Closing Time", "By: Joe Queenan"));
        arrBook.add(new BooksModel(R.drawable.dangerous_frames, "Dangerous Frames", "By: Nicholas J. G. Winter"));
        arrBook.add(new BooksModel(R.drawable.harry_potter, "Harry Potter and the Deathly Hallows", "By: J.K Rowling"));
        arrBook.add(new BooksModel(R.drawable.how_to_live, "How to Live", "By: Sarah Bakewell"));
        arrBook.add(new BooksModel(R.drawable.indecision_2, "Indecision", "By: Benjamin Kunkel"));
        arrBook.add(new BooksModel(R.drawable.lost_decades, "Lost Decades: The Making of America's Debt Crisis and the Long Recovery", "By: Jeffry Frieden and Menzie Chinn"));
        arrBook.add(new BooksModel(R.drawable.no_longer_human, "No Longer Human", "By: Osamu Dazai"));
        arrBook.add(new BooksModel(R.drawable.nova, "Nova", "By: Samuel R. Delany"));
        arrBook.add(new BooksModel(R.drawable.panic, "Panic: The Story of Modern Financial Insanity", "By: Michael Lewis"));
        arrBook.add(new BooksModel(R.drawable.the_last_skin, "The Last Skin", "By: Barbara Ras"));
        arrBook.add(new BooksModel(R.drawable.the_psychopath_test, "The Psychopath Test", "By: Jon Ronson"));
        arrBook.add(new BooksModel(R.drawable.the_spys_son, "The Spy's Son", "By: Bryan Denson"));
        arrBook.add(new BooksModel(R.drawable.wall_street, "Wall Street: America's Dream Palace", "By: Steve Fraser"));
        arrBook.add(new BooksModel(R.drawable.you_shall_know_them, "You Shall Know Them", "By: Vercors"));

        RecyclerBookAdapter adapter = new RecyclerBookAdapter(this, arrBook);
        recyclerView.setAdapter(adapter);
    }
}