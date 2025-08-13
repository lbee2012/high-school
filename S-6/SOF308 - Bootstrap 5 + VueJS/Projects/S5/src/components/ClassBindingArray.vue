<script setup>
import { ref } from 'vue';
const textColor = ref('text-success') //green
const toggleColor = () => {
    textColor.value === 'text-success' ? 'text-danger' : 'text-success';
}
</script>

<template>
    <div :class="[textColor, 'fw-bold', 'fs-3']">Day la doan van co class various color</div>
    <button class="btn btn-secondary mt-3" @click="toggleColor">Toggle Color</button>
    
</template>

<!-- 
:class nhận một mảng các class, mỗi class là một biến động ref hoặc giá trị tĩnh -->