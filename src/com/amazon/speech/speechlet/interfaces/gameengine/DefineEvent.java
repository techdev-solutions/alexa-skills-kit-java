package com.amazon.speech.speechlet.interfaces.gameengine;

import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.List;

@JsonTypeName("Event")
public class DefineEvent {

    public List<String> meets;
    public List<String> fails;
    public String reports;
    public boolean shouldEndInputHandler;
}
