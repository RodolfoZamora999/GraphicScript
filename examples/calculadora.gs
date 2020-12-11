//Creación de una calculadora sencilla
Ventana #id ventana #dimension 470,800 #posicion 440,125 #color 126,202,248

//Creación de un panel
Panel #id panel #dimension 470,800 #posicion 0,0 #color 255,255,255

//Se inserta el panel a la ventana
!ventana #insertar !panel

//Creación del panel de los digitos
Panel #id panel_digitos #dimension 425,150 #posicion 10,10 #color 230,230,230

//Se inserta el panel de los digitos al panel principal
!panel #insertar !panel_digitos

//Se crea el label de los digitos
Etiqueta #id digitos #dimension 190,60 #posicion 220,60 #texto 100_/_2_+_2 #texto_tamano 35

//Se inserta el label al panel digitos
!panel_digitos #insertar !digitos

//Creación de los botones
Boton #id boton7 #dimension 100,100 #posicion 10,200 #texto 7 #color 255,255,255 #texto_tamano 36 #color 240,240,240
Boton #id boton4 #dimension 100,100 #posicion 10,310 #texto 4 #color 255,255,255 #texto_tamano 36 #color 240,240,240
Boton #id boton8 #dimension 100,100 #posicion 120,200 #texto 8 #color 255,255,255 #texto_tamano 36 #color 240,240,240
Boton #id boton5 #dimension 100,100 #posicion 120,310 #texto 5 #color 255,255,255 #texto_tamano 36 #color 240,240,240
Boton #id boton9 #dimension 100,100 #posicion 230,200 #texto 9 #color 255,255,255 #texto_tamano 36 #color 240,240,240
Boton #id boton6 #dimension 100,100 #posicion 230,310 #texto 6 #color 255,255,255 #texto_tamano 36 #color 240,240,240
Boton #id botonx #dimension 100,100 #posicion 340,200 #texto x #color 255,255,255 #texto_tamano 36 #color 240,240,240
Boton #id boton- #dimension 100,100 #posicion 340,310 #texto - #color 255,255,255 #texto_tamano 36 #color 240,240,240
Boton #id boton1 #dimension 100,100 #posicion 10,420 #texto 1 #color 255,255,255 #texto_tamano 36 #color 240,240,240
Boton #id boton2 #dimension 100,100 #posicion 120,420 #texto 2 #color 255,255,255 #texto_tamano 36 #color 240,240,240
Boton #id boton3 #dimension 100,100 #posicion 230,420 #texto 3 #color 255,255,255 #texto_tamano 36 #color 240,240,240
Boton #id boton+ #dimension 100,100 #posicion 340,420 #texto + #color 255,255,255 #texto_tamano 36 #color 240,240,240
Boton #id boton+/- #dimension 100,100 #posicion 10,530 #texto +/- #color 255,255,255 #texto_tamano 36 #color 240,240,240
Boton #id boton0 #dimension 100,100 #posicion 120,530 #texto 0 #color 255,255,255 #texto_tamano 36 #color 240,240,240
Boton #id boton. #dimension 100,100 #posicion 230,530 #texto . #color 255,255,255 #texto_tamano 36 #color 240,240,240
Boton #id boton= #dimension 100,100 #posicion 340,530 #texto = #color 255,255,255 #texto_tamano 36 #color 240,240,240

//Se insertan todos los botones al panel
!panel #insertar !boton7 #insertar !boton4 #insertar !boton8 #insertar !boton5 #insertar !boton9 #insertar !boton6
!panel #insertar !botonx #insertar !boton- #insertar !boton1 #insertar !boton2 #insertar !boton3 #insertar !boton+
!panel #insertar !boton+/- #insertar !boton0 #insertar !boton. #insertar !boton=