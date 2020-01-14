package com.example.youtubeparcer.utils

import android.app.DownloadManager
import android.content.Context
import android.net.Uri
import android.os.Environment
import android.provider.ContactsContract

class DownloadMaster {
    fun downloadFile(context: Context, url: String, ext: String?, fileName: String?
    ) {
        var request: DownloadManager.Request =
            DownloadManager.Request(Uri.parse(url))
                .setTitle("$fileName.$ext") // Title of the Download Notification
                .setDescription("Downloading") // Description of the Download Notification
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE) // Visibility of the download Notification
                .setAllowedOverMetered(true) // Set if download is allowed on Mobile network
                .setAllowedOverRoaming(true)
                .setDestinationInExternalPublicDir("/folder", "FileName.extension")
                .setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, fileName)
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_MOBILE or DownloadManager.Request.NETWORK_WIFI)



        val downloadManager: DownloadManager = context.getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
        downloadManager.enqueue(request)
    }

}