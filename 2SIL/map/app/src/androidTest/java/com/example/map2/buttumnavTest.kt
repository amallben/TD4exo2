package com.example.map2

import androidx.test.rule.ActivityTestRule
import org.junit.After
import org.junit.Before
import com.example.map2.buttumnav
import com.google.android.gms.maps.model.LatLng
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

class buttumnavTest {


     var countryCode :buttumnav = buttumnav()

    @get:Rule
    var activityRule:
            ActivityTestRule<MainActivity>
            = ActivityTestRule(MainActivity::class.java)
    @Test
    fun countryCode() {
        countryCode.apply { var s:String = getCountryCode(LatLng(28.0339, 1.6596))
            assertEquals("DZ",s)}



    }
}