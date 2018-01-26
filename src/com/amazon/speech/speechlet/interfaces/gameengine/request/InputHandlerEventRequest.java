package com.amazon.speech.speechlet.interfaces.gameengine.request;

import com.amazon.speech.speechlet.SpeechletRequest;
import com.amazon.speech.speechlet.interfaces.gameengine.Event;
import com.fasterxml.jackson.annotation.JsonProperty;
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

    private InputHandlerEventRequest(@JsonProperty("requestId") final String requestId,
                                   @JsonProperty("timestamp") final Date timestamp,
                                   @JsonProperty("locale") final Locale locale,
                                   @JsonProperty("originatingRequestId") final String originatingRequestId) {
        super(requestId, timestamp, locale);
        this.originatingRequestId = originatingRequestId;
    }
}
