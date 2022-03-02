package com.myclaero.lowemillarts

import android.app.Application
import com.parse.Parse

class App: Application() {

	override fun onCreate() {
		super.onCreate()

		val config = Parse.Configuration.Builder(this)
			.applicationId("LoweMillDev")
			.clientKey("LOWEMILLDEVKEY")
			.server("http://localhost:1337/parse/")
			.build()
		Parse.initialize(config)
	}
}