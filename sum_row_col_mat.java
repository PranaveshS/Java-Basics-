public class sum_row_col_mat {
    static void array(int arr[][])
    {
        int array=0;
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                array += arr[i][j];
            }  
        }
        System.out.println(array);
    }
    public static void main(String [] args){
        array(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
    }
}
