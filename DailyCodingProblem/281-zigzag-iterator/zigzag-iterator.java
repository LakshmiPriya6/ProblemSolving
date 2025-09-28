public class ZigzagIterator {

    private List<Integer> v1;
    private List<Integer> v2;
    private int p1;
    private int p2;

    public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
        this.v1 = v1;
        this.v2 = v2;
        this.p1 = 0;
        this.p2 = 0;
    }

    public int next() {
        // If both vectors have elements, alternate based on pointer positions.
        if (p1 < v1.size() && p2 < v2.size()) {
            if (p1 <= p2) {
                return v1.get(p1++);
            } else {
                return v2.get(p2++);
            }
        } 
        // If only v1 has elements remaining.
        else if (p1 < v1.size()) {
            return v1.get(p1++);
        } 
        // If only v2 has elements remaining.
        else {
            return v2.get(p2++);
        }
    }

    public boolean hasNext() {
        return p1 < v1.size() || p2 < v2.size();
    }
}

/**
 * Your ZigzagIterator object will be instantiated and called as such:
 * ZigzagIterator i = new ZigzagIterator(v1, v2);
 * while (i.hasNext()) v[f()] = i.next();
 */