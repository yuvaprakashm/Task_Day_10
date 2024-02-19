package net.texala.main;

class Subclass extends Superclass {
     
    public Subclass(int privateMember) {
        super(privateMember); 
    }

     
    public void displayInSubclass() {
         
       //   System.out.println("Private member in the subclass: " + privateMember);
    }
}