
  class Palidrom
  {
   public static void main(String args[])
    {
        String s="mam";
        String rev="";
        for(int i=s.length()-1;i>=0;i--)
        {
        rev=rev+s.charAt(i);
        }
        if(s.equals(rev))
        {
            System.out.print("Palidrome ");
        }
        else{
            System.out.print("not palidrome");
        }
    }
   
  }