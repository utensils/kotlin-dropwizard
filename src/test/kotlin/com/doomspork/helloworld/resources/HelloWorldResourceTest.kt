package com.doomspork.helloworld.resources

import com.doomspork.helloworld.core.Saying
import com.google.common.base.Optional
import org.junit.Test
import org.junit.Assert.*

class HelloWorldResourceTest {
    @Test
    fun testSayHello() {
        run {
            val resource=HelloWorldResource("Hello, %s!", "Stranger")
            val expected= Saying(id = 1, content = "Hello, Stranger!");
            assertEquals(resource.sayHello(Optional.absent()), expected)
        }
        run {
            val resource=HelloWorldResource("Hello, %s!", "Stranger")
            val expected= Saying(id = 1, content = "Hello, TEST!");
            assertEquals(resource.sayHello(Optional.of("TEST")), expected)
        }
    }

    @Test
    fun testGetTemplate() {
        val r=HelloWorldResource("a", "b")
        assertEquals(r.template, "a")
    }

    @Test
    fun testGetDefaultName() {
        val r=HelloWorldResource("a", "b")
        assertEquals(r.defaultName, "b")
    }
}