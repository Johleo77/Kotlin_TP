class Personne {
    var nom = ""
    var taille = 0.0
    var poids = 0
    constructor()
    constructor(nom: String, taille: Double, poids: Int) {
        this.nom = nom
        this.taille = taille
        this.poids = poids
    }
    fun imc(): Double{
        return this.poids /(this.taille * this.taille)
    }
    fun significationImc(): String {
        var catégorie = ""
        if ( this.imc() < 18.5 ){
            catégorie = "maigreur"
        }
        else if ( this.imc() < 24.9){
            catégorie = "normal"
        }
        else if (this.imc() < 29.9){
            catégorie = "surpoids"
        }
        else {
            catégorie = "obésité"
        }
        return catégorie
    }
    override fun toString(): String {
        return "Personne(nom='$nom', taille=$taille, poids=$poids)"
    }
}
