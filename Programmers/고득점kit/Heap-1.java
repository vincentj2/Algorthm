package Algorthm.Programmers.고득점kit;

//더 맵게
class spicy{
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int value : scoville) {
            queue.offer(value);
        }

        while(queue.peek()<=K) {
            if(queue.size()==1) {
                return -1;
            }
            int min = queue.poll();
            int second_min = queue.poll();
            queue.offer(min + (second_min * 2));
            answer+=1;
        }
        return answer;
    }
}
