package org.example.task2;

import java.util.HashMap;
import java.util.Map;

public class Graph {

    private static int s; // the number of tests <= 10
    private int n; // the number of cities <= 10000
    private Map<String, Integer> cityList = new HashMap<>(); // List of cities
    private  static int v = 0;//City index
    public static int[][] relationMatrix; // Relation matrix
    public int INF = 200000; //Maximum path cost
    private int p;  // the number of neighbors of city NAME
    //setters block
    public void setS(int s) {
        if (s <= 10)
            this.s = s;
        else System.out.println("s<=10");
    }
    public void setN(int n) {
        if (n <= 10000)
            this.n = n;
        else System.out.println("n<=10000");
    }
    public void setP(int p) {
        this.p = p;
    }
    public void setRelationMatrix(){
        relationMatrix = new int[n+1][n+1];
        for (int i = 0; i <= n; i++) {// matrix is filled with maximum costs
            for (int k = 0; k <= n; k++) {
                relationMatrix[i][k] = INF; // setting default values
            }
        }
    }

    public  void addCity(String name) {// set new cities
        v++;
        cityList.put(name,v); //Put it in the MAP and set the index
    }
    public void addEdge( int nr, int cost) {
        relationMatrix[v][nr] = cost; // Set the cost of the path between cities
    }
    // Then I used the Dijkstra algorithm

    public int dijkstra(String start, String finish) {
        s++;
        boolean[] used = new boolean [n+1]; // array of marks
        int[] pathCost = new int [n+1]; // path cost array
        for (int i = 0; i <= n; i++) {
            pathCost[i]=relationMatrix[cityList.get(start)][i];
        }
        pathCost[cityList.get(start)] = 0; // for the first city path cost = 0

        for (;;) { //Starting an endless loop
            int l = -1;
            for (int nv = 0; nv <= n; nv++) // passes the cities
                // select the nearest unmarked city
                if (!used[nv]  && pathCost[nv] < INF && (l == -1 || pathCost[l] > pathCost[nv]))
                    l = nv;
            if (l == -1) break; // Nearest city not found
            used[l] = true; // mark it
            for (int nv = 0; nv <= n; nv++)
                if (!used[nv] && relationMatrix[l][nv] < INF) // for all unmarked contiguous cities
                    // improve cost estimate
                    pathCost[nv] = Math.min(pathCost[nv], pathCost[l] + relationMatrix[l][nv]);
        }
        return pathCost[cityList.get(finish)];
    }
}
