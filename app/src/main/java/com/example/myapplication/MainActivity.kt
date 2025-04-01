package com.example.myapplication

import android.app.ActivityManager
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.KeyEvent
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            val am = getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
            if (am.lockTaskModeState == ActivityManager.LOCK_TASK_MODE_NONE) {
                startLockTask()
            }
        }

        val launchIntent = Intent()
        launchIntent.component = ComponentName(
            "io.aiscreen.player.twa",
            "io.aiscreen.player.twa.MainActivity" // заменим, если активити другое
        )
        launchIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(launchIntent)

        finish()
    }

    override fun onBackPressed() {
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        return true
    }

    override fun onUserLeaveHint() {
    }
}
