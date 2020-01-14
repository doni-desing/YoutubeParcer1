package com.example.youtubeparcer.utils
import android.app.Application
import androidx.room.Room
import com.example.youtubeparcer.db.AppDataBase
class App : Application() {
    companion object{
        lateinit var database: AppDataBase
        lateinit var instance: App
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        database = Room.databaseBuilder(this, AppDataBase::class.java, "database")
            .build()
    }
    fun getInstance():App{
        return instance
    }
    fun getDatabase(): AppDataBase {
        return database
    }
}