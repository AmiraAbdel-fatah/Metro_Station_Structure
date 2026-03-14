package data.models


data class MetroDto(
    val stations: List<StationsDto>,
    val travel_time_between_stations_minutes: Int
)