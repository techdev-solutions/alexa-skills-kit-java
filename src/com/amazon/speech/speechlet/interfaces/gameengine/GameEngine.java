package com.amazon.speech.speechlet.interfaces.gameengine;

import com.amazon.speech.json.SpeechletRequestEnvelope;
import com.amazon.speech.speechlet.SpeechletResponse;
import com.amazon.speech.speechlet.interfaces.gameengine.request.InputHandlerEventRequest;

public interface GameEngine {

    SpeechletResponse onInputHandlerHandlerEvent(SpeechletRequestEnvelope<InputHandlerEventRequest> requestEnvelope);
}
