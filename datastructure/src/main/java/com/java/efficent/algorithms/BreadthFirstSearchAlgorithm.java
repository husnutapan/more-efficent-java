package com.java.efficent.algorithms;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class BreadthFirstSearchAlgorithm {
    private int side;
    private List<Integer> closeness[];


    BreadthFirstSearchAlgorithm(int side) {
        this.side = side;
        closeness = new LinkedList[side];
        for (int i = 0; i < side; i++) {
            closeness[i] = new LinkedList<>();
        }
    }

    void addSideToData(int side, int data) {
        closeness[side].add(data);
    }

    void breadthFirstAlgorithm(int var) {

        boolean isVisited[] = new boolean[side];

        LinkedList<Integer> queue = new LinkedList<>();

        isVisited[var] = true;
        queue.add(var);

        while (queue.size() != 0) {
            var = queue.poll();
            System.out.println(var + " ");
            Iterator<Integer> k = closeness[var].listIterator();

            while (k.hasNext()) {
                int next = k.next();
                if (!isVisited[next]) {
                    isVisited[next] = true;
                    queue.add(next);
                }
            }
        }
    }

    public static void main(String[] args) {
        BreadthFirstSearchAlgorithm algorithm = new BreadthFirstSearchAlgorithm(4);

        algorithm.addSideToData(0, 1);
        algorithm.addSideToData(0, 2);
        algorithm.addSideToData(1, 3);
        algorithm.addSideToData(2, 4);
        algorithm.addSideToData(2, 1);
        algorithm.addSideToData(2, 0);

        algorithm.breadthFirstAlgorithm(2);

    }

}
