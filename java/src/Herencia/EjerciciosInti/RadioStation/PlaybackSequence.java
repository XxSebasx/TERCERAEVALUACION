package Herencia.EjerciciosInti.RadioStation;

import java.util.Arrays;

public class PlaybackSequence extends AudioElement {

    private AudioElement[] vector;
    private static final int MAX=100;
    private int size;
    public PlaybackSequence(String name) {
        super(name);
        vector = new AudioElement[MAX];
        size = 0;
       
    }

    private boolean full(){
        return size==vector.length;
    }

    private boolean isValid(int pos){
        return pos >= 0 && pos < size;
    }

    public void add(AudioElement audio){
       if(!full()){
        vector[size] = audio;
        size++;
       }
    }

    public void set(int posicion, AudioElement audio){
      if(isValid(posicion)){
        vector[posicion] = audio;
      }
    }

    public void remove(int posicion, AudioElement audio){
        if(isValid(posicion)){
            for (int i = 0; i < vector.length; i++) {
                vector[i] = vector[i++];
            }
            size--;
        }
    }

    public void insert(int posicion, AudioElement audio){
       if(isValid(posicion) && !full()){
        for (int i = size; i > vector.length; i--) {
            vector[i] = vector[i-1];
        }vector[posicion] = audio;
        size++;
       }
    }


    @Override
    public void play() {
       for (AudioElement audioElement : vector) {
            audioElement.play();
       }
    }

    @Override
    public int duration() {
        int total = 0;
        for (AudioElement audioElement : vector) {
            total += AudioTools.getDuration(audioElement.getName());
        }

        return total;
    }

    @Override
    public int profit() {
        int result = 0;
        for (int i = 0; i < vector.length; i++) {
            result += vector[i].profit();
        }
        return result;
    }

    @Override
    public String toString() {
        return "PlaybackSequence [vector=" + Arrays.toString(vector) + "]";
    }

    
}
   
