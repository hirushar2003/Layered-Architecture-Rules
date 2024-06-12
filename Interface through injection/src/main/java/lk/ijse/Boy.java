package lk.ijse;

public class Boy implements Di{
    Agreement agreement ;
    public void chatWithGirl(){
        agreement.chat();
    }
    public void test(){
        agreement.chat();
    }

    @Override
    public void setInjection(Agreement agreement) {
        this.agreement = agreement;
    }
}
