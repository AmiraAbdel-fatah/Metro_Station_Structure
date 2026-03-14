package di

import data.dataSource.MetroJsonDataSource
import data.repo.MetroRepositoryImpl
import domain.usecase.*
import presentation.ConsoleController

object AppModule {

    fun provideController(): ConsoleController {

        val dataSource =
            MetroJsonDataSource(
                "D:\\kotlin\\Metro-App\\cairo_metro_structured (1).json"
            )

        val repository =
            MetroRepositoryImpl(
                dataSource
            )

        val fare = CalculateFareUseCase(repository)
        val time = CalculateTimeUseCase(repository)
        val bfsUseCase = BFSUseCase()

        val findRoute =
            FindRouteUseCase(repository, fare, time, bfsUseCase)
        val getFirstStationUseCase = GetFirstStationUseCase(repository)
        val getLastStationUseCase = GetLastStationUseCase(repository)
        val direction = GetDirectionUseCase(getFirstStationUseCase, getLastStationUseCase)

        return ConsoleController(
            findRoute,
            direction
        )
    }
}