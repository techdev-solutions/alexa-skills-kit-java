package com.amazon.speech.interfaces.gameengine.directive;

import com.amazon.speech.speechlet.interfaces.gameengine.DefineEvent;
import com.amazon.speech.speechlet.interfaces.gameengine.Pattern;
import com.amazon.speech.speechlet.interfaces.gameengine.Recognizer;
import com.amazon.speech.speechlet.interfaces.gameengine.directive.StartInputHandlerDirective;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StartInputHandlerDirectiveTest {

    @Test
    public void testJsonCreation() throws Exception {
        StartInputHandlerDirective startInputHandlerDirective = new StartInputHandlerDirective();
        startInputHandlerDirective.timeout = 1000;
        startInputHandlerDirective.maximumHistoryLength = 10;

        ArrayList<String> proxies = new ArrayList<>();
        proxies.add("A");
        proxies.add("B");
        proxies.add("C");
        startInputHandlerDirective.proxies = proxies;

        Map<String, Recognizer> recognizers = new HashMap<>();
        Recognizer recognizerFoo = new Recognizer();
        recognizerFoo.anchor = "anchor foo";
        recognizerFoo.fuzzy = true;
        recognizerFoo.type = "foo type";
        recognizerFoo.actions = new ArrayList<>();

        ArrayList<Pattern> patterns = new ArrayList<>();
        Pattern pattern = new Pattern();
        pattern.action = "action";
        patterns.add(pattern);
        recognizerFoo.pattern = patterns;


        recognizers.put("foo", recognizerFoo);
        startInputHandlerDirective.recognizers = recognizers;

        Map<String, DefineEvent> events = new HashMap<>();
        DefineEvent defineEvent = new DefineEvent();
        defineEvent.shouldEndInputHandler = true;
        events.put("foo event", defineEvent);
        startInputHandlerDirective.events = events;


        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("foo.json"), startInputHandlerDirective);
    }
}
