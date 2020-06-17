package com.example.azkar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class one extends AppCompatActivity {
Button one;
Button two;
Button there;
Button fife;
Button six;
Button sifen;
Button ate;
Button naine;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.one);
        final String [] item ={"تجريدُ الميِّتِ مِن ثيابِه","سَتْرُ عورةِ المَيِّت","عَصْرُ بَطْنِ الميِّت","نيَّة الغُسلِ","مَسْحُ أسنانِ المَيِّت \nومِنْخَريه وتنظيفُهما","تَوضِئَةُ الميِّت","غُسلُ الميِّت بالسِّدْر","غَسْلُ جميعِ بَدَنِ \nالمَيِّتِ والتيامُن فيه\n","التيامُنُ في غُسلِه","وَضْعُ الكافورِ في \n الغَسْلَة الأخيرةِ","الوِتْرُ في غُسلِ الميِّت ","تقليمُ أظْفار \nالمَيِّتِ وقَصُّ شارِبِه","حَلْقُ شَعْرِ \nعانَةِ المَيِّت\n","تنشيفُ المَيِّتِ بعد\n الغُسْل","التيمُّمُ عند العَجْزِ\n عن الماءِ"};
        final String [] item1  ={"الأحكامُ الخاصَّةُ\n بغُسْلِ المرأة","غسلُ الخُنثى المُشْكِل","صفةُ غُسْلِ من\n مات مُحْرِمًا"};
        final int [] itemstrings  ={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        final int [] itemstrings1  ={15,16,17};
        final int[] strings={0};


        //        HashMap<String, List<String>>data=new HashMap<>();
//        List<String>input=new ArrayList<>();
//
//        input.add("No.1");
//        input.add("No.2");
//        input.add("No.3");
//        input.add("No.4");
//
//        data.put(item[0],input);
        naine=findViewById(R.id.naine);
        ate=findViewById(R.id.ate);
        sifen=findViewById(R.id.sifen);
        six=findViewById(R.id.six);
        fife =findViewById(R.id.fife);
        there=findViewById(R.id.there);
        one =findViewById(R.id.one);
        two =findViewById(R.id.two);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent one = new Intent(one.this, page_two.class);
                one.putExtra("data", item);
                one.putExtra("strings",itemstrings);
                startActivity(one);
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent two = new Intent(one.this, page_two.class);
                two.putExtra("data",item1);
                two.putExtra("strings",itemstrings1);
                startActivity(two);
            }
        });


        there.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent there = new Intent(com.example.azkar.one.this,three.class);

                there.putExtra("data1",18);
                startActivity(there);
            }
        });


        fife.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fife = new Intent(com.example.azkar.one.this,three.class);

                fife.putExtra("data1",19);
                startActivity(fife);
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent six = new Intent(com.example.azkar.one.this,three.class);

                six.putExtra("data1",20);
                startActivity(six);
            }
        });


        sifen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sifen = new Intent(com.example.azkar.one.this,three.class);

                sifen.putExtra("data1",21);
                startActivity(sifen);
            }
        });

        ate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ate = new Intent(com.example.azkar.one.this,three.class);

                ate.putExtra("data1",22);
                startActivity(ate);
            }
        });

        naine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent naine = new Intent(com.example.azkar.one.this,three.class);

                naine.putExtra("data1",23);
                startActivity(naine);
            }
        });




    }
}
