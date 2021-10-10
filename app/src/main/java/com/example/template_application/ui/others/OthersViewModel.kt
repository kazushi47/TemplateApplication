package com.example.template_application.ui.others

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * [OthersFragment] 用の [ViewModel] 。
 *
 * @author Lambdasigns株式会社　杉谷一祝
 * @since 1.0
 */
class OthersViewModel : ViewModel() {

    /** textDashboard のテキスト */
    val text: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

    // 初期値を設定
    init {
        text.value = "This is dashboard Fragment"
    }

    /**
     * [text] のテキストを `This is changed!` に変更する。
     */
    fun changeText() {
        text.value = "This is changed!"
    }
}