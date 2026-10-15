interface SRGOC{
    void show();
}

class SRCEM implements SRGOC{
    public void show(){
        System.out.println("SRCEM Show");
    }
}

class SRSPS implements SRGOC{
    public void show(){
        System.out.println("SRSPS Show");
    }
}

class Test {
    public static void main(String[]arg){

        SRCEM sm = new SRCEM();

        sm.show();

        SRSPS sps = new SRSPS();

        sps.show();

        new SRCEM();

    }
}
