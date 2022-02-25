// Java program to print DFS 
//Mtraversal from a given given graph 

import java.io.*;
import java.util.*;

// This class represents 
//directed graph using adjacency 
// list representation 

class Graph12 {
    private int V; //. of vertices 

    // Array of lists fro 
    //Adjancency List representation 
    private LinkedList<Integer> adj[];

    // Constructor 
    @SuppressWarnings("unchecked") Graph12(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    // Function to add an edgg into the graph 
    void addEdge(int v, int w)
    {
        adj[v].add(w); // Add w to v's list.
    }

    // A function used by DFS
    void DFSUtil(int v, boolean visited[])
    {
        // Mark the current node as visited and print it 
        visited[v] = true;
        System.out.print(v + " ");

        //Recur for all the vertices adjacent to this 
        //vertex
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }

// The function to do DFS traversal.
//it uses recursive 
// DFSUtil()
void DFS(int v)
{
    // Mark all the vertices as 
    //not visited (set as 
    // false by default in in java)
    boolean visited[] = new boolean[V];

    // Call the recursive helper 
    // functionto print DFS
    //traversal
    DFSUtil(v, visited);

}

// Driver code 
public static void main(String args[])
{
    Graph12 g = new Graph12(4);

    g.addEdge(0, 1);
    g.addEdge(0, 2);
    g.addEdge(1, 2);
    g.addEdge(2, 0);
    g.addEdge(2, 3);
    g.addEdge(3, 3);

    System.out.println(
        "Following is Depth First Traversal "
        + "(starting from vertex 2)");

    g.DFS(2);   
    }
}
//This code is by Aakash Hasija


// Java program to print DFS
// traversal from a given given 
//graph


// This class represents a directed graph using adjacency 
//List representation 
class Graph13{
    private int V; // No. of vertices 

    // Array of lists for 
    //Adjacency List Representation 
    private LinkedList<Integer> adj[];

    // Constructor 
    @SuppressWarnings("unchecked") Graph13(int v)
    {
        V = v; 
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj [i] = new LinkedList(); 
    }

// Function to add an edge into the graph
void addEdge(int v, int w)
    {
    adj[v].add(w); // Add w to v's list.
    }

    // A function used by DFS
    void DFSUtil(int v, boolean visited [])
    {
        // Mark the current node as visited and print it 
        visited[v] = true;
        System.out.print(v + " ");

        // Recur for all the vertices adjacent to this 
        //vertex

        Iterator<Integer> i = adj [v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }


    // The function to do DFS traversal. It uses recursive 
    //DFSUtil()
    void DFS()
    {
        //Mark all the vertices as not visited(set as 
        // fallse by default in java)
        boolean visited[] = new boolean[V];

        //Call the recursive helper function to print DFS 
        //Traversal starting from all vertices one by one 
        for (int i = 0; i < V; ++i)
            if (visited [i] == false)
            DFSUtil(i, visited);
    }

    //Driver Code 
    public static void main(String args [])
    {
        Graph13 g = new Graph13(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println(
            "Following is Depth First Traversal");

        g.DFS();
    }
}

//This code is contributed by Aakash Hasija

