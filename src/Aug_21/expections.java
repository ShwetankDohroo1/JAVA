package Aug_21;

class insufficientFunds extends Exception{
    public insufficientFunds(String msg){
        super(msg);
    }
}
class negativefunds extends Exception{
    public negativefunds(String msg){
        super(msg);
    }
}