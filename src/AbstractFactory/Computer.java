package AbstractFactory;

public abstract  class Computer {
    protected String ram;
    protected String cpu;

    public abstract String getRAM();
    public abstract String getCPU();

    @Override
    public String toString(){
        return "RAM= "+this.getRAM()+", CPU="+this.getCPU();
    }
}