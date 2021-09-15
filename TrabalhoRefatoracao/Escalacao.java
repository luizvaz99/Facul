public class Escalacao {
   
    private String data;
   
    public void setData(String newData) {
    this.data = newData;
    }
    public void imprimir()
    {
        System.out.println("O jogo será " + this.data);
    }
}
