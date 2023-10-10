 public void rotate(int[][] matrix) {

        //Transpose
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        //Reverse
         for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j]=temp;
            }
        }
        System.out.print("[");
        for(int i=0;i<matrix.length;i++){
             System.out.print("[");

            for(int j=0;j<matrix[0].length;j++){
                {
                    if(j != matrix[0].length-1)
                    System.out.print(matrix[i][j]+",");
                    else
                    System.out.print(matrix[i][j]);
                }

                System.out.println("]");
                if(i != matrix.length-1)
                System.out.println(",");
                else
                System.out.println("]");
        
    }
        }
    }
