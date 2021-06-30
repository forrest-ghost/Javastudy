public class FirstQuestion {
     public static void main(String[] args) {
         int j=0;
    for (int i=1;i<=100;i++) {
        if(i%7!=0)
        {
            System.out.print(i);
            System.out.print("\t");
            if(j==3)
            System.out.print("\n");
            j=(j+1)%4;
        }

        }    
    }
}