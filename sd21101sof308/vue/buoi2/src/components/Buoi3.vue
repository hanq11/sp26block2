<script setup>
import { ref } from 'vue';

let seen = ref(false)
const toggleSeen = () => {
    seen.value = !seen.value
}
</script>

<template>
    <h2 style="color: red">v-if v-else v-else-if v-show </h2>
    <h2 v-if="seen">Ban co thay toi khong</h2>
    <button @click="toggleSeen">Toggle</button>
    <h2 v-if="seen">Xin chuc mung ban</h2>
    <h2 v-else>Rat tiec, hen gap lai</h2>
    <h2 v-show="seen">Toi la v-show</h2>
</template>