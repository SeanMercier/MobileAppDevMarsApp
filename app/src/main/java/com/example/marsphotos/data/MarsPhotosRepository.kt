package com.example.marsphotos.data

import com.example.marsphotos.network.MarsApiService
import com.example.marsphotos.network.MarsPhoto

// Define MarsPhotosRepository as an interface
interface MarsPhotosRepository {
    suspend fun getMarsPhotos(): List<MarsPhoto>
}

// Implementation of MarsPhotosRepository
class NetworkMarsPhotosRepository(
    private val marsApiService: MarsApiService
) : MarsPhotosRepository {

    override suspend fun getMarsPhotos(): List<MarsPhoto> {
        return marsApiService.getPhotos() // Ensure getPhotos() returns List<MarsPhoto>
    }
}
