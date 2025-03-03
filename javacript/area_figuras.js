// Importamos la librería prompt-sync para permitir la entrada de datos en Node.js
const prompt = require('prompt-sync')(); 

// Definimos constantes necesarias para los cálculos
const PI = 3.1416; 
const valorConst = 2; 

// Solicitamos al usuario que seleccione una figura geométrica
let opcion = prompt(`Seleccione la figura a calcular su área:
1 para rombo
2 para rectángulo
3 para cuadrado
4 para trapecio
`);
opcion = parseInt(opcion); // Convertimos la opción ingresada a número entero

// Utilizamos una estructura de control switch para calcular el área según la opción elegida
switch (opcion) {
    case 1:
        // Cálculo del área del rombo: (Dmayor * Dmenor) / 2
        let Dmayor = parseFloat(prompt("Ingrese el valor de la diagonal mayor: "));
        let Dmenor = parseFloat(prompt("Ingrese el valor de la diagonal menor: "));
        let areaRombo = (Dmayor * Dmenor) / valorConst;
        console.log("El área del rombo es: " + areaRombo);
        break;
        
    case 2:
        // Cálculo del área del rectángulo: base * altura
        let Largo = parseFloat(prompt("Ingrese el valor del largo del rectángulo: "));
        let Ancho = parseFloat(prompt("Ingrese el valor del ancho del rectángulo: "));
        let areaRectangulo = Largo * Ancho;
        console.log("El área del rectángulo es: " + areaRectangulo);
        break;
        
    case 3:
        // Cálculo del área del cuadrado: lado * lado
        let Lado = parseFloat(prompt("Ingrese el valor del lado del cuadrado: "));
        let areaCuadrado = Lado * Lado;
        console.log("El área del cuadrado es: " + areaCuadrado);
        break;
        
    case 4:
        // Cálculo del área del trapecio: ((Bmayor + Bmenor) * altura) / 2
        let Bmayor = parseFloat(prompt("Ingrese el valor de la base mayor: "));
        let Bmenor = parseFloat(prompt("Ingrese el valor de la base menor: "));
        let H = parseFloat(prompt("Ingrese la altura del trapecio: "));
        let areaTrapecio = ((Bmayor + Bmenor) * H) / valorConst;
        console.log("El área del trapecio es: " + areaTrapecio);
        break;
        
    default:
        // Mensaje de error si el usuario ingresa una opción no válida
        console.log("Opción no válida. Por favor, seleccione un número del 1 al 4.");
}

