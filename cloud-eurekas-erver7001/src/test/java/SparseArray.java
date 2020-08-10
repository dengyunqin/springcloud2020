public class SparseArray {
    public static void main(String[] arg0){
        int oldArray[][] = new int [11][11];
        oldArray[1][2]=1;
        oldArray[2][3]=2;
        System.out.println("原始数组为:");
        for(int[] row : oldArray){
            for(int data : row){
                    System.out.print("  "+data);
            }
            System.out.println();
        }
        int count=0;
        for(int i=0;i<11;i++){
            for(int j=0;j<11;j++){
                if(oldArray[i][j]!=0){
                    count++;
                }
            }
        }
        System.out.println("稀疏数组数据个数为:"+count);
        int sparseArray[][] = new int[count+1][3];
        sparseArray[0][0]=11;
        sparseArray[0][1]=11;
        sparseArray[0][2]=count;
        int cou=0;
        for(int i=0;i<11;i++){
            for(int j=0;j<11;j++){
                if(oldArray[i][j]!=0){
                    cou++;
                    sparseArray[cou][0]=i;
                    sparseArray[cou][1]=j;
                    sparseArray[cou][2]=oldArray[i][j];
                }
            }
        }
        for(int[] row : sparseArray){
            for(int data : row){
                System.out.print("  "+data);
            }
            System.out.println();
        }
        int restoreArray [][] = new int[sparseArray[0][0]][sparseArray[0][1]];
        for(int i=1;i<=sparseArray[0][2];i++){
            restoreArray [sparseArray[i][0]][sparseArray[i][1]]=sparseArray[i][2];
        }
        System.out.println("还原后的稀疏数组");
        for(int[] row : restoreArray){
            for(int data : row){
                System.out.print("  "+data);
            }
            System.out.println();
        }
    }



}
