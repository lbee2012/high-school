<script setup>
import { ref } from 'vue';
var count = ref(0)
</script>

<style scoped>
button {
    background-color: cadetblue;
    color: white;
    border-radius: 10px;
    padding: 5px 10px;
    text-align: center;
    border: none;
}
</style>

<template>
    <div>
        <h1>{{ count }}</h1>
        <button @click="count++">+</button>
        <button @click="count--">-</button>
    </div>
</template>