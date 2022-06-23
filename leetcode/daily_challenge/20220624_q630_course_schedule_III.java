// q630; 2022.6.23
// This is a HARD, Greedy question
class Solution {
    public int scheduleCourse(int[][] courses) {
        int total_day = 0;
        // use a priorityqueue to store the result
        // rank the added course in reverse order of duration (longest course at first)
        PriorityQueue<Integer> course_rank = new PriorityQueue<Integer>(Comparator.reverseOrder());
        // sort the course list in the sequence of last day to finish (earliest at first)
        Arrays.sort(courses, Comparator.comparingInt(course -> course[1]));

        for (int i = 0; i < courses.length; i++) {
            course_rank.add(courses[i][0]);
            // traverse the course list: if found that the current cumulative 
            // course attending day plus current course's duration greater than
            // course's last acceptable finishing day, delete the one with longest
            // duration currently in attending list
            if ((total_day += courses[i][0]) > courses[i][1])
                total_day -= course_rank.poll();
        }
        
        // return the length of queue (max num. of course to attend)
        return course_rank.size();
    }
}