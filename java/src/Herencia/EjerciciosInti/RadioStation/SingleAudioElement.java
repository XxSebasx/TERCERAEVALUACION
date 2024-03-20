package Herencia.EjerciciosInti.RadioStation;

public class SingleAudioElement extends AudioElement{
    private int duration;
    private String fileName;
    private int profit;
    public SingleAudioElement(String name, String fileName,int profit) {
        super(name);
        this.fileName = fileName;
        this.profit = profit;
        this.duration = AudioTools.getDuration(fileName);
        
    }
    


    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

   

    @Override
    public void play() {
        AudioTools.nombrefichero(fileName);
    }
    @Override
    public int duration() {
        return duration;
    }
    @Override
    public int profit() {
       return profit;
    }
    @Override
    public String toString() {
        return "SingleAudioElement [fileName=" + fileName + ", profit=" + profit + "]";
    }

    
   
    
}
