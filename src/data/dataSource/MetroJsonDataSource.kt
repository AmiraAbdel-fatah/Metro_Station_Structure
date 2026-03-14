package data.dataSource

import com.google.gson.Gson
import data.models.MetroDto
import java.io.File

class MetroJsonDataSource(private val path: String) : MetroDataSource {
    // ************* where the data will come from **************
    private val gson = Gson()
    private val dto by lazy {
        gson.fromJson(
            File("D:/Amira/New folder (3)/Metro-App/cairo_metro_structured (1).json").readText(),
            MetroDto::class.java
        )
    }

    // ********************** two functions that will be implemented from interface ************
    override fun loadStations() =
        dto.stations

    override fun getTravelTime() =
        dto.travel_time_between_stations_minutes

}