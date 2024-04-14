public class arr2dRandzero {
    public static void main(String[] args){
        int arr[][] = new int[4][4];
        for(int i=0;i<4;++i){
            for(int j=0;j<4;++j){
                arr[i][j] = 0;
            }
        }

        int randomten = 0;

        while(randomten != 10){
            int a = (int)(Math.random() * 4);
            int b = (int)(Math.random() * 4);
            if(arr[a][b] != 0){
                continue;
            }
            arr[a][b] = (int)(Math.random() * 10 + 1);
            ++randomten;
            //System.out.println(arr[a][b]);
            
        }

        for(int i=0;i<4;++i){
            for(int j=0;j<4;++j){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
