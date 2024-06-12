package lk.ijse;

public class Boy {

    Agreement agreement ;

    public Boy(Agreement agreement){
        this.agreement = agreement ;
    }
    public void chatWithGirl(){
        //Agreement agreement = new Girl();
        agreement.chat();
    }
    public void test(){
        //Agreement agreement = new Girl();
        agreement.chat();
    }
}
