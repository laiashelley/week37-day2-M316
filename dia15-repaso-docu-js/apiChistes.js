/**
 * Crea evento "click" en el botón con id "botonChiste" y hace solicitud a la API "Joke API" para obtener chiste random.
 * @event click
 */
document.getElementById("botonChiste").addEventListener("click", () => {
  // URL de la API para obtener un chiste en español
  const chisteApi = `https://v2.jokeapi.dev/joke/Any?lang=es&type=single`;

  // Realiza una solicitud GET a la API del chiste.
  fetch(chisteApi)
    .then((response) => response.json()) // Convierte la respuesta a formato JSON.
    .then((data) => {
      console.log(data);

      // Convierte el chiste a mayúsculas y lo inserta en el elemento con id "chisteNormal".
      let chisteNormal = data.joke.toUpperCase();
      document.getElementById("chisteNormal").innerHTML = chisteNormal;
    })
    .catch((err) => console.log(err));
});

/**
 *Crea evento "click" en el botón con id "botonChisteNorris" y hace solicitud a la API de Chuck Norris para obtener chiste random de Chuck Norris.
 * @event click
 */
document.getElementById("botonChisteNorris").addEventListener("click", () => {
  // URL de la API para obtener un chiste aleatorio de Chuck Norris.
  const norrisApi = `https://api.chucknorris.io/jokes/random`;

  // Realiza una solicitud GET a la API de Chuck Norris.
  fetch(norrisApi)
    .then((response) => response.json()) // Convierte la respuesta a formato JSON.
    .then((data) => {
      console.log(data);

      // Convierte el chiste a mayúsculas y lo inserta en el elemento "chisteNorris".
      let chisteNorris = data.value.toUpperCase();
      document.getElementById("chisteNorris").innerHTML = chisteNorris;
    })
    .catch((err) => console.log(err));
});
