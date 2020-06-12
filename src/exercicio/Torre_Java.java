package exercicio;


import java.util.Scanner;

public class Torre_Java {
	
	static int line = 8, colun = 8;
    static int[] casa = {0 ,0};
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        System.out.println("Para sair digite 999 nas duas poisçõe \n \n");
        screen();
    }
    
    private static boolean inputPrint(String txt, int value, int cs)
    {
        boolean r = false;
        
        while(true)
        {
            System.out.println(txt);
            int num = input.nextInt();
            
            if (num == 999)
            {
               r = false;
               break;
            }
            else if (num < (value + 1) && num >= 1)
            {
                casa[cs] = num;
                r = true;
                break;
            }
            else
            {
                System.out.println("\nAlerta: O número inserido é invalido! \n");
            }
        }

        return r;
    }
    
    private static void screen() 
    {
        while(true)
        {
            if (
                inputPrint("Digite a linha que a Torre se encontra", line, 1) && 
                inputPrint("Digite a coluna que a Torre se encontra", colun, 0)
            )
            {
                boardPrint();
            }
            else
            {
                break;
            }
        }
    }
    
    private static void boardPrint()
    {
        String hr = "";
                
        System.out.print("    ");
        
        for(int z = 1; z <= line; z++)
        {
            System.out.printf(" %d ",z);
            hr += "---";
        }
      
        System.out.print("\n    ");
        System.out.println(hr);
        
        for(int x = 1; x <= colun; x++)
        {
            String y = "";
            
            for(int z = 1; z <= line; z++)
            {   
                if (z == casa[0] || x == casa[1])
                {
                    y += "x  ";
                }
                else
                {
                    y += "-  ";
                }
            }
            
            System.out.printf(" %d | %s\n", x, y);
        }
        
        System.out.println("");
    }

}
