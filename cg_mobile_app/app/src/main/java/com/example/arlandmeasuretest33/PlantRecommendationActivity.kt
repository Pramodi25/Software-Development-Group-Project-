package com.example.arlandmeasuretest33

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class PlantRecommendationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plant_recommendation)

        try {
            // Get data from intent if needed
            val selectedDistrict = intent.getStringExtra("SELECTED_DISTRICT") ?: ""
            val gardenName = intent.getStringExtra("GARDEN_NAME") ?: ""

            // Initialize all CardViews
            val cabbageCard = findViewById<CardView>(R.id.cabbageCard)
            val radishCard = findViewById<CardView>(R.id.radishCard)
            val carrotCard = findViewById<CardView>(R.id.carrotCard)
            val tomatoCard = findViewById<CardView>(R.id.tomatoCard)
            val capsicumCard = findViewById<CardView>(R.id.capsicumCard)
            val brinjalCard = findViewById<CardView>(R.id.brinjalCard)
            val okraCard = findViewById<CardView>(R.id.okraCard)

            // Set click listeners for each card
            cabbageCard.setOnClickListener { startARFeature("cabbage") }
            radishCard.setOnClickListener { startARFeature("radish") }
            carrotCard.setOnClickListener { startARFeature("carrot") }
            tomatoCard.setOnClickListener { startARFeature("tomato") }
            capsicumCard.setOnClickListener { startARFeature("capsicum") }
            brinjalCard.setOnClickListener { startARFeature("brinjal") }
            okraCard.setOnClickListener { startARFeature("okra") }

        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun startARFeature(plantType: String) {
        try {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("PLANT_TYPE", plantType)
            intent.putExtra("START_AR", true)
            startActivity(intent)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
} 