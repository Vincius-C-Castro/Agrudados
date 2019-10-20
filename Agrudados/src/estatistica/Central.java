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
public class Central extends Calculos {
    
    public void calcular() {
        calcularMedia();
        calcularModa();
        calcularMediana();
    }

    private void calcularMedia() {
        double valores[] = this.getConjunto();
        double soma = 0;

        for (int i = 0; i < valores.length; i++) {
            soma += valores[i];
        }

        this.setMedia(soma / valores.length);

    }

    private void calcularModa() {
        double valores[] = this.getConjunto();
        int[] cont = new int[valores.length];
        int vezes = 0;
        int indice = 0;
        int repeat = 0;

        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores.length; j++) {
                if (valores[i] == valores[j]) {
                    cont[i] = cont[i] + 1;
                }
            }
        }
        vezes = cont[0];
        for (int i = 0; i < cont.length; i++) {
            if (cont[i] > vezes) {
                vezes = cont[i];
                indice = i;
            }
        }

        if (vezes > 1) {
            for (int i = 0; i < cont.length; i++) {
                if (cont[i] == vezes) {
                    repeat++;
                }
            }

            repeat /= cont[indice];
        } else {
            repeat = 0;
        }

        switch (repeat) {
            case 0: {
                this.setIndiceModa(-1);
            }
            break;

            case 1: {
                this.setModa(valores[indice]);
                this.setIndiceModa(indice);
            }
            break;

            case 2: {
                this.setIndiceModa(-2);
            }
            break;

            default: {
                this.setIndiceModa(-3);
            }
            break;

        }
    }

    private void calcularMediana() {
        double valores[] = this.getConjunto();
        int esq = 0;
        int dir = valores.length - 1;
        int meio;
        meio = (esq + dir) / 2;

        this.setMediana(valores[meio]);
    }
}
