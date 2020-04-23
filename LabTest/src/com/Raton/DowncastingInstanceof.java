package com.Raton;
    class Animal{}
    class Dog extends Animal{
        static void method(Animal a){
            if(a instanceof Dog){
                Dog d =(Dog)a;
                System.out.println("Ok,Downcasting Instance of Performed");
            }
        }

        public static void main(String[] args) {
         Animal a = new Dog();
         Dog.method(a);
        }
    }
