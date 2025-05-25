package Linear_Search;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},
                            {3,2,1}  };
         System.out.println(maximumWealth(accounts));                   
    }
    public static int maximumWealth(int[][] accounts) {
        int max = 0;

        for (int i = 0; i < accounts.length; i++) {
            int p=0;

             for (int j = 0; j < accounts[i].length; j++) {
                   p= accounts[i][j]+p;
                    
             }
            if(p>max){
                max=p;
            }
        }
        
        return max;
        }
        
        
    }
    

