fun main() {
    var em= employee("omr",22)
    var w =webD()


    w.salary()
    println(w.name)
}

open class employee(name:String,age:Int){

    var name=name
    var age:Int=age


    open fun salary(){

    }



}

open class webD :employee("",0){


}

class iosD(name: String, age: Int) :employee(name, age){


}

class androidD(name: String, age: Int) :employee(name, age){


}