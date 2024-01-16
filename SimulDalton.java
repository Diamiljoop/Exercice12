public class SimulDalton{
    public static void main(String[] args) {
        // creation de 4 objet parmetré avec leur nom et taille
        GestionDalton Joe= new GestionDalton("Joe", 137);
        GestionDalton Jack= new GestionDalton("Jack", 165);
        GestionDalton William= new GestionDalton("William", 190);
        GestionDalton Averell= new GestionDalton("Averell", 210);
        // Appel de methode parle () pour les 4 objets creer
        System.out.println(Joe.parle());
        System.out.println(Jack.parle());
        System.out.println(William.parle());
        System.out.println(Averell.parle());
        
        
        


    }
}