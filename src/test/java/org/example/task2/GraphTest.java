package org.example.task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GraphTest {
    Graph graph = new Graph();//create an object of class graph

    @BeforeEach
    void setUp() {

        //input of the given parameters

        graph.setS(1);
        graph.setN(4);
        graph.setRelationMatrix();// matrix is filled with maximum costs

        graph.addCity("gdansk");
        graph.setP(2);
        graph.addEdge(2, 1);
        graph.addEdge(3, 3);

        graph.addCity("bydgoszcz");
        graph.setP(3);
        graph.addEdge(1,1);
        graph.addEdge(3,1);
        graph.addEdge(4,4);

        graph.addCity("torun");
        graph.setP(3);
        graph.addEdge(1,3);
        graph.addEdge(2,1);
        graph.addEdge(4,1);

        graph.addCity("warszawa");
        graph.setP(2);
        graph.addEdge(2,4);
        graph.addEdge(3,2);

    }

    @Test
    void testDijkstra() {
        assertEquals(3,graph.dijkstra("gdansk","warszawa"));
        assertEquals(2,graph.dijkstra("bydgoszcz","warszawa"));
    }
}