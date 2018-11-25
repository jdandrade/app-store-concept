package com.onedevarmy.appstoreconcept

object Injection {

    fun provideViewModelFactory(): ViewModelFactory {
        return ViewModelFactory(provideAppRepository())
    }

    fun provideAppRepository(): AppRepository {
        return AppRepository()
    }

}
