package ai.elimu.learndigits.ui.game

import android.content.Context
import android.content.res.AssetManager
import android.os.Vibrator
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class GameViewModelFactory(
    private val assetManager: AssetManager,
    private val vibrator: Vibrator,
    private val context: Context
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(GameViewModel::class.java)) {
            return GameViewModel(assetManager, vibrator, context) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}