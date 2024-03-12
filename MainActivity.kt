package Fernanda.Hernandez.poofernanda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //variables
        var dia: String
        var edad: Int = 22
        var velocidad: Double
        var temperatura: Float = 30.0f

        //valores (constantes)
        val pi: Double = 3.1416
        val DUI: String = "0930203-8"
        val fechaN: String = "8 de octubre "

        //variables nulas
        var tel: Int? = null //comprobar si la variable es nula, y asi la aplicacion no se cierre; si tiene el signo de pregunta la variable puede tener datos nulos pero primero se comprueba si es nulo o no

        //objetos

        val objCalc = Calcu ()
        objCalc.suma(8, 4 )

       println( objCalc.suma(8, 4 ))

        val itzferhdz = Usuario()
        itzferhdz.darlike()
        itzferhdz.follow()

// arrays
        val listado = arrayOf("Yun", "Chae", "Eun", "Zuha", "Saku chan", 8 )
    }






    //clases
    class personas {

    }
     class newUser {

     }

    class leSserafim {

    }



}

