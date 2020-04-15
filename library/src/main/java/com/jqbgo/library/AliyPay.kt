package com.jqbgo.library

import android.app.Activity
import android.content.Context
import android.widget.Toast
import com.alipay.sdk.app.PayTask


class AliyPay{

      fun startToPay(context: Context,url:String){
          Thread{
              var aliyPay= PayTask(context as Activity)
              var result=aliyPay.payV2(url,true)
              Toast.makeText(context,result.toString(),Toast.LENGTH_SHORT).show()
          }.start()
      }
}