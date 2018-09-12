package com.ejarosiewicz.both

import org.junit.Assert.*
import org.junit.Test

class BothPrinterTest{

    private val systemUnderTest = BothPrinter()

    @Test
    fun `Should print stuff for both modules`(){
        val basicText = systemUnderTest.print()
        assertEquals(basicText, "This is a both text")
    }
}