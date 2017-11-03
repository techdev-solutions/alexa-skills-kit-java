package com.amazon.speech.speechlet.interfaces.gameengine.directive;

import com.amazon.speech.speechlet.Directive;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("GameEngine.StopInputHandler")
public class StopInputHandlerDirective extends Directive {

    public String originatingRequestId;
}
