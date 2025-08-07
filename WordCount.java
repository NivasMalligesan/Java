import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   String name = "Apple banana apple";
	   String [] words = name.toLowerCase().split(" ");
	   
	   TreeMap <String,Integer> map = new TreeMap<>();
	   
	   for(String word : words){
	       if(map.containsKey(word)){
	           map.put(word,map.get(word)+1);
	       }else{
	           map.put(word,1);
	       }
	   }
	   
	   for(Map.Entry<String,Integer> entry : map.entrySet()){
	       System.out.println(entry.getKey() + entry.getValue());
	   } 
	}
}
