package com.cursosant.sopadeletras

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var jugando = false
    val palabras_partida_actual = mutableListOf<String>() // Lista de palabras seleccionadas aleatoriamente para la partida
    lateinit var casillas: Array<TextView>
    lateinit var palabras: Array<String>
    lateinit var letras: Array<String>
    val tablero = Array(10) { Array(10) { "" } } // Tablero de 10x10, inicialmente vacío
    var errores = 0
    var contador_encontradas = 0
    val palabras_encontradas = BooleanArray(5) { false } // Control de palabras encontradas
    val posicion_palabras = Array(5) { mutableListOf<Int>() } // Guarda las posiciones (índices) de las letras que forman cada palabra
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btn_iniciar = findViewById<Button>(R.id.btn_iniciar)
        val btn_rendirse = findViewById<Button>(R.id.btn_rendirse)
        val txtview_palabra_aleatoria_n1 = findViewById<TextView>(R.id.txtview_palabra_aleatoria_n1)
        val txtview_palabra_aleatoria_n2 = findViewById<TextView>(R.id.txtview_palabra_aleatoria_n2)
        val txtview_palabra_aleatoria_n3 = findViewById<TextView>(R.id.txtview_palabra_aleatoria_n3)
        val txtview_palabra_aleatoria_n4 = findViewById<TextView>(R.id.txtview_palabra_aleatoria_n4)
        val txtview_palabra_aleatoria_n5 = findViewById<TextView>(R.id.txtview_palabra_aleatoria_n5)
        val txtview_errores = findViewById<TextView>(R.id.txtview_errores)
        val txtview_palabras_restantes = findViewById<TextView>(R.id.txtview_palabras_restantes)
        val txtview_palabras_encontradas = findViewById<TextView>(R.id.txtview_palabras_encontradas)
        val cs1 = findViewById<TextView>(R.id.cs1)
        val cs2 = findViewById<TextView>(R.id.cs2)
        val cs3 = findViewById<TextView>(R.id.cs3)
        val cs4 = findViewById<TextView>(R.id.cs4)
        val cs5 = findViewById<TextView>(R.id.cs5)
        val cs6 = findViewById<TextView>(R.id.cs6)
        val cs7 = findViewById<TextView>(R.id.cs7)
        val cs8 = findViewById<TextView>(R.id.cs8)
        val cs9 = findViewById<TextView>(R.id.cs9)
        val cs10 = findViewById<TextView>(R.id.cs10)
        val cs11 = findViewById<TextView>(R.id.cs11)
        val cs12 = findViewById<TextView>(R.id.cs12)
        val cs13 = findViewById<TextView>(R.id.cs13)
        val cs14 = findViewById<TextView>(R.id.cs14)
        val cs15 = findViewById<TextView>(R.id.cs15)
        val cs16 = findViewById<TextView>(R.id.cs16)
        val cs17 = findViewById<TextView>(R.id.cs17)
        val cs18 = findViewById<TextView>(R.id.cs18)
        val cs19 = findViewById<TextView>(R.id.cs19)
        val cs20 = findViewById<TextView>(R.id.cs20)
        val cs21 = findViewById<TextView>(R.id.cs21)
        val cs22 = findViewById<TextView>(R.id.cs22)
        val cs23 = findViewById<TextView>(R.id.cs23)
        val cs24 = findViewById<TextView>(R.id.cs24)
        val cs25 = findViewById<TextView>(R.id.cs25)
        val cs26 = findViewById<TextView>(R.id.cs26)
        val cs27 = findViewById<TextView>(R.id.cs27)
        val cs28 = findViewById<TextView>(R.id.cs28)
        val cs29 = findViewById<TextView>(R.id.cs29)
        val cs30 = findViewById<TextView>(R.id.cs30)
        val cs31 = findViewById<TextView>(R.id.cs31)
        val cs32 = findViewById<TextView>(R.id.cs32)
        val cs33 = findViewById<TextView>(R.id.cs33)
        val cs34 = findViewById<TextView>(R.id.cs34)
        val cs35 = findViewById<TextView>(R.id.cs35)
        val cs36 = findViewById<TextView>(R.id.cs36)
        val cs37 = findViewById<TextView>(R.id.cs37)
        val cs38 = findViewById<TextView>(R.id.cs38)
        val cs39 = findViewById<TextView>(R.id.cs39)
        val cs40 = findViewById<TextView>(R.id.cs40)
        val cs41 = findViewById<TextView>(R.id.cs41)
        val cs42 = findViewById<TextView>(R.id.cs42)
        val cs43 = findViewById<TextView>(R.id.cs43)
        val cs44 = findViewById<TextView>(R.id.cs44)
        val cs45 = findViewById<TextView>(R.id.cs45)
        val cs46 = findViewById<TextView>(R.id.cs46)
        val cs47 = findViewById<TextView>(R.id.cs47)
        val cs48 = findViewById<TextView>(R.id.cs48)
        val cs49 = findViewById<TextView>(R.id.cs49)
        val cs50 = findViewById<TextView>(R.id.cs50)
        val cs51 = findViewById<TextView>(R.id.cs51)
        val cs52 = findViewById<TextView>(R.id.cs52)
        val cs53 = findViewById<TextView>(R.id.cs53)
        val cs54 = findViewById<TextView>(R.id.cs54)
        val cs55 = findViewById<TextView>(R.id.cs55)
        val cs56 = findViewById<TextView>(R.id.cs56)
        val cs57 = findViewById<TextView>(R.id.cs57)
        val cs58 = findViewById<TextView>(R.id.cs58)
        val cs59 = findViewById<TextView>(R.id.cs59)
        val cs60 = findViewById<TextView>(R.id.cs60)
        val cs61 = findViewById<TextView>(R.id.cs61)
        val cs62 = findViewById<TextView>(R.id.cs62)
        val cs63 = findViewById<TextView>(R.id.cs63)
        val cs64 = findViewById<TextView>(R.id.cs64)
        val cs65 = findViewById<TextView>(R.id.cs65)
        val cs66 = findViewById<TextView>(R.id.cs66)
        val cs67 = findViewById<TextView>(R.id.cs67)
        val cs68 = findViewById<TextView>(R.id.cs68)
        val cs69 = findViewById<TextView>(R.id.cs69)
        val cs70 = findViewById<TextView>(R.id.cs70)
        val cs71 = findViewById<TextView>(R.id.cs71)
        val cs72 = findViewById<TextView>(R.id.cs72)
        val cs73 = findViewById<TextView>(R.id.cs73)
        val cs74 = findViewById<TextView>(R.id.cs74)
        val cs75 = findViewById<TextView>(R.id.cs75)
        val cs76 = findViewById<TextView>(R.id.cs76)
        val cs77 = findViewById<TextView>(R.id.cs77)
        val cs78 = findViewById<TextView>(R.id.cs78)
        val cs79 = findViewById<TextView>(R.id.cs79)
        val cs80 = findViewById<TextView>(R.id.cs80)
        val cs81 = findViewById<TextView>(R.id.cs81)
        val cs82 = findViewById<TextView>(R.id.cs82)
        val cs83 = findViewById<TextView>(R.id.cs83)
        val cs84 = findViewById<TextView>(R.id.cs84)
        val cs85 = findViewById<TextView>(R.id.cs85)
        val cs86 = findViewById<TextView>(R.id.cs86)
        val cs87 = findViewById<TextView>(R.id.cs87)
        val cs88 = findViewById<TextView>(R.id.cs88)
        val cs89 = findViewById<TextView>(R.id.cs89)
        val cs90 = findViewById<TextView>(R.id.cs90)
        val cs91 = findViewById<TextView>(R.id.cs91)
        val cs92 = findViewById<TextView>(R.id.cs92)
        val cs93 = findViewById<TextView>(R.id.cs93)
        val cs94 = findViewById<TextView>(R.id.cs94)
        val cs95 = findViewById<TextView>(R.id.cs95)
        val cs96 = findViewById<TextView>(R.id.cs96)
        val cs97 = findViewById<TextView>(R.id.cs97)
        val cs98 = findViewById<TextView>(R.id.cs98)
        val cs99 = findViewById<TextView>(R.id.cs99)
        val cs100 = findViewById<TextView>(R.id.cs100)
        casillas = arrayOf(cs1, cs2, cs3, cs4, cs5, cs6, cs7, cs8, cs9, cs10, cs11, cs12, cs13, cs14, cs15, cs16, cs17, cs18, cs19, cs20, cs21, cs22, cs23, cs24, cs25, cs26, cs27, cs28, cs29, cs30, cs31, cs32, cs33, cs34, cs35, cs36, cs37, cs38, cs39, cs40, cs41, cs42, cs43, cs44, cs45, cs46, cs47, cs48, cs49, cs50, cs51, cs52, cs53, cs54, cs55, cs56, cs57, cs58, cs59, cs60, cs61, cs62, cs63, cs64, cs65, cs66, cs67, cs68, cs69, cs70, cs71, cs72, cs73, cs74, cs75, cs76, cs77, cs78, cs79, cs80, cs81, cs82, cs83, cs84, cs85, cs86, cs87, cs88, cs89, cs90, cs91, cs92, cs93, cs94, cs95, cs96, cs97, cs98, cs99, cs100)
        palabras = arrayOf("SOL","MAR","LUZ","PEZ","CASA","GATO","PERRO","LUNA","AGUA","FLOR","ARBOL","CIELO","NUBE","VIENTO","TIERRA","FUEGO","ROCA","RIO","LAGO","MONTE","VALLE","ISLA","PLAYA","ONDA","ARENA","CORAL","ALGA","PINO","ROBLE","HOJA","RAMA","RAIZ","FRUTO","SEMILLA","JARDIN","CAMPO","SELVA","BOSQUE","PRADERA","DESIERTO","NIEVE","HIELO","ESTRELLA","COMETA","PLANETA","COSMOS","GALAXY","METEOR","ORBITA","ESPACIO")
        letras = arrayOf("A","B","C","D","E","F","G","H","I","J","K","L","M","N","Ñ","O","P","Q","R","S","T","U","V","W","X","Y","Z")

        btn_iniciar.isEnabled = true
        btn_rendirse.isEnabled = false

        btn_iniciar.setOnClickListener {
            btn_iniciar.isEnabled = false
            btn_rendirse.isEnabled = true
            jugando = true

            casillas.forEach { casilla -> // Pone todas las letras a blanco
                casilla.setTextColor(android.graphics.Color.WHITE)
            }

            palabras_partida_actual.clear() // Selecciona 5 palabras aleatorias únicas
            while (palabras_partida_actual.size < 5) {
                val palabra = palabras.random()
                if (!palabras_partida_actual.contains(palabra)) {
                    palabras_partida_actual.add(palabra)
                }
            }
            txtview_palabra_aleatoria_n1.text = palabras_partida_actual[0]
            txtview_palabra_aleatoria_n2.text = palabras_partida_actual[1]
            txtview_palabra_aleatoria_n3.text = palabras_partida_actual[2]
            txtview_palabra_aleatoria_n4.text = palabras_partida_actual[3]
            txtview_palabra_aleatoria_n5.text = palabras_partida_actual[4]

            colocarpalabras()
            colocarletras()

            errores = 0
            contador_encontradas = 0
            txtview_errores.text = "0"
            txtview_palabras_restantes.text = "5"
            txtview_palabras_encontradas.text = "0"
        }

        btn_rendirse.setOnClickListener {
            if (jugando) {
                jugando = false
                errores = 0
                contador_encontradas = 0

                Toast.makeText(this, "Te Rendiste", Toast.LENGTH_SHORT).show()
                btn_iniciar.isEnabled = true
                btn_rendirse.isEnabled = false
            } else {
                Toast.makeText(this, "Presiona 'Iniciar'", Toast.LENGTH_SHORT).show()
            }
        }

        casillas.forEachIndexed { i, casilla ->
            casilla.setOnClickListener {
                if (jugando == false) {
                    Toast.makeText(this, "Presiona 'Iniciar'", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }

                var encontrado = false

                for (ind_palabra in 0..4) { // Recorre las 5 palabras
                    if (palabras_encontradas[ind_palabra]) continue

                    if (i in posicion_palabras[ind_palabra]) { // Comprueba si el índice pulsado pertenece a alguna palabra
                        encontrado = true
                        palabras_encontradas[ind_palabra] = true

                        for (pos in posicion_palabras[ind_palabra]) { // Pinta la palabra encontrada a verde
                            casillas[pos].setTextColor(android.graphics.Color.GREEN)
                        }

                        contador_encontradas++
                        txtview_palabras_encontradas.text = contador_encontradas.toString()
                        txtview_palabras_restantes.text = (5 - contador_encontradas).toString()

                        if (contador_encontradas == 5) {
                            Toast.makeText(this, "Ganaste", Toast.LENGTH_LONG).show()
                            btn_iniciar.isEnabled = true
                            btn_rendirse.isEnabled = false
                            jugando = false
                        }
                    }
                }
                if (!encontrado) { // Si no era parte de una palabra, cuenta errores
                    errores++
                    txtview_errores.text = errores.toString()

                    if (errores >= 5) {
                        Toast.makeText(this, "Perdiste", Toast.LENGTH_LONG).show()
                        btn_iniciar.isEnabled = true
                        btn_rendirse.isEnabled = false
                        jugando = false
                    }
                }
            }
        }
    }

    fun colocarpalabras() {
        for (fil in 0..9) {
            for (column in 0..9) {
                tablero[fil][column] = ""
            }
        }

        for (ind_palabra in 0..4) { // Reinicia posiciones y estados
            posicion_palabras[ind_palabra].clear()
            palabras_encontradas[ind_palabra] = false
        }

        for (ind_palabra in 0..4) {
            val palabra = palabras_partida_actual[ind_palabra]
            var colocada = false
            var intentos = 0

            while (!colocada && intentos < 100) {
                val direccion = (0..1).random() // 0 = horizontal, 1 = vertical
                val fila = (0..9).random()
                val columna = (0..9).random()

                val cabe = if (direccion == 0) {
                    columna + palabra.length <= 10
                } else {
                    fila + palabra.length <= 10
                }

                if (cabe) {
                    var espacio_libre = true
                    for (ind_letra in palabra.indices) { // Revisa que el espacio está libre
                        val letra = palabra[ind_letra].toString()
                        val letra_tablero = if (direccion == 0) {
                            tablero[fila][columna + ind_letra]
                        } else {
                            tablero[fila + ind_letra][columna]
                        }

                        if (letra_tablero != "" && letra_tablero != letra) {
                            espacio_libre = false
                            break
                        }
                    }

                    if (espacio_libre) { // Si hay espacio, coloca la palabra letra por letra
                        for (indiceLetra in palabra.indices) {
                            val letra = palabra[indiceLetra].toString()

                            if (direccion == 0) {
                                tablero[fila][columna + indiceLetra] = letra
                                val numeroCasilla = (fila * 10) + (columna + indiceLetra)
                                posicion_palabras[ind_palabra].add(numeroCasilla)
                            } else {
                                tablero[fila + indiceLetra][columna] = letra
                                val numeroCasilla = ((fila + indiceLetra) * 10) + columna
                                posicion_palabras[ind_palabra].add(numeroCasilla)
                            }
                        }
                        colocada = true
                    }
                }
                intentos++
            }
        }
    }

    fun colocarletras() {
        for (i in 0..9) {
            for (j in 0..9) {
                if (tablero[i][j] == "") {
                    tablero[i][j] = letras.random()
                }
            }
        }

        var indice = 0 // Pasa las letras del tablero al array de TextViews
        for (i in 0..9) {
            for (j in 0..9) {
                casillas[indice].text = tablero[i][j]
                indice++
            }
        }
    }
}