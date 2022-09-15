package com.pushki;

public class Skelleton extends  Boss{
    private  int umberOfArrows;

    public int getUmberOfArrows() {
        return umberOfArrows;
    }

    public void setUmberOfArrows(int umberOfArrows) {
        this.umberOfArrows = umberOfArrows;
    }

    @Override
    public String info() {
        return super.info() + "\n Ваше количество стрел : "+getUmberOfArrows();
    }
}