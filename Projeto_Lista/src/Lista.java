/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Lista {
    protected int interator; //numero de elementos
    protected No head;
    protected No tail;

	public Lista(){
		
                interator = 0;
		head = null;
		tail = null;
        }	
        //insere no final
	public void append(String dado)
	{
		No novo = new No(dado);
		if(tail == null)
		{	
			tail = novo;
			head = novo;
               
		}else{
               novo.setAnt(tail);
               tail.setProx(novo);
               tail = novo;
		}		
		interator++;
	}
        //insere no inicio
	public void addFirst(String dado)
	{	No novo = new No(dado);
		if(head == null)
		{	head = novo;
			tail = novo;
		}else{
		head.setAnt(novo);		
                novo.setProx(head);
		head = novo;
                }
             interator++;
	}
        //insere em uma posição
	public void addEmPosicao(String dado, int posicao){
		No novoNodo = new No(dado);
		//criação do nó auxiliar o qual vai ser um comparativo que vai até o tail
                No aux = head;
		if (head == null || posicao == 1){
			novoNodo.setProx(head);
			head = novoNodo;
		} else {
                        //o i é um laço de repetição que serve como um "indice" que em seguida vai ser comparado com a posição informada 
			int i = 0;
			while (aux.getProx() !=null){
				if (i == posicao-2){
					novoNodo.setProx(aux.getProx());
					aux.setProx(novoNodo);
    				break;
				}
                               
				aux = aux.getProx();
				i++;
			}
			if (aux.getProx() == null){
				//aqui é um caso onde o aux é o ultimo dado, no caso o tail.
                                append(dado);
			}
		}
                interator++;
	}	
        // remove na posição indicada
	public void removerEmPosicao(int posicao){
		// os dois auxiliares sao "contadores" que sao comparativos para a "indexagem" da lista.
                No aux = head;
		No aux1 = head;
		int i = 0;
		if (posicao == 1){
			head = aux.getProx();
                        interator--;
		} else {
			while (aux.getProx() !=null){
				if (i == posicao){
					No novoNodo = aux.getProx();
					int j=0;
					while (j<posicao){
						if (j==posicao-2){
						aux1.setProx(novoNodo);
							break;
						}
						aux1=aux1.getProx();
						j++;
					}
					break;
				}
				aux = aux.getProx();
				i++;
			}
                        interator--;
			if (aux.getProx() == null){
				System.out.println("Posicao invalida.");;
			}
		}
                
	}
        //remove no inicio
        public void removeInicio(){
            if(head == null){
                System.out.println("Lista Vazia");
            }else{
            if(head.getProx() !=null){
                head = head.getProx();
                head.getAnt().setProx(null);
                head.setAnt(null);
                      interator--;
            }
      
        }}
       //remove no final
        public void removeFinal(){
            if(tail==null){
              System.out.println("Lista Vazia");
            }else{
                No aux = tail;
            if(tail.getAnt() != null){
                tail = tail.getAnt();
                tail.getProx().setAnt(null);
                tail.setProx(null);
                   interator--;
            }}
         
        }
        //imprime todos.
	public void imprimirTodos(){
                int i=0;
                if(head == null){
                    System.out.println("Lista Vazia");
                }else{
		No aux = head;
		while (aux != null) {
                    i++;
			System.out.println(i + " "+aux.getDado());
			aux = aux.getProx();
                }	
		}
	}
        //funciona
        public void imprimirApenasUm(int posicao){
            //o i faz a indexagem em comparação com a posição indicada.
            int i=1;
           if(head == null){
               System.out.println("Lista Vazia");
           }else{ 
            No aux = head;
         
            while(aux !=null || i != posicao){
               if (posicao == i){
               System.out.println(i + " "+aux.getDado());
               break;
               }
               i++;
               aux = aux.getProx();               
        }
        }
	
        }
	 
}
