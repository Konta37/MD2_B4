package BTVN.B4;

public class Fan {
    private int fanSpeed = 200;
    private int fanSlow = 1;
    private int fanMedium = 2;
    private int fanFast = 3;
    private int fanStatus;
    private boolean isTurn = false;
    private double fanRadius = 5;
    private String fanColor = "blue";

    public Fan() {
    }

    //check turn on or off
    public void setIsTurn(boolean isTurn) {
        this.isTurn = isTurn;
    }

    public boolean getIsTurn() {
        return isTurn;
    }

    public void setStatus(int fanStatus) {
        this.fanStatus = fanStatus;
    }

    public int getStatus() {
        //check nhap 1-2-3
        if (fanStatus == 1 || fanStatus == 2 || fanStatus == 3) {
            return fanStatus;
        } else {
            return 0;
        }
    }

    //enter fan radius
    public void setRadius(double fanRadius) {
        this.fanRadius = fanRadius;
    }

    public double getRadius() {
        return fanRadius;
    }

    //enter color
    public void setColor(String fanColor) {
        this.fanColor = fanColor;
    }

    public String getColor() {
        return fanColor;
    }

    //Caculator speed
    public int fanRunning() {
        return switch (fanStatus) {
            case 1 -> fanSpeed * fanSlow;
            case 2 -> fanSpeed * fanMedium;
            case 3 -> fanSpeed * fanFast;
            default -> 0;
        };
    }
    public String display(){
        if(isTurn==true){
            return "fan is on. Speed: " + fanRunning() + " color: " + fanColor + " radius: "+ fanRadius;
        }else {
            return "fan is off. Speed: " + fanRunning() + " color: " + fanColor + " radius: "+ fanRadius;
        }
    }
}
