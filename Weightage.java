class Weightage {
    public static void main(String[] args) {
     int arr[]={49,36,10,8,12};
     int weightageArr[]=new int[arr.length];
     for(int i=0;i<arr.length;i++){
         int weightage=0;
         if(isPerfect(arr,i)==true)
             weightage+=5;
         if(arr[i]%4==0&&arr[i]%6==0)
             weightage+=4;
         if(arr[i]%2==0)
             weightage+=3;
        // System.out.println("<"+arr[i]+","+weightage+">");
        weightageArr[i]=weightage;
     }
     for(int i=0;i<weightageArr.length;i++){
         for(int j=i+1;j<weightageArr.length;j++){
             if(weightageArr[i]==weightageArr[j]) {
                 if (arr[i]<arr[j])
                     swap(arr,i,j);
             }
            else if(weightageArr[i]<weightageArr[j]) {
                 swap(arr, i, j);
                 swap(weightageArr,i,j);
             }
         }
     }
        System.out.println("Output: <Number,weightage> ");
       for(int i=0;i<arr.length;i++){
           System.out.print("<"+arr[i]+","+weightageArr[i]+">"+" ");
       }
    }
     static boolean isPerfect(int[] a,int b){
        boolean status=false;
        int temp=(int)Math.sqrt(a[b]);
        if(a[b]==temp*temp)
            status=true;
        return status;
     }
     static int[] swap(int a[],int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
        return a;
     }

}

