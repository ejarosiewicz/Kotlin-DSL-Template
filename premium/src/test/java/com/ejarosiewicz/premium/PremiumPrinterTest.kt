package com.ejarosiewicz.premium

import org.junit.Assert.assertEquals
import org.junit.Test

class PremiumPrinterTest{

    private val systemUnderTest = PremiumPrinter()

    @Test
    fun `Should print stuff for premium module`(){
        val premiumText = systemUnderTest.print()
        assertEquals(premiumText, "This is a premium text")
    }
}