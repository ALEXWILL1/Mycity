package com.example.mycity.data.repository

import com.example.mycity.data.model.Category
import com.example.mycity.data.model.Place
import com.example.mycity.data.source.LocalPlaceDataSource
import com.example.mycity.data.source.PlaceDataSource

class PlaceRepository(
    private val dataSource: PlaceDataSource = LocalPlaceDataSource
) {

    fun getCategories(): List<Category> {
        return dataSource.getCategories()
    }

    fun getAllPlaces(): List<Place> {
        return dataSource.getPlaces()
    }

    fun getPlacesByCategory(category: Category): List<Place> {
        return dataSource.getPlacesByCategory(category)
    }

    fun getPlaceById(id: Int): Place? {
        return dataSource.getPlaceById(id)
    }
}