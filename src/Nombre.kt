class Nombre {
    var nb: Int = 0
    constructor(nb: Int) {
        this.nb = nb
    }
    constructor()
    fun sommeChiffres(): Int {
        var somme = 0
        var num = nb
        while (num != 0) {
            somme += num % 10
            num /= 10
        }
        return somme
    }
    fun estAmi(nb2: Nombre): Boolean {
        return if (this.sommeChiffres() == nb2.sommeChiffres()) true else false
    }
    fun estPremier(): Boolean{
        if ( this.diviseurs().size == 2)
            return true
        else
            return false
    }
    fun diviseurs(): List<Int>{
        val diviseurs = mutableListOf<Int>()
        for (i in 1..this.nb) {
            if (this.nb % i == 0) {
                diviseurs.add(i)
            }
        }
        return diviseurs
    }
    override fun toString(): String {
        return "Nombre : nb = $nb "
    }
}