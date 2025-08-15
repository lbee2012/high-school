<script setup>
import { ref } from "vue";
import TacGiaForm from "./components/TacGiaForm.vue";
import TacGiaTable from "./components/TacGiaTable.vue";
import FoodterLayout from "./layout/FoodterLayout.vue";
import HeaderLayout from "./layout/HeaderLayout.vue";

//mảng tác giả
const danhSachTaacGia = ref([
  {
    id: "1",
    ten: "Thùy",
    gioiTinh: true,
    diaChi: "Hà Nội",
    tuoi: 25,
  },
  {
    id: "2",
    ten: "Thiện",
    gioiTinh: false,
    diaChi: "Hà Nội",
    tuoi: 25,
  },
  {
    id: "3",
    ten: "Thanh",
    gioiTinh: true,
    diaChi: "Hà Nội",
    tuoi: 25,
  },
]);
</script>

<template>
  <div class="container">
    <HeaderLayout></HeaderLayout>
    <TacGiaForm @them-gia="a => danhSachTaacGia.push(a)"></TacGiaForm>
    <TacGiaTable :danh-sach-taac-gia="danhSachTaacGia" @xoa-gia="i => danhSachTaacGia.splice(i,1)"></TacGiaTable>
    <!-- Lưu ý gọi form và các sự kiện -->
    <FoodterLayout></FoodterLayout>
  </div>
</template>
