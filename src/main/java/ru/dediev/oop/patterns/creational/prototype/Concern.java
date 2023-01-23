package ru.dediev.oop.patterns.creational.prototype;

//Не самое удачное название, но Cloneable уже занят =)
public interface Concern<T> {
    T copy();
}
