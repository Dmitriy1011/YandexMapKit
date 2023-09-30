package ru.testapp.yandexmaps

import android.app.Application
import com.yandex.mapkit.MapKitFactory

class YandexApp : Application() {
    override fun onCreate() {
        super.onCreate()
        MapKitFactory.setApiKey("ece0a5c2-8cbf-4417-82b4-0aecc22f148d")
    }
}