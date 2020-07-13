// Copyright 2019 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * handle Kin slide show
 */
$(function () {
  $("#listshow").KinSlideshow({
    moveStyle: "down",
    intervalTime: 2,
    titleBar: { titleBar_height: 30, titleBar_bgColor: "#000000", titleBar_alpha: 0.5 },
    mouseEvent: "mouseover",
    titleFont: { TitleFont_size: 8, TitleFont_color: "#FF0000" },
    btn: {
      btn_bgColor: "#666666", btn_bgHoverColor: "#f00",
      btn_fontColor: "#fff", btn_fontHoverColor: "#fff", btn_fontFamily: "Verdana",
      btn_borderColor: "#999999", btn_borderHoverColor: "#FF0000",
      btn_borderWidth: 1, btn_bgAlpha: 0.9
    }
  });
})

/**
 * Adds a random greeting to the page.
 */
function addRandomGreeting() {
  const greetings =
    ['Hello world!', '¡Hola Mundo!', '你好，世界！', 'Bonjour le monde!'];

  // Pick a random greeting.
  const greeting = greetings[Math.floor(Math.random() * greetings.length)];

  // Add it to the page.
  const greetingContainer = document.getElementById('greeting-container');
  greetingContainer.innerText = greeting;
}

async function getRandomCatName() {
  const response = await fetch('/cat-name');
  const quote = await response.text();
  document.getElementById('cat-name-container').innerText = quote;
}

// function getJson() {
//   fetch('/data').then(response => response.json()).then((obj) => {
//     const element = document.getElementById('json-container');
//     element.innerHTML = '';
//     element.appendChild(
//       createListElement('obj1: ' + obj[0]));
//     element.appendChild(
//       createListElement('obj2: ' + obj[1]));
//     element.appendChild(
//       createListElement('obj3: ' + obj[2]));
//     element.appendChild(
//       createListElement('obj4: ' + obj[3]));
//   });
// }

/** Creates an <li> element containing text. */
function createListElement(text) {
  const liElement = document.createElement('li');
  liElement.innerText = text;
  return liElement;
}
