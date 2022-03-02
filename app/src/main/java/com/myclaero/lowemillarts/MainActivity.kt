package com.myclaero.lowemillarts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MainActivity: AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
	}

	internal class StudioRecyclerAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {

		override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
			TODO("Not yet implemented")
		}

		override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
			TODO("Not yet implemented")
		}

		override fun getItemCount(): Int = 0

	}

	internal class StudioHolder(view: View): RecyclerView.ViewHolder(view) {

	}
}