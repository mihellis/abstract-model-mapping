package com.example.abstractmodelmapping.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "performance", include = JsonTypeInfo.As.EXISTING_PROPERTY, visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = TrapezeDTO.class, name = "trapeze"),
        @JsonSubTypes.Type(value = ClownDTO.class, name = "clown"),
        @JsonSubTypes.Type(value = UnicylceDTO.class, name = "unicycle")
})
@Getter
@Setter
public abstract class PerformanceDTO {

    private  Long id;
    private String name;
    private int duration;
}
