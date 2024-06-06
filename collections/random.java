import java.util.*;
class Main
{
	public static void main(String[] args) {
		Random r = new Random();
	for(int i=0;i<=7;i++)
	{
		char c = (char)(r.nextInt(26) + 'a');
		System.out.print(c);
	}
	}
}
