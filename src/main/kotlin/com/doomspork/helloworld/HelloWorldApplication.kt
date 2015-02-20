package com.doomspork.helloworld

import io.dropwizard.Application
import io.dropwizard.setup.Bootstrap
import io.dropwizard.setup.Environment
import kotlin.platform.platformStatic
import com.doomspork.helloworld.resources.HelloWorldResource

class HelloWorldApplication() : Application<HelloWorldConfiguration>() {
    class object {
        platformStatic fun main(args: Array<String>) {
            HelloWorldApplication().run(args)
        }
    }

    override fun initialize(bootstrap: Bootstrap<HelloWorldConfiguration>) {
        throw UnsupportedOperationException()
    }

    override fun run(config: HelloWorldConfiguration, env: Environment) {
        val resource =  HelloWorldResource(config.template, config.defaultName)
        env.jersey().register(resource)
    }

}