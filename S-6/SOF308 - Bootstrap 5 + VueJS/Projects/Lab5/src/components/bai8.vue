<script setup>
import { ref } from 'vue'

var styleArray = ref([
  { color: 'purple' },
  { fontSize: '18px' }
])
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
        <h1 :style="styleArray">Mảng các style</h1>
        <button class="btn btn-primary" @click="styleArray[0].color = styleArray[0].color === 'purple' ? 'red' : 'purple'">Đổi màu</button>
    </div>
</template>