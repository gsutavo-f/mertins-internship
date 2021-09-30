package Thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gsutavo
 */
public class TarefasParalelas {
    private class TarefaParalela implements Runnable {
        private final String descricao;
        private final int tempo;
        private final Object controle;
        
        public TarefaParalela(String descricao, int tempo, Object controle) {
            this.descricao = descricao;
            this.tempo = tempo;
            this.controle = controle;
        }

        public String getDescricao() {
            return descricao;
        }
        
        @Override
        public void run() {
            try {
                System.out.printf("Vai executar trabalho [%s]\n", descricao);
                Thread.sleep(tempo);
                synchronized(controle) {
                    System.out.printf("Terminou trabalho [%s]. Hora de notificar superior!\n", descricao);
                    controle.notify();
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(TarefasParalelas.class.getName()).log(Level.SEVERE, String.format("Falha ao agurdar processo de trabalho [%s]\n", this.descricao), ex);
            }
        }
    }
    
    public void executar() {
        Thread[] tarefas = {
            new Thread(new TarefaParalela("tarefa 1", 7000, this), "tarefa 1"),
            new Thread(new TarefaParalela("tarefa 2", 4000, this), "tarefa 2"),
            new Thread(new TarefaParalela("tarefa 3", 15000, this), "tarefa 3")
        };
        synchronized(this) {
            for(Thread t: tarefas) {
                t.start();
            }
            System.out.printf("Tarefas solicitadas! Aguardando a primeira resposta para continuar!\n");
            try {
                this.wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(TarefasParalelas.class.getName()).log(Level.SEVERE, "Falha ao aguardar tarefas", ex);
            }
        }
        for(Thread t: tarefas) {
            System.out.printf("Tarefa [%s] concluida = [%b]\n", t.getName(), !t.isAlive());
        }
    }
}
