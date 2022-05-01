package com.company;

public abstract class GameCalculater {
    public abstract void hesapla();//3-Burdaki "System.out.println("Puaniniz : 100")" kodunu silip abstract ettim.
    //Bu su demek; hesapla yi herkes icermek zorunda. Ama kimse de inherit edemez herkes kendi hesaplama sini yazmali.

    public void gameOver(){
        System.out.println("Oyun bitti.");
    }
}
