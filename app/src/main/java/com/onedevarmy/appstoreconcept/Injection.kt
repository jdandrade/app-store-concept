package com.onedevarmy.appstoreconcept

import com.onedevarmy.appstoreconcept.model.AppRepository

object Injection {

    fun provideViewModelFactory(): ViewModelFactory {
        return ViewModelFactory(provideAppRepository())
    }

    fun provideAppRepository(): AppRepository {
        return AppRepository()
    }

}
