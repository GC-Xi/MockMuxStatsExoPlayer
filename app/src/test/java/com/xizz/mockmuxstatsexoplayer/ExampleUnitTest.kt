package com.xizz.mockmuxstatsexoplayer

import com.google.android.exoplayer2.SimpleExoPlayer
import com.mux.stats.sdk.muxstats.MuxStatsExoPlayer
import io.mockk.mockk
import org.junit.Test

class ExampleUnitTest {
    @Test
    fun test() {
        val simpleExoPlayer = mockk<SimpleExoPlayer>(relaxed = true)
        val muxStatsExoPlayer = mockk<MuxStatsExoPlayer>(relaxed = true)
    }
}