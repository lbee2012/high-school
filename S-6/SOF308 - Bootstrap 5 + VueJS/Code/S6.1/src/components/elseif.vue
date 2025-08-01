<script setup>
const weather = 'sunny'
</script>
<template>
    <div class="container mt-4">
        <div v-if="weather==='sunny'">Troi nang, di choi de</div>
        <div v-else-if="weather==='rainy'">Troi mua, o nha de</div>
        <div v-else-if="weather==='cloudy'">Troi am u, mang o di lam</div>
    </div>
</template>
<style scoped></style>