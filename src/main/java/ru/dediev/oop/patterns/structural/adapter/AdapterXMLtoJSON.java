package ru.dediev.oop.patterns.structural.adapter;

public class AdapterXMLtoJSON extends FrameworkForWorkWithJSON implements DataInXML {
    @Override
    public void workOnlyWithXML() {
        //бизнес-логика по преобразованию xml в json ^_^
        workOnlyWithJSON();
    }
}
