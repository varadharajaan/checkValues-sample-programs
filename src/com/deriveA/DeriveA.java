package com.deriveA;

import com.parent.Base;

public class DeriveA extends Base{
    
   public  DeriveA (){
       System.out.println("deriveA");
    }
    @Override
    public void print() {
        System.out.println("deriveA");
    }

}
