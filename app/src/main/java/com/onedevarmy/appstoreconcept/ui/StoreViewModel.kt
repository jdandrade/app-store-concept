package com.onedevarmy.appstoreconcept.ui

import androidx.lifecycle.ViewModel
import com.onedevarmy.appstoreconcept.model.App
import com.onedevarmy.appstoreconcept.model.AppRepository
import io.reactivex.Flowable

class StoreViewModel(private val appRepository: AppRepository) : ViewModel() {

    fun getApps(): Flowable<App> {
        return appRepository.getApps()
    }
}
