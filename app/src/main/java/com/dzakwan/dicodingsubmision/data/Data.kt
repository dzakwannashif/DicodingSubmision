package com.dzakwan.dicodingsubmision.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Data(
    var namaSiswa: String?,
    var umur: String?,
    var lokasi: String?,
    var image: Int,
    var noTelp: String?,
    var desc: String?,
) : Parcelable
