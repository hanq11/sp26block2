<script setup>
import { ref } from 'vue'

// one way data binding
let message = "hello world"

const printMessage = () => {
  message += "1"
  console.log(message)
}
// two way data binding - ref
let number = ref(1)
const increaseNumber = () => {
  number.value++
}
let person = ref({
  name: "abc",
  age: 123
})
const increaseAge = () => {
  person.value.age++
}
</script>

<template>
  <h2>One way data binding</h2>
  Message: <input type="text" :value="message">
  <br>
  <button @click="printMessage()">Click me</button>

  <h2>Two way data binding - ref</h2>
  Number value: <span>{{ number }}</span>
  <br>
  <button @click="increaseNumber()">Click me</button>
  <br>
  Two way with v-model: <input type="text" v-model="number">
  <h2>Ref with object</h2>
  Name: <input type="text" v-model="person.name"><br>
  Age: <button @click="increaseAge()">Increase age</button> <br>
  Person named {{ person.name }} and {{ person.age }} yrs old
</template>
