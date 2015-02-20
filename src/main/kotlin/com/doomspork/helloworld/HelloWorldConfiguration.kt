package com.doomspork.helloworld

import io.dropwizard.Configuration
import org.hibernate.validator.constraints.NotEmpty
import com.fasterxml.jackson.annotation.JsonProperty

data class HelloWorldConfiguration(JsonProperty NotEmpty var template: String,
                                   JsonProperty NotEmpty var defaultName: String = "Stranger") : Configuration()
