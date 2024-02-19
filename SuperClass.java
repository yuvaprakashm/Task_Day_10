package net.texala.main;

class Superclass {
    private int privateMember;

    public Superclass(int privateMember) {
        this.privateMember = privateMember;
    }

    public void display() {
        System.out.println("Private member in the superclass: " + privateMember);
    }
}
