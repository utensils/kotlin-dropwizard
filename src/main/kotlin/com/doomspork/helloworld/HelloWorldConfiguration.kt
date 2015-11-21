package com.doomspork.helloworld

import com.fasterxml.jackson.annotation.JsonProperty
import io.dropwizard.Configuration

public class HelloWorldConfiguration() : Configuration() {
    @JsonProperty("template")
    public var template: String=""

    @JsonProperty("defaultName")
    public var defaultName: String="Stranger"
}
