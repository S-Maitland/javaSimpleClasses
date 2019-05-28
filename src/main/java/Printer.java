public class Printer {

    private int paperSheets;
    private int tonerVolume;

    public Printer(){
        this.paperSheets = 50;
        this.tonerVolume = 100;
    }

    public int getPaperSheets(){
        return this.paperSheets;
    }

    public int getTonerVolume(){
        return this.tonerVolume;
    }

    public Boolean printJob(int pages, int copies){

        if (paperSheets >= (pages * copies)){
            this.tonerVolume -= pages;
            return true;
        }
            return false;
    }

}
