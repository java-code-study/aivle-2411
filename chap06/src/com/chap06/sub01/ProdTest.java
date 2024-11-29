package com.chap06.sub01;

class Prod {
    int id;
    String nm;

    public Prod(int id, String nm) {
        this.id = id;
        this.nm = nm;
    }

    public void info(){
        System.out.println(id + ":" + nm);
    }
}

class ExtProd extends Prod {
    int qty;
    ExtProd(int id, String nm, int qty){
        super(id, nm);
        this.qty = qty;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("아차차..수량은 " + qty);
    }
}

public class ProdTest {
    public static void main(String[] args) {
        Prod p = new Prod(1, "Pen");
        p.info();
        ExtProd ep = new ExtProd(2, "Notebook", 10);
        ep.info();
    }
}
