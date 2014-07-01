package com.kursadaydin.animasyon;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button btnScale, btnRotate,btnAlpha, btnTranslate, btnAllofThem;
       	btnScale = (Button) findViewById(R.id.btnScale);
        btnRotate = (Button) findViewById(R.id.btnRotate);
        btnAlpha = (Button) findViewById(R.id.btnAlpha);
        btnTranslate = (Button) findViewById(R.id.btnTranslate);
        btnAllofThem = (Button) findViewById(R.id.btnAllofThem);    
        
        btnScale.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Animation anim_scale = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_scale);
				ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);
				imageView1.startAnimation(anim_scale);
			}
		});
        
        btnRotate.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Animation anim_rotate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_rotate);
				ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);
				imageView1.startAnimation(anim_rotate);
			}
		});
        
        btnAlpha.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Animation anim_alpha = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_alpha);
				ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);
				imageView1.startAnimation(anim_alpha);
				
			}
		});
        
        btnTranslate.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Animation anim_translate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_translate);
				ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);
				imageView1.startAnimation(anim_translate);
				
			}
		});
        
        
        btnAllofThem.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				AnimationSet animasyonGrubu = new AnimationSet(false);
				Animation anim_scale = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_scale);
				Animation anim_rotate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_rotate);
				Animation anim_alpha = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_alpha);
				Animation anim_translate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_translate);
				
				animasyonGrubu.addAnimation(anim_scale);
				animasyonGrubu.addAnimation(anim_rotate);
				animasyonGrubu.addAnimation(anim_alpha);
			//	animasyonGrubu.addAnimation(anim_translate);
				
				ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);
				imageView1.startAnimation(animasyonGrubu);
			}
		});
    }

	
	
	
		
	}



