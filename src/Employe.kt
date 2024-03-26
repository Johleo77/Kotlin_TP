import java.time.LocalDate
import java.time.LocalTime
class Employe {
    var matricule = 0
    var nom = ""
    var prenom = ""
    var anneEmbauche = 0
    var salaire = 0.0

    constructor(matricule: Int, nom: String, prenom: String, anneEmbauche: Int, salaire: Double ) {
        this.matricule = matricule
        this.nom = nom
        this.prenom = prenom
        this.anneEmbauche = anneEmbauche
        this.salaire = salaire
    }
    fun anciennete(anneEmbauche: Int ){
        var annee_actuel = LocalDate.now().year
        annee_actuel  - this.anneEmbauche
    }
    fun augmentationDuSalaire(anciennete : Int) {
        if (anciennete <  5 ){
            this.salaire *= 1.02
        }
        else if (anciennete < 10 ){
            this.salaire *= 1.05
        }
        else {
            this.salaire *=1.10
        }


    }
}