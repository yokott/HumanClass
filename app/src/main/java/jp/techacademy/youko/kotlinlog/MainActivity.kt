package jp.techacademy.youko.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val daughter = Human("ゆいな",8,"チア")
        daughter.say()
        daughter.think()

        val son = Human("ゆうき",6,"野球")
        son.say()
        son.think()

    }
}
