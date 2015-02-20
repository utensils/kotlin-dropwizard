package com.doomspork.helloworld.core

import com.fasterxml.jackson.annotation.JsonProperty
import org.hibernate.validator.constraints.Length

data class Saying(JsonProperty id: Long, JsonProperty Length(max = 3) content: String)
