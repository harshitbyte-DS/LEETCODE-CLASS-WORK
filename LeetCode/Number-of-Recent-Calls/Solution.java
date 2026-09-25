1import java.util.*;
2class RecentCounter {
3    Queue<Integer> queue;
4    public RecentCounter() {
5    queue = new LinkedList<>();
6    }
7    public int ping(int t){
8        queue.offer(t);
9        while(queue.peek()< t -3000) {
10            queue.poll();
11        }
12        return queue.size();
13    }
14}