package com.example.template_application

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.template_application.databinding.ActivityMainBinding

/**
 * MainActivity は、アプリケーションが起動したときに最初に呼ばれる [AppCompatActivity] が元のアクティビティ。
 *
 * @author Lambdasigns株式会社　杉谷一祝
 * @since 1.0
 */
class MainActivity : AppCompatActivity() {

    /** バインディング（初期化は [onCreate] で行う。） */
    private lateinit var binding: ActivityMainBinding

    /**
     * [AppCompatActivity] のライフサイクルにおいて、生成時の最初に呼ばれる。
     *
     * このタイミングで次の処理を行う。
     *
     * - [binding] の初期化
     * - ナビゲーションコントローラから最初のフラグメントの起動
     * - アプリバーの設定
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // binding を初期化する。
        // binding を使用して当アクティビティのレイアウトをセットし、必要な部品を準備する。
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val navView: BottomNavigationView = binding.bottomNav

        // ナビゲーションコントローラを取得する。
        // supportFragmentManager から取得しないといけない（binding からは取得不可）。
        val navController = (supportFragmentManager.findFragmentById(R.id.nav_host) as NavHostFragment).navController

        // アプリバーの設定とナビゲーションコントローラのセットを行う。
        // アプリバーのアイコンが選択されたときの対応するメニューの項目をセットしておく。
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_current_meetings, R.id.navigation_booking, R.id.navigation_histories, R.id.navigation_others
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }
}