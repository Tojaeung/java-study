package jcf.list;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ch3_stackQueue {
    public static void main(String[] args) {
        Stack st = new Stack<String>();
        st.push("0");
        st.push("1");
        st.push("2");

        Queue q = new LinkedList<String>();
        q.offer("0");
        q.offer("1");
        q.offer("2");


        while (!st.empty()) {   // 스택이 없어질때까지
            System.out.println(st.pop());
        }

        while (!q.isEmpty()) {  // 큐가 없어질때까지
            System.out.println(q.poll());
        }


    }


}
