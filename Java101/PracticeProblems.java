//problem 1
public class PracticeProblems {
    public static void main(String[] args) {
        int[] arr= {1,3,6,4,4,3,6,7,4};
        int n=4;

        System.out.println(countOccurrences(arr,n));

    }

        public static int countOccurrences (int[] arr, int n) {
            int numOfn = 0;
            for (int number : arr ) {
                if (number == n)
                    numOfn ++;
            }
            return numOfn;
            
        }   
}

//problem 2
public class PracticeProblems {
    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 4, 2, 4, 6, 7, 3};
        int[] reverseArr = reverseArray(arr);
        for (int num : reverseArr) {
            System.out.println(num);
        }
    }

    public static int[] reverseArray(int[] arr) {
        int[] reverse = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reverse[i] = arr[arr.length - 1 - i];
        }
        return reverse;
    }
}

//problem 3
public class PracticeProblems {
    public static double sumGrid(double[][] grid) {
           double sum = 0.0;
           for (int i = 0; i < grid.length; i++) {
           for (int j=0; j < grid[i].length; j++) {
                sum += grid[i][j];
               }
           }

           return sum;
       }
   
   
   public static void main(String[] args) {
       double[][] grid = {
           {7, 3, 4},
           {9, 2, 6},
           {4, 1, 2}
       };

       double total = sumGrid(grid);
       System.out.println(total);
       
       
      
   } 
}

//problem 4
public class PracticeProblems {

    public static int fib(int[] arr) {
        if (n<=1) {
            return n;
        }

        int x = 0;
        int y = 1;

        for (int i=2; i <= n; i++) {
            int z = x + y;
            x=y;
            y=z;
        }
        return y;

    }
    public static void main(String[] args) {
       System.out.println (fib(n));
    }
}