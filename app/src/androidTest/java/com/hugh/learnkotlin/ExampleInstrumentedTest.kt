package com.hugh.learnkotlin

import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4
import com.hugh.learnkotlin.grammar.BasicDataTypes
import com.hugh.learnkotlin.grammar.ControlFlow

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getTargetContext()
        assertEquals("com.hugh.learnkotlin", appContext.packageName)
    }

    @Test
    fun learn_array() {
        // Context of the app under test.
        val basicDataTypes = BasicDataTypes()
        val learnArray = basicDataTypes.learnArray()
        assertEquals("5--4", learnArray)
    }

    @Test
    fun learn_string() {
        // Context of the app under test.
        val basicDataTypes = BasicDataTypes()
        val learnArray = basicDataTypes.learnString()
        assertEquals("c o m f o r t a b l e", learnArray)
    }

    @Test
    fun learn_if() {
        // Context of the app under test.
        val basicDataTypes = ControlFlow()
        val learnIf = basicDataTypes.learnIf()
        assertEquals(8, learnIf)
    }

    @Test
    fun learn_when() {
        // Context of the app under test.
        val basicDataTypes = ControlFlow()
        val learnWhen = basicDataTypes.learnWhen("shanghai")
        assertEquals("SH", learnWhen)
    }
}
