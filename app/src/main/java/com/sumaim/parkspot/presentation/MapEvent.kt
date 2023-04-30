package com.sumaim.parkspot.presentation

import com.google.android.gms.maps.model.LatLng
import com.sumaim.parkspot.domain.model.ParkingSpot

sealed class MapEvent {
    object ToggleFalloutMap: MapEvent()
    data class OnMapLongClick(val latLng: LatLng): MapEvent()
    data class OnInfoWindowLongClick(val spot: ParkingSpot): MapEvent()
}
