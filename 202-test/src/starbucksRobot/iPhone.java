package starbucksRobot;

public class iPhone
{
    Robot ro = new Robot() ;
    Decaf de = new Decaf(ro) ;
    Shots sh = new Shots(de) ;
    Milk  mi = new Milk(sh) ;
    Drink dr = new Drink(mi) ;
    
    public iPhone( ) { }

    public void setDecaf(String s)
    {
        // input: NO, YES and 1/2
        de.setOption( s ) ;
        
    }
    
    public void setShots(String s)
    {
        // input: 1, 2, 3, d
        sh.setOption( s ) ;
    }

    public void setMilk(String s)
    {
        // input: WH, NF, 1, 2
        mi.setOption( s ) ;
    }
    
    public void setDrink(String s)
    {
        // input: A, L, M, C, CM, CDI, E, ECP
        dr.setOption( s ) ;
    }
    
    public String sendCommand()
    {
        // return command string for robot 
        System.out.println( dr.getCommand() ) ;
        return dr.getCommand().trim() ;
    }
    
    public static void main(String a[])
    {
    	 iPhone iPhone6 = new iPhone();
    	 iPhone6.setDecaf("1/2");
         iPhone6.setShots("D");
         iPhone6.setMilk("NF");
         iPhone6.setDrink("L");
         iPhone6.sendCommand();
         // "Robot: Decaf[1/2] Shots[D] Milk[NF] Drink[L]"
    }
    
}
