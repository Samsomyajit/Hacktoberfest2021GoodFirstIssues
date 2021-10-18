#include<stdio.h>
#include<stdlib.h>
 
void display(int[] ,int);
void heapSort(int[],int);
void buildHeap(int[], int);
int delRoot(int[],int*);
void heapify(int[],int,int);

 
 int n;

int main()
{
   int choice,i;
   char ch[20];
   int arr[100];

   
    
 
            printf("Enter no. of elements : ");
            scanf("%d",&n);

            printf("Enter elements : ");
            for(i=0;i<n;i++) 
                scanf("%d",&arr[i]);
            
                
                    heapSort(arr,n-1);
                    printf("Sorted Array : ");
                    display(arr,n);
  
return 0;
}
 


void display(int arr[],int n) {
    
    
    for(int i=0;i<n;i++) {
        printf("%d ",arr[i]);
   }
    printf("\n");
}
 


void heapSort(int arr[],int size) {

    int max=0;
    buildHeap(arr,size);
    printf("\nHeap : ");
    display(arr,size+1);
    while(size>0) {
        
       max=delRoot(arr,&size);
       arr[size+1]=max;
        
    }
}

void buildHeap(int arr[],int size) {
    
    for(int i=size/2;i>=0;i--){
        
        heapify(arr,i,size);
    }
}

int delRoot(int arr[],int *size) {

    int max=arr[0];
    arr[0]=arr[*size];
    (*size)--;
    heapify(arr,0,*size);
    return max;
    
}

void heapify(int arr[],int i,int size) {
    
    int lchild=2*i+1,rchild=lchild+1;
    int num=arr[i];
    
    while(rchild<=size){
        
        if(num>arr[lchild]&&num>arr[rchild]){
            
            arr[i]=num;
            return;
        }
        else if(arr[lchild]>arr[rchild]){
            
            arr[i]=arr[lchild];
            i=lchild;
        }
        else {
            
            arr[i]=arr[rchild];
            i=rchild;
        }
        lchild=2*i +1;
        rchild=lchild+1;
    }
    if(lchild==size && num<arr[lchild]){
            
        arr[i]=arr[lchild];
        i=lchild;
        
    }
    arr[i]=num;
    
}

