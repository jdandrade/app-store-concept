package com.onedevarmy.appstoreconcept.model

import io.reactivex.Flowable

class AppRepository {
    fun getApps(): Flowable<App> {
        return Flowable.just(App("hello world", "https://via.placeholder.com/450"))
    }

}
