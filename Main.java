import java.util.Collections;
import java.util.Map;

// Task # 1
// You have to write a function which takes an array of integers "seq" and an integer "target". There exist two elements of the array whose sum is equal to the target. You can assume that there exists only one solution. You have to return the indices of those elements
// [1,9,2,19]  Target = 3, Answer = 0,2

// [2,4]  Target = 6, Answer =0,1

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }


  private String getTargetIndices(List<Integer> items, int target){
    //[1,9,2,4,19] = 5
    //[1,2,3,9,19]
    //[1,2]
    //3-1 = 2
    //2 = 1,
    // -1
    //

    Collections.sort(list); //nlogn
    // target < = array
    int itemCount = 0;
    int index = -1;
    while(index == -1){(n-1)
      int number = items.get(itemCount);
      int nextNumber = target - number;
       index = getIndexOf(list,-1, 4);//(logn)
      if(index = -1){
        itemCount++;
      }
      
    }
    return itemCount+","+ index;
  }

  //n2
  //loop exec
  //loop ex
  //cons(n)
  //2n

  //[1,2,3,9,19]
  private int getIndexOf(List<Integer> item,int index, int number){
    
    int tempNumber = item.get(index < 0 ? 0 : index);
    if(tempNumber > number){
      index = index/2;
      return getIndexOf(item, index, number);
    }else if(tempNumber < number){
      //5, 10
      index = (index + item.size())/2;
            return getIndexOf(item, index, number);
    }else 
      return index;
  }




  private String (List<Integer> items, target){
    Map<Integer, Integer> itemMap = new HashMap<>();
    for(int i = 0; i< items.size(); i++){
      int value = items.get(i);
      itemMap.put(value, i)
    }
    for(int i = 0; i< items.size(); i++){
      int value = items.get(i);
      int expectedValue = target - value;
     Integer itemVaule = item.get(expectedValue);
      if(itemValue != null){
        return i+","itemValue;
      }
  itemMap }
  }
}