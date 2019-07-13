/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author LucasCorrea
 */
public class Patient{

    private String nome;
    private int year;
    private long phone;
    private String adress;
    private String numberAdress;
    private String nationale;
    private static int codig = 1;
    private int cod;
    
    public Patient(String name, int year, long phone, String adress, String numberAdress, String nationale) {
        this.nome = name;
        this.year = year;
        this.phone = phone;
        this.adress = adress;
        this.numberAdress = numberAdress;
        this.nationale = nationale;
        this.cod = codig++;
    }

    
    
  
    public String writeFile() {
        String string = getCod()+";"+getNome()+";"+getYear()+";"+getPhone()+";"+getAdress()+";"+
                getNumberAdress()+";"+getNationale()+";\n";
        return string;
    }
    
    public String toString(){
        String to = getCod() +" - "+ getNome();
        return to;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the phone
     */
    public long getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(long phone) {
        this.phone = phone;
    }

    /**
     * @return the adress
     */
    public String getAdress() {
        return adress;
    }

    /**
     * @param adress the adress to set
     */
    public void setAdress(String adress) {
        this.adress = adress;
    }

    /**
     * @return the numberAdress
     */
    public String getNumberAdress() {
        return numberAdress;
    }

    /**
     * @param numberAdress the numberAdress to set
     */
    public void setNumberAdress(String numberAdress) {
        this.numberAdress = numberAdress;
    }

    /**
     * @return the nationale
     */
    public String getNationale() {
        return nationale;
    }

    /**
     * @param nationale the nationale to set
     */
    public void setNationale(String nationale) {
        this.nationale = nationale;
    }

    /**
     * @return the cod
     */
    public int getCod() {
        return cod;
    }
    
    public void setCod(int cod) {
        this.cod = cod;
    }
}
