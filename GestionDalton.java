public class GestionDalton{
// creation d'attribut
    String nom;
    int taille ;
    private String dit_dalton;
   
    // cretion d'une constructeur d'objet dalton
    public GestionDalton(String unnom, int unetaille){
        this.nom=unnom;
        this.taille=unetaille;
    }
    // creation d'une methode String qui renvoi ce que dit les dalton 
    public  String parle(){
         
        if(nom=="Averell"){
            return "Quand est-ce qu'on mange?";

        }
        else if(nom=="Jack" || nom== "William"){
            return "Calme toi Joe";
        }
        else if(nom=="Joe"){
            return "je hais Lucky Luke";
        }
        else{
            return " ";
        }

     }

    
    
}