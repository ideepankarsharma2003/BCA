/**
 * Inner Class ------> Class Inside Class
 * 1. Member Inner Class ------> Non Static Inner Class  
 * 2. Static Inner Class ------> Static
 * 3. Anonymous Inner Class ----> No Name
 */


class IC_01_Phone{
    // IC_01_Phone(){
    //     show();
    // }
    public void show(){
        System.out.println("Phone Call");
    }
}


public class IC_01_Intro {
    int i;    
    
    /**
     * InnerIC_01_Intro ----> Member Inner Class
     * 
     * pathname:=>         'IC_01_Intro$InnerIC_01_Intro.class'
     */
    public class InnerIC_01_Intro_Member {
        int j;
        InnerIC_01_Intro_Member(){
            System.out.println("Hello I'm Member Inner Class !!!");
        }
    }

    /**
     * InnerIC_01_Intro_1 ----> Static Inner Class
     */
    static class InnerIC_01_Intro_Static {
        int k;
        InnerIC_01_Intro_Static(){
            System.out.println("Hello I'm Static Inner Class !!!");
        }
        
    }


    IC_01_Intro(){
        System.out.println("Hello I'm the Boss Class !!!!");
    }


    public static void main(String[] args) {
        IC_01_Intro obj= new IC_01_Intro();
        obj.i= 5;

        IC_01_Intro.InnerIC_01_Intro_Member objMemberInner= obj.new InnerIC_01_Intro_Member();
        objMemberInner.j= 9;

        IC_01_Intro.InnerIC_01_Intro_Static objStaticInner=  new IC_01_Intro.InnerIC_01_Intro_Static();
        objStaticInner.k= 10;


        new IC_01_Phone(){ // ------> Anonymous Inner Class, overriding the parent class
            public void show(){
                System.out.println("Samsung Phone: PhoneCall + Video Call");
            }
        }.show();
        
    }
    
}