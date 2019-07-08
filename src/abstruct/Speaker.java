package abstruct;

public abstract class Speaker
{
   abstract void audio();
   abstract void talk();
   String search = "facebook.com";
   void webSearch()
   {
       System.out.println("Here is the result for: "+search);
   }
}