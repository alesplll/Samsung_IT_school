package ru.samsung.itschool.mdev.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText objectA, objectB, objectC;
    public TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void solve(View view) {
        double a = Double.parseDouble( ((EditText)
                findViewById(R.id.a)).getText().toString());
        double b = Double.parseDouble( ((EditText)
                findViewById(R.id.b)).getText().toString());
        double c = Double.parseDouble( ((EditText)
                findViewById(R.id.c)).getText().toString());
        TextView res = findViewById(R.id.res);

        double discriminant = b * b - 4 * a * c;
        if(a==0 && b==0 && c==0){
            res.setText("any");
        } else if(a==0){
            double root = -c/b;
            if(root==-0.0){root=0.0;}
            res.setText(""+root);
        } else if (a!=0 && discriminant > 0) {
            double root1 = ((-b + Math.sqrt(discriminant)) / (2 * a));
            double root2 = ((-b - Math.sqrt(discriminant)) / (2 * a));
            if(root1==-0.0){root1=0.0;}
            if(root2==-0.0){root2=0.0;}
            res.setText(root1 + " " + root2);

        } else if (discriminant == 0) {
            double root = (-b / (2 * a));
            if(root==-0.0){root=0.0;}
            res.setText(""+root);
            System.out.println("Discr ===0");

        } else {
            res.setText("none");
        }
    }


}