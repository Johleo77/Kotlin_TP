class Compte {
    var solde = 0.0



    constructor()
    constructor(solde: Double ){
        this.solde = solde

    }

    fun getbalance() = this.solde
    fun deposer(ajout:Double){
        this.solde += ajout
    }
    fun retirer(retirer:Double){
        this.solde -= retirer
    }
    fun interet(interet : Double){
        this.solde *= (1 + interet)
    }
}
