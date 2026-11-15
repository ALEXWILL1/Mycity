package com.example.mycity.data.model

data class Place(
    val id: Int,
    val category: Category,
    val name: String,
    val shortDescription: String,
    val description: String,
    val address: String,
    val openingHours: String,
    val priceInformation: String,
    val menuItems: List<MenuItem> = emptyList(),
    val facilities: List<String> = emptyList(),
    val latitude: Double,
    val longitude: Double
)

data class MenuItem(
    val name: String,
    val price: Int
)