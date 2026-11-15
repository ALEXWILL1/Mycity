package com.example.mycity.data.source

import com.example.mycity.data.model.Category
import com.example.mycity.data.model.Place

interface PlaceDataSource {

    fun getCategories(): List<Category>

    fun getPlaces(): List<Place>

    fun getPlacesByCategory(category: Category): List<Place>

    fun getPlaceById(id: Int): Place?
}