public class Search_Sort {
public static void Bubble_Sort(int arr[]) {
	int help;
	for(int i=0;i<=arr.length-2;i++) {
		for(int j=0;j<=arr.length-2-i;j++) {
			if(arr[j]>arr[j+1]) {
				help=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=help;
			}
		}
	}
}
public static void Selection_Sort(int arr[]) {
	int min;
	int pos;
	int help;
	for(int i=0;i<=arr.length-2;i++) {
		min=arr[i];
		pos=i;
		for(int j=i+1;j<=arr.length-1;j++) {
			if(arr[j]<min) {
				min=arr[j];
				pos=j;
			}
		}
		help=arr[i];
		arr[i]=arr[pos];
		arr[pos]=help;
	}
}
public static void Insertion_Sort(int arr[]) {
	
	for(int i=1;i<=arr.length-1;i++) {
		int item=arr[i];
		int j=i-1;
		while( j>=0 && arr[j]>item) {
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=item;
	}
}
public static int Linear_Search(int key,int arr[]) {
	for(int i=0;i<=arr.length-1;i++) {
		if(key==arr[i]) {
			return i;
		}
	}
	return -1;
}
public static int Binary_Search(int key,int arr[]) {
	int low=0;
	int high=arr.length-1;
	int mid;
	for(int i=0;i<=arr.length-1;i++) {
		mid=(low+high)/2;
		if(key==arr[mid]) 
		{
			return mid;
		}
		else if(key>=arr[mid]) 
		{
			low=mid+1;
		}else 
		{
			high=mid-1;
		}
	}
return -1;
		
}

}
