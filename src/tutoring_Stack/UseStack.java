package tutoring_Stack;

import java.util.Stack;

public class UseStack
{
    //first one first in and last one first out
    public static void main(String[] args)
    {
        Stack <String> items = new Stack<String>();

        items.push("Table");                //push() for adding
        items.push("Chair");
        items.push("Light");
        items.push("Mouse");
        items.push("Keyboard");
        items.push("Books");

        System.out.println(items.peek());       //peek is to verify which value has last input
        items.pop();                            //pop is to remove
        System.out.println(items.peek());
        System.out.println(items.search("Mouse"));  //search is to find out current position of the node


    }
}
