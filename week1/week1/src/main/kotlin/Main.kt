
fun main(){

    val human = Human("Apple")
    human.attack()
    human.hasManaOrNot()
    val mage = Mage("Pie")
    mage.attack()
    mage.hasManaOrNot()

}

open class Human(private val name :String){
    open  val hasMana :Boolean = false
    open fun attack() = println("$name use Fist Attack!")
    fun hasManaOrNot(){
        if (hasMana){
            println("$name has mana")
        }else{
            println("$name has no mana")
        }
    }
}

class Mage(private val name: String,) : Human(name){
    override val hasMana: Boolean
        = true
    override fun attack() {
        println("$name use Fireball!")
    }
}