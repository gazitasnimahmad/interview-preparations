package com.Interview.solidprinciples.lsp.LSP;

class Bird {
    void fly() {
        System.out.println("Flying...");
    }
}

class Penguin extends com.Interview.solidprinciples.lsp.LSP.Bird {  // Penguins can't fly!
    @Override
    void fly() {
        throw new UnsupportedOperationException("Penguins can't fly!");
    }
}

public class LspViolation {
    public static void main(String[] args) {
        com.Interview.solidprinciples.lsp.LSP.Bird bird = new com.Interview.solidprinciples.lsp.LSP.Bird();
        bird.fly();  // ✅ Works fine

        com.Interview.solidprinciples.lsp.LSP.Bird penguin = new com.Interview.solidprinciples.lsp.LSP.Penguin();
        penguin.fly();  // ❌ Throws exception! (LSP Violation)
    }
}