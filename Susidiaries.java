package srgoc;
import university.*;

public class Susidiaries {
    public static void main(String[] args){
        SRCEM sm = new SRCEM();
        sm.srcem_branches();
        System.out.println("Roll = "+sm.roll);

        SRSBS sb = new SRSBS();
        sb.srsbs_branches();

        SRSPS sp = new SRSPS();
        sp.srsps_branches();

        SRSPS s1 = new SRSPS();
        sp.srsps_branches();

        RGPV rgpv = new RGPV();
        System.out.println(rgpv.h);
    }
}

class SRCEM{ 

    int roll = 10;

    public void srcem_branches(){
        System.out.println("SRCEM Branches");
        System.out.println("BTech CSE");
        System.out.println("BTech AIML");
        System.out.println("BTech Mechanical");
        System.out.println("BTech Electrical");
    }
}

class SRSBS{
    public void srsbs_branches(){
        System.out.println("SRSBS Branches");
        System.out.println("BBA");
        System.out.println("BCom");
        System.out.println("MBA");
    }
}

class SRSPS{
    public void srsps_branches(){
        System.out.println("SRSPS Branches");
        System.out.println("BPharma");
        System.out.println("MPharma");
        System.out.println("DPharma");
    }
}