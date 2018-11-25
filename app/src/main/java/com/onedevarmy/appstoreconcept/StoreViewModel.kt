package com.onedevarmy.appstoreconcept

import androidx.lifecycle.ViewModel
import io.reactivex.Flowable

class StoreViewModel(private val appRepository: AppRepository) : ViewModel() {

    fun helloWorld(): Flowable<String> {
        return appRepository.getApps()
    }
}
