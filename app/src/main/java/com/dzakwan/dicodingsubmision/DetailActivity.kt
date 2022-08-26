package com.dzakwan.dicodingsubmision

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.dzakwan.dicodingsubmision.data.Data
import com.dzakwan.dicodingsubmision.databinding.ActivityDetailBinding


class DetailActivity : AppCompatActivity() {

    private var _binding : ActivityDetailBinding? = null
    private val binding get() = _binding as ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root )

        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_back)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val data = intent.getParcelableExtra<Data>(DETAIL_KEY)
        Log.i("TAG", "onCreate: $data")
        Glide.with(this).load(data?.image).into(binding.imgDetail)

        binding.apply {
            data?.let {
                supportActionBar?.title = data.namaSiswa
                tvNama.text = data.namaSiswa
                tvDesc.text = data.desc
                tvLokasi.text = data.lokasi
                tvNoTelp.text = data.noTelp
                tvUmur.text = data.umur
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_detail, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                finish()
                return true
            }
            R.id.ic_profile -> startActivity(Intent(this, AboutActivity::class.java))
        }
        return super.onOptionsItemSelected(item)
    }

    companion object{
        val DETAIL_KEY = "detail_key"
    }
}