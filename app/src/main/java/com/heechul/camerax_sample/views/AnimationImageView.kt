package com.heechul.camerax_sample.views

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.view.animation.Animation
import com.heechul.camerax_sample.R

class AnimationImageView : androidx.appcompat.widget.AppCompatImageView {
    private var mAnimation: Animation? = null
    private var mContext: Context

    constructor(context: Context) : super(context) {
        mContext = context
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        mContext = context
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        mContext = context
    }

    fun setmAnimation(mAnimation: Animation?) {
        this.mAnimation = mAnimation
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    fun startFocusing() {
        this.visibility = VISIBLE
        startAnimation(mAnimation)
        this.setBackgroundResource(R.drawable.focus)
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    fun focusSuccess() {
        this.visibility = VISIBLE
        this.setBackgroundResource(R.drawable.focus_succeed)
    }

    fun stopFocus() {
        this.visibility = INVISIBLE
    }
}