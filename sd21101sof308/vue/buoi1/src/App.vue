<script setup>
let message = "SD21101"

const sayHi = () => {
  return "say hi"
}
let htmlCode = "<b>Hello</b>"
let redClass = "red";
let number = 12;
const helloWorld = () => {
  console.log("Hello world")
}
const vao = () => {
  console.log("vao")
}
const ra = () => {
  console.log("ra")
}
</script>

<template>
  Hello <span>{{ message }}</span>
  <p>{{ sayHi() }}</p>
  <p v-html="htmlCode" :class=redClass></p>
  <p>{{ number }} là số {{ number % 2 == 0 ? "Chẵn" : "Lẻ" }}</p>
  <button v-on:click="helloWorld()">Click me</button>
  <button @click="helloWorld()" @mouseenter="vao()" @mouseleave="ra()">Click me</button>
  <table class="table">
    <thead>
      <tr>
        <th scope="col">#</th>
        <th scope="col">First</th>
        <th scope="col">Last</th>
        <th scope="col">Handle</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <th scope="row">1</th>
        <td>Mark</td>
        <td>Otto</td>
        <td>@mdo</td>
      </tr>
      <tr>
        <th scope="row">2</th>
        <td>Jacob</td>
        <td>Thornton</td>
        <td>@fat</td>
      </tr>
      <tr>
        <th scope="row">3</th>
        <td>John</td>
        <td>Doe</td>
        <td>@social</td>
      </tr>
    </tbody>
  </table>
</template>

<style scoped>
.red {
  color: red;
}
</style>