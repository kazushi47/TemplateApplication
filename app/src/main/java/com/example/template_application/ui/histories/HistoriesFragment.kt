package com.example.template_application.ui.histories

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.template_application.databinding.FragmentHistoriesBinding

/**
 * HistoriesFragment は、アプリバーのメニューより `履歴` が選択されたときに表示される画面の [Fragment] である。
 *
 * @author Lambdasigns株式会社　杉谷一祝
 * @since 1.0
 */
class HistoriesFragment : Fragment() {

    /** このフラグメント用の ViewModel （初期化は [onCreateView] で行う。） */
    private lateinit var historiesViewModel: HistoriesViewModel

    /** バインディング（初期化は [onCreateView] で行う。）*/
    private lateinit var binding: FragmentHistoriesBinding

    /**
     * このフラグメントが生成されるとき最初に呼ばれる。
     *
     * このタイミングで次の処理を行う。
     *
     * - [historiesViewModel] の初期化
     * - [binding] の初期化
     * - `textDashboard` の設定
     */
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // historiesViewModel を初期化する。
        historiesViewModel = ViewModelProvider(this).get(HistoriesViewModel::class.java)

        // bindingを初期化する。
        binding = FragmentHistoriesBinding.inflate(inflater, container, false)

        // historiesViewModel インスタンスを レイアウトの viewModel に設定
        binding.historiesViewModel = historiesViewModel

        // ライフサイクルオーナーを設定
        binding.lifecycleOwner = viewLifecycleOwner

        return binding.root
    }
}