<template>
  <div class="container">
    <h3>Form Quan Ly</h3>
    <div class="form-group">
        <div class="form-field">
            <label for="ma">Ma _</label>
            <input type="text" id="ma" v-model="xeMay.ma">
        </div>
        <div class="form-field">
            <label for="ten">Ten _</label>
            <input type="text" id="ten" v-model="xeMay.ten">
        </div>
        <div class="form-field">
            <label for="gia">Gia _</label>
            <input type="number" id="gia" v-model="xeMay.gia">
        </div>
        <div class="form-field">
            <label for="hang">Hang _</label>
            <select id="hang" v-model="xeMay.hang">
                <option value="">Chon hang</option>
                <option value="yamaha">Yamaha</option>
                <option value="honda">Honda</option>
                <option value="suzuki">Suzuki</option>
            </select>
        </div>
        <div>
            <label>Gioi tinh _</label>
            <input type="radio" id="nam" value="nam" v-model="xeMay.gioiTinh">
            <label for="nam">Nam</label>
            <input type="radio" id="nu" value="nu" v-model="xeMay.gioiTinh">
            <label for="nu">Nữ</label>
        </div>
        <button class="button" @click="themXeMay">Add</button>
    </div>

    <h5>Table XeMay</h5>
    <table class="table">
      <thead>
        <tr>
          <th>STT</th>
          <th>Ma</th>
          <th>Ten</th>
          <th>Gia</th>
          <th>Hang</th>
          <th>Gioi tinh</th>
          <th>Chuc nang</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="(item, index) in danhSachXeMay" :key="index">
          <td>{{ index + 1 }}</td>
          <td>{{ item.ma }}</td>
          <td>{{ item.ten }}</td>
          <td>{{ item.gia }}</td>
          <td>{{ item.hang }}</td>
          <td>{{ item.gioiTinh }}</td>
          <td>
            <button class="button" @click="xoaXeMay(index)">Delete</button>
            <button class="button" @click="chiTietXeMay(item)">Detail</button>
          </td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script setup>
import { ref } from 'vue';

// model
const xeMay = ref({
  ma: '',
  ten: '',
  gia: null,
  hang: '',
  gioiTinh: ''
});

// getAll
const danhSachXeMay = ref([]);

// add
const themXeMay = () => {
  if (xeMay.value.ma && xeMay.value.ten && xeMay.value.gia && xeMay.value.hang && xeMay.value.gioiTinh) {
    danhSachXeMay.value.push({ ...xeMay.value });

    xeMay.value = {
      ma: '',
      ten: '',
      gia: null,
      hang: '',
      gioiTinh: ''
    };
  } else {
    alert('Vui long dien day du thong tin!');
  }
};

// delete
const xoaXeMay = (index) => {
  if (confirm('Ban co chac chan muon xoa xe may nay khong?')) {
    danhSachXeMay.value.splice(index, 1);
  }
};

// getOne - detail
const chiTietXeMay = (item) => {
  alert(`Thong tin Chi tiet:\nMa: ${item.ma}\nTen: ${item.ten}\nGia: ${item.gia}\nHang: ${item.hang}\nGioi tinh: ${item.gioiTinh}`);
};
</script>

<style scoped>
.container {
  max-width: 800px;
  margin: 40px auto;
  padding: 40px;
  border: 1px solid;
  border-radius: 8px;
}

button {
    border-radius: 8px;
    border: 1px solid;
    padding: 4px;
    background-color: #f0f0f0;
}

.form-field {
    margin-bottom: 5px;
}
</style>