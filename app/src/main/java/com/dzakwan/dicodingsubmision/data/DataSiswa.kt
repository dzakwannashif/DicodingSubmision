package com.dzakwan.dicodingsubmision.data

import com.dzakwan.dicodingsubmision.R

object DataSiswa {

    val namaSiswa = arrayListOf(
        "Irfan Hakim",
        "Ilham Akbar",
        "David Disini",
        "Kocheng Oren",
        "Si Angel",
        "Nunung",
        "Dilan",
        "Milea",
        "Ucup",
        "Aisyah",
    )

    val umur = arrayListOf(
        "13 tahun",
        "13 tahun",
        "13 tahun",
        "13 tahun",
        "13 tahun",
        "13 tahun",
        "13 tahun",
        "13 tahun",
        "13 tahun",
        "13 tahun",
    )

    val lokasi = arrayListOf(
        "Jakarta",
        "Bojong",
        "Bandung",
        "Depok,",
        "Karawang",
        "Citayem",
        "Bogor",
        "Tanggerang",
        "Jogja",
        "Bekasi",
    )

    val image = arrayListOf(
        R.drawable.bocah_kacamata,
        R.drawable.cowo_kupluk,
        R.drawable.bocah_headset,
        R.drawable.kocheng_oren,
        R.drawable.cewe_rambut_pendek,
        R.drawable.cewe_kibo,
        R.drawable.cowo_kacamata,
        R.drawable.cewe_oren,
        R.drawable.cowo_coklat_oren,
        R.drawable.cewe_hijab,
        )

    val noTelp = arrayListOf(
        "0123456789",
        "0123456789",
        "0123456789",
        "0123456789",
        "0123456789",
        "0123456789",
        "0123456789",
        "0123456789",
        "0123456789",
        "0123456789",
    )

    val description = arrayListOf(
        "Hidup untuk bermain",
        "Selalu Bernyanyi",
        "pereview barang baru",
        "Hidup bagaikan larry",
        "apapun yang terjadi Tetap lah bernapas",
        "Temennya Ucup",
        "Mantannya Milea",
        "Mantannya Dilan",
        "Temennya Nunung",
        "Bek Bek Bek",
    )

    val listName: ArrayList<Data> get() {
        val listNama = arrayListOf<Data>()
        for (position in namaSiswa.indices){
            val data = Data(
                namaSiswa = namaSiswa[position],
                umur = umur[position],
                lokasi = lokasi[position],
                image = image[position],
                noTelp = noTelp[position],
                desc = description[position],
            )
            listNama.add(data)
        }
        return listNama
    }
}