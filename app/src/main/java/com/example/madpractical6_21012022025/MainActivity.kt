package com.example.madpractical6_21012022025

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            val myvideoview=findViewById<VideoView>(R.id.playview)
            val mybuttonview=findViewById<FloatingActionButton>(R.id.playbtn1)

            val mediaController=MediaController(this)
            val uri:Uri=Uri.parse(("android.resource://"+packageName+"/"+R.raw.thestoryoflight))
            myvideoview.setMediaController((mediaController))
            mediaController.setAnchorView((myvideoview))
            myvideoview.setVideoURI(uri)
            myvideoview.requestFocus()
            myvideoview.start()

            mybuttonview.setOnClickListener{
                Intent(this,YouTubeActivity::class.java).apply {
                    startActivity(this)
                }
            }
    }
}