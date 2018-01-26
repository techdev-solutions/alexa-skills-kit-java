package com.amazon.speech.speechlet.interfaces.gameengine.directive;

import com.amazon.speech.speechlet.Directive;
import com.amazon.speech.speechlet.interfaces.gameengine.DefineEvent;
import com.amazon.speech.speechlet.interfaces.gameengine.Recognizer;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.List;
import java.util.Map;

@JsonTypeName("GameEngine.StartInputHandler")
public class StartInputHandlerDirective extends Directive {

    public int timeout;
    public int maximumHistoryLength;
    public List<String> proxies; // Temporary gadget IDs to assign to devices
    public Map<String, Recognizer> recognizers;
    public Map<String, DefineEvent> events;
}
