package com.huynhbaoloc;

public class TextEditor {
    private SpellSpeaker spellSpeaker;
    public TextEditor(SpellSpeaker spellSpeaker){
        System.out.println("Inside TextEditor Contructor.");
        this.spellSpeaker = spellSpeaker;
    }
    public void checkSpelling(){
        spellSpeaker.spellCheck();
    }
}
