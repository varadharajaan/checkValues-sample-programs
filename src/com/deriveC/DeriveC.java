package com.deriveC;

import com.parent.Base;

public class DeriveC extends Base {
    
    public  DeriveC (){
        System.out.println("deriveC");
     }
    
    @Override
    public void print() {
        System.out.println("deriveC");
    }

}
