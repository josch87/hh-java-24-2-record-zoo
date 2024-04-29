package com.aljoschazoeller.java.zoo;

public record Animal(String id, String name, Species species, short age, Owner owner) {
}
