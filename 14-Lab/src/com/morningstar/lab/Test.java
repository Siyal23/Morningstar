package com.morningstar.lab;

class Main {
    protected int x, y;
    public Main(int _x,int _y) {
    	x=_x;
    	y=_y;
    }
}
 
class Test {
    public static void main(String args[]) {
        int x=10;
        int y=20;
    	Main t = new Main(x,y);
        System.out.println(t.x + " " + t.y);
    }
}
