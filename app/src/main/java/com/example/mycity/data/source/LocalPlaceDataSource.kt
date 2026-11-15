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
        ),
        Place(
            id = 7,
            category = Category.LIBRARY,
            name = "Perpustakaan Kota Yogyakarta",
            shortDescription = "Perpustakaan umum dan ruang produktif di kawasan Kotabaru.",
            description = "Perpustakaan Kota Yogyakarta menyediakan koleksi bacaan, ruang belajar, akses internet, komputer, serta layanan perpustakaan digital bagi masyarakat.",
            address = "Jl. Suroto No. 9, Kotabaru, Gondokusuman, Kota Yogyakarta",
            openingHours = "Senin–Kamis 07.30–20.00; Jumat 09.00–17.00; Sabtu–Minggu 08.30–12.00 WIB",
            priceInformation = "Layanan perpustakaan gratis.",
            facilities = listOf(
                "Ruang baca",
                "Coworking space",
                "Wi-Fi",
                "Komputer",
                "Perpustakaan digital"
            ),
            latitude = -7.7841325,
            longitude = 110.37452
        ),
        Place(
            id = 8,
            category = Category.LIBRARY,
            name = "Jogja Library Center",
            shortDescription = "Perpustakaan bernuansa bangunan kolonial di kawasan Malioboro.",
            description = "Jogja Library Center menyediakan koleksi tentang Yogyakarta, surat kabar, majalah, koleksi Kyoto Corner, internet, dan layanan audiovisual.",
            address = "Jl. Malioboro No. 175, Sosromenduran, Gedongtengen, Kota Yogyakarta",
            openingHours = "Senin–Kamis 08.00–16.00; Jumat 08.00–14.30; Sabtu 08.00–13.00 WIB; Minggu tutup",
            priceInformation = "Layanan perpustakaan gratis.",
            facilities = listOf(
                "Koleksi Yogyasiana",
                "Majalah dan surat kabar",
                "Kyoto Corner",
                "Internet",
                "Ruang audiovisual"
            ),
            latitude = -7.7926,
            longitude = 110.3657
        ),
        Place(
            id = 9,
            category = Category.RECREATION_PARK,
            name = "Gembira Loka Zoo",
            shortDescription = "Kebun binatang dan wisata edukasi keluarga di Yogyakarta.",
            description = "Gembira Loka Zoo menghadirkan berbagai zona satwa, kegiatan edukasi, kereta keliling, kapal katamaran, dan fasilitas rekreasi keluarga.",
            address = "Jl. Kebun Raya No. 2, Rejowinangun, Kotagede, Kota Yogyakarta",
            openingHours = "Setiap hari, 08.00–16.00 WIB",
            priceInformation = "Hari kerja Rp70.000; akhir pekan dan hari libur nasional Rp85.000.",
            facilities = listOf(
                "Zona satwa",
                "Kereta keliling",
                "Kapal katamaran",
                "Ruang laktasi",
                "Kantin",
                "Pusat informasi"
            ),
            latitude = -7.8063,
            longitude = 110.396
        ),
        Place(
            id = 10,
            category = Category.RECREATION_PARK,
            name = "Sindu Kusuma Edupark",
            shortDescription = "Taman bermain keluarga dengan wahana darat dan waterpark.",
            description = "Sindu Kusuma Edupark menyediakan waterpark dan berbagai wahana permainan seperti Cakra Manggilingan, Kursi Mabur, serta wahana bertema edukasi.",
            address = "Jl. Jambon, Kragilan, Sinduadi, Mlati, Sleman, Daerah Istimewa Yogyakarta",
            openingHours = "Selasa–Jumat 09.00–17.00; Sabtu–Minggu waterpark 08.00–17.00 dan wahana 10.00–18.00 WIB",
            priceInformation = "Waterpark mulai Rp30.000; paket wahana Rp50.000; tiket terusan sekitar Rp80.000.",
            facilities = listOf(
                "Waterpark",
                "Wahana keluarga",
                "Bianglala",
                "Area makan",
                "Area parkir"
            ),
            latitude = -7.767499,
            longitude = 110.35576
        ),
        Place(
            id = 11,
            category = Category.MUSEUM,
            name = "Museum Benteng Vredeburg",
            shortDescription = "Museum perjuangan nasional di kawasan Titik Nol Yogyakarta.",
            description = "Museum Benteng Vredeburg menampilkan diorama dan koleksi sejarah perjuangan bangsa di dalam bangunan bekas benteng kolonial.",
            address = "Jl. Margo Mulyo No. 6, Ngupasan, Gondomanan, Kota Yogyakarta",
            openingHours = "Selasa–Kamis 08.00–20.00; Jumat–Minggu 08.00–21.00 WIB; Senin tutup",
            priceInformation = "Dewasa Rp15.000 pada Selasa–Kamis; Jumat–Minggu Rp20.000 siang dan Rp25.000 setelah pukul 16.00.",
            facilities = listOf(
                "Diorama sejarah",
                "Ruang pameran",
                "Perpustakaan",
                "Ruang audiovisual",
                "Area terbuka"
            ),
            latitude = -7.800375,
            longitude = 110.366378
        ),
        Place(
            id = 12,
            category = Category.MUSEUM,
            name = "Museum Affandi",
            shortDescription = "Museum seni yang menampilkan karya dan perjalanan hidup Affandi.",
            description = "Museum Affandi menyimpan karya maestro Affandi dan berbagai koleksi seni di kompleks bangunan yang dirancang dengan bentuk khas.",
            address = "Jl. Laksda Adisucipto No. 167, Caturtunggal, Depok, Sleman",
            openingHours = "Senin–Sabtu, 09.00–16.00 WIB",
            priceInformation = "Pengunjung domestik Rp50.000 dan mancanegara Rp100.000.",
            facilities = listOf(
                "Galeri seni",
                "Area parkir",
                "Akses kursi roda",
                "Toko suvenir",
                "Minuman ringan"
            ),
            latitude = -7.780907,
            longitude = 110.396562
        ),
        Place(
            id = 13,
            category = Category.HISTORICAL_SITE,
            name = "Keraton Yogyakarta",
            shortDescription = "Pusat kebudayaan Jawa dan kediaman resmi Sultan Yogyakarta.",
            description = "Kagungan Dalem Kedhaton merupakan bagian inti Keraton Yogyakarta. Pengunjung dapat mempelajari sejarah, arsitektur, koleksi kerajaan, tradisi, dan kesenian Jawa.",
            address = "Jl. Rotowijayan Blok No. 1, Panembahan, Kraton, Kota Yogyakarta",
            openingHours = "Selasa–Minggu, 08.30–14.30 WIB; Senin tutup",
            priceInformation = "Harga tiket mengikuti paket kunjungan yang tersedia di loket atau situs resmi Keraton.",
            facilities = listOf(
                "Ruang koleksi",
                "Pameran budaya",
                "Pertunjukan seni",
                "Pemandu wisata",
                "Aksesibilitas terbatas"
            ),
            latitude = -7.805284,
            longitude = 110.364203
        ),
        Place(
            id = 14,
            category = Category.HISTORICAL_SITE,
            name = "Taman Sari",
            shortDescription = "Kompleks taman dan pemandian bersejarah milik Keraton Yogyakarta.",
            description = "Taman Sari dibangun sebagai tempat peristirahatan dan perlindungan keluarga kerajaan. Kawasan ini memiliki kolam pemandian, gerbang, lorong, dan bangunan bersejarah.",
            address = "Patehan, Kraton, Kota Yogyakarta, Daerah Istimewa Yogyakarta",
            openingHours = "Setiap hari, 09.00–15.00 WIB",
            priceInformation = "Harga tiket mengikuti ketentuan loket atau situs resmi wisata Keraton.",
            facilities = listOf(
                "Kompleks pemandian",
                "Bangunan bersejarah",
                "Pemandu wisata",
                "Area fotografi"
            ),
            latitude = -7.810151,
            longitude = 110.358946
        ),
        Place(
            id = 15,
            category = Category.HISTORICAL_SITE,
            name = "Museum Kotagede Intro Living Museum",
            shortDescription = "Museum yang memperkenalkan sejarah dan kehidupan kawasan Kotagede.",
            description = "Museum Kotagede memperkenalkan perkembangan Mataram Islam, situs arkeologi, arsitektur, kerajinan tradisional, kesenian, dan kehidupan masyarakat Kotagede.",
            address = "Jl. Tegalgendu, Kotagede, Yogyakarta",
            openingHours = "Selasa–Kamis 08.00–16.00; Jumat 08.00–14.30; Sabtu–Minggu 08.30–20.00 WIB; Senin tutup",
            priceInformation = "Gratis. Kunjungan rombongan perlu melakukan reservasi.",
            facilities = listOf(
                "Ruang pameran",
                "Informasi sejarah",
                "Koleksi budaya",
                "Program edukasi"
            ),
            latitude = -7.8168,
            longitude = 110.3922
        ),
        Place(
            id = 16,
            category = Category.NATURE,
            name = "Puncak Becici",
            shortDescription = "Kawasan hutan pinus dengan panorama Yogyakarta dari ketinggian.",
            description = "Puncak Becici menawarkan suasana hutan pinus, panorama perbukitan, pemandangan matahari terbenam, area berkemah, dan berbagai spot foto.",
            address = "Gunungcilik, Muntuk, Dlingo, Bantul, Daerah Istimewa Yogyakarta",
            openingHours = "Setiap hari, sekitar 05.00–19.00 WIB",
            priceInformation = "Tiket masuk sekitar Rp5.000. Biaya parkir dan aktivitas tambahan dibayar terpisah.",
            facilities = listOf(
                "Area parkir",
                "Toilet",
                "Musala",
                "Camping ground",
                "Spot foto"
            ),
            latitude = -7.9022,
            longitude = 110.4387
        ),
        Place(
            id = 17,
            category = Category.NATURE,
            name = "Hutan Pinus Mangunan",
            shortDescription = "Hutan pinus dengan area santai, fotografi, dan pertunjukan.",
            description = "Hutan Pinus Mangunan menghadirkan suasana sejuk, deretan pohon pinus, panggung terbuka, gardu pandang, serta berbagai spot foto di kawasan Dlingo.",
            address = "Mangunan, Dlingo, Bantul, Daerah Istimewa Yogyakarta",
            openingHours = "Setiap hari, sekitar 06.00–18.00 WIB",
            priceInformation = "Tiket sekitar Rp5.000–Rp10.000. Parkir dan kegiatan khusus dibayar terpisah.",
            facilities = listOf(
                "Area parkir",
                "Toilet",
                "Musala",
                "Warung",
                "Panggung terbuka",
                "Spot foto"
            ),
            latitude = -7.9259,
            longitude = 110.4316
        ),
        Place(
            id = 18,
            category = Category.NATURE,
            name = "Pantai Parangtritis",
            shortDescription = "Pantai terkenal di pesisir selatan Yogyakarta.",
            description = "Pantai Parangtritis menawarkan pemandangan laut selatan, area menikmati matahari terbenam, penyewaan ATV, delman, dan akses menuju kawasan Gumuk Pasir.",
            address = "Parangtritis, Kretek, Bantul, Daerah Istimewa Yogyakarta",
            openingHours = "Kawasan pantai dapat dikunjungi 24 jam; layanan wisata umumnya beroperasi pagi hingga sore",
            priceInformation = "Retribusi kawasan sekitar Rp15.000 per orang. Aktivitas dan parkir dibayar terpisah.",
            facilities = listOf(
                "Area parkir",
                "Toilet",
                "Musala",
                "Warung",
                "Penyewaan ATV",
                "Delman"
            ),
            latitude = -8.0255,
            longitude = 110.329
        ),
        Place(
            id = 19,
            category = Category.CULINARY,
            name = "Gudeg Yu Djum Wijilan 167",
            shortDescription = "Tempat menikmati gudeg kering khas Yogyakarta.",
            description = "Gudeg Yu Djum Wijilan 167 menyajikan gudeg kering dengan krecek, telur, tahu, tempe, dan berbagai pilihan ayam kampung serta paket oleh-oleh.",
            address = "Jl. Wijilan No. 167, Panembahan, Kraton, Kota Yogyakarta",
            openingHours = "Setiap hari, 06.00–22.00 WIB",
            priceInformation = "Menu nasi gudeg sekitar Rp20.500–Rp64.300. Harga paket oleh-oleh berbeda.",
            menuItems = listOf(
                MenuItem(
                    name = "Nasi Gudeg Telur",
                    price = 20_500
                ),
                MenuItem(
                    name = "Nasi Gudeg Ayam Suwir",
                    price = 32_000
                ),
                MenuItem(
                    name = "Paket Besek",
                    price = 83_000
                )
            ),
            facilities = listOf(
                "Makan di tempat",
                "Bawa pulang",
                "Paket oleh-oleh",
                "Pemesanan daring"
            ),
            latitude = -7.804923,
            longitude = 110.366765
        ),
        Place(
            id = 20,
            category = Category.CULINARY,
            name = "Bakmi Jowo Mbah Gito",
            shortDescription = "Bakmi Jawa dengan suasana bangunan kayu tradisional.",
            description = "Bakmi Jowo Mbah Gito menyajikan bakmi godog, bakmi goreng, dan magelangan yang dimasak menggunakan tungku tradisional.",
            address = "Jl. Nyi Ageng Nis No. 9, Rejowinangun, Kotagede, Kota Yogyakarta",
            openingHours = "Setiap hari, 11.00–22.00 WIB",
            priceInformation = "Harga menu utama sekitar Rp24.000–Rp51.000.",
            menuItems = listOf(
                MenuItem(
                    name = "Bakmi Godog",
                    price = 24_000
                ),
                MenuItem(
                    name = "Bakmi Goreng",
                    price = 24_000
                ),
                MenuItem(
                    name = "Magelangan",
                    price = 24_000
                )
            ),
            facilities = listOf(
                "Makan di tempat",
                "Bawa pulang",
                "Area parkir",
                "Suasana tradisional"
            ),
            latitude = -7.82435,
            longitude = 110.3988
        ),
        Place(
            id = 21,
            category = Category.CULINARY,
            name = "Sate Klathak Pak Pong",
            shortDescription = "Kuliner sate kambing khas Bantul dengan tusuk jeruji besi.",
            description = "Sate Klathak Pak Pong menyajikan sate kambing berbumbu sederhana yang dibakar menggunakan jeruji besi, serta tongseng, tengkleng, dan olahan kambing lainnya.",
            address = "Jl. Sultan Agung, Wonokromo, Pleret, Bantul, Daerah Istimewa Yogyakarta",
            openingHours = "Setiap hari, sekitar 09.00–23.00 WIB",
            priceInformation = "Harga menu sekitar Rp38.000–Rp65.000 per porsi.",
            menuItems = listOf(
                MenuItem(
                    name = "Sate Klathak",
                    price = 38_000
                ),
                MenuItem(
                    name = "Tengkleng",
                    price = 38_000
                ),
                MenuItem(
                    name = "Tongseng Kepala",
                    price = 32_000
                )
            ),
            facilities = listOf(
                "Makan di tempat",
                "Bawa pulang",
                "Area parkir",
                "Pilihan olahan kambing"
            ),
            latitude = -7.8715,
            longitude = 110.4091
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