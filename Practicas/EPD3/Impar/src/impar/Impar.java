/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package impar;

/**
 *
 * @author usuarioupo
 */
public class Impar {

        private int n;

        public Impar(int n) {
            setN(n);
        }

        public int getN() {
            return n;
        }

        public void setN(int n) {
            if (esImpar(n)) {
                this.n = n;
            } else {
                this.n = n + 1;
            }
        }

        private boolean esImpar(int n) {
            return n % 2 == 1;
        }
    }
