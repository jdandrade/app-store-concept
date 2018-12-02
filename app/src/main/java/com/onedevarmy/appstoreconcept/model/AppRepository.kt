package com.onedevarmy.appstoreconcept.model

import io.reactivex.Flowable

open class AppRepository {
    open fun getApps(): Flowable<App> {
        return Flowable.just(App("hello world", "https://via.placeholder.com/450"))
    }

}
