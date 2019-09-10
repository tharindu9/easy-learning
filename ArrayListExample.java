import java.util.ArrayList;
import java.util.List;


public class ArrayListExample {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Integer[] intA = {1,2,3,5,6};
//		Object[] outPut = append(100, intA);
//		System.out.println(outPut[5]);		
        Object[] outPutRemove = remove(2, intA);
        System.out.println(outPutRemove[3]);
        for (Object x : outPutRemove) {
            System.out.print(x + " " );
        }
        System.out.println();
        System.out.println(add(3,intA,5)[3] + " " + add(3,intA,5)[5] );
        System.out.println(get(3,intA));

    }

    public static Object[] append(Object value,Object[] arr){
        int size = arr.length;
        Object[] newArray = new Object[size+1];
        for(int i=0;i<size;i++){
            newArray[i] = arr[i];
        }
        newArray[size]=value;
        return newArray;
    }

    public static Object[] remove(int index,Object[] arr){//Sample code to remove item on a arraylist
        int size = arr.length-1;
        Object[] newArr = new Object[size];
        for(int i=0;i<index;i++){
            newArr[i]=arr[i];
        }
        for(int k=index;k<size;k++){
            newArr[k] = arr[k+1];
        }
        return newArr;
    }

    public static Object[] add(int index , Object[] arr,Object value){
        int size = arr.length+1;
        Object[] newArr = new Object[size];
        for(int i=0;i<index;i++){
            newArr[i]=arr[i];
        }
        newArr[index] = value;
        for(int i=index+1;i<size;i++){
            newArr[i]=arr[i-1];
        }
        return newArr;
    }

    public static Object get(int index,Object[] arr){
        return arr[index];
    }

}
