<script setup>
import { ref } from 'vue';
var tenNguoiDung = ref("");
</script>

<template>
    <div>
        <input type="text" v-model="tenNguoiDung" placeholder="Nhap ten nguoi dung">
        <br>
        <h3>Xin chao, {{ tenNguoiDung }}</h3>
    </div>
</template>