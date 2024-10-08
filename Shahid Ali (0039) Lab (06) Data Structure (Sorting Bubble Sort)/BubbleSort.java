
package bubblesort;
public class BubbleSort {
 boolean sort=false;
   
public void bubblesort(int[] Arr){ 
    int steps=0;
for(int i=0; i < Arr.length-1;i++){
    for(int j=0; j < Arr.length-1;j++){
        steps++;
        if(Arr[j] > Arr[j+1]){
        int temp =  Arr[j];
        Arr[j]=Arr[j+1];
        Arr[j+1]=temp;  
    }
    }
}
    for(int i=0; i<Arr.length;i++){
       System.out.print(Arr[i] + " ");
   } 
     System.out.println("steps: "+steps);
}

public void EarlyStopBubbleSort(int[] Arr){   
    int stepOfsorted=0;
    for(int i=0; i < Arr.length-1;i++){ 
    for(int j=0; j < Arr.length-1-i;j++){
        stepOfsorted++;
        if(Arr[j] > Arr[j+1]){
              int temp =  Arr[j];
              Arr[j]=Arr[j+1];
              Arr[j+1]=temp;
              sort=true;        
}
    if(sort==false){
    break;
    }
    }
}
 for(int i=0; i<Arr.length;i++){
       System.out.print(Arr[i] + " ");
   }
  System.out.println("steps: "+stepOfsorted);
}

public void StringBubbleWithEarlyStopSort(String[] Arr){ 
    int strSteps=0;
for(int i=0; i < Arr.length-1;i++){
    
    for(int j=0; j < Arr.length-1-i;j++){
        strSteps++;
        if(Arr[j].length() > Arr[j+1].length()){
              String temp =  Arr[j];
              Arr[j]=Arr[j+1];
              Arr[j+1]=temp;
              sort=true;        
}
    if(sort==false){
    break;
    }
    }
}
    
 for(int i=0; i<Arr.length;i++){
       System.out.print(Arr[i] + " ");
   }
  System.out.println("steps: "+strSteps);
 
}
   
    public static void main(String[] args) {
  int[] arr={5,1,3,4,6,2};  
  String[] StrArr={"apple","pie","banana","cat"};
   BubbleSort B1 = new BubbleSort();

   B1.bubblesort(arr);
   B1.EarlyStopBubbleSort(arr);
   B1.StringBubbleWithEarlyStopSort(StrArr);
   
    }
    
}
