/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package graph1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Shahid Ali
 */


public class Graph1 {

    public void detectConnectedComponents(int[][] matrix) {
        int n = matrix.length;
        boolean[] visited = new boolean[n];  // Track visited vertices
        List<List<Integer>> connectedComponents = new ArrayList<>();

        
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
               
                List<Integer> component = new ArrayList<>();
                dfs(matrix, i, visited, component);
                connectedComponents.add(component);
            }
        }

        
        System.out.println("Connected Components:");
        for (int i = 0; i < connectedComponents.size(); i++) {
            System.out.print("Component " + (i + 1) + ": ");
            System.out.println(connectedComponents.get(i));
            
        }
    }


    private void dfs(int[][] matrix, int node, boolean[] visited, List<Integer> component) {
        visited[node] = true;
        component.add(node + 1);  

        
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[node][i] == 1 && !visited[i]) {
         dfs(matrix, i, visited, component);
            }
        }
    }
    public static void main(String[] args) {
           Graph1 graph=new Graph1();
      int[][] matrix = {
            {0, 1, 1, 0, 0},  
            {1, 0, 1, 0, 0},  
            {1, 1, 0, 0, 0},  
            {0, 0, 0, 0, 1},  
            {0, 0, 0, 1, 0}  
        };

      
        graph.detectConnectedComponents(matrix);
    }
    
}
