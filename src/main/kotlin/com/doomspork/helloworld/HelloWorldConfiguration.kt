package com.doomspork.helloworld

import io.dropwizard.Configuration
import org.hibernate.validator.constraints.NotEmpty
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonCreator

data class HelloWorldConfiguration [JsonCreator] (JsonProperty("template") NotEmpty var template: String = "",
                                   JsonProperty("defaultName") NotEmpty var defaultName: String = "Stranger") : Configuration()
