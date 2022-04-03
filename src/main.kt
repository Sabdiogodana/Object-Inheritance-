fun main(){
    var banker=Banker("Mary",22)
    var doctor=Doctor("Mercy",24)
    var farmer=Farmer("Njeri",35)
    banker.eat()
    banker.talk("Hello lisalab")
   var x= banker.countMoney(arrayOf(3,4,5))
    println(x)
    banker.sleep()
    doctor.eat()
    doctor.talk("treating")
    doctor.treatPatient("Jane","Malaria")
    farmer.eat()
    farmer.sleep()
   println(banker is Banker)
    println(doctor is Any)
    println(doctor is person)

    //banker.eat()
    //doctor.eat()
    farmer.eat()
    banker.intro()
    doctor.intro()
    farmer.intro()
    


//add an introduction function to your parent class.
    //it should print out "Hi my name is ..."
    }

   open class person (var name:String,var age:Int){
       open fun talk(words:String){
            println(words)
        }
        open fun eat(){
            println("yum")
        }
        fun sleep(){
            println("zzz")
        }
       open fun intro(){
           println("Hi my name is $name")

       }

    }





class Banker( name:String,  age:Int):person(name,age){

    fun countMoney(notes:Array<Int>):Int{
        var sum=notes.sum()
        return sum
    }
}
class Doctor( name:String, age:Int):person(name,age){

    fun treatPatient(patient:String,disease:String){
        println("Treating $patient for $disease")
    }
     override fun intro(){
         //super.intro()
        println("Hi my name is Dr.$name")

    }


}
class Farmer( name:String, age:Int):person(name,age){

    fun cultivateLand(){
        println("dig dig dig")

    }

    override fun eat() {

        super.eat()
        println("I am eating all the food that I've grown")
    }

}