package com.onedevarmy.appstoreconcept

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.onedevarmy.appstoreconcept.model.AppRepository
import com.onedevarmy.appstoreconcept.ui.StoreViewModel

@Suppress("UNCHECKED_CAST")
class ViewModelFactory(private val appRepository: AppRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(StoreViewModel::class.java)) {
            return StoreViewModel(appRepository) as T
        }
        throw IllegalArgumentException(
            "Unknown ViewModel class"
        )
    }
}