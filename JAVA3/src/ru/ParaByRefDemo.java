package ru;

class ParaByRef{
    int x, y;
    ParaByRef(int x, int y){
        this.x = x;
        this.y = y;
    }
    void CallByRef (ParaByRef o) {
        o.x = o.x + this.x;
        o.y = o.y + this.y;
    }

    public void callByRef(ParaByRef q) {
    }
}
public class ParaByRefDemo {
    public static void main(String[] args) {
        ParaByRef p = new ParaByRef(2, 3);
        ParaByRef q = new ParaByRef(3, 2);

        System.out.println("q.x =" + q.x);
        System.out.println("q.y =" + q.y);

        p.callByRef(q);
        
        System.out.println("q.x =" + q.x);
        System.out.println("q.y =" + q.y);

    }
}


