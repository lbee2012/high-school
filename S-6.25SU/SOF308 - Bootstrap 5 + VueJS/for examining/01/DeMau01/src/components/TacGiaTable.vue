<script setup>
import { ref } from "vue";
const prop = defineProps({ danhSachTaacGia: Array }); // nhận mảng danh sách tác giả từ cha App.vue
const emit = defineEmits(["xoa-gia"]);
</script>

<template>
  <div class=":container mt-3">
    <h2>Danh sách tác giả</h2>
    <table class="table table-bordered">
      <thead>
        <tr>
          <th scope="col">ID</th>
          <th scope="col">Tên</th>
          <th scope="col">Giới tính</th>
          <th scope="col">Địa chỉ</th>
          <th scope="col">Tuổi</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="(tg,i) in danhSachTaacGia" :key="tg.id">
            <!-- v-for="(tg,i) in danhSachTaacGia" :key="tg.id" -->
          <td>{{ tg.id }}</td>
          <td>{{ tg.ten }}</td>
          <td>{{ tg.gioiTinh ? "Nam" : "Nữ" }}</td>
          <td>{{ tg.diaChi }}</td>
          <td>{{ tg.tuoi }}</td>
          <td>
            <button @click="emit('xoa-gia',i)" class="btn btn-primary">Xóa</button>
            <!-- Lưu ý: @click="emit('xoa-gia',i)" -->
          </td>
        </tr>
      </tbody>
    </table>
  </div>
</template>
