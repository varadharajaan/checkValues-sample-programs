package com.deriveB;

import com.parent.Base;

public class DeriveB extends Base {
    
    public  DeriveB (){
        System.out.println("deriveB");
     }
    
    @Override
    public void print() {
        System.out.println("deriveB");
    }

}
