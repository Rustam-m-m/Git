import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.prism.shader.Solid_ImagePattern_Loader;
import com.sun.security.auth.SolarisNumericUserPrincipal;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by ww on 09.05.14.
 */
/*Необходимо посчитать равномерность распределения целых рандомных чисел, генерируемых классом Random.
Программа должна выполняться для каждого k от 10 до 100.
Для каждого числа K надо выполнить генерацию 1 000, 10 000, 100 000, 1 000 000 и 10 000 000
случайных чисел в диапазоне от 1 до k. */

public class RandomSome {
    public double d;
    public HashMap<Integer, Integer> map;

    public RandomSome(int K, int k){
        this.map = createArList(K, k);
        this.d = (maxMin(map, true) - maxMin(map, false))/K;
    }

    public double maxMin(HashMap<Integer, Integer> mapMax, boolean flag){
       //метод находит находит max – количество появлений для наиболее часто встречающегося числа,
       //                      min -  количество появлений для наиболее редкого числа
        double value;
        double max = 0;
        double min = mapMax.get(1);

        if (flag == true){
            for (Map.Entry<Integer, Integer> pair : mapMax.entrySet()){
                value = pair.getValue();
                if (value > max){
                    max = value;
                }
            }
            return max;
        }else{
            for (Map.Entry<Integer, Integer> pair : mapMax.entrySet()){
                value = pair.getValue();
                if (value < min){
                    min = value;
                }
            }
            return min;
        }

    }

    public static void main(String[] args) {
        final int K3 = 1000;
        final int K4 = 10000;
        final int K5 = 100000;
        final int K6 = 1000000;
        final int K7 = 10000000;

        final int k = 10;
        final int maxK = 100;
        int i = k;

       for (;i <= maxK; i++ ){
           RandomSome randomSome3 = new RandomSome(K3, i);
           RandomSome randomSome4 = new RandomSome(K4, i);
           RandomSome randomSome5 = new RandomSome(K5, i);
       //    RandomSome randomSome6 = new RandomSome(K6, i);
       //    RandomSome randomSome7 = new RandomSome(K7, i);

           System.out.println("#" + i);
           System.out.println(K3 + " - " + randomSome3.d);
           System.out.println(K4 + " - " + randomSome4.d);
           System.out.println(K5 + " - " + randomSome5.d);
         //  System.out.println(K6 + " - " + randomSome6.d);
          // System.out.println(K7 + " - " + randomSome7.d);
       }
    }

    public static HashMap<Integer, Integer> counter(ArrayList<Integer> listToMap){

        // считает сколько раз число встречается ArrayList и записывает в HashMap

        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        int count = 0;
        for (int i = 0; i < listToMap.size(); i++){
             for (Integer h : listToMap){
                    if (listToMap.get(i) == h){
                        count++;
                    }
             }

            hashMap.put(listToMap.get(i), count);
            count = 0;
        }
        return hashMap;
    }

    public static HashMap<Integer, Integer> createArList (int K , int k){

        // создает ArrayList с рандомными числами,
        // считает сколько раз число встречается в ArrayList и записывает в HashMap

        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();

            ArrayList<Integer> listToMap = createRandomList(K, k);
            m =  counter(listToMap);

    return m;
    }


    /* //используется только для теста
    public static void printHush (HashMap<Integer, Integer> map, int k){

        System.out.println("k = " + k + ":");
        for (Map.Entry<Integer, Integer> pair : map.entrySet() ){
            int key = pair.getKey();
            int value = pair.getValue();
            System.out.println(key + " : " + value);

        }
    }
    */

    public static ArrayList<Integer> createRandomList(int GENERATION, int k ){
       // здесь и создается рандомный ArrayList
       // GENERATION - сколько значений нужно создать,
       // k - в каких пределах значения

        ArrayList<Integer> list = new ArrayList<Integer>();
        Random random = new Random();
        for (int j = 0; j <= GENERATION; j++){
            int rand = random.nextInt(k) + 1;
            list.add(rand);
        }
        return list;
    }
}