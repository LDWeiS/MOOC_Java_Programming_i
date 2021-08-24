
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }
    
    public Money plus(Money addition){
        int euroPlus = this.euros + addition.euros;
        int centPlus = this.cents + addition.cents;
        
        if (centPlus > 99) {
            euroPlus = euroPlus + centPlus / 100;
            centPlus = centPlus % 100;
        }
        
        Money newMoney = new Money(euroPlus, centPlus);

        return newMoney;
    }
    
    public Money minus(Money decreaser){
        int euroMinus = this.euros - decreaser.euros;
        int centMinus = this.cents - decreaser.cents;
        
        if (centMinus < 0) {
            euroMinus = euroMinus - 1;
            centMinus = centMinus + 100;
        }
        
        if (euroMinus < 0){
            euroMinus = 0;
            centMinus = 0;
        }
        
        Money newMoney = new Money(euroMinus, centMinus);

        return newMoney;
    }
    
    public boolean lessThan(Money compared){
        if (this.euros < compared.euros()) {
            return true;
        } else if (this.euros == compared.euros() && this.cents < compared.cents()) {
            return true;
        } else {
            return false;
        }
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
