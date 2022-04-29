package com.example.graphic_quest;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class Musik  extends Service{
    MediaPlayer player;

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        player = MediaPlayer.create(this, R.raw.musi_by_fon);
        player.setVolume(5,5);
        player.setLooping(true);

    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        player.start();
        return Service.START_NOT_STICKY;
    }

    public void onDestroy() {

        player.stop();
        player.release();
        stopSelf();
        super.onDestroy();
    }
}

