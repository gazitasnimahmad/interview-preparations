/*
package com.Interview.solidprinciples.lsp.LSP;

public class LspCorrect {
    public static void main(String[] args) {
        // Using base class reference with subclass instances
        Bird bird1 = new FlyingBird();  // Valid substitution
        Bird bird2 = new Penguin();     // Valid substitution

        bird1.eat();  // Works for all birds
        bird2.eat();  // Works for all birds

        // Additional behaviors (require casting)
        if (bird1 instanceof FlyingBird) {
            ((FlyingBird)bird1).fly();
        }

        if (bird2 instanceof Penguin) {
            ((Penguin)bird2).swim();
        }
    }

    // Method that accepts any Bird subclass (LSP in action)
    public static void makeBirdEat(Bird bird) {
        bird.eat();  // Guaranteed to work for all Bird subtypes
    }

}

public class Bird {
    public void eat() {
        System.out.println("Bird is eating...");
    }
}

public class FlyingBird extends Bird {
    public void fly() {
        System.out.println("FlyingBird is flying...");
    }
}

public class Penguin extends Bird {
    public void swim() {
        System.out.println("Penguin is swimming...");
    }
}*/
