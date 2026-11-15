package com.example.mycity.data.repository

import com.example.mycity.data.model.Category
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertNull
import org.junit.Before
import org.junit.Test

class PlaceRepositoryTest {

    private lateinit var repository: PlaceRepository

    @Before
    fun setUp() {
        repository = PlaceRepository()
    }

    @Test
    fun getCategories_returnsSevenCategories() {
        val categories = repository.getCategories()

        assertEquals(7, categories.size)
    }

    @Test
    fun getPlacesByCategory_cafe_returnsThreePlaces() {
        val cafes = repository.getPlacesByCategory(Category.CAFE)

        assertEquals(3, cafes.size)
        assertEquals(
            listOf(
                "ViaVia Jogja",
                "Moikai Coffee CDT",
                "Klinik Kopi"
            ),
            cafes.map { cafe -> cafe.name }
        )
    }

    @Test
    fun getPlaceById_existingId_returnsCorrectPlace() {
        val place = repository.getPlaceById(1)

        assertNotNull(place)
        assertEquals("ViaVia Jogja", place?.name)
        assertEquals(Category.CAFE, place?.category)
    }

    @Test
    fun getPlaceById_unknownId_returnsNull() {
        val place = repository.getPlaceById(999)

        assertNull(place)
    }
}