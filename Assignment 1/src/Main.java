/*As you know that java do not support multiple class inheritance. 
In case of need what should you do ? How to achieve multiple inheritance?
For this assignment you have to write a program to demonstrate multiple inheritance .

NOTE : You have to write the code according to the proper OOP manner.  
Define classes clearly and then upload the code on github and post here 
the link to your git repo.*/


public class Main {
    public static void main(String[] args) throws Exception {
        Engine obj1 = new Car();
        MusicSystem obj2 = new Car();

        obj1.startEngine();
        obj2.playMusic();
    }
}


