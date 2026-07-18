class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return (!knightIsAwake);
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        if(knightIsAwake || archerIsAwake || prisonerIsAwake){
            return true;
        }
        return false;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        if(prisonerIsAwake && !archerIsAwake){
            return true;
        }
        return false;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if(petDogIsPresent){
            return petDogIsPresent && !archerIsAwake;
        }
        else{
            return !petDogIsPresent && !knightIsAwake && !archerIsAwake && prisonerIsAwake;
        }   
    }
}
