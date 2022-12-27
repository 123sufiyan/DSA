
public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // we created a new pen object p1
        
        // int getSize(){       // these GETTERS
        //     return this.size;
        // }
        p1.setColour("Blue");  // these are SETTERS
        p1.setSize(50);
        // String getColour() {  // these are GETTERS
        //     return this.colour;  // this is uses to get current value in java
        // }


        BankAccount myAcc = new BankAccount();
        myAcc.username = "123Sufiyan123";  
        // myAcc.password = "2345678";  // we cannot access password cause it is private
        myAcc.newPassword("12345");



            // Student s1 = new Student();  constructor
            // System.out.println(s1);



            //copy cons

            Student s1 = new Student();
            s1.name = "Sufi";
            s1.rollNo = 566;


            Student s2 = new Student(s1);
            System.out.println();
            System.out.println();



                //INHERITENCE
                Fish shark = new Fish();
                shark.eat();
                shark.breathe();
                System.out.println();
                System.out.println();



                Dog hira = new Dog();
                hira.eat();
                hira.hotBlood();
                hira.breed();
                System.out.println();
                System.out.println();





                //ABSTRACTION
                Queen q = new Queen();
                q.moves();
                System.out.println();
                System.out.println();
                


        //MULTIPLE INHERITENCE

        Bear bhalu = new Bear();
        bhalu.eats();
        bhalu.sleeps();
        System.out.println();
        System.out.println();

    }}

class BankAccount{
    public String username;
    private String password;  
    public static void newPassword(String pwd) {
        String newPassword = pwd;
        
    }
}
class Pen{

    String colour;
    int size;

    void setColour(String newColour) {
        colour = newColour;
    }

    void setSize(int newSize){
        size = newSize;
    }
}



// Constructor
class Student{
    String name;
    int age;
    int rollNo;
    
    

    //this is constructor
    Student(){
        System.out.println("Constructor is called, line 63");}




    // copy constructor(Shallow)
    Student(Student s1){
        System.out.println("This is copy constructor, line 82");
        this.name = s1.name;
        this.age = s1.age;
        this.rollNo = s1.rollNo;
    }}



    //INHERITENCE

// Parent class/base class
class Animal{
    String colour;
    public static void eat() {
        System.out.println("eats on line 104");
    }
    void breathe() {
        System.out.println("breadths");
    }}


 //Child class/derived class
 class Fish extends Animal{     //extend word is used to copy the properties of a class
    void fins(){
        System.out.println("fish have fins on line 108");
    }
}

//derived class

class Mammals extends Animal{
    void hotBlood(){
        System.out.println("mammals are hot blooded on line 123");
        int legs;
    }
}

class Dog extends Mammals{
    void breed(){
        System.out.println("dog breed on line 129");

    }
}




//ABSTRACTION
//INTERFACE


interface ChessPlayer{      //created the blueprint for the chessplayer, moves will be not defined as it is abstracted
    void moves();       
}


class Queen implements ChessPlayer{
    public void moves(){        //only void will create default method, we need public for interface
        System.out.println("left,right,up,down,digonal");
    }}

    class king implements ChessPlayer{
        public void moves(){      
            System.out.println("left,right,up,down,digonal(only 1 space)");
        }}
        class rook_elephant implements ChessPlayer{
            public void moves(){        
                System.out.println("left,right,up,down,");
            }}


            ///MULTIPLE INHERITENCE
            interface Herbivore{
                 void eats();
            }
            interface Carnivore{
                void sleeps();
            }

            class Bear implements Herbivore , Carnivore{
                public void eats() {
                    System.out.println("herbiore prop");
                }
                public void sleeps() {
                    System.out.println("carnivore prop");
                }
            }

             
