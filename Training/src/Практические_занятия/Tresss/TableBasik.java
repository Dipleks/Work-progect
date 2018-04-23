package Практические_занятия.Tresss;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

public class TableBasik implements Serializable{

    private double ves1;
    private int podhod1;
    private int povtor1;
    private double procent1;
    private double ves2;
    private int podhod2;
    private int povtor2;
    private double procent2;
    private double ves3;
    private int podhod3;
    private int povtor3;
    private double procent3;

    private double tonnazh;
    private int kpd;
    private double pm;

    public TableBasik(double ves1, int podhod1, int povtor1, double procent1,
                      double ves2, int podhod2, int povtor2, double procent2,
                      double ves3, int podhod3, int povtor3, double procent3,
                      double tonnazh, int kpd, double pm) {
        this.ves1 = ves1;
        this.podhod1 = podhod1;
        this.povtor1 = povtor1;
        this.procent1 = ves1/pm;
        this.ves2 = ves2;
        this.podhod2 = podhod2;
        this.povtor2 = povtor2;
        this.procent2 = ves2/pm;
        this.ves3 = ves3;
        this.podhod3 = podhod3;
        this.povtor3 = povtor3;
        this.procent3 = ves3/pm;
        this.tonnazh = (podhod1*povtor1*ves1)+(podhod2*povtor2*ves2)+(podhod2*povtor2*ves3);
        this.kpd = (podhod1*povtor1)+(podhod2*povtor2)+(podhod2*povtor2);
        this.pm = pm;
    }

    public double getVes1() {
        return ves1;
    }

    public void setVes1(double ves1) {
        this.ves1 = ves1;
    }

    public int getPodhod1() {
        return podhod1;
    }

    public void setPodhod1(int podhod1) {
        this.podhod1 = podhod1;
    }

    public int getPovtor1() {
        return povtor1;
    }

    public void setPovtor1(int povtor1) {
        this.povtor1 = povtor1;
    }

    public double getProcent1() {
        return procent1;
    }

    public void setProcent1(double procent1) {
        this.procent1 = ves1/pm;
    }

    public double getVes2() {
        return ves2;
    }

    public void setVes2(double ves2) {
        this.ves2 = ves2;
    }

    public int getPodhod2() {
        return podhod2;
    }

    public void setPodhod2(int podhod2) {
        this.podhod2 = podhod2;
    }

    public int getPovtor2() {
        return povtor2;
    }

    public void setPovtor2(int povtor2) {
        this.povtor2 = povtor2;
    }

    public double getProcent2() {
        return procent2;
    }

    public void setProcent2(double procent2) {
        this.procent2 = ves2/pm;
    }

    public double getVes3() {
        return ves3;
    }

    public void setVes3(double ves3) {
        this.ves3 = ves3;
    }

    public int getPodhod3() {
        return podhod3;
    }

    public void setPodhod3(int podhod3) {
        this.podhod3 = podhod3;
    }

    public int getPovtor3() {
        return povtor3;
    }

    public void setPovtor3(int povtor3) {
        this.povtor3 = povtor3;
    }

    public double getProcent3() {
        return procent3;
    }

    public void setProcent3(double procent3) {
        this.procent3 = ves3/pm;
    }

    public double getTonnazh() {
        return tonnazh;
    }

    public void setTonnazh(double tonnazh) {
        this.tonnazh = (podhod1*povtor1*ves1)+(podhod2*povtor2*ves2)+(podhod2*povtor2*ves3);
    }

    public int getKpd() {
        return kpd;
    }

    public void setKpd(int kpd) {
        this.kpd = (podhod1*povtor1)+(podhod2*povtor2)+(podhod2*povtor2);
    }

    public double getPm() {
        return pm;
    }

    public void setPm(double pm) {
        this.pm = pm;
    }
}
