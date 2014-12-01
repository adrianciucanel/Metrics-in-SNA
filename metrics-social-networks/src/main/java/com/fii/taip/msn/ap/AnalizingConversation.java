package com.fii.taip.msn.ap;

import com.fii.taip.msn.dbmodel.Conversation;

public class AnalizingConversation {

    private Conversation conversation;
    private int sympathy;
    private Interpreter interpreter;
    private DictionarRepository dictionarRepository;

    public AnalizingConversation(Conversation conversation) {
        if (this.conversation == null)
            sympathy = 0;
        this.conversation = conversation;
        interpreter = new Interpreter();
        dictionarRepository = new DictionarRepository();
    }

    public void addToDataBase(String key, Conversation conversation, int sympathy) {
    }

    public void getFromDataBase(String Key) {
    }

    public void setSympathy(int value) {
        sympathy += value;
    }

    public int getSympathy() {
        return sympathy;
    }

    public Conversation getConversation() {
        return conversation;
    }

    public void setConversation(Conversation conversation) {
        this.conversation = conversation;
    }

    public Interpreter getInterpreter() {
        return interpreter;
    }

    public void setInterpreter(Interpreter interpreter) {
        this.interpreter = interpreter;
    }

    public DictionarRepository getDictionarRepository() {
        return dictionarRepository;
    }

    public void setDictionarRepository(DictionarRepository dictionarRepository) {
        this.dictionarRepository = dictionarRepository;
    }
}
