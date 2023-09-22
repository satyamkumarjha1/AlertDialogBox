package com.example.alertdialogbox;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        AlertDialog alertDialog = new AlertDialog.Builder(this).create();

        alertDialog.setTitle("Terms and Condition");
        alertDialog.setIcon(R.drawable.info_24);
        alertDialog.setMessage("Have you read all the T & C");


        alertDialog.setButton(DialogInterface.BUTTON_POSITIVE, "Yes i've Read ",new  DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialogInterface, int i){
            Toast.makeText(MainActivity.this, "Yes, you can procced now..", Toast.LENGTH_SHORT).show();
            }
        });
        alertDialog.show();

         */



        AlertDialog.Builder delDialog = new AlertDialog.Builder(MainActivity.this);
        delDialog.setTitle("Delete?");
        delDialog.setIcon(R.drawable.delete_24);
        delDialog.setMessage("Are you sure you want to delete?");

        delDialog.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                //for Yes
                Toast.makeText(MainActivity.this, "Item Deleted", Toast.LENGTH_SHORT).show();
            }
        });

        delDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                // for No
                Toast.makeText(MainActivity.this, "Item Not Deleted.", Toast.LENGTH_SHORT).show();
            }
        });
        delDialog.show();

    }

    @Override
    public void onBackPressed() {

        AlertDialog.Builder exitDialog = new AlertDialog.Builder(this);
        exitDialog.setTitle("Exit?");
        exitDialog.setIcon(R.drawable.exit_to_app_24);
        exitDialog.setMessage("Are you sure want to delete");

        exitDialog.setPositiveButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(MainActivity.this, "Welcome Back!", Toast.LENGTH_SHORT).show();
            }
        });
        exitDialog.setNegativeButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                MainActivity.super.onBackPressed();
            }
        });

        exitDialog.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(MainActivity.this, "Operation Cancel!", Toast.LENGTH_SHORT).show();
            }
        });
        exitDialog.show();

    }
}
