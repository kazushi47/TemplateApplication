package com.example.template_application.ui.booking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.template_application.databinding.FragmentBookingBinding

/**
 * BookingFragment は、アプリバーのメニューより `予約` が選択されたときに表示される画面の [Fragment] である。
 *
 * @author Lambdasigns株式会社　杉谷一祝
 * @since 1.0
 */
class BookingFragment : Fragment() {

    /** このフラグメント用の ViewModel （初期化は [onCreateView] で行う。） */
    private lateinit var bookingViewModel: BookingViewModel

    /** バインディング（初期化は [onCreateView] で行う。）*/
    private lateinit var binding: FragmentBookingBinding

    /**
     * このフラグメントが生成されるとき最初に呼ばれる。
     *
     * このタイミングで次の処理を行う。
     *
     * - [bookingViewModel] の初期化
     * - [binding] の初期化
     * - `textDashboard` の設定
     */
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // bookingViewModel を初期化する。
        bookingViewModel = ViewModelProvider(this).get(BookingViewModel::class.java)

        // bindingを初期化する。
        binding = FragmentBookingBinding.inflate(inflater, container, false)

        // bookingViewModel インスタンスを レイアウトの viewModel に設定
        binding.bookingViewModel = bookingViewModel

        // ライフサイクルオーナーを設定
        binding.lifecycleOwner = viewLifecycleOwner

        return binding.root
    }
}