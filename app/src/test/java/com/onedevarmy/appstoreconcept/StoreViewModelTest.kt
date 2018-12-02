package com.onedevarmy.appstoreconcept

import com.onedevarmy.appstoreconcept.model.App
import com.onedevarmy.appstoreconcept.model.AppRepository
import com.onedevarmy.appstoreconcept.ui.StoreViewModel
import io.reactivex.Flowable
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

class StoreViewModelTest {

    @Mock
    private lateinit var appRepository: AppRepository
    private lateinit var storeViewModel: StoreViewModel

    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)
        storeViewModel = StoreViewModel(appRepository)
    }

    @Test
    fun getApps() {
        val app = App("appName", "appImage")
        Mockito.`when`(appRepository.getApps()).thenReturn(Flowable.just(app))
        storeViewModel.getApps().test().assertValue(app)
    }

}
