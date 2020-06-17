package com.example.azkar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class page_two extends AppCompatActivity {
RecyclerView recyclerView;
adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_two);

        String [] x= getIntent().getStringArrayExtra("data");
        int [] y = getIntent().getIntArrayExtra("strings");

        List<String>btns=new ArrayList<>();
        List<Integer>t=new ArrayList<>();
        for(int i = 0;i<y.length;i++){
            Log.e("write",y[i]+"");
            t.add(y[i]);
        }
        Log.e("read",x.length+"");
        for(int i = 0;i<x.length;i++){
            Log.e("write",x[i]+"");
            btns.add(x[i]);
        }
        recyclerView = findViewById(R.id.rec);
       // idates.add(new data( "اولا : تجريدُ الميِّتِ مِن ثيابِه\n يُسَنُّ تجريدُ الميِّتِ من ثيابِه،وهو مذهَبُ الجمهورِ \n : الحَنفيَّة والمالِكيَّة والحَنابِلَة  \n الأدلَّة:\n أوَّلًا: من السُّنَّة\n عن عائشةَ رَضِيَ اللَّهُ عنها، قالت: ((لَمَّا أرادوا غُسلَ النبيِّ صلَّى الله عليه وسلَّم، قالوا: واللهِ ما ندري: أَنُجَرِّدُ رسولَ الله صلَّى الله عليه وسلَّم من ثيابِه كما نُجَرِّدُ موتانا، أم نُغَسِّلُه وعليه ثيابُه؟)) .\n وَجهُ الدَّلالةِ:\n دلَّ قولُهم: أَنُجَرِّدُ رسولَ الله صلَّى الله عليه وسلَّم مِن ثيابِه كما نُجَرِّدُ موتانا؛ أنَّ عادتَهم كانت تجريدَ موتاهم للغُسلِ في زَمَنِه صلَّى الله عليه وسلَّم \n "));
        adapter = new adapter(btns,this,t);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}
