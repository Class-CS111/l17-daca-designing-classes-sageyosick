/********************************************
*	DACArecipient Tester
*********************************************
*	PROGRAM DESCRIPTION:
*	This program is to test methods of the DACArecipient class.
*********************************************/
class Main 
{
  public static void main(String[] args) 
	{
    DACArecipient person1, person2;
    
    person1 = new DACArecipient();
    person2 = new DACArecipient();

    person1.setAll("Mendez", "Javier", "56-3-445", "El Salvador", 2451564, 3956753, 3956840, 'M');
    person2.setAll("Mendez", "Javier", "56-3-445", "El Salvador", 2451564, 3956753, 3956840, 'M');

    System.out.println(person1);
    System.out.println(person2);
    System.out.println(person1.equals(person2));

    System.out.println(person1.printCard());

  }
}