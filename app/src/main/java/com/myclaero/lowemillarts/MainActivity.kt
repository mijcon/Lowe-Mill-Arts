package com.myclaero.lowemillarts

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.parse.ParseException
import com.parse.ParseObject
import com.parse.ParseQuery

class MainActivity: AppCompatActivity() {

	private var adapter = StudioRecyclerAdapter()

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		ParseQuery.getQuery<ParseObject>("Studio").findInBackground { studios, e ->

			var studioList = studios

			// adapter.studioList = studios

			// adapter.notifyDataSetChanged()
		}

	}

	private class StudioRecyclerAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {

		var studioList: MutableList<String> = mutableListOf("")

		override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
			return StudioHolder(LayoutInflater.from(parent.context).inflate(R.layout.view_studio_list, parent, false))
		}

		override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

		}

		override fun getItemCount() = studioList.count()
	}

	private class StudioHolder(view: View): RecyclerView.ViewHolder(view) {
		val textTitle: TextView = view.findViewById(R.id.textTitle)
		val textDescription: TextView = view.findViewById(R.id.textDescription)
		val imageThumb: ImageView = view.findViewById(R.id.textCategories)
		val textCategories: TextView = view.findViewById(R.id.imageThumb)
	}

}