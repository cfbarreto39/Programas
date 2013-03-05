public class Test
{
	public static void main (String[] args)
	{
		System.out.println("ingrese el valor para s");
		String s= System.console().readLine();

		System.out.println("ingrese el valor para t");
		String t= System.console().readLine();
		
		int i=Integer.parseInt(s);
		double j=Double.parseDouble(t);
		
		

		System.out.println(s+t); //une strings 
		
		System.out.println(i/j); //suma entero y double y lo convierte en double
		System.out.println(s+j); //une los valores de la string s y el double j como strings
		System.out.println(i+t); //suma 
		System.out.println(j+s);
		System.out.println(t+i);
	}
}