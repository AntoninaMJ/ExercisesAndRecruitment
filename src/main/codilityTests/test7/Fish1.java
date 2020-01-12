package main.codilityTests.test7;

import java.util.Stack;


public class Fish1 {
    public static void main(String[] args) {
        Fish1 fish = new Fish1();

        //powinno być 2!!!!
        int[] A = {4, 6, 3, 2, 1, 5};
        int[] B = {0, 1, 1, 0, 0, 0};

        System.out.println(fish.solutionPoprawione(A, B));
        System.out.println(fish.solutionInternet(A, B));
    }

    public int solutionPoprawione(int[] A, int[] B){
        int alive = A.length;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < A.length; i++){
            if (B[i] == 1){
                stack.push(A[i]);
            }
            if (B[i] == 0){
                while (!stack.isEmpty()){
                    if (A[i] < stack.peek()){
                        alive--;
                        break;
                    } else if (A[i] > stack.peek()){
                        alive--;
                        stack.pop();
                    }
                }
            }
        }
        return alive;
    }


    //z internetu, działa
    public int solutionInternet(int[] A, int[] B) {

        // special case: no fish
        if (A.length == 0)
            return 0;

        // main idea: use "stack" to store the fishes with B[i]==1
        // that is, "push" the downstream fishes into "stack"
        // note: "push" the Size of the downstream fish
        Stack<Integer> st = new Stack<>();
        int numAlive = A.length;

        for (int i = 0; i < A.length; i++) {

            // case 1; for the fish going to downstrem
            // push the fish to "stack", so we can keep them from the "last" one
            if (B[i] == 1) {
                st.push(A[i]); // push the size of the downstream fish
            }
            // case 2: for the fish going upstream
            // check if there is any fish going to downstream
            if (B[i] == 0) {
                while (!st.isEmpty()) {
                    // if the downstream fish is bigger (eat the upstream fish)
                    if (st.peek() > A[i]) {
                        numAlive--;
                        break;      // the upstream fish is eaten (ending)
                    }
                    // if the downstream fish is smaller (eat the downstream fish)
                    else if (st.peek() < A[i]) {
                        numAlive--;
                        st.pop();   // the downstream fish is eaten (not ending)
                    }
                }
            }
        }
        return numAlive;
    }
}
