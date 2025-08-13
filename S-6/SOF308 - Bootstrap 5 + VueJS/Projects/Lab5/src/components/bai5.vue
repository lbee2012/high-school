<script setup>
var isVip = true;
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
    <div :class="{ 'text-danger': isVip , 'text-success': !isVip }">
        <h2>Khach hang</h2>
        <button @click="isVip = !isVip">Change VIP</button>
    </div>
</template>