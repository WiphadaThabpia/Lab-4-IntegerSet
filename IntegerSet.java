import java.util.ArrayList;

/** ADT
 * 
 */
public class IntegerSet {

    ArrayList<Integer> Numbers ; // Rep
    
    // AF
    // RI

    public IntegerSet() {
        Numbers  = new ArrayList<>();
        checkRep();
    }

    /**
     * ตรวจสอบว่า Rep Invariant เป็นจริงหรือไม่
     */
    private void checkRep() {
        for (int i = 0; i < Numbers.size() - 1; i++) {
            if (Numbers.get(i) >= Numbers.get(i+1)) {
                throw new RuntimeException("Rep invariant violated!");
            }
        }
    }

    /**
     * เพิ่มจำนวนเต็มเข้าเซต
     * @param x จำนวนเต็มที่ต้องการเพิ่ม
     */
    public void add(int x) {
    if (!this.contains(x)) {
        int i = 0;
        // ใช้ i ในการเข้าถึง Numbers ไม่ใช่ x
        while (i < Numbers.size() && Numbers.get(i) < x) {
            i++;
        }
        Numbers.add(i, x); // แทรก x ที่ตำแหน่งที่จัดเรียงแล้ว
    }
    checkRep(); // ตรวจสอบความเรียงลำดับ
}

    /**
     * ลบจำนวนเต็มออกจากเซต
     * @param x ตัวอักษรที่ต้องการลบ
     */
    public void remove(int x) {
       Numbers.remove(Integer.valueOf(x));
        }
    /**
     * ตรวจสอบว่ามีตัวอักษรนี้อยู่ในเซตหรือไม่
     * @param x ตัวอักษรที่ต้องการตรวจสอบ
     * @return true หากมี x อยู่ในเซต, false หากไม่มี
     */
    public boolean contains(int x) {
        return Numbers.contains(x);
    }

    /**
     * คืนค่าขนาดของเซต
     * @return จำนวนสมาชิกในเซต
     */
    public int size() {
        return Numbers.size();
    }

    @Override
    public String toString() {
        return Numbers.toString();
    }
}
