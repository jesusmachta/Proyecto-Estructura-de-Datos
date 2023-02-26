
package EstructurasdeDatos;

public class Funciones {
    //Estos son los algoritmos DFS, BFS y Dijkstra que no se lograron implementar al 100%, sin embargo, se dejan aquí para que se vea la lógica que se intentó implementar para el proyecto
     ///public int[] distancia = new int[10];
///public int[][] costo = new int[10][10];

///public void calc(int n, int s) {
    ///int[] bandera = new int[n + 1];
    ///int i, minpos = 1, k, c, minima;

    ///for (i = 1; i <= n; i++) {
        ///bandera[i] = 0;
        ///this.distancia[i] = this.costo[s][i];
    ///}
    ///c = 2;
    ///while (c <= n) {
        ///minima = 99;
        ///for (k = 1; k <= n; k++) {
            ///if (this.distancia[k] < minima && bandera[k] != 1) {
                ///minima = this.distancia[i];
                ///minpos = k;
            ///}
        ///}
        ///bandera[minpos] = 1;
        ///c++;
        ///for (k = 1; k <= n; k++) {
            ///if (this.distancia[minpos] + this.costo[minpos][k] < this.distancia[k] && bandera[k] != 1) {
                ///this.distancia[k] = this.distancia[minpos] + this.costo[minpos][k];
            ///}
        ///}
    ///}

///}

///public static void main(String args[]) {
    ///int nodos, posicion, i, j;
    //Scanner sc = new Scanner(System.in);
    ///System.out.println("Ingrese el número de nodos \n");
    ///nodos = sc.nextInt();
    ///Dijkstra d = new Dijkstra();
    //System.out.println("Ingrese los pesos de la matriz de costos: \n");
    ///for (i = 1; i <= nodos; i++) {
        ///for (j = 1; j <= nodos; j++) {
            ///d.costo[i][j] = sc.nextInt();
            //if (d.costo[i][j] == 0) {
                ///d.costo[i][j] = 999;
            ///}
        ///}
    ///}
    ///System.out.println("Ingrese la posicion de origen :\n");
    ///posicion = sc.nextInt();

    ///d.calc(nodos, posicion);
    ///System.out.println("El camino más corto desde la posicion \t" + posicion + "\t a todos los demás puntos son : \n");
    ///for (i = 1; i <= nodos; i++) {
        ///if (i != posicion) {
            ///System.out.println("posicion :" + posicion + "\t destino :" + i + "\t Costo minimo es :" + d.distancia[i] + "\t");
        ///}
    ///}

///}
//Algoritmo BFS
// Una clase para almacenar un borde de graph
//class Edge
//{
    //int source, dest;
 
    //public Edge(int source, int dest)
    //{
        //this.source = source;
        //this.dest = dest;
    ///}
///}
 
// Una clase para representar un objeto graph
//class Graph
//{
    // Una lista de listas para representar una lista de adyacencia
    ///List<List<Integer>> adjList = null;
 
    // Constructor
    //Graph(List<Edge> edges, int n)
    //{
        //adjList = new ArrayList<>();
 
        //for (int i = 0; i < n; i++) {
            ///adjList.add(new ArrayList<>());
        //}
 
        // agrega bordes al grafo no dirigido
        ///for (Edge edge: edges)
        ///{
            //int src = edge.source;
            ///int dest = edge.dest;
 
            //adjList.get(src).add(dest);
            ///adjList.get(dest).add(src);
        ///}
    ///}
///}
 
///class Main
///{
    // Realiza BFS recursivamentemente en el graph
    ///public static void recursiveBFS(Graph graph, Queue<Integer> q,
                                    ///boolean[] discovered)
    ///{
        ///if (q.isEmpty()) {
            ///return;
        ///}
 
        // quitar la queue del nodo frontal e imprimirlo
        ///int v = q.poll();
        ///System.out.print(v + " ");
 
        // hacer para cada borde (v, u)
        ///for (int u: graph.adjList.get(v))
        ///{
            ///if (!discovered[u])
            ///{
                // marcarlo como descubierto y ponerlo en queue
                ///discovered[u] = true;
                ///q.add(u);
            ///}
        ///}
 
        ///recursiveBFS(graph, q, discovered);
    ///}
 
    ///public static void main(String[] args)
    ///{
        // Lista de bordes de graph según el diagrama anterior
        ///List<Edge> edges = Arrays.asList(
                ///new Edge(1, 2), new Edge(1, 3), new Edge(1, 4), new Edge(2, 5),
                ///new Edge(2, 6), new Edge(5, 9), new Edge(5, 10), new Edge(4, 7),
                //new Edge(4, 8), new Edge(7, 11), new Edge(7, 12)
                // los vértices 0, 13 y 14 son nodos individuales
        ///);
 
        // número total de nodos en el graph (etiquetados de 0 a 14)
        ///int n = 15;
 
        // construye un graph a partir de los bordes dados
        ///Graph graph = new Graph(edges, n);
 
        // para realizar un seguimiento de si se descubre un vértice o no
        ///boolean[] discovered = new boolean[n];
 
        // crea una queue para hacer BFS
        //Queue<Integer> q = new ArrayDeque<>();
 
        // Realizar el recorrido BFS desde todos los nodos no descubiertos hasta
        // cubrir todos los componentes conectados de un graph
        ///for (int i = 0; i < n; i++)
        ///{
            ///if (discovered[i] == false)
            ///{
                // marca el vértice de origen como descubierto
                ///discovered[i] = true;
 
                // poner en queue el vértice fuente
                ///q.add(i);
 
                // inicia el recorrido BFS desde el vértice `i`
                ///recursiveBFS(graph, q, discovered);
            //}
        ///}
    ///}
///}
//Algoritmo DFS
///import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
 
// Una clase para almacenar un borde de graph
//class Edge
//{
    //int source, dest;
 
    ///public Edge(int source, int dest)
    ///{
        ///this.source = source;
        ///this.dest = dest;
    //}
//}
 
// Una clase para representar un objeto graph
///class Graph
///{
    // Una lista de listas para representar una lista de adyacencia
    ///List<List<Integer>> adjList = null;
 
    // Constructor
    ///Graph(List<Edge> edges, int n)
    ///{
        ///adjList = new ArrayList<>();
        ///for (int i = 0; i < n; i++) {
            ///adjList.add(new ArrayList<>());
///        }
 
        // agrega bordes al grafo no dirigido
        ///for (Edge edge: edges)
        ///{
            ///int src = edge.source;
            ///int dest = edge.dest;
 
            ///adjList.get(src).add(dest);
            ///adjList.get(dest).add(src);
        ///}
    ///}
///}
 
///class Main
///{
    // Función para realizar el recorrido DFS en el graph en un graph
    ///public static void DFS(Graph graph, int v, boolean[] discovered)
    ///{
        // marca el nodo actual como descubierto
        ///discovered[v] = true;
 
        // imprime el nodo actual
        ///System.out.print(v + " ");
 
        // hacer para cada borde (v, u)
        ///for (int u: graph.adjList.get(v))
        ///{
            // si aún no se ha descubierto `u`
            ///if (!discovered[u]) {
                ///DFS(graph, u, discovered);
            ///}
        ///}
    ///}
 
    ///public static void main(String[] args)
    ///{
        // Lista de bordes de graph según el diagrama anterior
        ///List<Edge> edges = Arrays.asList(
                // Observe que el nodo 0 no está conectado
                ///new Edge(1, 2), new Edge(1, 7), new Edge(1, 8), new Edge(2, 3),
                ///new Edge(2, 6), new Edge(3, 4), new Edge(3, 5), new Edge(8, 9),
                ///new Edge(8, 12), new Edge(9, 10), new Edge(9, 11)
            ///);
 
        // número total de nodos en el graph (etiquetados de 0 a 12)
        ///int n = 13;
 
        // construye un graph a partir de los bordes dados
        ///Graph graph = new Graph(edges, n);
 
        // para realizar un seguimiento de si se descubre un vértice o no
        ///boolean[] discovered = new boolean[n];
 
        // Realizar el recorrido DFS de todos los nodos no descubiertos a
        // cubrir todos los componentes conectados de un graph
        ///for (int i = 0; i < n; i++)
        ///{
            //if (!discovered[i]) {
                ///DFS(graph, i, discovered);
            ///}
        ///}
    ///}
///}
}
