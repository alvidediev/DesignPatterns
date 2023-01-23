package ru.dediev.oop.patterns.structural.adapter;

public class TranslatorRunner {
    public static void main(String[] args) {
        DataInXML dataInXML = new AdapterXMLtoJSON();

        dataInXML.workOnlyWithXML();
    }
}
