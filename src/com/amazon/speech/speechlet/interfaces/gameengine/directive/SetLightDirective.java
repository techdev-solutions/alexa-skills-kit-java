package com.amazon.speech.speechlet.interfaces.gameengine.directive;

import com.amazon.speech.speechlet.Directive;
import com.amazon.speech.speechlet.interfaces.gameengine.Parameters;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

@JsonTypeName("GadgetController.SetLight")
public class SetLightDirective extends Directive {

    public int version = 1;
    public List<String> targetGadgets;
    public Parameters parameters;
}
