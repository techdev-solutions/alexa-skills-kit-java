package com.amazon.speech.speechlet.interfaces.gameengine;

import java.util.List;

public class Recognizer {

    public String type;
    public String anchor;
    public boolean fuzzy;
    public List<String> gadgetIds;
    public List<String> actions;
    public List<Pattern> pattern;
}
