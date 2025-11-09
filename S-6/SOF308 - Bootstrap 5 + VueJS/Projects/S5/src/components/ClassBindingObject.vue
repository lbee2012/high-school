<script setup>
import { ref } from 'vue';
const isDongY = ref(false);

</script>

<template>
    <div :class="{ 'bg-success text-white': isDongY, 'bg-danger text-white': !isDongY }">
        {{ isDongY ? 'Dong Y' : 'Khong Dong Y' }}

    </div>
</template>
