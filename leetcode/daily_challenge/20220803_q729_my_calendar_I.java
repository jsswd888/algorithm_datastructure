class MyCalendar {
    List<int[]> booking;
    
    public MyCalendar() {
        booking = new ArrayList();
    }
    
    public boolean book(int start, int end) {
        for (int[] i: booking) {
            // start date within last end date AND end date within last start date 
            if(start < i[1] && end > i[0]){    
                return false;
            }
        }
        booking.add(new int[]{start, end});
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */