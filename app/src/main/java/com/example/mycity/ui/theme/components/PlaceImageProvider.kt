
package com.example.mycity.ui.components

object PlaceImageProvider {

    fun getImageName(placeId: Int): String? = when (placeId) {
        1 -> "viavia_jogja"
        2 -> "moikai_coffee"
        3 -> "klinik_kopi"
        4 -> "grhatama_pustaka"
        5 -> "taman_pintar"
        6 -> "museum_sonobudoyo"
        7 -> "perpustakaan_kota"
        8 -> "jogja_library_center"
        9 -> "gembira_loka"
        10 -> "sindu_kusuma"
        11 -> "museum_vredeburg"
        12 -> "museum_affandi"
        13 -> "keraton_yogyakarta"
        14 -> "taman_sari"
        15 -> "museum_kotagede"
        16 -> "puncak_becici"
        17 -> "hutan_pinus"
        18 -> "pantai_parangtritis"
        19 -> "gudeg_yu_djum"
        20 -> "bakmi_mbah_gito"
        21 -> "sate_klathak"
        else -> null
    }
}
