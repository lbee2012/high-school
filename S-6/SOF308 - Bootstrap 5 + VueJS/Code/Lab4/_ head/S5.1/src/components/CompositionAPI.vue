<script setup>
import { computed, ref } from 'vue'
let initialNumber = ref(1)
let doubled = computed(() => initialNumber.value * 2)
</script>

<template>
    <input type="number" v-model="initialNumber" class="form-control" placeholder="Enter a number:"
    <p>Initial Number: {{ initialNumber }}</p>
    <p>Doubled Value: {{ doubled }}</p>
</template>

<!-- 
- Composition API là một cách tiếp cận mới trong Vue 3 để tổ chức và quản lý logic của component.
(linh hoạt hơn so với Options API)
- các API chính
    - ref: tạo biến phản ứng (reactive variable)
    - reactive: tạo đối tượng phản ứng (reactive object)
    - computed: tạo thuộc tính tính toán (computed property)
    - watch: theo dõi sự thay đổi của biến
    - provide/inject: chia sẻ dữ liệu giữa các component không có quan hệ cha-con
 -->