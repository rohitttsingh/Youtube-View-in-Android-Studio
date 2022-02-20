package com.module.trialdsaproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class MainActivity extends AppCompatActivity {
    YouTubePlayerView youTubePlayerView,youTubePlayerView2,youTubePlayerView3,youTubePlayerView4,youTubePlayerView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        youTubePlayerView=findViewById(R.id.youtube_player_view);
        youTubePlayerView2=findViewById(R.id.youtube_player_view2);
        youTubePlayerView3=findViewById(R.id.youtube_player_view3);
        youTubePlayerView4=findViewById(R.id.youtube_player_view4);
        youTubePlayerView5=findViewById(R.id.youtube_player_view5);



        getLifecycle().addObserver(youTubePlayerView);
        getLifecycle().addObserver(youTubePlayerView2);
        getLifecycle().addObserver(youTubePlayerView3);
        getLifecycle().addObserver(youTubePlayerView4);
        getLifecycle().addObserver(youTubePlayerView5);



        youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                String videoId = "vgSKOMsjLbc";
                youTubePlayer.loadVideo(videoId,0);
            }
        });

        youTubePlayerView2.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                String videoId = "ocF7u-OrF24";
                youTubePlayer.loadVideo(videoId, 0);
            }
        });

        youTubePlayerView3.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                String videoId = "5_5oE5lgrhw";
                youTubePlayer.loadVideo(videoId, 0);
            }
        });

        youTubePlayerView4.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                String videoId = "STL8ESuETmM";
                youTubePlayer.loadVideo(videoId, 0);
            }
        });

        youTubePlayerView5.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                String videoId = "o9WevKSnHL4";
                youTubePlayer.loadVideo(videoId, 0);
            }
        });


    }
}