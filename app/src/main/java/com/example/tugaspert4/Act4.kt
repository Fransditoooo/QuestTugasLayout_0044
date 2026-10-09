package com.example.tugaspert4

import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ActivitasPertama(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize()
    ) {

        Text(
            text = stringResource(id = R.string.copy),
            fontSize = 12.sp,
            color = colorResource(id = R.color.text_hitam),
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 50.dp)
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 100.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(id = R.string.prodi),
                fontSize = 35.sp,
                fontWeight = FontWeight.Bold,
                color = colorResource(id = R.color.text_hitam)
            )
            Text(
                text = stringResource(id = R.string.univ),
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = colorResource(id = R.color.text_hitam)
            )
            Spacer(modifier = Modifier.height(25.dp))

            KartuProfil(
                nama = R.string.nama_0,
                telp = null,
                alamat = R.string.alamat_0,
                warnaCard = R.color.card_0_bg,
                gambar = R.drawable.logo_umy,
                fontNama = FontFamily.Cursive,
                beratFont = FontWeight.Normal,
                ukuranNama = 20
            )
            KartuProfil(
                nama = R.string.nama_1,
                telp = R.string.telp_1,
                alamat = R.string.alamat_1,
                warnaCard = R.color.card_1_bg,
                gambar = R.drawable.logo_umy
            )
            KartuProfil(
                nama = R.string.nama_2,
                telp = R.string.telp_2,
                alamat = R.string.alamat_2,
                warnaCard = R.color.card_2_bg,
                gambar = R.drawable.logo_umy
            )
            KartuProfil(
                nama = R.string.nama_3,
                telp = R.string.telp_3,
                alamat = R.string.alamat_3,
                warnaCard = R.color.card_3_bg,
                gambar = R.drawable.logo_umy
            )
        }
    }
}

@Composable
fun KartuProfil(
    @StringRes nama: Int,
    @StringRes telp: Int?,
    @StringRes alamat: Int,
    @ColorRes warnaCard: Int,
    @DrawableRes gambar: Int,
    fontNama: FontFamily = FontFamily.Default,
    beratFont: FontWeight = FontWeight.Bold,
    ukuranNama: Int = 20
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp, vertical = 6.dp),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(id = warnaCard)
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(all = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = gambar),
                contentDescription = null,
                modifier = Modifier.size(60.dp)
            )

            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 10.dp),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = stringResource(id = nama),
                    fontSize = ukuranNama.sp,
                    fontFamily = fontNama,
                    fontWeight = beratFont,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                    color = colorResource(id = R.color.text_putih)
                )

                if (telp != null) {
                    Text(
                        text = stringResource(id = telp),
                        fontSize = 14.sp,
                        color = colorResource(id = R.color.text_cyan)
                    )
                }

                Text(
                    text = stringResource(id = alamat),
                    fontSize = 14.sp,
                    color = colorResource(id = R.color.text_kuning)
                )
            }

            Image(
                painter = painterResource(id = gambar),
                contentDescription = null,
                modifier = Modifier.size(60.dp)
            )
        }
    }
}