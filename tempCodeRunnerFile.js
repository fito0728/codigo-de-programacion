// Solicitar al usuario el primer valor
let A = parseInt(prompt("Ingrese el primer valor:"));

// Solicitar al usuario el segundo valor
let C = parseInt(prompt("Ingrese el segundo valor:"));

// Calcular la potencia A^C
let potencia = Math.pow(A, C); // Función Math.pow(base, exponente)

// Mostrar el resultado en la consola
console.log(`La potencia de ${A} sobre ${C} es: ${potencia}`);

// También se puede mostrar en la página web
document.write(`La potencia de ${A} sobre ${C} es: ${potencia}`);
