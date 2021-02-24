package com.company;

public class Engine {
    int horsePower;
    int nM;

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getnM() {
        return nM;
    }

    public void setnM(int nM) {
        this.nM = nM;
    }

    public Engine(int horsePower, int nM) {
        this.horsePower = horsePower;
        this.nM = nM;
    }
}
