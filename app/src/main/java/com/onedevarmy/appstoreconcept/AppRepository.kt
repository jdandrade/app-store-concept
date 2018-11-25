package com.onedevarmy.appstoreconcept

import io.reactivex.Flowable
import io.reactivex.functions.BiFunction
import java.util.concurrent.TimeUnit

class AppRepository {
    fun getApps(): Flowable<String> {
        val numbers: ArrayList<String> = ArrayList()
        for (i in 1..50) {
            numbers.add("hello world")
            numbers.add("hello joao")
            numbers.add("hello aptoide")
            numbers.add("hello kotlin")
        }
        val flowable = Flowable.fromIterable(numbers)
            .zipWith<Long, String>(
                Flowable.interval(250, TimeUnit.MILLISECONDS),
                BiFunction { string, _ -> string })
        return flowable
    }

}
