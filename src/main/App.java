package main;

public class App {
    public static int encontre(int[] arrayOrdenado, int num){
        for( int i=0;i<arrayOrdenado.length;i++){
            if(arrayOrdenado[i]==num){
                return 1;
            }
        }
            return 0;
        }
        public static int maior(int[] arrayDesordenado){            
            int maiornumero= arrayDesordenado[0];
            
            for (int i=0;i<arrayDesordenado.length;i++){
                
                if(arrayDesordenado[i]>= maiornumero){
                    
                    maiornumero = arrayDesordenado[i];
                    
                }
            }
            return maiornumero;
        }
        
        public static Integer[][] ParMaisProximo(Integer[][] pares) {
            Integer[][] PontoMaisPerto = new Integer[2][2];
            double menorcaminho = Double.MAX_VALUE;
             
            for (int i = 0; i < pares.length; i++) {
                
                for (int j = i + 1; j < pares.length; j++) {
                    double caminho = Math.sqrt(Math.pow(pares[i][0] - pares[j][0], 2) + Math.pow(pares[i][1] - pares[j][1], 2));
                    
                    if (menorcaminho>caminho){
                        
                        menorcaminho = caminho;
                        PontoMaisPerto[0] = pares[i];
                        PontoMaisPerto[1] = pares[j];
                    }
                }
            }
        
            return PontoMaisPerto;
        }
        
    }

    


        

    