package Heranca;

public class Vendedor extends Funcionario{

    private int totalItensVendidos;
    private float comissaoPorITem;
    
    public Vendedor(){
        super();
    }
    
    public float calcularSalario(){
        return super.getSalario() + (this.comissaoPorITem * this.totalItensVendidos);
    }

    public int getTotalItensVendidos() {
        return totalItensVendidos;
    }

    public void setTotalItensVendidos(int totalItensVendidos) {
        this.totalItensVendidos = totalItensVendidos;
    }

    public float getComissaoPorITem() {
        return comissaoPorITem;
    }

    public void setComissaoPorITem(float comissaoPorITem) {
        this.comissaoPorITem = comissaoPorITem;
    }

    
}
