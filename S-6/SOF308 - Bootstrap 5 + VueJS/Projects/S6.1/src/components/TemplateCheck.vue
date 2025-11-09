<script setup>
import { ref } from 'vue';
const isLogin = ref(true)
const khachHang = {
    ten: "Long Hoang",
    trangThai: true,
}
</script>

<template>
    <template v-if="isLogin && khachHang.trangThai">
        <div class="alert alert-success">
            Ho ten: {{ khachHang.ten }} <br>
            Trang thai: {{ khachHang.trangThai ? 'Dong y tham gia' : 'Khong dong y tham gia' }}
        </div>
    </template>
    <template v-else>
        <div class="alert alert-danger">
            Khong the hien thi thong tin khach hang
        </div>
    </template>
</template>

<style scoped></style>