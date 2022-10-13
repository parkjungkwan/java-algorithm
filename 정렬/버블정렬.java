package 정렬;
import java.util.*;
class 버블정렬 {
  public static void main(String[] args) {
    new 버블정렬().solution();
  }
  void solution(){
    int[] arr = creatArray();
    arr = sortArray(arr);
    printArray(arr);
  }
  int createRandomNumber(){
    return (int)(Math.random()*100)+1;
  }
  int[] creatArray(){
    int[] arr = new int[10];
    // for
    return arr;
  }
  int[] sortArray(int[] arr){
    return arr;
  }
  void printArray(int[] arr){
    // for
  }
}
