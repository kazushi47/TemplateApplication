package com.example.template_application.ui.current_meetings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.template_application.databinding.FragmentCurrentMeetingsBinding

/**
 * CurrentMeetingsFragment は、アプリバーのメニューより `会議中` が選択されたときに表示される画面の [Fragment] である。
 *
 * @author Lambdasigns株式会社　杉谷一祝
 * @since 1.0
 */
class CurrentMeetingsFragment : Fragment() {

    /** このフラグメント用の ViewModel （初期化は [onCreateView] で行う。） */
    private lateinit var currentMeetingsViewModel: CurrentMeetingsViewModel

    /** バインディング（初期化は [onCreateView] で行う。）*/
    private lateinit var binding: FragmentCurrentMeetingsBinding

    /**
     * このフラグメントが生成されるとき最初に呼ばれる。
     *
     * このタイミングで次の処理を行う。
     *
     * - [currentMeetingsViewModel] の初期化
     * - [binding] の初期化
     * - `textDashboard` の設定
     */
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // currentMeetingsViewModel を初期化する。
        currentMeetingsViewModel = ViewModelProvider(this).get(CurrentMeetingsViewModel::class.java)

        // bindingを初期化する。
        binding = FragmentCurrentMeetingsBinding.inflate(inflater, container, false)

        // currentMeetingsViewModel インスタンスを レイアウトの viewModel に設定
        binding.currentMeetingsViewModel = currentMeetingsViewModel

        // ライフサイクルオーナーを設定
        binding.lifecycleOwner = viewLifecycleOwner

        return binding.root
    }
}