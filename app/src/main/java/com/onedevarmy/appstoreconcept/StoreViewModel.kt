package com.onedevarmy.appstoreconcept

import androidx.lifecycle.ViewModel
import io.reactivex.Flowable
import io.reactivex.functions.BiFunction
import java.util.concurrent.TimeUnit

class StoreViewModel : ViewModel() {

    fun helloWorld(): Flowable<String> {
        val numbers: ArrayList<String> = ArrayList()
        for (i in 1..50) {
            numbers.add("hello world")
            numbers.add("hello joao")
            numbers.add("hello aptoide")
            numbers.add("hello kotlin")
        }
        return Flowable.fromIterable(numbers)
            .zipWith(Flowable.interval(250, TimeUnit.MILLISECONDS), BiFunction { string, interval -> string })
    }
}
