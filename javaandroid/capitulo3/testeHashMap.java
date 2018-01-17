package br.com.androidpro.javaandroid.capitulo3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class testeHashMap {

    public static void main (String[] args) {

        HashMap<String, Double> map = new HashMap<>();

        map.put("Donut", new Double(1.6));
        map.put("Eclari", new Double(2.1));
        map.put("Froyo", new Double(2.2));

        System.out.println("HashMap: " + map);

        Set<Map.Entry<String, Double>> set = map.entrySet();
        Iterator<Map.Entry<String, Double>> i = set.iterator();

        System.out.println();

        while (i.hasNext()) {
            Map.Entry<String, Double> mapI = i.next();
            System.out.println("Chave: " + mapI.getKey() + " VALOR: " + mapI.getValue());
        }




    }
}
