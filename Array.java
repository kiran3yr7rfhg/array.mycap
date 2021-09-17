public class Array {

    public static void main(String[] args) {
        int a [][]= {{1,3,4},{2,4,3},{3,4,5}};
        int b [][]= {{1,3,4},{2,4,3},{3,4,5}};
        int [][] sum = new int [3][3];
        int [][] mult = new int [3][3];
        int i,j;
        for(i=0;i<a.length;i++){
            for (j=0;j<b.length;j++) {
                sum[i][j] = a[i][j]+b[i][j];
                mult[i][j] = a[i][j] * b[i][j];

                
            }
        }
        System.out.println("the matrix of addition is :  ");
        for(i=0;i<a.length;i++){
            for (j=0;j<b[0].length;j++) {
                System.out.format("%d\t",sum[i][j] );


            }
            System.out.println("");
        }
        System.out.println("the matrix of multplication  is :  ");
        for(i=0;i<a.length;i++){
            for (j=0;j<b[0].length;j++) {
                System.out.format("%d\t",mult[i][j] );


            }
            System.out.println("");
        }
        

    
        
    
        


    }
}