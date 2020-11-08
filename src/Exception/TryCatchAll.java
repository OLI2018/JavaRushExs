package Exception;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TryCatchAll {

  public static void main(String[] args)  {

    readData();
  }

  public static void readData()   {

    int b = 1;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    List<Integer> list = new ArrayList<>();

    try{
      for(int i = 0; i < b; i++){
        int num = Integer.parseInt(reader.readLine());
        b++;
        list.add(num);
      }
    }
    catch(Exception e){
      for(int k = 0; k < list.size(); k++) {
        System.out.println(list.get(k));
      }
    }
  }
}

