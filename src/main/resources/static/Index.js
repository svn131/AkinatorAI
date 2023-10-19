// Функция для отправки ответа на сервер и получения следующего вопроса и изображения
function sendAnswer(answer) {
  // Получаем текущий индекс вопроса и путь к изображению
  var currentIndex = document.getElementById("question").dataset.index;
  var currentImage = document.getElementById("image").src;

  // Отправляем запрос на сервер с использованием fetch API
  fetch('/answer', {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify({ index: currentIndex, answer: answer })
  })
  .then(function(response) {
    if (response.ok) {
      return response.json();
    } else {
      throw new Error('Ошибка при отправке ответа на сервер');
    }
  })
  .then(function(data) {
    // Обновляем вопрос и изображение на странице
    document.getElementById("question").textContent = data.question;
    document.getElementById("question").dataset.index = data.index;
    document.getElementById("image").src = data.image;
  })
  .catch(function(error) {
    console.error(error);
  });
}

// Код для инициализации начального вопроса и изображения
window.onload = function() {
  // Отправляем запрос на сервер с использованием fetch API
  fetch('/question')
  .then(function(response) {
    if (response.ok) {
      return response.json();
    } else {
      throw new Error('Ошибка при получении начального вопроса с сервера');
    }
  })
  .then(function(data) {
    // Обновляем вопрос и изображение на странице
    document.getElementById("question").textContent = data.question;
    document.getElementById("question").dataset.index = data.index;
    document.getElementById("image").src = data.image;
  })
  .catch(function(error) {
    console.error(error);
  });
};
