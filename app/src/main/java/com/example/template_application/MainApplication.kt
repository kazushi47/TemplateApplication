package com.example.template_application

import android.app.Application

/**
 * MainApplication は、アプリケーションの状態を維持するための基本クラス。
 *
 * このクラスの完全修飾名を `AndroidManifest.xml` の `<application>` タグの `android：name` 属性として指定することで、独自の実装を提供できます。
 *
 * アプリケーション/パッケージのプロセスが作成されるときに、他のクラスの前にインスタンス化されます。
 *
 * @author Lambdasigns株式会社　杉谷一祝
 * @since 1.0
 */
class MainApplication : Application() {

    /**
     * [MainApplication] のライフサイクルにおいて、生成時の最初に呼ばれる。
     */
    override fun onCreate() {
        super.onCreate()
    }
}