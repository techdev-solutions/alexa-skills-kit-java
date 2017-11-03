package com.amazon.speech.speechlet.interfaces.gameengine.request;

import com.amazon.speech.speechlet.SpeechletRequest;
import com.amazon.speech.speechlet.interfaces.gameengine.Event;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@JsonTypeName("GameEngine.InputHandlerEvent")
public class InputHandlerEventRequest extends SpeechletRequest {

    public List<Event> events;
    public String originatingRequestId;

    protected InputHandlerEventRequest(SpeechletRequestBuilder builder) {
        super(builder);
    }

    protected InputHandlerEventRequest(String requestId, Date timestamp, Locale locale) {
        super(requestId, timestamp, locale);
    }
}
