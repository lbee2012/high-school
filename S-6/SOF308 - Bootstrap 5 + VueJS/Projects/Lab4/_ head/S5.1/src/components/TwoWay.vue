<script setup>
import { ref } from 'vue';
const email = ref('')
</script>

<template>
    <input type="email" v-model="email" class="form-control" placeholder="enter your email:">
    <p>Email: {{ email }}</p>
</template>

<!-- 
Two way là ràng buộc dữ liệu 2 chiều, là cơ chế đồng bộ dữ liệu 2 chiều giữa model và view thông qua viewModel 
- Two way sử dụng v-model
- v-model là chỉ thị (directive)
    - khi người dùng nhập dữ liệu vào input thì giá trị của biến sẽ được tự động cập nhật
    - khi giá trị của biến thay đổi thì giao diện ở input sẽ tự động cập nhật theo

-->