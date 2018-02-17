package com.example.logonrm.intentservice

import android.app.IntentService
import android.content.Intent
import android.os.Bundle
import android.support.v4.os.ResultReceiver
import android.text.TextUtils

/**
 * Created by logonrm on 17/02/2018.
 */
class DownloadService : IntentService(DownloadService::class.java.name) {

    companion object{
        val STATUS_RUNNING = 0
        val STATUS_FINISHED = 1
        val STATUS_ERROR = 2
    }

    override fun onHandleIntent(intent: Intent?) {

        val receiver = intent!!.getParcelableArrayExtra<ResultReceiver>("receiver")
        val url = intent.getStringExtra("url")
        val bundle = Bundle()
        if(!TextUtils.isEmpty(url)){
        /*Atualiza a UI: Download Service rodando */
        receiver.send(STATUS_RUNNING,Bundle.EMPTY)

    }


}