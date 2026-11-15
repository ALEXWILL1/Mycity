package com.example.mycity.data.source

import com.example.mycity.data.model.Category
import com.example.mycity.data.model.MenuItem
import com.example.mycity.data.model.Place

object LocalPlaceDataSource : PlaceDataSource {

    private val places = listOf(
        Place(
            id = 1,
            category = Category.CAFE,
            name = "ViaVia Jogja",
            shortDescription = "Kafe dan restoran di kawasan Prawirotaman.",
            description = "ViaVia Jogja menawarkan makanan Indonesia dan internasional, termasuk pilihan vegetarian dan vegan. Tempat ini cocok untuk makan, bersantai, dan berkumpul.",
            address = "Jl. Prawirotaman No. 30, Brontokusuman, Mergangsan, Kota Yogyakarta",
            openingHours = "Setiap hari, 09.00–22.00 WIB",
            priceInformation = "Menu makanan sekitar Rp40.000–Rp110.000, belum termasuk pajak.",
            menuItems = listOf(
                MenuItem(
                    name = "Vegan Garang Asem",
                    price = 40_000
                ),
                MenuItem(
                    name = "Garang Asem Ayam",
                    price = 60_000
                ),
                MenuItem(
                    name = "Nasi Campur ViaVia",
                    price = 70_000
                )
            ),
            facilities = listOf(
                "Pilihan vegetarian",
                "Pilihan vegan",
                "Area makan",
                "Informasi wisata"
            ),
            latitude = -7.8186,
            longitude = 110.3688
        ),
        Place(
            id = 2,
            category = Category.CAFE,
            name = "Moikai Coffee CDT",
            shortDescription = "Kedai kopi bergaya Japanese vintage di Jalan Cik Di Tiro.",
            description = "Moikai Coffee CDT menempati rumah bernuansa heritage dan menyediakan kopi, makanan, serta tempat untuk bersantai atau berkumpul.",
            address = "Jl. Cik Di Tiro No. 27, Terban, Gondokusuman, Kota Yogyakarta",
            openingHours = "Setiap hari, 07.00–22.00 WIB",
            priceInformation = "Promo kopi pagi mulai Rp15.000. Harga reguler mengikuti menu yang tersedia.",
            menuItems = listOf(
                MenuItem(
                    name = "Americano Promo Pagi",
                    price = 15_000
                ),
                MenuItem(
                    name = "Latte Promo Pagi",
                    price = 15_000
                ),
                MenuItem(
                    name = "Cappuccino Promo Pagi",
                    price = 15_000
                )
            ),
            facilities = listOf(
                "Area duduk",
                "Makanan dan minuman",
                "Reservasi rombongan"
            ),
            latitude = -7.7777986,
            longitude = 110.3756152
        ),
        Place(
            id = 3,
            category = Category.CAFE,
            name = "Klinik Kopi",
            shortDescription = "Tempat menikmati manual brew dan mengenal kopi Indonesia.",
            description = "Klinik Kopi dikenal melalui pengalaman menikmati kopi yang berfokus pada pilihan biji, proses penyeduhan, dan percakapan tentang kopi.",
            address = "Jl. Kaliurang Km 7,5, Sleman, Daerah Istimewa Yogyakarta",
            openingHours = "09.00–16.00 WIB; konfirmasi sebelum berkunjung",
            priceInformation = "Harga menyesuaikan pilihan biji kopi dan metode penyeduhan.",
            facilities = listOf(
                "Manual brew",
                "Diskusi kopi",
                "Area duduk"
            ),
            latitude = -7.737979,
            longitude = 110.3934027
        ),
        Place(
            id = 4,
            category = Category.LIBRARY,
            name = "Grhatama Pustaka",
            shortDescription = "Perpustakaan umum dan ruang literasi masyarakat DIY.",
            description = "Grhatama Pustaka menyediakan koleksi bacaan, layanan peminjaman, ruang anak, ruang mendongeng, dan berbagai kegiatan literasi.",
            address = "Jl. Janti, Banguntapan, Bantul, Daerah Istimewa Yogyakarta",
            openingHours = "Senin–Kamis 08.00–15.30; Jumat 09.00–15.30; Sabtu 08.00–15.30",
            priceInformation = "Layanan perpustakaan gratis, kecuali beberapa fasilitas khusus.",
            facilities = listOf(
                "Ruang baca",
                "Ruang bermain anak",
                "Ruang mendongeng",
                "Ruang musik anak",
                "Koleksi digital"
            ),
            latitude = -7.79954,
            longitude = 110.40701
        ),
        Place(
            id = 5,
            category = Category.RECREATION_PARK,
            name = "Taman Pintar Yogyakarta",
            shortDescription = "Wisata edukasi interaktif untuk anak dan keluarga.",
            description = "Taman Pintar menggabungkan permainan dengan pembelajaran sains, teknologi, budaya, dan kreativitas melalui berbagai zona dan wahana.",
            address = "Jl. Panembahan Senopati No. 1–3, Gondomanan, Kota Yogyakarta",
            openingHours = "Selasa–Minggu, 08.30–16.00 WIB; Senin tutup",
            priceInformation = "Gedung Oval dan Kotak: anak Rp14.000 dan dewasa Rp24.000. Wahana lain memiliki tiket terpisah.",
            facilities = listOf(
                "Gedung Oval dan Kotak",
                "Planetarium",
                "Zona budaya",
                "Playground",
                "Zona air"
            ),
            latitude = -7.8008,
            longitude = 110.3679
        ),
        Place(
            id = 6,
            category = Category.MUSEUM,
            name = "Museum Sonobudoyo",
            shortDescription = "Museum sejarah dan kebudayaan Jawa di pusat Yogyakarta.",
            description = "Museum Sonobudoyo menyimpan dan memamerkan koleksi sejarah, seni, serta kebudayaan Jawa. Lokasinya berada dekat kawasan Titik Nol Kilometer.",
            address = "Jl. Trikora/Pangurakan No. 6, Kota Yogyakarta",
            openingHours = "Selasa–Minggu, 08.00–21.00 WIB; tiket terakhir pukul 20.00; Senin tutup",
            priceInformation = "Dewasa Rp10.000, anak-anak Rp5.000, dan wisatawan asing Rp20.000.",
            facilities = listOf(
                "Pameran tetap",
                "Pergelaran budaya",
                "Bioskop museum",
                "Informasi koleksi"
            ),
            latitude = -7.8032311,
            longitude = 110.3629631
        )
    )

    override fun getCategories(): List<Category> {
        return Category.entries.toList()
    }

    override fun getPlaces(): List<Place> {
        return places
    }

    override fun getPlacesByCategory(category: Category): List<Place> {
        return places.filter { place ->
            place.category == category
        }
    }

    override fun getPlaceById(id: Int): Place? {
        return places.find { place ->
            place.id == id
        }
    }
}