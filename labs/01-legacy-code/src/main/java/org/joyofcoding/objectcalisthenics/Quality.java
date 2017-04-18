package org.joyofcoding.objectcalisthenics;

/**
 * Created by Stefan on 27-3-2017.
 */
public class Quality {
    private int quality;
    public Quality(int quality){
        this.quality = quality;
    }

    public int getQuality(){
        return quality;
    }

    public void decrease(){
        quality--;
    }

    public void increase(){
        quality++;
    }

    public void zero(){
        quality = 0;
    }
}
