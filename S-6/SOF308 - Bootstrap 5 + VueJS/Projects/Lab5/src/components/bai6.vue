<script setup>
import { ref } from 'vue';
var mainClass = ref('bg-primary')
var textClass = ref('text-white')
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
    <div :class="[mainClass, textClass]">
        <h2>Mau nen vao Mau chu</h2>
        <button @click="mainClass = 'bg-success'; textClass = 'text-dark'">Change Style</button>
    </div>
</template>