import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {
    
    
    private static Integer  id= 1;
    private String nome;
    private String email;
    private List<Giocattolo> giocattoliCliente = new ArrayList<>();


    public Cliente( String nome, String email) {
        id++;
        this.nome = nome;
        this.email = email;
    }
    
    
        public int getId() {
        return id;
        }
        public void setId(int id) {
        this.id = id;
        }
        public String getNome() {
        return nome;
        }
        public void setNome(String nome) {
        this.nome = nome;
        }
        public String getEmail() {
        return email;
        }
        public void setEmail(String email) {
        this.email = email;
        }

        static void acquistagiocattolo(Giocattolo giocattolo, Cliente cliente){

            Scanner sc= new Scanner(System.in);

            System.out.println("inserisci il nome dell'oggetto");

            String ricerca = sc.nextLine();

            if(giocattolo.getNome().equals(ricerca)){
                System.out.println("giocattolo acquistato");
                Vendita.aggungiGiocattolo(giocattolo, cliente);
                

            }else{
                System.out.println("oggetto non trovato");
            }

        }


        public static void setId(Integer id) {
            Cliente.id = id;
        }


        public List<Giocattolo> getGiocattoliCliente() {
            return giocattoliCliente;
        }


        public void setGiocattoliCliente(List<Giocattolo> giocattoliCliente) {
            this.giocattoliCliente = giocattoliCliente;
        }

    
}
