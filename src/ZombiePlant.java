public class ZombiePlant {
    private int maxpotency;
    private int treatmentreq;
    public ZombiePlant(){
        this.maxpotency = 1;
        this.treatmentreq = 1;
    }
    public ZombiePlant(int maxpotency, int treatmentreq){
        this.maxpotency = maxpotency;
        this.treatmentreq = treatmentreq;
    }
    public int getPotencyRequired(){
        return this.maxpotency;
    }
    public int treatmentsNeeded(){
        return this.treatmentreq;
    }
    public boolean isDangerous(){
        return this.treatmentreq != 0;
    }
    public void treat(int n){
        if(n<=this.maxpotency && n>0 && treatmentreq>0){
            this.treatmentreq--;
        }
        else if(n>this.maxpotency){
            this.treatmentreq++;
        }
    }
}
