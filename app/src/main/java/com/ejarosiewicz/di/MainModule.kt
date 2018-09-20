package com.ejarosiewicz.di

import org.koin.dsl.module.module
import com.ejarosiewicz.both.BothPrinter

val mainModule = module {

    single { BothPrinter() }
}