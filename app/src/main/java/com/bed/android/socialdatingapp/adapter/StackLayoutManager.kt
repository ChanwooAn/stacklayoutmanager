package com.bed.android.socialdatingapp.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class StackLayoutManager : RecyclerView.LayoutManager() {
    override fun generateDefaultLayoutParams(): RecyclerView.LayoutParams {
        return RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT)
    }

}