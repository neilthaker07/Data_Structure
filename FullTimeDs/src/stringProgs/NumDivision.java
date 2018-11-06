public class NumDivision{

// Divide numbers 
// input : 10.00, 3
// output : [3.34, 3.33, 3.33]
     public static void main(String []args){
        System.out.println("Hello World");
     
        int K=3;
        double N = 20.00;
        double array[] = new double[K];
        for (int i = 0 ;i<K;i++){
            double x = N / K;
              
            String g = String.valueOf(x);
            int q = g.indexOf('.');
            g=g.substring(0,q+3);
            double dd = Double.valueOf(g);
            array[i]=dd;
            //System.out.println(array[i]);
        }
        //divide up the remainder
        for(int i = 0 ;i<N%K;i++)
            array[i] += 0.01;
            
        for(int i=0;i<K;i++)
        {
            System.out.println(array[i]);
        }
     }
}
