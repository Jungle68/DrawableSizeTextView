package com.jungle68.drawablesizetextview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;

public class MainActivity extends AppCompatActivity {
    private String mUrl = "https://ss0.baidu.com/7Po3dSag_xI4khGko9WTAnF6hhy/image/h%3D360/sign=e6bd967ff203738dc14a0a248319b073/08f790529822720e534f0b257fcb0a46f31fab68.jpg";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Glide.with(this)
                .load(mUrl)
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(new SimpleTarget<GlideDrawable>() {
                    @Override
                    public void onResourceReady(GlideDrawable resource, GlideAnimation<? super GlideDrawable> glideAnimation) {
                        resource.setBounds(0, 0, resource.getIntrinsicWidth(), resource.getIntrinsicHeight());
                        ((TextView) findViewById(R.id.dtv_net)).setCompoundDrawables(resource, null, null, null);
                    }
                });
        Glide.with(this)
                .load(mUrl)
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(new SimpleTarget<GlideDrawable>() {
                    @Override
                    public void onResourceReady(GlideDrawable resource, GlideAnimation<? super GlideDrawable> glideAnimation) {
                        int headIconWidth = 200;
                        resource.setBounds(0, 0,headIconWidth, headIconWidth); // confirm the drawable size to show
                        ((TextView) findViewById(R.id.dtv_net2)).setCompoundDrawables(resource, null, null, null);
                    }
                });
    }
}
