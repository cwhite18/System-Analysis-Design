/** Christopher Lewis White
  * ITFN 3112-01 System Analysis & Design
  * In-Class Example about how Inheritance works
  * Dr. Qu 
  * 09-08-2021
*/

//There is no main method for this operation to run properly!!!//

public class Spaceship{//Only one class can be public//

private int Health = 100;//Attribute//
private int Fuel = 100;//attribute//
public void hit(){
   Health -= 10;//The minus equals configuration allows you to decrement//
 }//End of method//
 
}//End of Spaceship class//


class Warship extends Spaceship{//Inheritance//
private int Health = 100;//Attribute//
private int Fuel = 100;//Attribute//
public void hit(){
   Health -= 5;//The minus equals configuration allows you to decrement//
 }//End of method//
}//End of Warship class//


class Flagship extends Spaceship{//Inheritance//
public void hit(){

 }//End of Flagship class//

}//End of program//