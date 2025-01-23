public class ZombiePlant {

    private int maximumPotency;
    private int successfulTreatments;

    public ZombiePlant(int maxPotency, int treatmentsNeeded){
        maximumPotency = maxPotency;
        successfulTreatments = treatmentsNeeded;
    }

    public int getPotency(){
        return maximumPotency;
    }

    public int treatmentsNeeded(){
        return successfulTreatments;
    }

    public boolean isDangerous(){
        if(successfulTreatments>0){
            return true;
        }
        return false;
    }

    public void treat(int potency) {
        if (isDangerous() == true) {
            if (potency > 0 && potency <= maximumPotency) {
                successfulTreatments--;
            } else if (potency > maximumPotency) {
                successfulTreatments++;
            }
        } else if (potency > maximumPotency) {
            successfulTreatments++;
        }
    }
}
