package com.example.template_application.ui.others

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.template_application.databinding.FragmentOthersBinding

/**
 * OthersFragment は、アプリバーのメニューより `その他` が選択されたときに表示される画面の [Fragment] である。
 *
 * @author Lambdasigns株式会社　杉谷一祝
 * @since 1.0
 */
class OthersFragment : Fragment() {

    /** このフラグメント用の ViewModel （初期化は [onCreateView] で行う。） */
    private lateinit var othersViewModel: OthersViewModel

    /** バインディング（初期化は [onCreateView] で行う。）*/
    private lateinit var binding: FragmentOthersBinding

    /**
     * このフラグメントが生成されるとき最初に呼ばれる。
     *
     * このタイミングで次の処理を行う。
     *
     * - [othersViewModel] の初期化
     * - [binding] の初期化
     * - `textDashboard` の設定
     */
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // othersViewModel を初期化する。
        othersViewModel = ViewModelProvider(this).get(OthersViewModel::class.java)

        // bindingを初期化する。
        binding = FragmentOthersBinding.inflate(inflater, container, false)

        // othersViewModel インスタンスを レイアウトの viewModel に設定
        binding.othersViewModel = othersViewModel

        // ライフサイクルオーナーを設定
        binding.lifecycleOwner = viewLifecycleOwner

        return binding.root
    }
}