class RecentCounter {
    int size=0;
    Deque<Integer>deque;
    public RecentCounter() {
        deque=new LinkedList<>();
    }
    
    public int ping(int t) {
       deque.add(t);
       while(t-deque.peekFirst()>3000){
        deque.pollFirst();
       }
       return deque.size();
    } 
}

