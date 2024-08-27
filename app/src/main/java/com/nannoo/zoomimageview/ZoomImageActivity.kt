package com.nannoo.zoomimageview

import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.nannoo.zoomimageview.databinding.ActivityZoomImageBinding

class ZoomImageActivity : AppCompatActivity() {

    private lateinit var binding: ActivityZoomImageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityZoomImageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (isBitmap) {
            try {
//                binding.ivImage.setImageBitmap(mBitmap)
            } catch (_: Exception) {

            }
        } else {
//            Glide.with(this)
//                .load(imageUrl)
//                .placeholder(R.drawable.ic_launcher_background)
//                .error(R.drawable.ic_launcher_background)
//                .into(binding.ivImage)
        }

        binding.ivBtnClose.setOnClickListener {
            this.finish()
        }

    }

    companion object {

        var imageUrl = ""
        var mBitmap: Bitmap? = null
        var isBitmap = false

        fun newIntent(context: Context, url: String = ""): Intent {
            imageUrl = url
            isBitmap = false
            return Intent(context, ZoomImageActivity::class.java)
        }

//        fun newIntentBitmap(context: Context, bitmap: Bitmap): Intent {
//            mBitmap = bitmap
//            isBitmap = true
//            return Intent(context, ZoomImageActivity::class.java)
//        }

    }

}