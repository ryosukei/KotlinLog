package jp.techacademy.ryosuke.aono.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("kotlintest", "ログへの出力テスト")

        var dog = Dog("ぽち",3)

        dog.say()
        Log.d("kotlintest", "犬の名前は" + dog.name + "です。")
        Log.d("kotlintest", "犬の年齢は" + dog.age + "歳です。")

        var bigdog = BigDog("ヨーゼフ",15)
        bigdog.say()
        Log.d("kotlintest", "犬の名前は" + bigdog.name + "です。")
        Log.d("kotlintest", "犬の年齢は" + bigdog.age + "歳です。")

        var person1 = Human("テストくん",22,"野球")
        var person2 = Human("テストちゃん",22,"サッカー")

        person1.say()
        person1.think()
        person2.say()
        person2.think()
    }
}