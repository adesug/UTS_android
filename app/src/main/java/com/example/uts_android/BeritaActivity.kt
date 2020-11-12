package com.example.uts_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.uts_android.adapter.ImageAdapter

class BeritaActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_berita)

        val imageList = listOf<Image>(
            Image(
                R.drawable.berita1,
                "Tutup Sejak Maret 2020 Imbas COVID-19, Sekolah di Ibu Kota Argentina Buka Lagi",
                "Liputan6.com, Buenos Aires- Akitivitas belajar mengajar di sekolah-sekolah di Ibu Kota Argentina mulai dibuka kembali pada 13 Oktober 2020.\n" +
                        "\n" +
                        "Pembukaan itu dilakukan sebagai bagian dari pelonggaran pembatasan bertahap ke kelas tatap muka di tengah pandemi COVID-19. " +
                        "Kantor Wali Kota Buenos Aires melaporkan, bahwa para murid tahun ajaran terakhir di sekitar puluhan sekolah umum di kota tersebut telah kembali mengikuti aktivitas belajar ke kelas.\n" +
                        "\n" +
                        "\"Ini adalah langkah yang sangat penting, kembali sekolah untuk menutup penguncian dalam kehidupan pendidikan mereka,\" ujar wakil Wali Kota, Diego Santilli, seperti dikutip dari AFP, Rabu (14/10/2020).\n" +
                        "\n" +
                        "Sementara itu, beberapa siswa sekolah dasar akan melanjutkan aktivitas belajar mereka di kelas pada pekan depan. " +
                        "Soledad Acuna, pejabat pendidikan tinggi di Buenos Aires, mengatakan bahwa \"Antara manajemen sekolah negeri dan swasta, 70.000 anak laki-laki dan perempuan akan dapat menghadiri kelas tatap muka yang akan melengkapi ruang virtual\"."
            ),
            Image(
                R.drawable.berita2,
                "Sekolah Libur Lama Akibat Pandemi, Ular Piton 6 Meter Ditemukan di Kelas",
                "Liputan6.com, Jakarta Masa pandemi Corona Covid-19 ini membuat sekolah memberlakukan sistem belajar di rumah atau sekolah online, dari PAUD hingga SMA.  Proses belajar mengajar diganti kelas online. Ruang kelas pun lama tak berpenghuni. Akibatnya, ular besar ditemukan di salah satu kelas. " +
                        "Fakta adanya ular di dalam kelas itu baru-baru ini diunggah di media sosial, yakni video singkat yang memperlihatkan ular piton di dalam kelas. Diketahui lokasi tersebut berada di wilayah Kusan Hulu Tanah Bumbu, Kalimantan Selatan.\n" +
                        "\n" +
                        "Video tersebut pun viral di media sosial dan mendapat perhatian warganet. Dilansir dari berbagai sumber, berikut Liputan6.com cerita ular selengkapnya, Rabu (21/10/2020)." +
                        "\"Kelamaan libur sekolah, ruang kelas jadi sarang ular? Menurut informasi telah diamankan seekor ular di dalam ruang kelas di salah satu sekolahan Wil. Kusan Hulu Tanah Bumbu\" tulis akun @ndorobeii di Instagram pada Senin (19/10/2020) lalu."
            ),
            Image(
                R.drawable.berita3,
                "Unik, Sekolah Ini Ajarkan Para Siswinya Ilmu Perbengkelan dan Perawatan Mobil",
                "Liputan6.com, Australia - Sudah menjadi hal yang lumrah jika sekolah mengajarkan berbagai mata pelajaran seperti matematika, ilmu pengetahuan alam, bahasa, seni dan lainnya. Namun, bagaimana jadinya jika sekolah mengajarkan keterampilan dasar dalam kehidupan sehari-hari?" +
                        "Stella Maris di Sydney, Australia, baru-baru ini membagikan unggahan berjudul \"Essential Life Skills\" yang menjelaskan beberapa pelajaran yang diberikan kepada siswa perempuannya.\n" +
                        "\n" +
                        "Unggahan tersebut menjelaskan bahwa siswi kelas 11 di sekolah tersebut diajari sejumlah keterampilan penting dalam perbengkelan dan perawatan mobil. Sesi pelajaran ini dilatih langsung oleh Galmatic, sekolah yang menawarkan kursus perbengkelan untuk wanita dan remaja." +
                        "Galmatic mengajarkan para siswi di sekolah ini cara mengganti ban, mengecek tekanan angin ban, cara memeriksa kadar oli dan cairan pendingin, apa yang harus dilakukan saat terjadi kecelakaan mobil, dan lain-lain.\n" +
                        "\n" +
                        "Ini dilakukan dengan harapan mendorong kemandirian, kekuatan, dan skill di kalangan remaja putri."
            ),
            Image(
                R.drawable.berita4,
                " Anak Sekolah Belajar di Rumah, Kok SPP-nya Nggak Turun? ",
                "Jakarta -\n" +
                        "\n" +
                        "Biaya bulanan sekolah atau biasa disebut SPP (Sumbangan Pembinaan Pendidikan) anak tidak mengalami penurunan meski sistem belajar dilakukan dari rumah secara online. Begitu juga dengan biaya pendaftaran peserta didik baru, tidak ada pemberian diskon untuk masuk sekolah." +
                        "Ika, salah satu pekerja bidang Penerimaan Peserta Didik Baru (PPDB) di salah satu sekolah SMA Swasta di Jakarta Selatan mengungkap alasannya. Menurutnya, mau anak sekolah tatap muka atau secara virtual sama saja tetap belajar seperti biasa." +
                        "\"Nggak (turun). Tetap saja (biaya sekolah) karena tetap belajar seperti biasa,\" ucapnya saat dihubungi detikcom, Rabu (3/6/2020)." +
                        "Pihaknya sendiri menerapkan kegiatan belajar mengajar melalui virtual Zoom selama pandemi. Hal ini akan terus dilakukan sampai menunggu keputusan dari pemerintah. \"Kita digital selama pandemi. (Sampai kapan) belum tahu tergantung dari pemerintah,\" katanya." +
                        "\"Menurut saya itu saja, nggak usah diatur dari Kemendikbud-nya lah repot. Udah saja bicara dengan orang tua murid dengan sekolah. Jadi kalau mau uang-uang ekstrakulikuler itu tidak ada lagi karena memang nggak ada. Biaya lain seperti biaya olahraga, biaya kesenian mungkin itu (yang bisa dikurangi),\" sarannya."
            ),
            Image(
                R.drawable.berita5,
                "Kapan Anak Bisa Kembali Sekolah Saat Wabah Corona? Ini Kata WHO",
                "Jakarta -\n" +
                        "\n" +
                        "Saat wabah virus Corona COVID-19 menyebar, sekolah-sekolah ditutup sebagai langkah pencegahan. Namun, belakangan beredar isu sekolah akan kembali dibuka." +
                        "Menteri Pendidikan dan Kebudayaan (Mendikbud) Nadiem Anwar Makarim menegaskan kabar murid kembali masuk sekolah pada bulan Juli tidak benar. Keputusan waktu dan metode belajar ke depannya seperti apa akan berlandaskan pertimbangan Gugus Tugas Percepatan Penanganan COVID-19." +
                        "\"Harus diketahui bahwa Kemendikbud sudah siap dengan semua skenario. Kami sudah ada berbagai macam. Tapi tentunya keputusan itu ada di dalam Gugus Tugas, bukan Kemendikbud sendiri. Jadi, kami yang akan mengeksekusi dan mengkoordinasikan,\" ujarnya dalam keterangan tertulis beberapa hari lalu." +
                        "Organisasi Kesehatan Dunia (WHO) telah mengeluarkan panduan terkait masalah penutupan dan pembukaan sekolah di masa pandemi virus Corona. Hal ini memang jadi masalah karena tidak semua anak memiliki kemampuan dan lingkungan yang sama bila terus dilakukan proses belajar dari luar sekolah." +
                        "Setidaknya ada tiga hal yang disarankan WHO benar-benar harus dipahami pemegang kebijakan bila memang ingin membuka atau menutup sekolah:\n" +
                        "\n" +
                        "1. Kondisi terkini situasi penyebaran COVID-19 dan keparahannya di populasi anak-anak\n" +
                        "2. Situasi lokal dan epidemiologi COVID-19 di daerah sekitar sekolah\n" +
                        "3. Lingkungan sekolah dan kemampuannya untuk menerapkan upaya pencegahan serta pengendalian penyakit" +
                        "\"Sampai sekarang masih sedikit laporan institusi pendidikan terlibat dalam kemunculan wabah COVID-19. Hanya saja studi memang menunjukkan penyebaran penyakit utamanya terjadi pada aktivitas sosial terkait kehidupan sekolah,\" tulis WHO."
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id._imageRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ImageAdapter(this, imageList){
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}