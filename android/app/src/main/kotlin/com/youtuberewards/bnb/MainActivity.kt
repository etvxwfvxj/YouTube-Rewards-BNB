package com.youtuberewards.bnb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.runtime.getValue
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.youtuberewards.bnb.ui.navigation.NavGraph
import com.youtuberewards.bnb.ui.theme.YouTubeRewardsBNBTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            YouTubeRewardsBNBTheme {
                Surface {
                    NavGraph()
                }
            }
        }
    }
}
