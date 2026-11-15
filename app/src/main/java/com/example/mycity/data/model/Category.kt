package com.example.mycity.data.model

enum class Category(
    val displayName: String,
    val description: String
) {
    CAFE(
        displayName = "Kafe",
        description = "Rekomendasi tempat menikmati kopi, makanan, dan suasana nyaman."
    ),
    LIBRARY(
        displayName = "Perpustakaan",
        description = "Tempat membaca, belajar, dan menemukan berbagai koleksi buku."
    ),
    RECREATION_PARK(
        displayName = "Taman Rekreasi",
        description = "Tempat bersantai, bermain, dan menikmati waktu bersama keluarga."
    ),
    MUSEUM(
        displayName = "Museum",
        description = "Tempat mengenal sejarah, budaya, dan karya seni Yogyakarta."
    ),
    HISTORICAL_SITE(
        displayName = "Wisata Sejarah",
        description = "Tempat bersejarah yang menjadi bagian dari identitas Yogyakarta."
    ),
    NATURE(
        displayName = "Wisata Alam",
        description = "Tempat menikmati pemandangan dan keindahan alam Yogyakarta."
    ),
    CULINARY(
        displayName = "Kuliner",
        description = "Rekomendasi makanan dan minuman khas yang dapat dinikmati di Yogyakarta."
    )
}