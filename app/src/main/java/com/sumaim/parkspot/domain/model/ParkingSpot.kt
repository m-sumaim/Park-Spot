package com.sumaim.parkspot.domain.model

data class ParkingSpot(
    val lat: Double,
    val lng: Double,
    val id: Int? = null
)
