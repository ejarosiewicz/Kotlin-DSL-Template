package com.ejarosiewicz.basic

import org.junit.Assert.*
import org.junit.Test

class BasicPrinterTest{

    private val systemUnderTest = BasicPrinter()

    @Test
    fun `Should print stuff for basic module`(){
        val basicText = systemUnderTest.print()
        assertEquals(basicText, "This is a basic text")
    }
}