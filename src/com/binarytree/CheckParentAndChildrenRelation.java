package com.binarytree;

import com.children.Car;
import com.deriveA.DeriveA;
import com.deriveB.DeriveB;
import com.deriveC.DeriveC;
import com.parent.Base;
import com.parent.Vechile;

public class CheckParentAndChildrenRelation {

    public static void main(String[] args) {
        
       Base b1 = new DeriveA();
       DeriveB b2 = new DeriveB();
       Base b3 = new DeriveC();
       
     Base  b4 = new Base();
     b4.print();
     b1.print();
      
      
        

    }

}
