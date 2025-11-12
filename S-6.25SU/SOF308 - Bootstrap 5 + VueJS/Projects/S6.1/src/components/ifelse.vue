<script setup>
import { ref } from 'vue';
const khachHang = ({
    ten: "Long Hoang",
    trangThai: true
}) 
</script>

<template>
    <div class="container mt-4">
        <h2>Trang thai Khach hang</h2>
        <div v-if="khachHang.trangThai" class="alert alert-success">Dong y Tham gia</div>
        <div v-else class="alert alert-danger">Khong dong y Tham gia</div>
    </div>
</template>

<style scoped></style>