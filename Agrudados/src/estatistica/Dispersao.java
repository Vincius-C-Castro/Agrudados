/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estatistica;

/**
 *
 * @author viny-
 */
public class Dispersao extends Calculos {
    
    public void calcular() {
        calcularVariancia();
        calcularDesvioMedio();
        calcularDesvioPadrao();
        calcularAmplitude();
        calcularCoeficienteVariacao();
    }

    private void calcularDesvioPadrao() {
        double valores[] = this.getConjunto();
        if (valores.length == 1) {
            this.setDesvioPadrao(0.0);
        } else {
            double soma = 0;
            for (int i = 0; i < valores.length; i++) {
                double result = valores[i] - this.getMedia();
                soma = soma + result * result;
            }

            if (isConjuntoAmostral()) {
                this.setDesvioPadrao(Math.sqrt(((double) 1 / (valores.length - 1))
                        * soma));
            } else {
                this.setDesvioPadrao(Math.sqrt(((double) 1 / (valores.length))
                        * soma));
            }

        }
    }

    private void calcularVariancia() {
        double valores[] = this.getConjunto();
        if (valores.length == 1) {
            this.setVariancia(0.0);
        } else {
            double soma = 0l;
            for (int i = 0; i < valores.length; i++) {
                double result = valores[i] - this.getMedia();
                soma = soma + result * result;
            }

            if (isConjuntoAmostral()) {
                this.setVariancia(((double) 1 / (valores.length - 1))
                        * soma);
            } else {
                this.setVariancia(((double) 1 / (valores.length))
                        * soma);
            }

        }
    }

    private void calcularDesvioMedio() {
        
        double valores[] = this.getConjunto();
        
        if (valores.length == 1) {
            
            this.setDesvioMedio(0.0);
            
        }
        else
        {
                double soma = 0;
                
                for (int i = 0; i < valores.length; i++)
                {
                    double result = valores[i] - this.getMedia();
                    soma = soma + Math.abs(result);
                }
                
            this.setDesvioMedio(soma / valores.length);
        }

    }

    private void calcularAmplitude() {
        double valores[] = this.getConjunto();
        this.setAmplitude(valores[valores.length - 1] - valores[0]);
    }

    private void calcularCoeficienteVariacao() {
        this.setCoeficienteVariacao((this.getDesvioPadrao() / this.getMedia()) * 100);
    }
}
