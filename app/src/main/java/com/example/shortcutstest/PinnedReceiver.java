package com.example.shortcutstest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * @description: 固定快捷方式成功广播
 * @author: zhukai
 * @date: 2019/5/3 20:05
 */
public class PinnedReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "固定快捷方式成功", Toast.LENGTH_SHORT).show();
    }
}
